package com.company;

import java.util.Scanner;

/*
 * @param numberOfColumns - number of columns in a matrix
 * @param numberOfLine - number of lines in a matrix
 * @return - creature matrix;
 */
public class matrix {
    public static int[][] creatureMatrix(int numberOfLine, int numberOfColumns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[numberOfLine][numberOfColumns];
        for (int i = 0; i < numberOfLine; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.println("Enter number");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
