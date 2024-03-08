/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau10;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau10 {

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
        
        function10();
    }
    
    
     public static void function10(){
        System.out.println("====cau 10====");
        System.out.println("Enter element that you want to find index");
        int n = sc.nextInt();
        int first = -1, last = -1;
        for(int i = 0 ;i < list.size(); i++)
        {
            if(n == list.get(i))
            {
                first = i;
                break;
            }
        }
        for(int i = 0 ;i < list.size(); i++)
        {
            if(n == list.get(i))
            {
                last = i;
            }
        }
        if(last == -1 && first == -1)
        {
            System.out.println("Can't find index of " + n);
        } else if(last == first )
        {
            System.out.println("There is only one index of " + n + " is " + first);
        } else {
            System.out.println("The first index: " + first);
            System.out.println("The last index: " + last);
        }
    }
   
}
