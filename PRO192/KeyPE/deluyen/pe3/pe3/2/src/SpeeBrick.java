/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class SpeeBrick extends Brick{
    private int color;

    public SpeeBrick() {
    }

    public SpeeBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.color;
    }
    public void setData(){
        this.setPlace(this.getPlace().substring(0, 2) + "BCA" + this.getPlace().substring(2));
    }
    public int getValue(){
        if(this.getColor() > 7){
            return this.getPrice() + 9;
        }
        return this.getPrice() + 6;
        
    }
    
}
