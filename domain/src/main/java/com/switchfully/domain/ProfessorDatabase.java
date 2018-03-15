package com.switchfully.domain;

import javax.inject.Named;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Named
public class ProfessorDatabase {

    private Map<Integer, Professor> professorMap;
    private static int professorCount = 0;

    public ProfessorDatabase() {
        this.professorMap = new HashMap<>();
        storeNewProfessor(new Professor("Stephen", "Hawking"));
        storeNewProfessor(new Professor("Neil", "deGrasse Tyson"));
    }

    public Map<Integer, Professor> getProfessorMap() {
        return Collections.unmodifiableMap(professorMap);
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
