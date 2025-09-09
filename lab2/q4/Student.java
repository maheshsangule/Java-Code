package lab2.q4;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110

import java.util.*;

class Student {
    private int studentId;
    private String name;
    private float marks;
    List<String> achievements = new ArrayList<>();
    Mentor mentor;

    Student(int id, String name, float marks) {
        this.studentId = id;
        this.name = name;
        this.marks = marks;
    }

    void showDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Marks: " + marks);
        System.out.println("Achievements: " + achievements);
        if (mentor != null)
            System.out.println("Mentor: " + mentor.name + ", Dept: " + mentor.dept);
    }
}

class Mentor {
    String name;
    String dept;

    Mentor(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    void assignMentor(Student s) {
        s.mentor = this;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Kiran", 88);
        Mentor m1 = new Mentor("Dr. Sharma", "CS");
        m1.assignMentor(s1);

        s1.achievements.add("Hackathon Winner");
        s1.showDetails();

        // String is immutable (cannot modify s1.name directly)
        // Achievements list is mutable
        s1.achievements.add("Internship Completed");
        s1.showDetails();
    }
}
