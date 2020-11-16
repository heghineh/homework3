package com.company;

import java.util.Scanner;

public class problem3_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();
        boolean isPrime;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println("This number is not prime.");
            } else {
                System.out.println("This number is prime. ");
            }
            break;
        }
    }
}
