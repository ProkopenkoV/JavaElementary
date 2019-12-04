package com.hillel.prokopenko.javaelementary;

public class SequencesOfNumbers {

    public static void main(String[] args) {
        int[] firstSequences = new int[]{1, 2, 3, 4, 2, 3, 4, 5, 5};
        int[] secondSequences = new int[]{5, 4, 0};
        int numberOfPair = 0;
        boolean previousNumber = false;
        for (int i = 0; i < firstSequences.length; i++) {
            if (numberOfPair == secondSequences.length) {
                break;
            }
            if (!previousNumber) {
                numberOfPair = 0;
            }

            for (int j = 0; j < secondSequences.length; j++) {
                if (firstSequences[i] == secondSequences[j]) {
                    numberOfPair++;
                    previousNumber = true;
                    break;
                } else {
                    previousNumber = false;
                }
            }
        }
        if (numberOfPair == secondSequences.length) {
            System.out.println("The first sequence includes a second sequence");
        } else {
            System.out.println("The first sequence doesn't include the second sequence");
        }
        System.out.println();
    }
}
