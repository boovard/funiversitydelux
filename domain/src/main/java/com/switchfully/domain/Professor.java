package com.switchfully.domain;

import javax.inject.Named;
import java.util.Objects;

@Named
public class Professor {

    private int id;
    private String firstName;
    private String lastName;

    public Professor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return id == professor.id &&
                Objects.equals(firstName, professor.firstName) &&
                Objects.equals(lastName, professor.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName);
    }

    public static class ProfessorBuilder {
        private int id;
        private String firstName;
        private String lastName;

        private ProfessorBuilder(){}

        public static ProfessorBuilder professor(){
            return new ProfessorBuilder();
        }

        public ProfessorBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfessorBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfessorBuilder withId(int id){
            this.id = id;
            return this;
        }

        public Professor build() {
            return new Professor(firstName, lastName);
        }
    }
}
