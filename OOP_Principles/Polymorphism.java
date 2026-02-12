/*
 * Topic: Polymorphism
 *
 * Polymorphism means "many forms".
 * It allows one interface to be used for different data types.
 *
 * Types of Polymorphism:
 * 1. Compile-time Polymorphism (Method Overloading)
 * 2. Runtime Polymorphism (Method Overriding)
 *
 * Runtime polymorphism is achieved using:
 * - Inheritance
 * - Method overriding
 * - Upcasting
 *
 * This program clearly separates and demonstrates
 * compile-time and runtime polymorphism in Java.
 */

// ===============================
// 1️- Compile-Time Polymorphism
// ===============================
class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ===============================
// 2️- Runtime Polymorphism
// ===============================

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // =====================================
        // Compile-Time Polymorphism Execution
        // =====================================
        System.out.println("----- Compile-Time Polymorphism -----");

        Calculator calculator = new Calculator();

        System.out.println("add(int, int): " + calculator.add(10, 20));
        System.out.println("add(double, double): " + calculator.add(5.5, 4.5));
        System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));

        System.out.println();

        // =====================================
        // Runtime Polymorphism Execution
        // =====================================
        System.out.println("----- Runtime Polymorphism -----");

        Animal animal = new Dog();   // Upcasting
        animal.sound();              // Dynamic Method Dispatch
    }
}
