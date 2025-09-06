package modifiers;

 class Test {

    public static void main(String[] args) {


        Dog dog=new Dog("Mahesh");

        //below is the procted method it is accessiable from same package but while
        //we tried to access from other package it's not accessiable
        dog.bark();
        dog.callBark();

        System.out.println(Animal.dogName);

    }
}
