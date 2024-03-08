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
public class Circle {
    private double radius = 1.0;
    private String color  = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Construced a Circle with Circle()");
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius)");
        
        
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle[radius=" + radius + ", colour=" + color + " ]";
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
}
