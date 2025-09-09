package lab2.q1;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110

class Student {
    private int studentId;
    private String name;
    private float marks;

    Student() {
        this(0, "Unknown", 0.0f);
    }

    Student(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void showDetails() {
        System.out.println("ID: " + this.studentId + ", Name: " + this.name + ", Marks: " + this.marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul", 85.5f);
        s1.showDetails();
        s2.showDetails();
    }
}
