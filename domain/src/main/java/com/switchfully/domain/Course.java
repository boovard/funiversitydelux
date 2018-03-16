package com.switchfully.domain;

import javax.inject.Named;

@Named
public class Course {

    private int id;
    private String name;
    private double studyPoints;
    private String category;
    private Professor professor;

    public Course(String name, double studyPoints, String category) {
        this.name = name;
        this.studyPoints = studyPoints;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public double getStudyPoints() {
        return studyPoints;
    }

    public String getCategory() {
        return category;
    }

    public Professor getProfessor() {
        return professor;
    }

    public static class CourseBuilder {

    }
}
