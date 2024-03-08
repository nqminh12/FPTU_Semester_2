/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau9;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau9 {

    /**
     * @param args the command line arguments
     */
    static LinkedList<Integer> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        list.add(12);
        list.add(53);
        list.add(67);
        list.add(43);
        list.add(55);
        list.add(12);
        
        function9();
    }
    
    
    public static void function9(){
        System.out.println("=====cau 9=====");
        System.out.println("Enter number of element that you want to add");
        int num = sc.nextInt();
        for(int i = 1; i <= num;i++)
        {
            System.out.println(i+ ".");
            System.out.println("Enter element: ");
            int x = sc.nextInt();
            System.out.println("Enter index:");
            int index = sc.nextInt();
            list.add(index, x);
        }
        System.out.println(list);
    }
   
}
