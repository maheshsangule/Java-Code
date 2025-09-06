package arguments;

public class Conditional {

    public static void main(String[] args) {


        //Conditional/Ternary Operator
//        String result= ((20>10)? "20 is big" : "10 is big");
//
//        System.out.println(result);

        System.out.println(new Conditional().bigInThreeNum(50, 50, 30)+"is Greatest Number");
    }

    public float bigInThreeNum(float num1, float num2, float num3) {
        return (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
    }
}
