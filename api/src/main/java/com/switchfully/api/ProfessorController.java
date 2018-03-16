package com.switchfully.api;

import com.switchfully.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {
    private CourseService service;
    private ProfessorMapper mapper;

}
