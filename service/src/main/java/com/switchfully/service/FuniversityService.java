package com.switchfully.service;

import com.switchfully.domain.Course;
import com.switchfully.domain.CourseDatabase;
import com.switchfully.domain.Professor;
import com.switchfully.domain.ProfessorDatabase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class FuniversityService {

    private ProfessorDatabase professorDatabase;
    private CourseDatabase courseDatabase;

    @Inject
    public FuniversityService(ProfessorDatabase professorDatabase, CourseDatabase courseDatabase) {
        this.professorDatabase = professorDatabase;
        this.courseDatabase = courseDatabase;
    }

    public Map<Integer, Professor> getProfessors() {
        return professorDatabase.getProfessorMap();
    }

    public Map<Integer, Course> getCourses() {
        return courseDatabase.getCourses();
    }

    public Course storeCourse(Course course, int professorId) {
        course.setProfessor(professorDatabase.getProfessor(professorId));
        return courseDatabase.storeNewCourse(course);
    }

    public Professor storeProfessor(Professor professor) {
        return professorDatabase.storeNewProfessor(professor);
    }

    public Professor updateProfessor(Professor professor){
        return professorDatabase.updateProfessor(professor);
    }

    public Course updateCourse(Course course){
        return courseDatabase.updateCourse(course);
    }

    public void deleteProfessor(int id){
        professorDatabase.deleteProfessor(id);
    }

    public void deleteCourse(int id){
        courseDatabase.deleteCourse(id);
    }
}
