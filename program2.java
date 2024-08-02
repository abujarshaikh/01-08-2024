// write a java program print sum of all elements of array

import java.util.Scanner;

/**
 * program2
 */
public class program2 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of An Array: ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          int sum = 0;
          for (int i = 0; i < n; i++) {
               sum = sum + arr[i];
          }
          System.out.println("Sum of all elements of array is: " + sum);
          sc.close();
     }
}