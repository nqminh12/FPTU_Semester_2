/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menulab1;

/**
 *
 * @author Fpt
 */

//import static java.lang.System.exit;
//import java.util.Arrays;
import java.util.Scanner;


public class Menulab1 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("2 options:");
        System.out.println("[A]. Mảng 1 chiều");
        System.out.println("[B]. Mảng 2 chiều");
        System.out.println("[E]. Thoát");
        System.out.println("Nhập lựa chọn: ");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            String choice = input.next();
            input.nextLine();
            switch (choice) {
                case "A":
                    functionA();
                    break;
                case "B":
                    functionB();
                    break;
                case "E":
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        }
    }

    public static void menuA() {
        System.out.println("[1]. Sắp xếp tăng dần.");
        System.out.println("[2]. In số lớn nhất và nhỏ nhất.");
        System.out.println("[3]. Xóa phần tử trùng nhau.");
        System.out.println("[4]. Thống kê số chẵn, số lẻ.");
        System.out.println("[5]. Trở lại menu chính.");
    }
//  Chức năng A
    public static void functionA() {
	System.out.println("Nhập số phần tử mảng:");
        int n = input.nextInt();
        int[] a = nhapMang(n);
        boolean flagA = true;
        while (flagA) {
            menuA();
            System.out.println("Nhập lựa chọn:");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    int left = 0;
                    int right = a.length - 1;
                    
                    quickSort(a, left,right );
                    System.out.println("Mảng sau khi sắp xếp:");
                    showArray(a);
                    break;
                case 2:
                    minAndMax(a);
                    break;
                case 3:
                    xoaPhanTuLap2(a, n);
                    
                    break;
                case 4:
                    countEvenAndOdd(a, n);
                    
                    break;
                case 5:
                    System.out.println("Trở lại menu chính!");
                    flagA = false;
                    break;
                default:
                    System.out.println("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        }
    }
    
// Nhập Mảng 
        public static int[] nhapMang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        return a;
    }

// Case 1 chức năng A:
    public static void quickSort(int[] a, int left, int right) {
        if (a == null || a.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        int pivot = a[middle];
        int i = left, j = right;
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(a, left, j);
        }
        if (right > i) {
            quickSort(a, i, right);
        }
    }
    

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
 
// Case 2 chức năng A
    public static void minAndMax(int[] a) {
        int max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        
        
        int min = a[0];
        for (int j = 0; j < a.length; j++) {
            if (min > a[j]) {
                min = a[j];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
    
// Case 3 chức năng A
   public static void xoaPhanTuLap2(int[] a, int n)
    {
        int j = 0;
        if(n == 0 )
        {
            j = 0;
        } else if(j == 1){
            j = 1;
        }
        else{
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        }
        
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
   

    
// Case 4 chức năng A
  
   
   
   public static void countEvenAndOdd(int[] a, int n) {
        
        int countEven = 0;
        System.out.println("Các số chẵn trong mảng là:");
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                countEven++;
            }
        }
        System.out.println(" => Trong mảng có " + countEven + " số chẵn.");
        
        int countOdd = 0;
        System.out.println("Các số lẻ trong mảng là: ");
        for (int j = 0; j < a.length; j++) {
            if(a[j] % 2 != 0) {
                System.out.print(a[j] + " ");
                countOdd++;
            }
        }
        System.out.println(" => Trong mảng có " + countOdd + " số lẻ.");
    }
    
    
    
// chức năng B
    public static void functionB() {
        System.out.println("[1].Cộng hai mảng ");
        System.out.println("[2].Nhân hai mảng");
        System.out.println("[3].Trở lại menu chính");
        Scanner sc = new Scanner(System.in);
        int choice2;
        do {
            System.out.print("Chọn (1,2,3): ");
            choice2 = Integer.parseInt(sc.nextLine());
            switch (choice2) {
                case 1:
                    int rowA,
                     colA,
                     rowB,
                     colB;
                    Scanner scanner1 = new Scanner(System.in);
                    do {
                        System.out.print("Nhập số hàng của ma trận 1:");
                        rowA = scanner1.nextInt();
                        System.out.print("Nhập số cột của ma trận 1:");
                        colA = scanner1.nextInt();
                    } while (rowA < 1 || colA < 1);
                    Scanner scanner2 = new Scanner(System.in);
                    do {
                        System.out.print("Nhập số hàng của ma trận 2:");
                        rowB = scanner2.nextInt();
                        System.out.print("Nhập số cột của ma trận 2:");
                        colB = scanner2.nextInt();
                    } while (rowB < 1 || colB < 1);
                    if (rowA != rowB || colA != colB) {
                        System.out.println("Sai điều kiện");
                    } else {
                        System.out.println("Tổng 2 mảng là: ");
                        addArray(rowA, colA);
                    }
                    break;
                case 2:
                    int rowC,
                     colC,
                     rowD,
                     colD;
                    Scanner scanner4 = new Scanner(System.in);
                    do {
                        System.out.print("Nhập số hàng của ma trận 1:");
                        rowC = scanner4.nextInt();
                        System.out.print("Nhập số cột của ma trận 1:");
                        colC = scanner4.nextInt();
                    } while (rowC < 1 || colC < 1);
                    Scanner scanner5 = new Scanner(System.in);
                    do {
                        System.out.print("Nhập số hàng của ma trận 2:");
                        rowD = scanner5.nextInt();
                        System.out.print("Nhập số cột của ma trận 2:");
                        colD = scanner5.nextInt();
                    } while (rowD < 1 || colD < 1);
                    if (colC != rowD) {
                        System.out.println("Sai điều kiện");
                    } else {
                        System.out.println("Tích 2 ma trận là: ");
                        mulArray(rowC, colC, colD);
                    }
                    break;
                case 3:
                    System.out.println("Trở lại menu");
                    break;
                default:
                    System.out.println("Chọn (1,2,3) ");
                    break;
            }
        } while (choice2 != 3);
    }
// tổng hai mảng
    public static void addArray(int a, int b) {
        Scanner scanner3 = new Scanner(System.in);
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[a][b];
        int[][] matrix3 = new int[a][b];
        System.out.println("Nhập phần tử của ma trận 1 ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("ma trận 1[" + i + "," + j + "] = ");
                matrix1[i][j] = scanner3.nextInt();
            }
        }
        System.out.println("Nhập phần tử của ma trận 2 ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("ma trận 2[" + i + "," + j + "] = ");
                matrix2[i][j] = scanner3.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Ma trận 1:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma trận 2:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tổng của ma trận 1 và ma trận 2 :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
// tích 2 mảng
    public static void mulArray(int a, int b, int c) {
        Scanner scanner6 = new Scanner(System.in);
        int A[][] = new int[a][b];
        int B[][] = new int[b][c];
        int C[][] = new int[a][c];
        System.out.println("Nhập phần tử của ma trận 1 ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("ma trận 1[" + i + "," + j + "] = ");
                A[i][j] = scanner6.nextInt();
            }
        }
        System.out.println("Nhập phần tử của ma trận 2 ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("ma trận 2[" + i + "," + j + "] = ");
                B[i][j] = scanner6.nextInt();
            }
        }
        // Multiply matrices
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Ma trận 1:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma trận 2:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tích của ma trận 1 và ma trận 2 là :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }



    
     
}
