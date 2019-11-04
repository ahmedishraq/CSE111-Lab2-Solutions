/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j]+ " ");
            }
            System.out.println();
        }
    }

}
