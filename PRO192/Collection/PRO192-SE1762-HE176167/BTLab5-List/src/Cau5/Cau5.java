/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau5 {

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
        
        function5();
    }
    
    
    public static void function5(){
        System.out.println("=====cau 5=====");
        System.out.println("Enter element:");
        int n = sc.nextInt();
        System.out.println("Enter index:");
        int index = sc.nextInt();
        list.add(index, n);
        System.out.println(list);
    }
    
   
}
