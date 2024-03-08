/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Manager.Manager;
import Manager.Validation;
import Object.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



/**
 *
 * @author Fpt
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] a = {1,7,4,3,2,8,10};
        int len = a.length;
        Manager ma = new Manager();
        
        System.out.println("Array before sort: ");
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("}");
        System.out.println("");
        
        ma.sort(a, 0, len - 1);
        
        System.out.println("Array after sort: ");
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("}");
    }
   
    
}

    
        
        
    
    

