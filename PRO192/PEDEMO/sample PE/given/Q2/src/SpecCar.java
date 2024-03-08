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

    @Override
    public String toString() {
        return super.toString() + ", " + this.type; //To change body of generated methods, choose Tools | Templates.
    }
    public void setData(){
        this.setMaker("XY" + this.getMaker());
        this.setPrice(this.getPrice() + 20);
    }
    public int getValue(){
        int inc;
        if(this.type < 7){
            inc = 10;
        }else{
            inc = 15;
        }
        return this.getPrice() + inc;
    }
}
