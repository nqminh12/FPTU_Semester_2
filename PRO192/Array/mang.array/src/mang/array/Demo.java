/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang.array;

import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Demo {
    private static Scanner sc = new Scanner(System.in);// khởi tạo sc để mọi hàm có thể dùng
    public static void main(String[] args) {
       System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];// khởi tạo mảng số nguyên với n phần tử
        
        System.out.println("Nhập mảng: ");
        nhap(arr);
        
        System.out.println("Tổng các giá trị của mảng là:");
        tong(arr);
    }
    public static void tong(int[] arr){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        
        System.out.println(s);
    }
    
    public static void nhap(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập a[" + i + "]: ");
            a[i] = sc.nextInt();
        } // nhập giá trị từng phần tử mảng
    }
    
    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    
    
}
