
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCarp implements ICarp{

    @Override
    public int f1(List<Carp> t) {
        int count =0;
        for (Carp carp : t) {
            if ("2468".contains(carp.getPond().substring(1, 2))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Carp> t) {
        int pos =-1;
        for (int i = 0; i < t.size(); i++) {
            if (check(t.get(i).getPond())) {
                 pos =i;
                 break;
            }
        }
        if (pos>=0) {
            t.get(pos).setState(99);
        }
       
    }
    
    public boolean check (String s){
        StringBuffer sb = new StringBuffer(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }
    @Override
    public void f3(List<Carp> t) {
        Collections.sort(t.subList(0, 5), new Comparator<Carp>() {
            @Override
            public int compare(Carp o1, Carp o2) {
               int comp = Integer.compare(o1.getState(), o2.getState());
                if (comp==0) {
                    comp = o1.getPond().substring(1, 2).compareTo(o2.getPond().substring(1, 2));
                }
                return comp;
            }
        });
    }
    
}
