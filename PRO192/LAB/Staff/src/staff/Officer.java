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
class Officer extends Person {

    double baseSalary;

    Officer(String n, double s) {
        super(n);
        baseSalary = s;
    }

    @Override
    double getSalary() {
        return baseSalary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Salary: " + getSalary());
    }
}
