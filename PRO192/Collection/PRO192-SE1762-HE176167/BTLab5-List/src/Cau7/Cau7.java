/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau7;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau7 {

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
        
        function7();
    }
    
    
      public static void function7(){
        System.out.println("=====cau 7=====");
        System.out.println("Enter first element:");
        int first = sc.nextInt();
        list.add(0, first);
        System.out.println(list);
    }
   
}
