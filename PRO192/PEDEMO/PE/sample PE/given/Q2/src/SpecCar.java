
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +", " + type; //To change body of generated methods, choose Tools | Templates.
    }
    public void setData(){
//        String s = getMaker();
//        String snew = "";
//        for(int i = s.length() - 1; i >= 0; i--){
//            snew += s.charAt(i);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            snew = s.charAt(i) + snew;
//            
//        }
//        setMaker(snew);
//            int haft = getMaker().length() / 2;
//           setMaker(getMaker().substring(0,haft).toUpperCase() + getMaker().substring(haft).toLowerCase());
          String s = getMaker();
          String snew = "";
          for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                snew += s.charAt(i);
            }
        }
          
          setMaker(snew);
        
    }
    public int getValue(){
        int inc;
        if(type < 7){
            inc = 10;
        } else {
            inc = 15;
        }
        return getPrice() + inc;
    }
}
