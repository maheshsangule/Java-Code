package lab2.edu;

import lab2.edu.main.Student;
import lab2.edu.utils.StatusPrinter;


// Sangule Mahesh Arjun
// Bits ID : 202419TW110


public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Meena", 72);
        s1.showDetails();

        StatusPrinter sp = new StatusPrinter();
        sp.printStatus(s1);
        System.out.println(sp);
    }
}
