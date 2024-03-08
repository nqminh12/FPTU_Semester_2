/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau10 {
    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Set<String> set1 = new HashSet<>();
    private static Set<String> set2 = new HashSet<>();
    public static void main(String[] args) {
        // TODO code application logic here
        set1.add("Python");
        set1.add("Java");
        set1.add("C++");
        set2.add("Python");
        set2.add("Java");
        set2.add("C++");
        compare();
        
        
    }
    
    public static void compare(){
        if(set1.equals(set2))
        {
            System.out.println("The two sets is equal!");
        }else{
            System.out.println("The two sets are not equal");
        }
    }
}
