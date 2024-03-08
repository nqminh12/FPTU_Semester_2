
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
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(Cala i: t){
            if("0123456789".contains(i.getOwner().substring(1, 2))){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        Cala index;
        int max = Integer.MIN_VALUE;
        for(Cala i: t){
            if(max < i.getPrice()){
                max = i.getPrice();
                index = i;
            }
        }
        int flag = 0;
        for(Cala i: t){
            if(i.getPrice() == max){
                flag++;
            }
            if(flag == 2){
                t.remove(i);
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                return o1.getOwner().substring(1, 2).compareTo(o2.getOwner().substring(1, 2));
            }
        });
    }
    
}
