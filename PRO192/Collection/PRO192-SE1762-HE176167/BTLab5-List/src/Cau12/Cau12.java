/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau12;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau12 {

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
        
        function12();
    }
    
    
    public static void function12(){
        System.out.println("=====cau 12=====");
        System.out.println("Enter the element that you want to delete:");
        int n = sc.nextInt();
        for(int i = 0; i < list.size(); i++)
        {
            if(n == list.get(i))
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

   
}