/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmang;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class Validation {
    public static int checkInputLimitInt(int min, int max) {
        int x;
        Scanner in = new Scanner(System.in);
        try {
            x = in.nextInt();
            if (x < min || x > max) {
                System.out.println("Please input integer from " + min + " to " + max);
                return checkInputLimitInt(min, max);
            }
        } catch (Exception e) {
            System.out.println("Please input integer from " + min + " to " + max);
            return checkInputLimitInt(min, max);
        }
        return x;
    }

    public static int getInt() {
        int x;
        Scanner sc = new Scanner(System.in);
        try{
            x = sc.nextInt();
        }catch(Exception e)
        {
            System.out.println("Phai nhap so nguyen!");
            return getInt();
        }
        
        return x;
    }

}
