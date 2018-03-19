package com.switchfully.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ProfessorDatabaseTest {
    private ProfessorDatabase testDatabase;
    private Professor stephen;

    @Before
    public void setUp() {
        testDatabase = new ProfessorDatabase();
        stephen = new ProfessorBuilder().setFirstName("Stephen").setLastName("Mohawking").createProfessor();
    }

    @Test
    public void updateProfessor_shouldReturnUpdatedProfessor() {
        Professor expectedProfessor = new ProfessorBuilder().setFirstName("Stephen").setLastName("Hawking").createProfessor();
        expectedProfessor.setId(2);
        testDatabase.storeNewProfessor(stephen);
        Assertions.assertThat(testDatabase.updateProfessor(expectedProfessor)).isEqualTo(expectedProfessor);
    }

    @Test
    public void updateProfessor_shouldReplaceOldProfessorWithNewProfessor() {
        stephen.setId(1);
        testDatabase.updateProfessor(stephen);
        Assertions.assertThat(testDatabase.getProfessor(1)).isEqualTo(stephen);
    }

}