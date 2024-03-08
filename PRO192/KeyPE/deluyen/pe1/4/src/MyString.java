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
        int i;
        int j;
        for(i = 0; i < s.length; i++){
            for(j = 0; j < s[i].length();j++){
                if("13579".contains(s[i].charAt(j)+"")){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        int pos = -1;
        String[] s = str.split("\\s");
        int i;
        for(i = 0; i < s.length;i++){
            if(check(s[i])){
                pos = i;
                break;
            }
        }
        if(pos != -1){
            s[pos] = "XX";
        }
        String sn = "";
        for(i = 0 ; i < s.length;i++){
            sn += s[i] + " ";
        }
        return sn.trim();
            
    }
    
    public boolean check(String s){
        StringBuffer string = new StringBuffer(s);
        if(string.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }
}
