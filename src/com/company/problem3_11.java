package com.company;

import java.util.Scanner;

public class problem3_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
