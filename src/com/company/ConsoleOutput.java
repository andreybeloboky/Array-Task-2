package com.company;

public class ConsoleOutput {
    public static void arrayOutput  (int [][] matrixAB){
        for (int i = 0; i < matrixAB.length; i++) {
            for (int j = 0; j < matrixAB[0].length; j++) {
                System.out.print(" " + matrixAB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
