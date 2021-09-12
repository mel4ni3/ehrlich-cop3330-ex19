/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double height = 0.0, weight = 0.0, BMI = 0.0;

        System.out.print("Enter your weight.");
        String Weight = scanner.nextLine();

        try {
            weight = Double.parseDouble(Weight));
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
            Weight = scanner.nextLine();
        }

        System.out.print("Enter your height.");
        String Height = scanner.nextLine();

        try {
            height = Double.parseDouble(Height));
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
            Height = scanner.nextLine();
        }

        BMI = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f.\n", BMI);
        if (BMI < 18.5) {
            System.out.print("You are underweight. You should see your doctor.");
        }
        else if (BMI > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else if (BMI <= 25 && BMI >= 18.5) {
            System.out.print("You are within the ideal weight range.");
        }
    }
}