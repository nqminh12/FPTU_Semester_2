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
        String s[] = str.split("\\s");
        for(int i = 0; i < s.length;i++){
            if(check(s[i])){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
         String s[] = str.split("\\s");
         int max = Integer.MIN_VALUE;
         int index = -1;
         String s1 = null;
         
         
         for(int i = 0; i < s.length; i++)
         {
             if(lengthix(s[i]) > max){
                 max = lengthix(s[i]);
                 index = i;
             }
         }
         
         String news = "";
         for(int i = 0; i < s.length;i++)
         {
             if(i != index){
                 news += s[i] + " ";
             }else{
                 news += reverse(s[i]) + " ";
             }
         }
         return news.trim();
         
    }
    public boolean check(String ss){
        char s[] = ss.toCharArray();
        if(s[s.length -1] == 'm' || s[s.length - 1] == 'n'){
            return true;
        }
        return false;
    }
    
    
    public String reverse(String s){
        StringBuffer sc = new StringBuffer(s);
        return sc.reverse().toString();
    }
    public int lengthix(String s){
        char s1[] = s.toCharArray();
        return s1.length;
    }
    
}
