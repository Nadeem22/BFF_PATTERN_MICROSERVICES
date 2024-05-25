package com.nadeem.bff.client;

import com.nadeem.bff.model.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "course-service", url = "${course-service.url}")
public interface CourseServiceClient {
    @GetMapping("/course/author/{authorId}")
    List<Course> getCoursesByAuthor(@PathVariable("authorId") Long authorId);
}
