package com.Francis;

import java.util.Scanner;

public class Temperature_checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isFlag = true;

        while (isFlag) {
            System.out.println("1 = Celsius to Fahrenheit \t 2 = Fahrenheit to Celsius \t 0 = Exit");
            int ch = in.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the Celsius value:");
                    float cel = in.nextFloat();
                    float far = (cel * 1.8f) + 32;
                    System.out.println(cel + "°C = " + far + "°F");
                }
                case 2 -> {
                    System.out.println("Enter the Fahrenheit value:");
                    float far = in.nextFloat();
                    float cel = (far - 32) / 1.8f;
                    System.out.println(far + "°F = " + cel + "°C");
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    isFlag = false; // break the loop
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
