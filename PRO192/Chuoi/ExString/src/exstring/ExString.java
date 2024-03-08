/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exstring;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;

public class ExString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Ex 1:
        System.out.println("Enter string: ");
        String s = input.nextLine();
        int count = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            count++;
        }
        System.out.println("Độ dài của chuỗi là: " + count);
    }
*/
        
        /* Ex 2:
        System.out.println("Enter string: ");
        String s = input.nextLine();
        for(int i = 0; i < s.length(); i++)
        {
            System.out.print(s.charAt(i) + " ");
        }
*/
        /* Ex 3:
        System.out.println("Enter string: ");
        String s = input.nextLine();
        for(int i = s.length() - 1; i >= 0; i--)
        {
            System.out.print(s.charAt(i) + " ");
        }
*/
        
        System.out.println("Enter string: ");
        String s = input.nextLine();
        int count = 1;
        for(int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i - 1) != ' ')
            {
                count++;
            }
        }
        System.out.println("Trong chuỗi có " + count + " từ.");

        /* Ex 5:
        System.out.println("Enter string 1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string 2: ");
        String s2 = input.nextLine();
        if(s1.length() == s2.length())
        {
            
        }
*/
        
    
}
}
