/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau10 {
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
        function();
    }
    
    public static void function(){
        System.out.println("Enter the key that you want to get value: ");
        String n = sc.nextLine();
        String s = capitalCities.get(n);
        System.out.println(s);
    }
}
