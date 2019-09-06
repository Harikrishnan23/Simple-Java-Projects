package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first double input: ");
        double firstDouble = sc.nextDouble();
        System.out.println("Enter your second double input: ");
        double secondDouble = sc.nextDouble();
        double sum = (firstDouble + secondDouble) * 100.00;
        System.out.println(sum);
        double remainder = sum % 40.00;
        System.out.println(remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);
        if(isZero != true)
            System.out.println("Got some remainder");

    }
}
