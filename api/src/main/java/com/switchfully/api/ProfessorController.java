package com.switchfully.api;

import com.switchfully.domain.Professor;
import com.switchfully.service.CourseService;
import com.switchfully.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {
    private CourseService courseService;
    private ProfessorService professorService;
    private ProfessorMapper professorMapper;

    @Inject
    public ProfessorController(CourseService courseService, ProfessorService professorService, ProfessorMapper professorMapper) {
        this.courseService = courseService;
        this.professorService = professorService;
        this.professorMapper = professorMapper;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProfessorDto> getProfessors() {
        return professorService.getProfessors().stream()
                .map(professorMapper::toDto)
                .collect(Collectors.toList());

    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ProfessorDto createProfessor(ProfessorDto professorDto) {
        return professorMapper.toDto(professorService.storeProfessor(professorMapper.toDomain(professorDto)));
    }

    @PutMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ProfessorDto updateProfessor(@PathVariable Integer id, @RequestBody ProfessorDto professorDto) {
        return professorMapper.toDto(professorService.updateProfessor(professorMapper.toDomain(professorDto)));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfessor(@PathVariable Integer id) {
        professorService.deleteProfessor(id);
    }
}
