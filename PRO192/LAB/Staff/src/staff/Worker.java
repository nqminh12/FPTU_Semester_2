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
class Worker extends Person {

    int hoursWorked;
    double hourlyRate = 15.0; // default hourly rate

    Worker(String n, int hrs) {
        super(n);
        hoursWorked = hrs;
    }

    @Override
    double getSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Salary: " + getSalary());
    }
}
