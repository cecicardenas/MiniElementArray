package com.timbuchalka;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integer do you need enter:");
        int count = scanner.nextInt();
        int array[] = readIntegers(count);
        System.out.println("The values are:" + Arrays.toString(array));
        System.out.println("The minimum element is= "+ findMin(array));
    }

    public static int[] readIntegers(int count) {
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter " + i + " integer values.\r");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int array[]) {
        int var=0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    var = array[i];
                }
            }
        }
        return var;
    }
}
