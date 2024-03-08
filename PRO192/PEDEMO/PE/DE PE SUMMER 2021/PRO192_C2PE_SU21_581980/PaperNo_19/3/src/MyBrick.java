
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Fpt
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for (Brick brick : t) {
            char[] arr = brick.getPlace().toCharArray();
            if(Character.isDigit(arr[0]) && Character.isLetter(arr[arr.length - 1])){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Brick> t) {
        int max = 0;
        for (Brick brick : t) {
            if(max < brick.getPrice() && brick.getPrice() % 2 == 1){
                max = brick.getPrice();
            }
        }
        
        for (Brick brick : t) {
            if(max == brick.getPrice()){
                brick.setPlace("XX");
                break;
              
            }
        }
    }

    @Override
    public void f3(List<Brick> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
