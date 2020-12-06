/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adnan.courseService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/courses")
public class CourseController {
    
    private List<Course> courses = new ArrayList<>();
    
    @GetMapping("/{id}")
    public Course getById(@PathVariable("id") Long id) {
        return courses.stream().filter(it -> it.getId().equals(id)).findFirst().get();
    }
    
    @PostMapping
    public Course add(@RequestBody Course c) {
        c.setId((long) (courses.size() + 1));
        courses.add(c);
        return c;
    }
    
}
