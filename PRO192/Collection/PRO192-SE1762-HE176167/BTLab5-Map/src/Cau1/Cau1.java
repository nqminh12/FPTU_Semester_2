/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static void main(String[] args) {
        // TODO code application logic here
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("Old HashMap: " + capitalCities);
        function();
        System.out.println("New HashMap: " + capitalCities);
    }
    
    public static void function(){
        String s1;
        String s2;
        System.out.println("Enter Key: ");
        s1 = sc.nextLine();
        System.out.println("Enter Value: ");
        s2 = sc.nextLine();
        capitalCities.put(s1, s2);
    }
    
}
