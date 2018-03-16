package com.switchfully.api;

import com.switchfully.domain.Course;

import javax.inject.Named;

@Named
public class CourseMapper {
    private ProfessorMapper professorMapper;

    public CourseMapper(ProfessorMapper professorMapper) {
        this.professorMapper = professorMapper;
    }

    public CourseDto toDto(Course course) {
        return CourseDto.courseDto()
                .withCourseId(course.getId())
                .withName(course.getName())
                .withStudyPoints(course.getStudyPoints())
                .withCategory(course.getCategory())
                .withProfessor(professorMapper.toDto(course.getProfessor()));
    }

    public Course toDomain(CourseDto courseDto) {
        return Course.CourseBuilder.course()
                .withId(courseDto.getCourseId())
                .withName(courseDto.getName())
                .withstudyPoints(courseDto.getStudyPoints())
                .withCategory(courseDto.getCategory())
                //TODO not OK, instead we should get the professor from the database based on the provided ID
                .withProfessor(professorMapper.toDomain(courseDto.getProfessor()))
                .build();
    }
}
