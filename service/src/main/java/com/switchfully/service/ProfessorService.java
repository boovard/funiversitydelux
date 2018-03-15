package com.switchfully.service;

import com.switchfully.domain.Professor;
import com.switchfully.domain.ProfessorDatabase;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
public class ProfessorService {
    private ProfessorDatabase professorDatabase;

    @Inject
    public ProfessorService(ProfessorDatabase professorDatabase) {
        this.professorDatabase = professorDatabase;
    }

    public Map<Integer, Professor> getProfessors() {
        return professorDatabase.getProfessorMap();
    }

    public Professor storeProfessor(Professor professor) {
        return professorDatabase.storeNewProfessor(professor);
    }
    public Professor updateProfessor(Professor professor){
        return professorDatabase.updateProfessor(professor);
    }

    public void deleteProfessor(int id){
        professorDatabase.deleteProfessor(id);
    }
}
