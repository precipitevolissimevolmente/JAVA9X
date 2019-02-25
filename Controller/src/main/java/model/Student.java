package model;


import java.util.Objects;

public class Student {
    private String firstName;
    private String lastNameA;
    private String email;
    private Integer birthYear;

    public Student(String email) {
        //check not null
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameA() {
        return lastNameA;
    }

    public void setLastNameA(String lastNameA) {
        this.lastNameA = lastNameA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastNameA, student.lastNameA) &&
                email.equals(student.email) &&
                Objects.equals(birthYear, student.birthYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastNameA, email, birthYear);
    }
}