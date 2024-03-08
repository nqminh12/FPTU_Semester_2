/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Fpt
 */
public class Cau8 {
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
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println("Tree Set is: ");
        System.out.println(treeSet);
        
    }
}
