package com.switchfully.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfessorDatabaseTest {

    @Test
    public void updateProfessor_shouldReturnUpdatedProfessor() {
        ProfessorDatabase testDatabase = new ProfessorDatabase();
        Professor stephen = new Professor("Stephen", "Mohawking");
        Professor expectedProfessor = new Professor("Stephen", "Hawking");
        testDatabase.storeNewProfessor(stephen);
        Assertions.assertThat(testDatabase.updateProfessor(expectedProfessor)).isEqualTo(expectedProfessor);
    }

    @Test
    public void updateProfessor_shouldReplaceOldProfessorWithNewProfessor() {
        ProfessorDatabase testDatabase = new ProfessorDatabase();
        Professor stephen = new Professor("Stephen", "Mohawking");
        stephen.setId(1);

        testDatabase.updateProfessor(stephen);
        Assertions.assertThat(testDatabase.getProfessor(1)).isEqualTo(stephen);
    }

}