// package Programs.polymorphism;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

// import Programs.polymorphism.Animal;
// import Programs.polymorphism.Cat;
// import Programs.polymorphism.Dog;
public class Test {
    public static void main(String[] args) {


//        String.valueOf(args.length);

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.sayHello();
        cat.sayHello();
        dog.sayHello();


        Animal animal1 = new Dog(); //upcasting
        animal1.sayHello();  //Run time polymorphism

        animal1.sayBye();


        Animal cat1 = new Cat();
        cat1.sayHello();


        double d = 2.323223;

        System.out.println(d);
        System.out.println((int) d);

        Dog dog1 = (Dog) animal1;  //down casting
        dog1.sayBye();





    }
}
