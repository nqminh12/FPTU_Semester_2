/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau1 {

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
        System.out.println("Set before adding element: " + set); 
        add();
        System.out.println("Set after adding element: " + set);
        
    }
    
    public static void add(){
        System.out.println("Enter element: ");
        String s = sc.nextLine();
        set.add(s);
    }
}
