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
}
