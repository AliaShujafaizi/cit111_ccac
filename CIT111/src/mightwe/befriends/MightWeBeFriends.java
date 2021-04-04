/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mightwe.befriends;

import java.util.Scanner;

/**
 * Program to ask user some questions to compute an overall compatibility score
 *
 * @author Alia
 */
public class MightWeBeFriends {

    public static void main(String[] args) {
        //creat and initioalize variables.
        int q1Score = 0;
        int q2Score = 0;
        int q3Score = 0;
        int compatScore = 0;
        String userInput;
        int userResponse = 0;
        Scanner scan = new Scanner(System.in);
        final int COMPAT_THRESHOLD = 500;

        // welcome user and ask Q1
        System.out.print("Hello! My name is Alia, and this is a test program to see if we might be friends! ");
        System.out.println();
        System.out.println("*************");
        System.out.println("Question #1");
        System.out.println("*************");
        System.out.println();
        System.out.println("First of all, I love cooking, watching movies, and"
                + " learning programing: ");
        System.out.print("Which kind of food would you prefer? ");
        System.out.println("Amarican Food = 1; Middle Eastern Food = 2; Indian Food = 3");

        //use Scanner to grab user input
        userResponse = scan.nextInt();
        // give user 100 points 
        compatScore = 100;
        // Question 2:
        System.out.println("Question 2: Which one of the folowing food you like the most? ");
        System.out.println("1. Mantoo");
        System.out.println("2. Bolani");
        System.out.println("3. Qabili Ozbeki");
        System.out.println("4. Kichry");
        System.out.println("5. Kabab");
        System.out.println("6. Handi");
        System.out.println("7. Beriani");
        System.out.println("8. Shawarma");
        System.out.println("9. Falafil");

        userResponse = scan.nextInt();

        if (userResponse == 1) {//Mantoo
            System.out.println("Wow: you have a great taste in food");
            q1Score = 10;
        } else if (userResponse == 2) {//Bolani
            System.out.println("Yes: that's my favorite too");
            q1Score = compatScore = 80;
        } else if (userResponse == 3) {//Qabili Ozbeki
            System.out.println("Superb! Qabili is the most popular and delicious food in Afghanistan ");
            q1Score = 20;
        } else if (userResponse == 4) {//Kichry
            System.out.print("This is a special food for winter time, when snow is everywhere ");
            System.out.println("and the weather is very cold, I can say you are a foody person too");
            q1Score = 30;
        } else if (userResponse == 5) {//Kabab
            System.out.println("Wow! you choose Kabab? the yummiest");
            q1Score = 70;
        } else if (userResponse == 6) {//Handi
            System.out.println("This is an Indian food, and is great when it's very peppery"
                    + " and serve with chapati");
            q1Score = 50;
        } else if (userResponse == 7) {//Beriani
            System.out.println("Beriani is the best spicy rice, well done!");
            q1Score = 60;
        } else if (userResponse == 8) {//Shawarma
            System.out.println("Turkish! I like chicken shawarma");
            q1Score = 50;
        } else if (userResponse == 9) {//Faladil
            System.out.println("Kinda fast food, but yummy as you might know! ");
            q1Score = 15;
        } else {
            System.out.println("You must choose one from the list, otherwise no way to get points: ");
        }//close if/else 
        // Question 2!
        System.out.println();
        System.out.println("*************");
        System.out.println("Question #2");
        System.out.println("*************");
        System.out.println();
        System.out.println("Which kind of movies would you like to watch? ");
        System.out.println("1. Romantic ");
        System.out.println("2. Action ");
        System.out.println("3. Comedy ");
        System.out.println("4. Horror ");

        userResponse = scan.nextInt();

        switch (userResponse) {
            case 1://Romantic
                System.out.println("Romantic");
                System.out.println("You like it? Me too, but not much. ");
                q2Score = 10;
                break;
            case 2://Action
                System.out.println("Action");
                System.out.println("Oh! I don't like it. ");
                q2Score = 5;
                break;
            case 3://Comedy
                System.out.println("Comedy");
                System.out.println("I love comedy movies! ");
                q2Score = 200;
                break;
            case 4://Horror
                System.out.println("Horror");
                System.out.println("They make me jumpy, but I like it");
                q2Score = 50;
                break;
        }// close switch statment
        System.out.println();
        System.out.println("*************");
        System.out.println("Question #3");
                
        System.out.println("*************");
        System.out.println();
        while (q3Score == 0) {

            System.out.println("What is your favorite programming language? ");
            System.out.println("1. Java");
            System.out.println("2. Python");
            System.out.println("3. JavaScript");
            userResponse = scan.nextInt();

            switch (userResponse) {
                case 1:
                    System.out.println("Great! ");
                    q3Score = 20;
                    break;
                case 2:
                    System.out.println("Python is easy to go with. ");
                    q3Score = 30;
                    break;
                case 3:
                    System.out.println("Oh! JavaScript seems very hard. ");
                    q3Score = 40;
                    break;
                default:
                    System.out.println("Invalid value: ");
            }
        }//close while
        compatScore = q1Score + q2Score + q3Score;
        System.out.println("End of the test! Time to calculate your answers!");

        if (compatScore >= COMPAT_THRESHOLD) {
            System.out.println("WE MIGHT BE FRIENDS!");
        } else {
            System.out.println("SORRY WE MIGHT NOT BE FRIENDS! ");
        }
        System.out.println("Thank you for trying out my friend capability test program! ");
    }// close main

}//close class

