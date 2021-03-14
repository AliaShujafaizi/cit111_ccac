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
        final int COMPAT_THRESHOLD = 50;

        // welcome user and ask Q1
        System.out.print("Hello! My name is Alia, and this is a test program to see if we might be friends! ");

        System.out.println("*************");
        System.out.println("Question #1");
        System.out.println("*************");

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
        System.out.println("Mantoo = 1");
        System.out.println("Bolani = 2");
        System.out.println("Qabili Ozbeki = 3");
        System.out.println("Kichry = 4");
        System.out.println("Kabab = 5");
        System.out.println("Handi = 6");
        System.out.println("Beriani = 7");
        System.out.println("Shawarma = 8");
        System.out.println("Falafil = 9");

        userResponse = scan.nextInt();

        if (userResponse == 1) {//Mantoo
            System.out.println("Wow: you have a great taste in food");
            q1Score = 10;
        } else if (userResponse == 2) {//Bolani
            System.out.println("Yes: that's my favorite too");
            q1Score = compatScore = 200;
        } else if (userResponse == 3) {//Qabili Ozbeki
            System.out.println("Superb! Qabili is the most popular and delicious food in Afghanistan ");
            q1Score = 20;
        } else if (userResponse == 4) {//Kichry
            System.out.print("This is a special food for winter time, when snow is everywhere ");
            System.out.println("and the weather is very cold, I can say you are a foody person too");
            q1Score = 30;
        } else if (userResponse == 5) {//Kabab
            System.out.println("Wow! you choose Kabab? the yummiest");
            q1Score = 40;
        } else if (userResponse == 6) {//Handi
            System.out.println("This is an Indian food, and is great when it's very peppery"
                    + " and serve with chapati");
            q1Score = 50;
        } else if (userResponse == 7) {//Beriani
            System.out.println("Beriani is the best spicy rice, well done!");
            q1Score = 60;
        } else if (userResponse == 8) {
            System.out.println("Turkish! I like chicken shawarma");
            q1Score = 50;
        } else if (userResponse == 9) {
            System.out.println("Kinda fast food, but yummy as you might know! ");
            q1Score = 15;
            //should choose one number********
        } else {
            System.out.println("You must choose one from the list, otherwise no way to get points: ");
        }//close if/else 
        // Question 2!

        System.out.println("*************");
        System.out.println("Question #2");
        System.out.println("*************");
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

        System.out.println("*************");
        System.out.println("Question #3");
        System.out.println("*************");

        System.out.println("What is your favorite programming language? ");
        System.out.println("Java 1");
        System.out.println("Python 2");
        System.out.println("JavaScript 3");
        System.out.println("C++ 4");

        userResponse = scan.nextInt();

        while (q3Score == 0) {

        }//close while

    }// close main
}//close class

