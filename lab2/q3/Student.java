package lab2.q3;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110

class Student {
    private int studentId;
    private String name;
    private float marks;

    Student(int studentId) {
        this(studentId, "Unknown", 0.0f);
    }

    Student(int studentId, String name) {
        this(studentId, name, 0.0f);
    }

    Student(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    void updateMarks(float[] subjectMarks) {
        float sum = 0;
        for (float m : subjectMarks) sum += m;
        this.marks = sum / subjectMarks.length;
    }

    boolean isPassed() {
        return marks >= 40;
    }

    void showDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Raj");
        s1.updateMarks(85);
        s1.showDetails();
        System.out.println("Passed: " + s1.isPassed());

        float[] arr = {80, 70, 90};
        Student s2 = new Student(102, "Sneha");
        s2.updateMarks(arr);
        s2.showDetails();
        System.out.println("Passed: " + s2.isPassed());
    }
}
