

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        // int[][] mat = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // System.out.println("Transpose:");
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++)
        //         System.out.print(mat[j][i] + " ");
        //     System.out.println();
        // }


        // int sum = 0;
        // for (int i = 0; i < mat.length; i++){
        //     for (int j = 0; j < mat[i].length; j++){
        //         sum += mat[i][j];
        //     }
        // }
        // System.out.println("Sum = " + sum);

        // System.out.print("Main Diagonal: ");
        // for (int i = 0; i < mat.length; i++)
        //     System.out.print(mat[i][i] + " ");




        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0, max = arr[0], index = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Max = " + max + " at index " + index);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");

        sc.close();
    }
}
