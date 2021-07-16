package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixA = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int numberOfLinematrixA = scanner.nextInt();
        int[][] matrixA = matrix.creatureMatrix(numberOfLinematrixA, numberOfColumnsMatrixA);
        System.out.println("Enter size matrixA");
        System.out.println("Enter number of columns: ");
        int numberOfColumnsMatrixB = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int numberOfLinematrixB = scanner.nextInt();
        int[][] matrixB = matrix.creatureMatrix(numberOfColumnsMatrixB, numberOfColumnsMatrixB);
    }
}
