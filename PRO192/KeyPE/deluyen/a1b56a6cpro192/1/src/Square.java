/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {
    private String unit;

    public Square(int side) {
        super(side, side);
        unit = "cm";
    }
    
    public void setSquare(int side) {
        if (side > 0) {
            super.setLength(side);
            super.setWidth(side);
        }
    }
    
    public int getPerimeter() {
        return (super.getLength() + super.getWidth()) * 2;
    }
    
    public void output() {
        System.out.println("the side of the square=" + super.getLength() + "(" + unit + ")");
        System.out.println("the perimeter of the square=" + getPerimeter() + "(" + unit + ")");
    }
    
}
