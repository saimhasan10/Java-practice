// implementation of 2D array using matrix summation

import java.util.Scanner;

public class array_in_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of row and column: ");
        int size = input.nextInt();

        int [][] matrix1 = new int [size][size];
        int [][] matrix2 = new int [size][size];

        System.out.println("Enter the elements of first matrix:");
        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                
                matrix1[i][j] = input.nextInt();
            }
            System.out.println("\n");
        }

        System.out.println("Enter the elements of second matrix:");
        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                matrix2[i][j] = input.nextInt();
            }
            System.out.println("\n");
        }

        System.out.println("First matrix:");
        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println("\n");
        }

        System.out.println("Second matrix:");
        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println("\n");
        }
        int [][] sum = new int[size][size];

        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                sum [i][j] = matrix1[i][j]+ matrix2[i][j];
            }
            System.out.println("\n");
        }

        System.out.println("Sum of the  matrices:");
        for(int i= 0; i < size; i++)
        {
            for (int j= 0; j < size; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
