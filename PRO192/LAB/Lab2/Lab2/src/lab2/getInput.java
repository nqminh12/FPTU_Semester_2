/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Fpt
 */

public class getInput{

    public static int getInput(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lựa chọn: ");
        try {
            choice = sc.nextInt();
            if(choice < 0 || choice > 6)
            {
                System.out.println("Phải nhập từ 0 - 6!");
                return getInput();
                
            }
        }catch(Exception e) {
            System.out.println("Nhập một số nguyên từ 0 đến 6!");
            return getInput();
        }
        return choice;
}
    
}
