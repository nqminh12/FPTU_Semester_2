/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.util.HashMap;

/**
 *
 * @author Fpt
 */
public class Cau2 {
    /**
     * @param args the command line arguments
     */
    private static HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static void main(String[] args) {
        // TODO code application logic here
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("Old HashMap: ");
        function();
        
    }
    
    public static void function(){
        int a = capitalCities.size();
        System.out.println("There are " + a + " key/value in this HashMap");
    }
}
