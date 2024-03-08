/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
    }

    public SpecCala( String owner, int price, int color) {
        super(owner, price);
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
        return super.toString() + "," + this.color; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setData(){   
        this.setOwner(this.getOwner().replace(this.getOwner().substring(1, 2), "XX"));
    }
    public int getValue(){
        if(this.getColor() % 2 != 0){
            return this.getPrice() + 3;
        }else{
            return this.getPrice() + 7;
        }
    }
    
}
