/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang.array;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class MangArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a[];
        int i , j ;
        System.out.println("Nhap so phan tu mang: \n");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Nhap mang: \n");
        for(i = 0 ;i < n; i++)
        {
           a[i] = sc.nextInt();
        }
    /* Bai 1   
        // xap tu be den lon
        int c;
        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n; j++)
            {
                if(a[j] <= a[i])
                {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la :");
        for(int x: a)
        {
            System.out.print(x + " ");
        }
        
        //tu lon den be
        
        int c;
        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n; j++)
            {
                if(a[j] >= a[i])
                {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la :");
        for(int x: a)
        {
            System.out.print(x + " ");
        }
        */
        
    /*   Bai 2 
    int s = 0;
    for(int x : a)
    {
        s += x;
    }
        System.out.println("Tổng của các phần tử trong mảng là: " + s);
    }
    */
    
    
   /* bai 3 
    
    int count = 0;
    int k;
    int flag = 0;
    
    
    for( i = 0; i < n; i++)
    {
        for(j = i + 1 ; j < n ; j++)
        {
            if(a[i] == a[j])
            {
                count += 1;
                for(k = j; k < n - 1; k++)
                {
                    a[k] = a[k + 1];
                    
                }
                n-= 1;
                j--;
                
            }
        
        }
        if(count > 0)
        {
             System.out.println("Gia tri " + a[i] + " lạp " + count + " lần.");
             flag = 1;
             count = 0;
        }
        
       
        
    }
    if(flag == 0 )
    {
        System.out.println("Mang khong co gia tri nao trung lap.");
    }
    
*/
    
    
    /* bai 4
    int s = 0;
    for(int x : a)
    {
        s += x;
    }
    System.out.println("Gia tri trung binh cua mang la: " + (float)s/n);
     

*/
    
    /* bai 5 
    int c;
        for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n; j++)
            {
                if(a[j] >= a[i])
                {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
    int max2nd = a[0];
    for(i = 0 ; i < n; i++)
    {
        if(a[i] > a[i + 1])
        {
            max2nd = a[i + 1];
            break;
        }
    }
        System.out.println("Số lớn thứ hai trong mảng là: " + max2nd);
*/
    
    // bai 6
    int c;
    for(i = 0; i < n; i++)
        {
            for(j = i + 1; j < n; j++)
            {
                if(a[j] <= a[i])
                {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
    int min2nd = a[0];
    for(i = 0 ; i < n; i++)
    {
        if(a[i] < a[i + 1])
        {
            min2nd = a[i + 1];
            break;
        }
    }
    System.out.println("Số nhỏ thứ hai trong mảng là: " + min2nd);


    
    
       
    
        
    }
    
}
