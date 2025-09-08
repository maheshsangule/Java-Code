package Lab;

public class Test {
    public static void main(String[] args) {
        // Object created using parameterized constructor
        Student s1 = new Student(101, "Mahesh", 88.5f);

        // Object created using default constructor
        Student s2 = new Student();

        // Displaying details
        s1.showDetails();
        s2.showDetails();
    }
}