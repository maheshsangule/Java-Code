package interfaces;

public interface Animal {

    public int add(int num1,int num2);


    void sayHello();

    default void sayBye(){
        System.out.println("Bye...");
    }

}
