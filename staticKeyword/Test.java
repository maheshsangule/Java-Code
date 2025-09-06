package staticKeyword;

import jdk.jshell.execution.Util;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        System.out.println(Student.  count);

        Student.getCount();

        //we can't call non-static method from static method
        //for that method should be static or for accessing we need to create object of class

//        System.out.println(sum(10,20));

        System.out.println(new Test().sum(10,20));


//        student.getAge();

        System.out.println(Utils.max(10,20));
        System.out.println(Utils.min(10,20));
        System.out.println(Utils.trimAndUppercase("m a he sh"));


        School.getInstance();

    }

    public int sum(int n1, int n2){
        return n1+n2;
    }


}
