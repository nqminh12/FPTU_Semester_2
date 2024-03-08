/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Fpt
 */
public class Student {
    private String name;
    private String classes;
    private double math;
    private double physical;
    private double chemistry;

    public Student() {
    }

    public Student(String name, String classes, double math, double chemistry, double physical) {
        this.name = name;
        this.classes = classes;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public double getACG(){
        double avg = (math + physical + chemistry) / 3;
        return avg;
    }
    public String getType(double avg){
        if(avg > 7.5){
            return "A";
        } else if (avg >= 6){
            return "B";
        } else if (avg >= 4){
            return "C";
        } else {
            return "D";
        }
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
        double avg = (math + physical + chemistry) / 3;
        System.out.printf("AVG:  %.2f\n", avg);
        System.out.println("Type: " + getType(avg));
        
    }
}
