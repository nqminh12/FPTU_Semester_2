
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class MyCala implements ICala  {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            if(Character.isDigit(cala.getOwner().charAt(1))){
                count++;
            }
        }
        
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int max = -1;
        int index = 0;
        for (Cala cala : t) {
            if(cala.getPrice() > max){
                max = cala.getPrice();
            }
        }
        
        int count = 0;
        // xem co baoi nhieu phan tu max
        for (Cala cala : t) {
            if(cala.getPrice() == max){
                count++;
            }
        }
        
        
        
        if(count == 1){
            return;
        } else{
            count = 0;
            for (Cala cala : t) {
                if(cala.getPrice() == max){
                    count++;
                }
                if(count == 2){
                    t.remove(cala);
                }
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                String s1 = Character.toString(o1.getOwner().charAt(1));
                String s2 = Character.toString(o2.getOwner().charAt(1));
                //s1.compareto(s2)
                return s1.compareTo(s2);
            }
        });
    }

   
}
