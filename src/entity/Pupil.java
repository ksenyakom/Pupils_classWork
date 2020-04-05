package entity;

import java.util.Objects;

public class Pupil {
    private String firstName;
    private String lastName;
    private Sex sex;
    private double averageMark;

    
    public Pupil(String firstName, String lastName, Sex sex, double avarageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.averageMark = avarageMark;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAverageMark(double avarageMark) {
        this.averageMark = avarageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupil pupil = (Pupil) o;
        return Double.compare(pupil.averageMark, averageMark) == 0 &&
                Objects.equals(firstName, pupil.firstName) &&
                Objects.equals(lastName, pupil.lastName) &&
                sex == pupil.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sex, averageMark);
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public double getAverageMark() {
        return averageMark;
    }



    @Override
    public String toString() {
        return "Pupils " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", avarageMark=" + averageMark +
                '}'+ "\n";
    }
}
