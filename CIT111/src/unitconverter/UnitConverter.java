/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitconverter;

import java.util.Scanner;

/**
 *
 * @author Alia
 */
public class UnitConverter {

    public static void main(String[] args) {
        System.out.println("********UNIT CONVERTER******** ");
        System.out.println("HELLO! Welcome to unit converter program.\n");
        double celsius, fahrenheit, kilogram;

        Scanner userInput = new Scanner(System.in);
        int relevant = 0;
        // Keep looping until the user chooses exit
        while (relevant != 4) {

            System.out.println("Enter relevant number from below: ");
            System.out.println("1: Celsius To Fahrenheit");
            System.out.println("2: Fahrenheit To Celsius");
            System.out.println("3: Kilogram To Pound");
            System.out.println("4: Exit");

            relevant = userInput.nextInt();
            if (relevant == 1) {
                System.out.println("Enter amount in degrees celsius: ");
                // Get the number to be converted
                celsius = userInput.nextDouble();
                //Show the results of the conversion method
                System.out.println("celsius " + celsius + " is " + celsiusToFahrenheit(celsius) + " in fahrenheit.");
            } else if (relevant == 2) {
                System.out.println("Enter amount in degrees fahrenheit: ");
                fahrenheit = userInput.nextDouble();
                System.out.println("fahrenheit " + fahrenheit + " is " + fahrenheitToCelsius(fahrenheit) + " in celsius.");
            } else if (relevant == 3) {
                System.out.println("Enter amount in kilograms: ");
                kilogram = userInput.nextDouble();
                System.out.println("kilogram " + kilogram + " is " + kilogramToPound(kilogram) + " in pound.");
            } else if (relevant == 4) {
                System.out.println("exit");
            } else {
                System.out.println("WRONG! Please enter a number from the list");
            }
        }
        System.out.println("****THANK YOU! HAVE A GOOD ONE****");

    }//close main

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double kilogramToPound(double kilogram) {
        kilogram = 2.205 * kilogram;
        return kilogram;
    }
}
