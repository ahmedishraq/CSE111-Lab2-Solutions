/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                flag++;
            }
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
