package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(maxMirror(array));
    }

    private static int maxMirror(int[] array) {
        int length = array.length + 1;
        int result = 0;
        int[][] mem = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || j == 0) {
                    mem[i][j] = 0;
                }
                else {
                    if (array[i - 1] == array[array.length - j]) {
                        mem[i][j] = mem[i - 1][j - 1] + 1;
                        if (mem[i][j] > result) result = mem[i][j];
                    }
                    else {
                        mem[i][j] = 0;
                    }
                }
            }
        }
        return result;
    }
}
