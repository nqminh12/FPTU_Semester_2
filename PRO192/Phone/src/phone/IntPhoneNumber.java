/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author Fpt
 */
public class IntPhoneNumber extends PhoneNumber {
    private String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }
    
    @Override
   public void display()
   {
       System.out.println(this.countryCode + " - " + super.getArea() + " - " + super.getNumber());
   }
}
