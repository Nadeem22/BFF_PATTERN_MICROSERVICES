package com.nadeem.course.controller;

import com.nadeem.course.model.Course;
import com.nadeem.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/author/{authorId}")
    public List<Course> getCourseByAuthor(@PathVariable Long authorId){
        return courseRepository.findByAuthorId(authorId);
    }
}
