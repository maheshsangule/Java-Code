package exceptions;

public class Ex1 {
    public static void main(String[] args) {


        int[] arrVal ={100,200,300,400};
        int [] arrDiv={10,20,0,40};

        for(int i =0;i<arrVal.length;i++){

            try{
                System.out.println(new Ex1().div(arrVal[i],arrDiv[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Hello World");
            }


        }


    }

    int div(int num1,int num2){
        return num1/num2;
    }
}
