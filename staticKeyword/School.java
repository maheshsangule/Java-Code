package staticKeyword;

public class School {

    public static School school = new School();

    private School() {
        System.out.println("Welcome to Private school");
//        count++;
    }


    //static block-we can use this when we have to write some logic.
    static {
//           count = 22;
        System.out.println("Hello from static block");


    }

    public static School getInstance() {
        return school;
    }
}