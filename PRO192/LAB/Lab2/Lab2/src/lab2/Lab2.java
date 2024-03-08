/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    
    private static void menu(){
        System.out.println("1. Viết hoa ký tự đầu tiên trong chuỗi và đầu của câu tiếp theo. ");
        System.out.println("2. Tìm và xóa khoảng trắng dư.");
        System.out.println("3. Tìm và viết lại New Generation University.");
        System.out.println("4. Tìm và viết in hoa VIETNAM.");
        System.out.println("5. Tìm và đổi financing Promoting Technology thành FPT University.");
        System.out.println("6. Thống kê nguyên aamm và phụ âm trong đoạn văn trên.");
        System.out.println("0. Thoat!");
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "financing Promoting Technology was established with the mission to develop a ‘new generation university’ with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        boolean flag = true;
        int i;
        menu();
        while(flag)
        {
            int choice = getInput.getInput();
            switch(choice){
                case 1:
                    char[] a = text.toCharArray();
                    a[0] -= 32;
                    for(i = 0 ; i < a.length - 1; i++)
                    {
                        if(a[i] == '.')
                        {
                            a[i + 2] -= 32;
                        }
                    }
                    
                    System.out.println("Chuỗi mới: ");
                    System.out.println(text);
                    break;
                case 2: 
                    text = text.replaceAll("\\s+", " ").trim();
                    System.out.println("Chuỗi mới: ");
                    System.out.println(text);
                    break;
                case 3:
                    text = text.replaceAll("new generation university", "New Generation University");
                    System.out.println("Chuỗi mới: ");
                    System.out.println(text);
                    break;
                case 4:
                    text = text.replaceAll("Vietnam", "VIETNAM");
                    System.out.println("Chuỗi mới: ");
                    System.out.println(text);
                    break;
                case 5:
                    text = text.replaceAll("Financing Promoting Technology", "FPT University");
                    System.out.println("Chuỗi mới: ");
                    System.out.println(text);
                    break;
                case 6:
                    int phuam = 0 , nguyenam = 0;
                    text = text.toLowerCase();
                    char x;
                    for(i = 0; i < text.length(); i++)
                    {
                        x = text.charAt(i);
                        if(x == 'a' || x == 'u' || x == 'e' || x == 'o' || x == 'i')
                        {
                            nguyenam++;
                        } else if(x >= 'b' && x <= 'z')
                        {
                            phuam++;
                        }
                    }
                    System.out.println("Chuỗi bao gồm " + phuam + " phu am!");
                    System.out.println("Chuỗi bao gồm " + nguyenam + " nguyen am!");
                   
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    flag = false;
                
            }
            
        }
    }
    
}
