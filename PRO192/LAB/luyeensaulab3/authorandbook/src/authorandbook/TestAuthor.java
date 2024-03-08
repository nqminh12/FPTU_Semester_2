/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authorandbook;

/**
 *
 * @author Fpt
 */
public class TestAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());
        System.out.println("email is: " + ahTeck.getEmail());
        
    }
    
}
