package com.switchfully.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ProfessorDatabaseTest {

    @Test
    public void updateProfessor_shouldReturnUpdatedProfessor() {
        ProfessorDatabase testDatabase = new ProfessorDatabase();
        Professor stephen = new ProfessorBuilder().setFirstName("Stephen").setLastName("Mohawking").createProfessor();
        Professor expectedProfessor = new ProfessorBuilder().setFirstName("Stephen").setLastName("Hawking").createProfessor();
        testDatabase.storeNewProfessor(stephen);
        Assertions.assertThat(testDatabase.updateProfessor(expectedProfessor)).isEqualTo(expectedProfessor);
    }

    @Test
    public void updateProfessor_shouldReplaceOldProfessorWithNewProfessor() {
        ProfessorDatabase testDatabase = new ProfessorDatabase();
        Professor stephen = new ProfessorBuilder().setFirstName("Stephen").setLastName("Mohawking").createProfessor();
        stephen.setId(1);

        testDatabase.updateProfessor(stephen);
        Assertions.assertThat(testDatabase.getProfessor(1)).isEqualTo(stephen);
    }

}