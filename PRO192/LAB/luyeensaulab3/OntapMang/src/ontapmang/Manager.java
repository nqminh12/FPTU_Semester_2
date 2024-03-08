/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmang;

/**
 *
 * @author Fpt
 */
import java.util.Arrays;
public class Manager {
    
    public void menu(){
        System.out.println("1. Thêm giá trị vào mảng với chỉ số được nhập từ bàn phím");
        System.out.println("2. Xóa giá trị từ mãng với chỉ số được nhập từ bàn phím");
        System.out.println("3. Thực hiện sắp xếp mảng với thuật toán Quick sort");
        System.out.println("4. Tìm kiếm giá trị có ở trong mảng in ra vị trí của nó (in tất cả các vị trí của giá trị đó nếu có)");
        System.out.println("0. Thoát chương trình!");
        System.out.println("Nhập lựa chọn: ");
    }   
    
    public void nhap(int a[]){
        System.out.println("Nhập giá trị cần thêm vào mảng: ");
        int value = Validation.getInt();
        System.out.println("Nhập chỉ số thay thê: ");
        int index = Validation.checkInputLimitInt(0 , a.length - 1);
        int[] b = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
             b[i] = a[i];
        }
        
        b[index] = value; 
        for (int i = index + 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }
        a = b;
        System.out.println("Mang sau khi xoa la: ");
        System.out.println(Arrays.toString(a));
    }
    
    public void xoa(int a[]){
        System.out.println("Nhập chỉ số cần xóa: ");
        int index = Validation.getInt();
        int[] a_new = new int[a.length - 1];
        for (int i = 0, k = 0; i < a.length; i++) {
            if (i != index) {
                a_new[k] = a[i];
                k++;
            }
        }
        a = a_new;
        System.out.println("Mang sau khi xoa la: ");
        System.out.println(Arrays.toString(a));
        
    }
    
    public void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(a, left, right);
            quickSort(a, left, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, right);
        }
    }
    
    public void sort(int a[])
    {
        quickSort(a, 0, a.length - 1);
        System.out.println("Mang sau khi xoa la: ");
        System.out.println(Arrays.toString(a));
    }

    public int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[right];
        a[right] = temp;
        return i + 1;
    }
    
    public void kiemtra(int a[]){
        System.out.println("Nhap gia tri can tim: ");
        int k = Validation.getInt();
        int flag = 0;
        int i = 0;
        for(i = 0; i < a.length;i++)
        {
            if(a[i] == k)
            {
                System.out.println(k + " xuất hiện tại vị trí " + i);
                flag = 1;
            }
        }
        
        if(flag == 0)
        {
            System.out.println("Không tim thấy giá tri " + k);
        }
        
    }
}
