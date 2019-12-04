package com.hillel.prokopenko.javaelementary;

public class NumberLength {

    public static void main(String[] args) {
        int[] arrForHW3 = {15, 71, 4, 583, 1987};
        System.out.print("Source numbers: ");
        for (int i = 0; i < arrForHW3.length; i++) {
            System.out.print(arrForHW3[i] + " ");
        }
        System.out.println("\n");
        for (int i = arrForHW3.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrForHW3[j] > arrForHW3[j + 1]) {
                    int tp = arrForHW3[j];
                    arrForHW3[j] = arrForHW3[j + 1];
                    arrForHW3[j + 1] = tp;
                }
            }
        }

        System.out.print("The shortest number: ");
        for (int i = 0; i < arrForHW3.length - 1; i++) {
            if (numberLengthDetermination(arrForHW3[i]) == numberLengthDetermination(arrForHW3[i + 1])) {
                System.out.print(arrForHW3[i] + " ");
            } else {
                System.out.print(arrForHW3[i]);
                break;
            }
        }
        System.out.println();
        System.out.print("The longest number: ");
        for (int i = arrForHW3.length - 1; i > 0; i--) {
            if (numberLengthDetermination(arrForHW3[i]) == numberLengthDetermination(arrForHW3[i - 1])) {
                System.out.print(arrForHW3[i] + " ");
            } else {
                System.out.print(arrForHW3[i]);
                break;
            }
        }
    }

    public static int numberLengthDetermination(int num) {
        int def = 0;
        while (num != 0) {
            num /= 10;
            def++;
        }
        return def;
    }
}

