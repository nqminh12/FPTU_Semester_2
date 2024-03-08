/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau9 {
    
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
        revole();
       
        
    }
    
    public static void revole(){
        ArrayList<String> arr = new ArrayList<String>(set);
        System.out.println("ArrayList is: ");
        System.out.println(arr);
        
    }
}
