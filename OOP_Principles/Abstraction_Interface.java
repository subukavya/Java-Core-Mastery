/*
 * Topic: Abstraction
 *
 * Abstraction means hiding implementation details
 * and showing only essential features.
 *
 * It is achieved using:
 * - Abstract classes
 * - Interfaces
 *
 * Abstract class:
 * - Can have abstract and non-abstract methods.
 *
 * Interface:
 * - Used to achieve full abstraction.
 *
 * This program demonstrates abstraction using
 * abstract classes and interfaces.
 */

// ======================================
// 1️- Abstraction using Abstract Class
// ======================================

abstract class Shape {

    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    // Providing implementation of abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// ======================================
// 2️- Abstraction using Interface
// ======================================

interface Payment {

    void pay(double amount);  // implicitly public & abstract
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        // -------------------------------
        // Abstract Class Example
        // -------------------------------
        System.out.println("----- Abstract Class Example -----");

        Shape shape = new Circle();   // Upcasting
        shape.display();              // Concrete method
        shape.draw();                 // Abstract method implementation

        System.out.println();

        // -------------------------------
        // Interface Example
        // -------------------------------
        System.out.println("----- Interface Example -----");

        Payment payment = new CreditCardPayment();  // Upcasting
        payment.pay(2500);
    }
}
