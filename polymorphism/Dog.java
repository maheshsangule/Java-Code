package polymorphism;

public class Dog extends Animal{
    public int  sayHello()
    {
        System.out.println("Hello from Dog");
        return 0;
    }



   public void sayBye(){
        System.out.println("Bye from Dog");
    }
}
