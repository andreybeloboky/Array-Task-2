package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of line: ");
        int numberOfLineMatrixA = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixA = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int[][] matrixA = Matrix.creatureMatrix(numberOfLineMatrixA, numberOfColumnsMatrixA);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of line: ");
        int numberOfLineMatrixB = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixB = scanner.nextInt();
        int[][] matrixB = Matrix.creatureMatrix(numberOfLineMatrixB, numberOfColumnsMatrixB);
        if (numberOfColumnsMatrixA == numberOfLineMatrixB) {
            int[][] matrixAB = MultiplicationMatrix.calculatorMatrix(matrixA, matrixB);
            for (int i = 0; i < numberOfLineMatrixA; i++) {
                for (int j = 0; j < numberOfColumnsMatrixB; j++) {
                    System.out.print(" " + matrixAB[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Does not meet the matrix multiplication condition");
        }
    }
}
