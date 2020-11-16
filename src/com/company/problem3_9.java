package com.company;

import java.util.Scanner;

public class problem3_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        for(int i=1; i<=number; i++){
            System.out.println("The cube of " + i + " is " + Math.pow(i, 3));
        }
    }
}
