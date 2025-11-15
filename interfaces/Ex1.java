package interfaces;

public class Ex1 implements Animal{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public void sayHello() {

        System.out.println("Hello");
    }


    public static void main(String[] args) {


        Ex1 ex1 = new Ex1();

        ex1.sayHello();
        ex1.sayBye();
        System.out.println(ex1.add(10,55));

    }

}
