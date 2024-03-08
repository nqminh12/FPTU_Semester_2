/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toanhocabstrction;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;

public class Toanhocabstrction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        
        
        PhepCong Cong = new PhepCong();
        Cong.show(a,b);
        PhepTru Tru = new PhepTru();
        Tru.show(a,b);
        PhepNhan Nhan = new PhepNhan();
        Nhan.show(a,b);
        PhepChia Chia = new PhepChia();
        Chia.show(a,b);
        
    }
    
}
