package com.switchfully.api;

public class CourseDomainDto {
    private int courseId;
    private String name;
    private double studyPoints;
    private String category;
    private int professorId;

    public static CourseDomainDto courseDto() {
        return new CourseDomainDto();
    }

    public CourseDomainDto withCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseDomainDto withName(String name){
        this.name = name;
        return this;
    }

    public CourseDomainDto withStudyPoints(double studyPoints){
        this.studyPoints = studyPoints;
        return this;
    }

    public CourseDomainDto withCategory(String category) {
        this.category = category;
        return this;
    }

    public CourseDomainDto withProfessorId(int professorId) {
        this.professorId = professorId;
        return this;
    }

    public int getCourseId() {
        return courseId;
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
}
