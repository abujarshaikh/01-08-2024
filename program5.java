// write a java program print the average of an array

import java.util.Scanner;

public class program5 {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of An Array: ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          int sum = 0;
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
               sum += arr[i];
          }
          System.out.println("Total Sum is: " + sum);
          System.out.println("Total Number of Elmens: " + n);
          System.out.println("Average of array is: " + (double) sum / n);
          sc.close();
     }
}
