package arguments;

import java.util.Scanner;


//Taking input through Scanner class

class ScannerDemo {
    public static void main(String[] args) {
        String name;
        int num;
        char gender;
        double salary;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Name and Number of EMPLOYEE");
        name = S.nextLine();
        num = S.nextInt();
        System.out.println("\n Enter Gender of the EMPLOYEE");
        gender = S.next().charAt(0);
        System.out.println("\n Enter Salary of the EMPLOYEE");
        salary = S.nextDouble();
        System.out.println("\n Name of the EMPLOYEE : " + name);
        System.out.println("\n Number of the EMPLOYEE : " + num);
        System.out.println("\n Gender of the EMPLOYEE : " + gender);
        System.out.println("\n Salary of the EMPLOYEE : " + salary);
    }
}
