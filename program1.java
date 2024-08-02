// write a java program to create a array and initialize the value using scanner 

import java.util.Scanner;

/**
 * program1
 */
public class program1 {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of An Array: ");
          int n = sc.nextInt();
          int arr[] = new int[n];
          System.out.print("Enter Elements of an array: ");
          System.out.println();
          System.out.println("=================================================================");
          for (int i = 0; i < n; i++) {
        	  System.out.print("Enter Elemen"+(i+1)+": ");;
               arr[i] = sc.nextInt();
          }
          System.out.print("Array Elements: ");
          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + ", ");
          }
          System.out.println();
          System.out.println("=================================================================");
          sc.close();

     }
}