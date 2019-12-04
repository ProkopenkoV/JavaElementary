package com.hillel.prokopenko.javaelementary;

public class MatrixOutput {

    public static void main(String[] args) {
        int size = 61;
        double numberOfCol = Math.sqrt(size);
        if (numberOfCol % 1 != 0)
            numberOfCol++;
        int matrixElement = 1;
        System.out.println("The matrix from left to right and from top to bottom has the following form: ");
        for (int i = 0; i < (int) numberOfCol; i++) {
            for (int j = 0; j < (int) numberOfCol; j++) {
                if ((matrixElement <= size) && matrixElement != 0) {
                    System.out.print(matrixElement + " ");
                    matrixElement++;
                } else {
                    matrixElement = 0;
                    System.out.print(matrixElement + " ");
                }
            }
            System.out.println();
        }
    }
}
