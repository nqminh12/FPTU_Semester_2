/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Validation {
    
    public static String inputYN(){
        String s;
        Scanner sc = new Scanner(System.in);
        while (true) {            
                System.out.println("Do you want to enter more student information?(Y/N):Y");
                s = sc.nextLine();
                if(s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("N")){
                    return s;
                } else{
                        System.out.println("Please input Y or N");
                }
            }
    }
    
    
    public static double getDouble(String msg){
        double n;
        Scanner su = new Scanner(System.in);
        while (true) {            
            try {
                n = Double.parseDouble(su.nextLine());
                if(n < 0){
                    System.out.println(msg + " is greater than equal zero");
                } else if(n > 10){
                    System.out.println(msg + " is less than equal ten");
                } else{
                    break;
                }
            } catch (NumberFormatException Invalid) {
                System.out.println(msg + " is digit");
            }
        }
        return n;
        
    }
    
}
