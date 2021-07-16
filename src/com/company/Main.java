package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixA = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int numberOfLineMatrixA = scanner.nextInt();
        int[][] matrixA = matrix.creatureMatrix(numberOfLineMatrixA, numberOfColumnsMatrixA);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixB = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int numberOfLineMatrixB = scanner.nextInt();
        int[][] matrixB = matrix.creatureMatrix(numberOfLineMatrixB, numberOfColumnsMatrixB);
        if (numberOfLineMatrixA == numberOfColumnsMatrixB) {
            int[][] matrixAB = multiplicationMatrix.calculatorMatrix(matrixA, matrixB, numberOfColumnsMatrixA, numberOfLineMatrixA, numberOfColumnsMatrixB, numberOfLineMatrixB);
            for (int i = 0; i < numberOfColumnsMatrixA; i++) {
                for (int j = 0; j < numberOfLineMatrixB; j++) {
                    System.out.print(" " + matrixAB[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error");
        }
    }
}
