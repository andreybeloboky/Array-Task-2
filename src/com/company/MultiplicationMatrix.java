package com.company;

/*
 * @param [][]matrixA - the first matrix created in the Matrix.java class
 * @param [][]matrixB - the first matrix created in the Matrix.java class
 * @return - creature matrix;
 */
public class MultiplicationMatrix {
    public static int[][] calculatorMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] multiplicationMatrix = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    multiplicationMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return multiplicationMatrix;
    }
}
