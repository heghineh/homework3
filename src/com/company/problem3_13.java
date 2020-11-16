package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem3_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            String[][] matrix = new String[number][number];
            int counter = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    counter++;
                    if (Math.pow(-1, counter) == -1) {
                        matrix[i][j] = "black ";
                    } else {
                        matrix[i][j] = "white ";
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    System.out.print(matrix[i][j] + "   ");
                }
                System.out.println();
            }

        } else {
            number++;
            String[][] matrix = new String[number][number];
            int counter = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    counter++;
                    if (Math.pow(-1, counter) == -1) {
                        matrix[i][j] = "black ";
                    } else {
                        matrix[i][j] = "white ";
                    }
                    matrix[matrix.length - 1][j] = "";
                    matrix[i][matrix.length - 1] = "";
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    System.out.print(matrix[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }
}


