package com.company;

public class problem3_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
    }
}
