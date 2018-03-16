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
        return null;
    }
}
