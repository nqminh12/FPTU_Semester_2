
import java.util.Collections;
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
        int sum = 0;
        for (Car car : t) {
            sum += car.getRate();
        }
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max = Integer.MIN_VALUE;// tạo max nhỏ nhất để lưu giá trị lớn nhất trong mảng
        int indexmax = -1;// index của car có giá trị max trong mảng
        int min = Integer.MAX_VALUE;// tạo min có giá trị lớn nhất để lưu giá trị nhỏ nhất trong mảng
        int indexmin = -1;// index của car có giá trị nhỏ nhất trong mảng
        
        // lặp qua list t nếu giá trị nào lớn hơn max thì max được gán cho giá trị đó, đồng thời indexmax gán bằng index của car đang xét tới bằng phương thức t.indexOf()
        for (Car car : t) {
            if(max < car.getRate()){
                max = car.getRate();
                indexmax = t.indexOf(car);
            }
        }
        
        // lặp qua list t nếu giá trị nào nhỏ hơn max thì min được gán cho giá trị đó, đồng thời indexmin gán bằng index của car đang xét tới bằng phương thức t.indexOf()
        for (Car car : t) {
            if(min > car.getRate()){
                min = car.getRate();
                indexmin = t.indexOf(car);
            }
        }
        
        // dùng collectios.swap truyền vào 3 tham số list cần swap, 2 index của 2 phần tử muốn đỏi chỗ
        Collections.swap(t, indexmin, indexmax);

    }

    @Override
    public void f3(List<Car> t) {

    }

}
