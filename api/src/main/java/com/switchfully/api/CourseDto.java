package com.switchfully.api;

public class CourseDto {
    //TODO create separate Dto for toDomain and toDto so that incoming can provide professorId and outgoing provides a professorDto
    private int courseId;
    private String name;
    private double studyPoints;
    private String category;
    private int professorId;

    public static CourseDto courseDto() {
        return new CourseDto();
    }

    public CourseDto withCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseDto withName(String name){
        this.name = name;
        return this;
    }

    public CourseDto withStudyPoints(int studyPoints){
        this.studyPoints = studyPoints;
        return this;
    }

    public CourseDto withCategory(String category) {
        this.category = category;
        return this;
    }

    public CourseDto withProfessorId(int professorId) {
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

    public int getProfessorId() {
        return professorId;
    }
}
