/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau2 {
     /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        // TODO code application logic here
        set.add("Java");
        set.add("Python");
        set.add("C++");
        
        loop();
        
        
    }
    
    public static void loop(){
        for(String i: set){
            System.out.println(i);
        }
    }
}
