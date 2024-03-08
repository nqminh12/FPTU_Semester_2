/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fpt
 */
public class Inputter {

    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (min <= n && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.out.println("Please enter an integer number in range: " + min + "->" + max);
            }
        }
        return n;
    }

    public static String inputNonBlankStr(String msg) {
        String s;
        int flag = 1;
        do {
            System.out.println(msg);
            s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println("Input can't be blank");
                flag = 1;
            } else {
                flag = 0;
            }
        } while (flag == 1);
        return s;
    }
    
    public static String inputPattern(String msg, String pattern) {
        while(true) {
            System.out.println(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty())
            {
                System.err.println(pattern);
                continue;
            }
            if(s.length() != 4){
                System.err.println(pattern);
                continue;
            }
            if(s.charAt(0) == 's')
            {
                s = "S" + s.substring(1, s.length());
            }
            if(s.charAt(0) != 'S')
            {
                System.err.println(pattern);
                continue;
            }
            if(!Character.isDigit(s.charAt(1)) && !Character.isDigit(s.charAt(2)) && !Character.isDigit(s.charAt(3)))
            {
                System.err.println(pattern);
            } else {
                return s;
            }
            
        }
    }
     public static String inputString(String msg) {
        String s;
         System.out.println(msg);
        s = sc.nextLine();
            
        return s;
    }
    
}
