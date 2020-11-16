package com.company;

import java.util.Scanner;

public class problem3_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        int number1 = 0;
        int number2 = 1;
        int numberN = 1;
        System.out.print(number1 + ", " + number2 + ", ");

        for (int i = 2; i < number; i++) {
            numberN = number1 + number2;
            number1 = number2;
            number2 = numberN;
            System.out.print(numberN + ", ");
        }
    }
}



