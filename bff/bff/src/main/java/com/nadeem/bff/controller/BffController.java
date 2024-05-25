package com.nadeem.bff.controller;


import com.nadeem.bff.client.AuthorServiceClient;
import com.nadeem.bff.client.CourseServiceClient;
import com.nadeem.bff.model.Author;
import com.nadeem.bff.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bff")
public class BffController {

    @Autowired
    private CourseServiceClient courseServiceClient;
    @Autowired
    private AuthorServiceClient authorServiceClient;


    @GetMapping("/authors/{authorId}/courses")
    public ResponseEntity<?> getCourseByAuthor(@PathVariable("authorId") Long authorId){
        Author author = authorServiceClient.getAuthorById(authorId);
        if(author == null){
            return ResponseEntity.notFound().build();
        }
        List<Course> courses = courseServiceClient.getCoursesByAuthor(authorId);
        return ResponseEntity.ok(courses);
    }

}
