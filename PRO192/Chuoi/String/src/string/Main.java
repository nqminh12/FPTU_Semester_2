/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(Main[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter string: ");
        String s = input.nextLine();
        int count = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            count++;
        }
        System.out.println("Độ dài của chuỗi là: " + count);
        
    }
    
}
