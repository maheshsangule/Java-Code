package abstraction;


//Hiding complex part of the program from the user.
//we can initialize object of Abstract class

public abstract class Animal {

    public abstract void sayHello();
    //methods who doesn't have body is called abstract methods


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    //methods who has body is called concrete methods
    public void sleep()
    {
        System.out.println("zzz....");
    }


}
