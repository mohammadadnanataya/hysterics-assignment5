/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eclass;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/classes")
public class EClassController {

    private List<EClass> classes = new ArrayList<>();

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{name}")
    public List<Student> getClassStudents(@RequestParam("name") String name) {
        EClass eclass = classes.stream().filter(it -> it.getClass_name().equals(name)).findFirst().get();
        return eclass.getStudents();
    }
    
    @GetMapping("/withCourses/{name}")
    public List<Student> getClassStudentsCourses(@RequestParam("name") String name) {
        EClass eclass = classes.stream().filter(it -> it.getClass_name().equals(name)).findFirst().get();
        return eclass.getStudents();
    }

    @PostMapping
    public EClass add(@RequestBody EClass ec) {
        ec.setId((long) (classes.size() + 1));
        classes.add(ec);
        return ec;
    }
    
}
