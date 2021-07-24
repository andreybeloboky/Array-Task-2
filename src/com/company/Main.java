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
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of line: ");
        int numberOfLineMatrixB = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixB = scanner.nextInt();
        if (numberOfColumnsMatrixA >= 0 && numberOfLineMatrixA >= 0 && numberOfColumnsMatrixB >= 0 && numberOfLineMatrixB >= 0) {
            int[][] matrixA = Matrix.creatureMatrix(numberOfLineMatrixA, numberOfColumnsMatrixA);
            int[][] matrixB = Matrix.creatureMatrix(numberOfLineMatrixB, numberOfColumnsMatrixB);
            if (numberOfColumnsMatrixA == numberOfLineMatrixB) {
                int[][] matrixAB = MultiplicationMatrix.calculatorMatrix(matrixA, matrixB);
                ConsoleOutput.arrayOutput(matrixAB);
            } else {
                System.out.println("Does not meet the matrix multiplication condition");
            }
        } else {
            System.out.println("Matrix size must be greater than 0");
        }
    }
}

