package com.example.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    private List<Course> courses = new ArrayList<>() {
        {
            add(new Course(1, "Learn AWS", "test1"));
            add(new Course(2, "Learn DevOps", "test2"));
            add(new Course(3, "Learn Azure", "test3"));
        }
    };

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return courses;
    }
}
