/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adnan.courseService;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class StudentCourse {
    
    private Long student_id;
    private List<Course> student_courses;

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public List<Course> getStudent_courses() {
        return student_courses;
    }

    public void setStudent_courses(List<Course> student_courses) {
        this.student_courses = student_courses;
    }
    
    public void initData(Long studentId) {
        this.setStudent_id(studentId);
        Date start_at = new Date(2020, 12, 11);
        Date end_at = new Date(2021, 1, 22);
        this.setStudent_courses(Arrays.asList(
                new Course(1L, "IT", "This course interest in IT learning", start_at, end_at, "Adnan"),
                new Course(2L, "C++", "This course interest in C++ learning", start_at, end_at, "Ahmad")
        ));
    }
    
}
