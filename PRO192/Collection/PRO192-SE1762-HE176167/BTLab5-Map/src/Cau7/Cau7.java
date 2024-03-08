/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau7;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Cau7 {
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
        System.out.println("Enter key that you want to check: ");
        String key = sc.nextLine();
        if(capitalCities.containsKey(key)){
            System.out.println("Key exist!");
        } else{
            System.out.println("Key not exist!");
        }
    }
}
