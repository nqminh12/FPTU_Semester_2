/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau6 {
    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Set<String> set = new HashSet<>();
    private static Set<String> set2 = new HashSet<>();
    public static void main(String[] args) {
        // TODO code application logic here
        set.add("Python");
        set.add("Java");
        set.add("C++");
        addToAnother();
        System.out.println("New set after add all old set: ");
        System.out.println(set2);
        
    }
    
    public static void addToAnother(){
        set2.addAll(set);
    }
}
