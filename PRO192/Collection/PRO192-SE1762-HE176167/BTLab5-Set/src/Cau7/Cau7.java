/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fpt
 */
public class Cau7 {
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
        String[] arr = set.toArray(new String[set.size()]);
        System.out.println("New Array: ");
        for(int i = 0 ;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
