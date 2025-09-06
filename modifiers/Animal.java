package modifiers;

public class Animal {

    public static String dogName;

    public Animal(String dogName){
        this.dogName=dogName;
    }

    private void demo(){
        System.out.println("Demo");
    }

    protected void bark(){
        System.out.println(dogName+"Barking....");
    }


}
