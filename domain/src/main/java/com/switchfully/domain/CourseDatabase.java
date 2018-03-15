package com.switchfully.domain;

import javax.inject.Named;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Named
public class CourseDatabase {
    private static int courseCount = 0;
    private Map<Integer, Course> courseMap;

    public CourseDatabase() {
        this.courseMap = new HashMap<>();
        storeNewCourse(new Course("Advanced Micromanagement", 1, "Bullshit"));

    }

    public Course storeNewCourse(Course course){
        course.setId(courseCount++);
        courseMap.put(course.getId(),course);
        return course;
    }

    public Course setProfessorToCourse(int id, Professor professor){
        courseMap.get(id).setProfessor(professor);
        return courseMap.put(id, courseMap.get(id));
    }

    public Map<Integer, Course> getCourses() {
        return Collections.unmodifiableMap(courseMap);
    }

    public Course getCourse(int id){
        return courseMap.get(id);
    }

    public Course updateCourse(Course course){
        return courseMap.put(course.getId(), course);
    }

    public void deleteCourse(int id){
        courseMap.remove(id);
    }
}
