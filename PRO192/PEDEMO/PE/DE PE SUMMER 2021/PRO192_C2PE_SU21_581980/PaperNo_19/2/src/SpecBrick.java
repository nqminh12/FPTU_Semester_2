/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class SpecBrick extends Brick {
    
    private int color;

    public SpecBrick() {
        
    }

    public SpecBrick(String place, int price, int color ) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setData(){
        setPlace(getPlace().substring(0, 3) + "MINH" + getPlace().substring(3));
    }
    
    public int getValue(){
        if(color > 7){
            return getPrice() + 9;
        }
        else{
            return getPrice() + 6;
        }
    }

    
    

    
}
