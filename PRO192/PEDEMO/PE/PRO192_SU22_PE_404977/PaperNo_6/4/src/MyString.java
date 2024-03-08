
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
       char c;
       for(int i=0; i<str.length();i++)
       {
           c=str.charAt(i);
           if(Character.isDigit(c)&& check((c-'0'))) //'6'
               count+=c-'0';
               
       }
             return count;
    }
   public boolean check (int x){
       if (x<2) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(x); i++) {
           if(x%i==0){
               return false;
           }
       }
       return true;
   }
    @Override
    public String f2(String str) {
        String [] s = str.split("\\s");
        int count =0 ,count2 =0;
        int pos =-1, pos2 =-1;
        boolean ok =false;
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (i!=j && s[i].equals(s[j])) {
                          pos =i;
                          count++;                
                         ok = true;
                            
                }
            }
            if (ok==true) {
                break;
            }
        }
        
        if (pos>=0) {
            for (int i = pos + 1 ; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (i!=j && s[i].equals(s[j])) {
                    
                    count2++;
                    if (count<count2) {
                        String place1 = s[i].replace(s[i], "T");
                        String place2 = s[j].replace(s[i], "T");
                    }
                    pos = i;
                    ok=true;
                }
                
            }
            if (ok==true) {
                break;
            }
        }
        }
        
        String output = "";
        for (int i = 0; i < s.length; i++) {
            output+=s[i]+" ";
        } 
          
          
          
         
        return output.trim();
    }
    
}
