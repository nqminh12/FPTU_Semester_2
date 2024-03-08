/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Fpt
 */
public class StudentList {

    private final ArrayList<Student> arr = new ArrayList<>();

    void addStudent() {
        
        String code;    
        while(true){
                code = Inputter.inputPattern("Enter student code:", "Student code must be in format <S***>, * is a digit.");
                if(getStudent(code, arr) != null){
                    System.out.println("Code Exist! Please enter another code: ");
                    
                } else{
                    break;
                }
            }
            String name = Inputter.inputNonBlankStr("Enter student name: ");
            int mark = Inputter.inputInt("Enter student mark: ", 0, 10);
            arr.add(new Student(code, name, mark));

       
    }
    public Student getStudent(String code, ArrayList<Student> arr){
        for(Student o : arr)
        {
            if(o.getCode().equals(code))
            {
                return o;
            }
        }
        return null;
    }
    
    public void searchStudent(){
        if(arr.size() ==0){
            System.out.println("Empty List!");
        }else{
           String code;
        code = Inputter.inputPattern("Enter student code:", "Student code must be in format <S***>, * is a digit.");
        if(getStudent(code, arr) == null){
            System.out.println("Student " + code + " doesn't exit");       
        } else{
            System.out.println("OUTPUT: FOUND: ");
            System.out.println(getStudent(code, arr));
        }
        }
        
        
        
    }
    
    public void update(){
        if(arr.size() ==0){
            System.out.println("Empty List!");
        }else{
            String code;
        code = Inputter.inputPattern("Enter student code:", "Student code must be in format <S***>, * is a digit.");
        if(getStudent(code, arr) == null){
            System.out.println("Student " + code + " doesn't exit");       
        } else{
            System.out.println("Old name: " + getStudent(code, arr).getName());
            getStudent(code, arr).setName(Inputter.inputString("New name: "));
            System.out.println("Old mark: " + getStudent(code, arr).getMark());
            getStudent(code, arr).setMark(Inputter.inputInt("New mark 0...10 : ", 0, 10));
            
            System.out.println("Student" + code + " has been updated.");
        }
        }
    }
    
    public void remove(){
        if(arr.size() == 0)
        {
            System.out.println("Empty list!");
        }else{
            String code;
        code = Inputter.inputPattern("Enter student code:", "Student code must be in format <S***>, * is a digit.");
        if(getStudent(code, arr) == null){
            System.out.println("Student " + code + " doesn't exit");       
        }else{
            arr.remove(getStudent(code, arr));
            System.out.println("Student " + code + " has beem removed.");
        }
        }
    }
    
    public void listall(){
        if(arr.size() == 0)
        {
            System.out.println("Empty List!");
        }else{
            System.out.println("Student list:");
        for (Student student : arr) {
            System.out.println(student.toString().toUpperCase());
        }
        System.out.println("TOTAL: " + arr.size() + " student(s)");
        }
    }

}
