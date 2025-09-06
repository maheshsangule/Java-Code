package abstraction;

public class Test {
    public static void main(String[] args) {
        Animal  dog=new Dog();

//        Animal animal=new Animal(); //we can't create object of abstract class.
//        as in abstract class there is not method body.
//        that's the reason we can't create object of abstract class.

        dog.sayHello();
    }
}
