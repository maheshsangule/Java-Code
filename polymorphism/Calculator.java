package polymorphism;// package com.developermaheshsofttechltd.javaprograms.polymorphism;


//There are two types of polymorphism
//poly-Many   Morphism - Forms
//1-compile time polymorphism (we can this polymorphism method overloading (same method with different parameter in same class))
//2-Run time polymorphism (supports method overriding)


public class Calculator {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Animal animal=new Animal();

        System.out.println(animal.sayHello());

        System.out.println(add(10, 20));
        System.out.println(cal.add(10, 20, 50));
        System.out.println(cal.add(10.00, 20.00));
        System.out.println(cal.add(100f, 200f));

    }

     static int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}