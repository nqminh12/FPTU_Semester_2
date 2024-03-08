/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

/**
 *
 * @author Fpt
 */
abstract class Person {

    String name;

    Person() {
    }

    Person(String n) {
        name = n;
    }

    abstract double getSalary();

    void display() {
        System.out.println("Name: " + name);
    }
}
