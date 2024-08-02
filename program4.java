// write a java program print sum of all odd elements of array

import java.util.Scanner;

public class program4 {
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
               if (arr[i] % 2 != 0) {
                    sum = sum + arr[i];
               }
          }
          System.out.println("Sum of odd elements of array is " + sum);
          sc.close();
     }
}
