package overloading;

public class Test {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int[] num = {1, 2, 3, 4};

        System.out.println(  calculator.sum(num));

    }
}
