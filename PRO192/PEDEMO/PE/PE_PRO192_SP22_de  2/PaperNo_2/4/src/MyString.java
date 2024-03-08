/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String[]s = str.split("\\s"); // tach ra tung phan tu
        for(int i = 0; i <s.length;i++)
        {
            //tach tung words ra tung chu mot
            char [] a = s[i].toCharArray();
            //check xem trong tung vi tri co so le nao khong
            for(int j = 0; j < a.length;j++)
            {
                if("13579".contains(""+a[j])){
                    count++;
                }
            }
    }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] s = str.split("\\s");
        int pos = 0;
        for(int i = 0; i < s.length;i++)
        {
            if(checkPallin(s[i]))
            {
                pos = i;
                break;
            }
        }
        s[pos]="XX";
        String output = "";
        for(int i = 0; i <s.length;i++)
        {
            output += s[i] + " ";
        }
        return output.trim();
    }
    public boolean checkPallin(String s)
    {
        // so sanh chuoi goc voi chuoi da dao nguoc
        StringBuffer stringBuffer = new StringBuffer(s);
        if(stringBuffer.reverse().toString().equals(s))
            return true;
        return false;
        
    }
    
}
