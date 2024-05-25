package com.nadeem.course.repository;

import com.nadeem.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthorId(Long authorId);
}
