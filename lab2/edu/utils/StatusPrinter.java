package lab2.edu.utils;

// Sangule Mahesh Arjun
// Bits ID : 202419TW110


import lab2.edu.main.Student;

public class StatusPrinter {
    public void printStatus(Student s) {
        System.out.println(s.name + " has " + (s.isPassed() ? "Passed" : "Failed"));
    }

    @Override
    public String toString() {
        return "StatusPrinter Utility for EduTracker";
    }
}
