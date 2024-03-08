
import java.util.ArrayList;
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
public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for(Brick i: t){
            if(check(i)){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Brick> t) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        int i;
        for(i = 0 ; i < t.size();i++){
            if(max < t.get(i).getPrice()){
                if(t.get(i).getPrice() % 2 != 0){
                    max = t.get(i).getPrice();
                    index = i;
                }
            }
        }
        if(index != -1){
            t.get(index).setPlace("XX");
    }
    }

    @Override
    public void f3(List<Brick> t) {
        // tìm vị trí max 
        int max = Integer.MIN_VALUE;
        int index = -1; // index tại đó có vị trí max đầu tiên
        int i;
        for(i = 0 ; i < t.size();i++){
            if(max < t.get(i).getPrice()){// giá trị lớn hơn max mới dc gắn
                    max = t.get(i).getPrice();
                    index = i;// index được gán cho index tại vị trí to nhất trong list
            }
        }
        
        
        List<Brick> sc = new ArrayList<>();// khởi tạo list mới để lưu giá trị mới vào
        for(i = 0; i < index;i++){// nhập các brick từ đầu của list t đến giá trị to nhất vào list sc mới
            sc.add(t.get(i));
        }
        Collections.sort(sc, new Comparator<Brick>() {// sắp xếp các phần tử đang có trong list sc(từ đầu ffeens vị trí to nhất trong list)
            @Override
            public int compare(Brick o1, Brick o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        
        // nhập nốt brick còn lại từ list vào list sc bắt đầu từ indexx
        for(i = index; i < t.size(); i++){
            sc.add(t.get(i));
        }
        
        //xóa hết list t
        t.clear();
        
        // adđ hết từ list sc vào t
        t.addAll(sc);
    }
    public boolean check(Brick g){
        if("0123456789".contains(g.getPlace().charAt(0) + "")){
            if(Character.isLetter(g.getPlace().charAt(g.getPlace().length() - 1))){
                return true;
            }
        }
        return false;
    }
}
