package lab2.q2;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110

class Student {
    private int studentId;
    private String name;
    private float marks;
    static int totalStudents = 0;
    final String collegeName = "IIT EduTracker";

    Student(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        totalStudents++;
    }

    void calculateGrade() {
        int grade;
        if (marks >= 90) grade = 'A';
        else grade = 'B';
        System.out.println("Grade: " + (char) grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 95);
        Student s2 = new Student(102, "Neha", 75);
        s1.calculateGrade();
        s2.calculateGrade();
        System.out.println("Total Students: " + Student.totalStudents);
        System.out.println("College: " + s1.collegeName);
    }
}
