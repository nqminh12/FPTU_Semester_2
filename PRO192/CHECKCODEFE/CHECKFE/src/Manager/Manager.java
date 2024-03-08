/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Object.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Fpt
 */
public class Manager {
    
    public void sort(int[] a, int low, int high){
        if(low < high){
            int pi = sortSub(a, low, high);
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);
        }
    }
    
    public int sortSub(int[] a, int low, int high){
        int p = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(a[j] < p){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[high];
        a[high] = t;
        return i + 1;
    }
        
    
}
