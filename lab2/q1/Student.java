package Lab;

class Student {

    private int studentId;
    private String name;
    private float marks;

    //q2
    private static int totalStudents;
    final String collegeName="IIT EduTracker";

    public Student(int studentId, String name, float marks) {
       totalStudents++;
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    public Student() {
        this(1, "Mahesh", 91.0f);
    }

    public void showDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }


    public void updateMarks(float marks){
        this.marks=marks;
    }

}

