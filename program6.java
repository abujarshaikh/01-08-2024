// write a java program print the average of even indexed elements of an array

import java.util.Scanner;

public class program6 {
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
               if (arr[i] % 2 == 0) {
                    sum = sum + arr[i];
               }
          }
          System.out.println("Average of even indexed elements of an array is: " + (double) sum / n);
          sc.close();

     }
}
