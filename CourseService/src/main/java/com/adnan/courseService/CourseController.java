/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adnan.courseService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/courses")
public class CourseController {
    
    @GetMapping("/student/{id}")
    public StudentCourse getStudentCourses(@RequestParam("id") Long id) {
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.initData(id);
        return studentCourse;
    }
    
}
