package com.hillel.prokopenko.javaelementary;

public class SearchForNumbersWithDifferentNumbers {

    public static void main(String[] args) {
        int[] arr = {666, 71, 4, 99, 583};
        System.out.print("Numbers consisting only of different numbers: ");
        for (int i = 0; i < arr.length; i++) {
            int[] arrNumForTenEl = new int[10];
            int num = arr[i];
            for (int j = 1; j <= numberLengthDetermination(arr[i]); j++) {
                int last = num % 10;
                if (arrNumForTenEl[last] < 1) {
                    arrNumForTenEl[last]++;
                } else {
                    break;
                }
                if (num / 10 == 0) {
                    System.out.print(arr[i] + " ");
                } else {
                    num /= 10;
                }
            }
        }
        System.out.println("\n");
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


