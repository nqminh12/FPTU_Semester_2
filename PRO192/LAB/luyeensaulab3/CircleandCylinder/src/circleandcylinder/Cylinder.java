/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleandcylinder;

/**
 *
 * @author Fpt
 */
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
        
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color){
        super();
        this.height = height;
        System.out.println("Construced a Cylinder with Cylinder(height, radius, color)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        
    }
    public double getVolume(){
        return getArea()*height;
    }
    public String toString(){
        return "This is a Cylinder";
    }
    
    
    
}
