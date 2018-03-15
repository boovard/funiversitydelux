package com.switchfully.domain;

public class ProfessorBuilder {
    private String firstName;
    private String lastName;

    public ProfessorBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ProfessorBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Professor createProfessor() {
        return new Professor(firstName, lastName);
    }
}