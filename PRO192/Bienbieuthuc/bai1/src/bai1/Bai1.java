/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Bai 1:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap b: ");
        int b = Integer.parseInt(sc.nextLine());
        float c = (float)a/b;
        System.out.println("Sau khi lam tron: ");
        int d = (int)(c + 0.5);
        System.out.println(d);*/
        
        /* bai 2 
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        float n = sc.nextFloat();
        int a = (int)n;
        float b = n - (float)a;
        
        System.out.println("phan nguyen\n" + (int)n);
        System.out.format("phan du:\n %.2f", b);
        */
        
        /* bai 3 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: \n");
        float n = sc.nextFloat();
        int a = (int)n;
        float b = n - (float)a;
        if(b == 0)
        {
            System.out.println("b la so nguyen");
        }else {
            System.out.println("b ko phai so nguyen");
        }   */
        
        
        /*  Bai 5 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: \n");
        //int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();
        int a = 0;
        int x;
        
        do
        {
           x =  n % 10;
           n /= 10;
           a = 10 * a + x;
        }while(n > 0);
        System.out.println("So sau khi dao nguoc la: \n");
        System.out.println(a);
        */
        
        
        /* Bai 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: \n");
        int n = Integer.parseInt(sc.nextLine());
        if(n < 0)
        {
            System.out.println(-n);
        }else
        {
            System.out.println(n);
        }  */
        
        
        /* Bai 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        float n = sc.nextFloat();
        int a = (int)n;
        float b = (float)a;
        System.out.println("Sau khi lam tron: ");
        System.out.print(b);
        System.out.println("\n");
        */
        
        /* Bai 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: \n");
        float n = sc.nextFloat();
        if(n < 0)
        {
            System.out.println(-n);
        }else
        {
            System.out.println(n);
        }
        */
        
        
        /* Bai 6
        int i;
        int[] a;
        a = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so la ma: \n");
        String lama = sc.nextLine();
        int len = lama.length();
        for(i = 0; i < len; i++)
        {
        if(lama.charAt(i) == 'I')
            a[i] = 1;
        else if(lama.charAt(i) == 'V')
            a[i] = 5;
        else if(lama.charAt(i) == 'X')
            a[i] = 10;
        else if(lama.charAt(i) == 'L')
            a[i] = 50;
        else if(lama.charAt(i) == 'C')
            a[i] = 100;
        else if(lama.charAt(i) == 'D')
            a[i] = 500;
        else if(lama.charAt(i) == 'M')
            a[i] = 1000;
        }
    int k = a[len-1];
    for(i = len-1; i > 0; i--)
    {
        if(a[i] > a[i-1])
            k = k - a[i-1];
        else if(a[i] == a[i-1] || a[i] < a[i-1])
            k = k + a[i-1];
    }
        System.out.println(k);
        */
        
        
        /* Bai 4 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: \n");
        float n = sc.nextFloat();
        System.out.println("so sau khi lam tron\n");
        System.out.format("%.2f\n", n);
        */
        
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.println("Nhap so phan tu mang: \n");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Nhap mang: \n");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
            
        }
        int s = 0;
        for(int i : a)
        {
            s += i;
        }
        
        System.out.println((float)s/n);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
