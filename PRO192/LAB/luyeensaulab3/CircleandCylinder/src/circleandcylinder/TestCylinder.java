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
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()+ ", Height is: " + cy1.getHeight() + ", Color is: " + cy1.getColor()+ ", Base area is: " + cy1.getArea() + ", Volume is: " + cy1.getVolume());
        
        Cylinder cy2 = new Cylinder(5.0,2.0);
        System.out.println("Radius is " + cy2.getRadius()+ ", Height is: " + cy2.getHeight() + ", Color is: " + cy2.getColor()+ ", Base area is: " + cy2.getArea() + ", Volume is: " + cy2.getVolume());
        
        
    }
    
}
