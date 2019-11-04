/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j+=2) {
            System.out.print(arr[j] + " ");
        }
        for (int k = 1; k < arr.length; k+=2) {
            System.out.print(arr[k]+ " ");
        }
    }

}
