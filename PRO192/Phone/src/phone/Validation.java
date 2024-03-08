/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
    public static int getInt(String msg){
        System.out.println(msg);
        while (true) {            
            try {
                String s = sc.nextLine().trim();
                int n = Integer.parseInt(s);
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Must be number! Please input again");
            }
        }
    }
    public static String getString(String msg){
        System.out.println(msg);
        while (true) {            
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                System.err.println("Not allow input empty string! Please input again!");
                continue;
            }
            return s;
            
        }
    }
}
