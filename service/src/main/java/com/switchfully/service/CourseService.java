package com.switchfully.service;

import com.switchfully.domain.Course;
import com.switchfully.domain.CourseDatabase;
import com.switchfully.domain.Professor;
import com.switchfully.domain.ProfessorDatabase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class CourseService {

    private ProfessorService professorService;
    private CourseDatabase courseDatabase;

    @Inject
    public CourseService(ProfessorService professorService, CourseDatabase courseDatabase) {
        this.professorService = professorService;
        this.courseDatabase = courseDatabase;
    }

    public Map<Integer, Course> getCourses() {
        return courseDatabase.getCourses();
    }

    public Course getCourse(int id) {
        return courseDatabase.getCourse(id);
    }

    public Course storeCourse(Course course, int professorId) {
        course.setProfessor(professorService.getProfessor(professorId));
        return courseDatabase.storeNewCourse(course);
    }

    public Course updateCourse(Course course) {
        return courseDatabase.updateCourse(course);
    }

    public void deleteCourse(int id) {
        courseDatabase.deleteCourse(id);
    }
}
