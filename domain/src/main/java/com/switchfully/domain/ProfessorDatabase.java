package com.switchfully.domain;

import javax.inject.Named;
import java.util.*;

@Named
public class ProfessorDatabase {

    private Map<Integer, Professor> professorMap;
    private static int professorCount = 0;

    public ProfessorDatabase() {
        this.professorMap = new HashMap<>();
        storeNewProfessor(new ProfessorBuilder().setFirstName("Stephen").setLastName("Hawking").createProfessor());
        storeNewProfessor(new ProfessorBuilder().setFirstName("Neil").setLastName("deGrasse Tyson").createProfessor());
    }

    public List<Professor> getProfessors() {
        return Collections.unmodifiableList(new ArrayList<>(professorMap.values()));
    }

    public Professor getProfessor(int id){
        return professorMap.get(id);
    }

    public Professor storeNewProfessor(Professor professor){
        professor.setId(professorCount++);
        professorMap.put(professor.getId(),professor);
        return professor;
    }

    public Professor updateProfessor(Professor professor){
        return professorMap.put(professor.getId(),professor);
    }

    public void deleteProfessor(int id) {
        professorMap.remove(id);
    }
}
