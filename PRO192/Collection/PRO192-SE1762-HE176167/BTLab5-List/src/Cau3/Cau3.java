/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau3 {

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
        
        function3();
    }
    
    
    public static void function3(){
        System.out.println("=====Cau 3=====");
        System.out.println("Enter start index");
        int start = sc.nextInt();
        for (int i = start; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
   
}
