package constructor;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Mahesh Sangule", 20, 44);

        student.setAge(30);
        student.setRollNumber(40);
        student.setName("Dagdu");

        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
        System.out.println(student.getAge());

        Student student1 = new Student(10);
        System.out.println(student1.getRollNumber());

        Student student2 = new Student("Mahesh Sangule");
        System.out.println(student2.getName());


        //Non Parameterised constructor
        Student student3 = new Student();
        student3.display();

    }
}
