/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
