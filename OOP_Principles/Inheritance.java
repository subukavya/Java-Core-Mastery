/*
 * Topic: Inheritance
 *
 * Inheritance allows one class to acquire properties and behaviors
 * of another class using the 'extends' keyword.
 *
 * It promotes:
 * - Code reusability
 * - Hierarchical classification
 *
 * Key Concepts:
 * - Parent (Superclass)
 * - Child (Subclass)
 * - Method overriding
 * - super keyword
 *
 * This program demonstrates how a child class inherits
 * and overrides methods from a parent class.
 */

// Parent Class (Superclass)
class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child Class (Subclass)
class Car extends Vehicle {

    int speed;

    Car(String brand, int speed) {
        // Calling parent constructor using super
        super(brand);
        this.speed = speed;
    }

    // Method Overriding
    @Override // it's an annotation for documentation
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 120);

        // Inherited method
        car.displayBrand();

        // Overridden method
        car.start();

        // Child-specific method
        car.displaySpeed();
    }
}
