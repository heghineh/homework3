package com.company;

import java.util.Scanner;

public class problem3_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the numbers ");

        for (int i = 0; i < 10; i++) {
            System.out.print("---> ");
            int number = scanner.nextInt();
            sum += number;
        }
        int average = sum / 10;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
}
