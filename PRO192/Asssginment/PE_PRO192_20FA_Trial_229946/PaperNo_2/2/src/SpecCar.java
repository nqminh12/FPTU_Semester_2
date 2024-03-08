/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
    }

    

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.type; 
    }
    
    public void setData(){
        this.setMaker("XY" + super.getMaker());
        this.setPrice(super.getPrice() + 20);
    }
    public int getValue(){
        int inc = 0;
        if(this.getType()< 7){
            inc = 10;
        } else {
            inc = 15;
        }
        
        return getPrice() + inc;
    }
    
    
}
