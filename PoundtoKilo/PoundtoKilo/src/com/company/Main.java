package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pounds to be converted: " );
        double inputPound = input.nextDouble();
	double outputKilo = inputPound * 0.45359237;
        System.out.println(" Result of pounds converted to kilograms: " + outputKilo);
    }
}
