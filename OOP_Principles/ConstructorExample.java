/*
 * Topic: Constructors in Java
 *
 * A constructor is a special method used to initialize objects.
 * It has the same name as the class and is automatically called
 * when an object is created.
 *
 * Types of constructors:
 * - Default constructor
 * - Parameterized constructor
 * - Constructor overloading
 *
 * This program demonstrates:
 * - Object initialization using constructors
 * - Use of 'this' keyword
 * - Constructor overloading
 */

class Student {

    String name;
    int age;

    // 1️- Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // 2-Parameterized Constructor
    Student(String name, int age) {
        // Using 'this' keyword to differentiate instance variables
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // 3️- Constructor Overloading
    Student(String name) {
        this.name = name;
        this.age = 18;  // default age
        System.out.println("Overloaded Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Object using Default Constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Object using Parameterized Constructor
        Student s2 = new Student("Kavi", 20);
        s2.display();

        System.out.println();

        // Object using Overloaded Constructor
        Student s3 = new Student("Rahul");
        s3.display();
    }
}
