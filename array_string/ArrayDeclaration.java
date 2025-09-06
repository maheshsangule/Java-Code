package array_string;

public class ArrayDeclaration {

    public int subOfArrayElements(int[] num)
    {
        int sum=0;
        for (int j : num) {
            sum += j;
        }

        return sum;
    }

}
