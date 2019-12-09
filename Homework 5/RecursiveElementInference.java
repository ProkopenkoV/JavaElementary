package com.hillel.prokopenko.javaelementary;

public class RecursiveElementInference {
    public static void main(String[] args) {
        Operations recursive = new Operations(5);
        int i;
        for (i = 0; i < 5; i++) {
            recursive.array[i] = i;
        }
        System.out.print("Recursive сonclusion:");
        recursive.printArray(5);
        System.out.println(" ");
        System.out.println("The sum of the digits of the number is " + recursive.sumOfNum(7563932));
    }

}

class Operations {
    int array[];

    public Operations(int i) {
        array = new int[i];
    }

    void printArray(int i) {
        if (i < 1) {
            return;
        } else {
            System.out.print(i-- + " ");
            printArray(i);
        }
    }

    int sumOfNum(int i) {
        if (i < 10) {
            return i;
        } else {
            return i % 10 + sumOfNum(i / 10);
        }
    }
}