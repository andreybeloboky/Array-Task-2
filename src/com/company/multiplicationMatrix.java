package com.company;

public class multiplicationMatrix {
    public static int[][] calculatorMatrix(int[][] matrixA, int[][] matrixB, int numberOfColumnsMatrixA, int numberOfLineMatrixA, int numberOfColumnsMatrixB, int numberOfLineMatrixB) {
        int[][] multiplicationMatrix = new int[numberOfColumnsMatrixA][numberOfLineMatrixB];
        for (int i = 0; i < numberOfColumnsMatrixA; i++) {
            for (int j = 0; j < numberOfLineMatrixB; j++) {
                for (int k = 0; k < numberOfLineMatrixA; k++) {
                    multiplicationMatrix[i][j] = matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return multiplicationMatrix;
    }
}
