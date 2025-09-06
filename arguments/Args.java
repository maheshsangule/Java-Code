package arguments;

import java.util.Scanner;

public class Args {

    public static void main(String[] args) {

        //command line args will receive by this
        //we have to pass like this java Args.java Mahesh Sangule 10 20 30
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
//        System.out.println(args[4]);

        //one more command line

        int num;
        float salary, gross, ded;

        String name;
        num = Integer.parseInt(args[0]);
        gross = Float.parseFloat(args[1]);
        ded = Float.parseFloat(args[2]);
        name = args[3];



        salary = gross + ded;

        System.out.println("Name of Person : "+name);
        System.out.println("Number of Person : "+salary);
        System.out.println("Gross of Person : "+gross);
        System.out.println("Deduction of Person : "+ded);

//        int age = Integer.parseInt(args[0]);


        //taking input through Scanner class
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
        boolean bool = sc.nextBoolean();
        float price = sc.nextFloat();

//        System.out.print(num + "\n" + bool + "\n" + price);
    }
}
