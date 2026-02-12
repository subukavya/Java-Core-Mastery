/*
 * Topic: Class and Object in Java
 *
 * A class is a blueprint or template used to create objects.
 * It defines properties (variables) and behaviors (methods).
 *
 * An object is an instance of a class.
 * It represents a real-world entity and occupies memory.
 *
 * This program demonstrates:
 * - How to define a class
 * - How to create objects
 * - Accessing instance variables
 * - Calling methods using objects
 */
class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}
//create object in main method and call the method
