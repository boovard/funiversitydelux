package com.switchfully.api;

import com.switchfully.domain.Professor;

import javax.inject.Named;

@Named
public class ProfessorMapper {
    public ProfessorDto toDto(Professor professor) {
        return ProfessorDto.professorDto()
                .withId(professor.getId())
                .withFirstName(professor.getFirstName())
                .withLastName(professor.getLastName());
    }

    public Professor toDomain(ProfessorDto professorDto) {
        return Professor.ProfessorBuilder.professor()
                .withFirstName(professorDto.getFirstName())
                .withLastName(professorDto.getLastName())
                .build();
    }
}
