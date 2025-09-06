package constructor;

public class Student {

    private int age;
    private int rollNumber;
    private String name;

    //we can also do constructor overloading

    //There are two types of constructor
    //1 Default- In which we can't pass any args is called default constructor also it's is default
    //2 Parameterised- In which we pass args is called parameterized constructor
    //3 Non Parameterised constructor- The constructor which doesn't accept any parameter is called non parameterised constructor.


    //Parameterised
    public Student(String name, int age, int rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student(String name) {

        this.name = name;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public Student(){
        this.age=20;
        this.rollNumber = 1;
        this.name="Don";

    }

    void display(){
        System.out.println("\nAge : "+age+"\nName : "+name+"\nrollNumber : "+rollNumber);
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
