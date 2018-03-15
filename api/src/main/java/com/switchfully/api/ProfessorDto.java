package com.switchfully.api;

public class ProfessorDto {

    private int id;
    private String firstName;
    private String lastName;

    public static ProfessorDto professorDto() {
        return new ProfessorDto();
    }

    public ProfessorDto withId(int id) {
        this.id = id;
        return this;
    }

    public ProfessorDto withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ProfessorDto withLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
