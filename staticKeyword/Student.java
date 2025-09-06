package staticKeyword;

public class Student {

    public static int count = 0;
    public static Student student=new Student();

    public Student() {
        System.out.println("Welcome");
        count++;
    }



    //static block-we can use this when we have to write some logic.
    static {
           count = 22;
        System.out.println("Hello from static block");


    }

    public static Student getInstance(){
        return student;
    }

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static void getCount() {
        System.out.println("Total Students : " + count);
    }
}