package lab2.edu.main;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110


public class Student {
    public int studentId;
    public String name;
    public float marks;

    public Student(int id, String name, float marks) {
        this.studentId = id;
        this.name = name;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Marks: " + marks);
    }

    public boolean isPassed() {
        return marks >= 40;
    }
}
