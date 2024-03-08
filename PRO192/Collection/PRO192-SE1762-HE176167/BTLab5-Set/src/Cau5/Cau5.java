/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau5 {
     /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        // TODO code application logic here
        set.add("Python");
        set.add("Java");
        set.add("C++");
        check();
        
    }
    
    public static void check(){
        boolean x = set.isEmpty();
        
        if(x)
        {
            System.out.println("The Set is empty");
        }else{
            System.out.println("The Set is not empty");
        }
        
    }
}
