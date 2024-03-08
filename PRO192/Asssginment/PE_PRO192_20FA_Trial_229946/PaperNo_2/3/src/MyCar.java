
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
public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        double sum= 0;
        int count = 0;
        for(Car i: t){
            sum += i.getRate();
            count++;
        }
        int result = (int)sum/count;
        return result;
    }

    @Override
    public void f2(List<Car> t) {
        int indexmin = -1;
        int indexmax = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if(max < t.get(i).getRate())
            {
                max = t.get(i).getRate();
                indexmax = i;
            }
        }
        
        for (int i = 0; i < t.size(); i++) {
            if(min >  t.get(i).getRate())
            {
                min = t.get(i).getRate();
                indexmin = i;
            }
        }

        Collections.swap(t, indexmin, indexmax);   
    }

    @Override
    public void f3(List<Car> t) {
        Comparator sc = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int c = o1.getMaker().compareTo(o2.getMaker());
                if(c  == 0){
                    return o2.getRate() - o1.getRate();
                }
                return c;
            }
        };
        Collections.sort(t, sc);
                
    }
    
}
