package array_string;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        ArrayDeclaration arrayDeclaration=new ArrayDeclaration();
//
//        int [] arr={2,1,3,20};
//
//        System.out.println(arr.length);
//        System.out.println(Arrays.stream(arr).min());
//        System.out.println(Arrays.stream(arr).max());
//        System.out.println(Arrays.stream(arr).sorted());
//        System.out.println(Arrays.toString(arr.clone()));
//        System.out.println(Arrays.stream(arr).findAny());
//        System.out.println(Arrays.stream(arr).findFirst());
//        System.out.println(Arrays.stream(arr).sum());
//
//        System.out.println( arrayDeclaration.subOfArrayElements(arr));


        System.out.println("Smallest Integer Value : "+Integer.MIN_VALUE);

        //Element Search in array
        int[] arr1 = new int[100];

        int j = 0;
        for (int i = 10; i < 100; i++) {
            arr1[j] = i;
            j++;
        }

//        System.out.println(arr1.length);
//
//        for (int i : arr1) {
//           if(i==50)
//               break;
////           else
////               System.out.println(i);
//        }

//find max
        int max = Integer.MIN_VALUE;
        for (int i : arr1) {

            if (i > max) {
                max = i;
            }

        }
        System.out.println("Largest num from arrya: " + max);


        //find min

        int[] tempArr = {100, 20, 1000, 100};

        int minimum = tempArr[0];

        for (int i : tempArr) {
            if (i < minimum) {
                minimum = i;
            }
        }

        System.out.println("Minimum from array : "+minimum);


        // Find minimum value in the array
        // Declare your own array
        int[] arr2 = {45, 12, 67, 2, 89, 5};

        // Assume first element is smallest
        int min = arr2[0];

        // Loop through array to find smaller value
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];   // update min
            }
        }

        // Print result
        System.out.println("Smallest in the array: " + min);


        //reverse array
        int [] arrRev=new int[100];
        System.out.println("Reverse array : ");
        int count=0;
        for(int i= arr2.length-1;i>=0;i--){
            System.out.println(arr2[i]);
            arrRev[count]=arr2[i];
            count++;
        }

        System.out.println("Reversed Array : "+ Arrays.toString(arrRev));


    }


}
