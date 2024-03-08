/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;

/**
 *
 * @author Fpt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PhoneNumber> arr = new ArrayList<>();// khai báo array list để lưu trữ thông tin vào
        
        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        int n;
        while(true)
        {
            System.out.println("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit):");
            n = Validation.getInt("Enter your choice");
            switch(n){
                case 1:
                    int area1 = Validation.getInt("Enter area code: ");
                    String number1 = Validation.getString("Enter number: ");
                    arr.add(new PhoneNumber(area1, number1));
                    break;
                case 2:
                    String countryCode = Validation.getString("Enter country code: ");
                    int area2 = Validation.getInt("Enter area code: ");
                    String number2 = Validation.getString("Enter number: ");
                    arr.add(new IntPhoneNumber(countryCode, area2, number2));
                    break;
                case 0:
                    System.out.println("List of phone numbers:");
                    System.out.println("----------------------------------------");
                    for (PhoneNumber number : arr) {
                        number.display();
                    }
                    System.exit(0);
            }
        }
    }
    
}
