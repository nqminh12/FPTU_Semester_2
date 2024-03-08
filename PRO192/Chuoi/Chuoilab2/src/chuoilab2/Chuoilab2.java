/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoilab2;

/**
 *
 * @author Fpt
 */


public class Chuoilab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "financing Promoting Technology was established with the mission to develop a ‘new generation university’ with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        int i, j;
        // function 1
        
        char[] arr = text.toCharArray();
        for(i = 0; i < arr.length; i++)
            {
                if(arr[i] != ' ' && (arr[i] <= 'z' && arr[i] >= 'a'))
                {
                    arr[i] = Character.toUpperCase(arr[i]);
                    break;
                }
            }
        for(i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == '.' )
            for(j = i + 1; j < arr.length; j++)
            {
                if(Character.isLetter(arr[j]))
                {
                    arr[j] = Character.toUpperCase(arr[j]);
                    break;
                }
                
            }
        }
        System.out.println("Chuoi sau khi viet hoa chữ đầu và chữ sau dấu chấm là: " );
        System.out.println(arr);
        
      
        
        // function 2
        text = text.replaceAll(" ", "");
        System.out.println("chuỗi sau khi xóa khoảng trắng là: \n" + text);
        
        
        
        
        //function 4
        String str = new String(arr);
        int index = str.indexOf("Vietnam");
        if(index == -1)
        {
            System.out.println("Không tim thấy!");
        } else {
            System.out.println("Chuỗi sau khi đổi chữ Vietnam là: ");
            System.out.println(str.substring(0, index) + "VIETNAM" + str.substring(index + 7, str.length()));
        }
        
        // function 3
        
        
        //function 6
        int nguyenam = 0, tong = 0;
        for(i = 0 ; i < text.length(); i++)
        {
            if((text.charAt(i) == 'a') || (text.charAt(i) == 'i') || (text.charAt(i) == 'o') ||(text.charAt(i) == 'u') || (text.charAt(i) == 'e') || (text.charAt(i) == 'A') || (text.charAt(i) == 'E') || (text.charAt(i) == 'U') || (text.charAt(i) == 'I') || (text.charAt(i) == 'O'))
            {
                nguyenam++;
            }
        }
        for(i = 0 ; i < arr.length; i++)
        {
            if(Character.isLetter(arr[i]))
            {
                tong++;
            }
        }
        System.out.println("Trong chuỗi có " + nguyenam + " nguyên âm!");
        System.out.println("Trong chuỗi có " + (tong - nguyenam) + " phụ âm!");
        
        //function 5
        
        
        
        
    }
    
}














