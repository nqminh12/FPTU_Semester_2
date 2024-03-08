/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fpt
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        char a[] = str.toCharArray();
        for(int i = 0 ; i < a.length;i++)
        {
            if(Character.isDigit(a[i]))
            {
                if(isPrime(a[i] - '0'))
                {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String s[] = str.split("\\s");
        String s1 = "";
        for(int i = s.length - 1; i >= 0; i--)
        {
            s1 += " " + s[i]  ;
        }
        return s1.trim();
        
    }
    
    public static boolean isPrime(int s){
        if(s == 2)
        {
            return true;
        } else if(s == 1){
            return false;
        } else{
            for(int i = 2; i <= Math.sqrt(s);i++)
            {
                if(s % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
}
