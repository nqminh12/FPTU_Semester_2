/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmang;

/**
 *
 * @author Fpt
 */
import java.util.Scanner;

public class OntapMang {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Manager manager = new Manager();
        Validation validation = new Validation();
        System.out.println("Nhập số phần tử của mảng: ");
        int n = validation.getInt();
        int i;
        int a[] = new int[n];
        boolean flag = true;
        for(i = 0 ; i < n ; i++)
        {
            System.out.println("a[" + i + "] : ");
            a[i] = validation.getInt();
        }
        
        do{
            manager.menu();
            int choice = validation.checkInputLimitInt(0 , 4);
            switch(choice){
                case 1:
                    manager.nhap(a);
                    break;
                case 2:
                    manager.xoa(a);
                    break;
                case 3:
                    manager.sort(a);
                    break;
                case 4:
                    manager.kiemtra(a);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }while(flag == true);
        
        
        
        
    }
    
    
}
