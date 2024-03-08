/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Fpt
 */
public class Menu {
    public static void menu(){
        System.out.println("(1) Add new student.");
        System.out.println("(2) Search a student (based on code).");
        System.out.println("(3) Update name and mark (based on code).");
        System.out.println("(4) Remove a student (based on code)");
        System.out.println("(5) List all students.");
        System.out.println("(6) Quit.");
    }
    public static void getchoice(){
    StudentList st = new StudentList();
        int choice;
        menu();
        do{
            choice = Inputter.inputInt("Choose 1...6: ", 1, 6);
            switch(choice){
                case 1:
                    st.addStudent();
                    break;
                case 2:
                    st.searchStudent();
                    break;
                case 3:
                    st.update();
                    break;
                case 4:
                    st.remove();
                    break;
                case 5:
                    st.listall();
                case 6:
                    break;
            }
            
        }while(choice < 6);
    }
}
