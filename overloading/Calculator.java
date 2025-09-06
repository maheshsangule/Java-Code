package overloading;

public class Calculator {

    public int sum(int[] arr){
        int sum=0;
        for(int i =0;i<=arr.length;i++){
            sum+=i;
        }
        return sum;
    }
}
