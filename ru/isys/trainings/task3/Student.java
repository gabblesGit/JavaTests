package ru.isys.trainings.task3;

import java.util.Objects;

public class Student {

    int studentId;
    String studentName;
    Double salary;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getSalary() {
        return salary;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName) && Objects.equals(salary, student.salary);
    }

    public int hashCode() {
        return Objects.hash(studentId, studentName, salary);
    }

    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
