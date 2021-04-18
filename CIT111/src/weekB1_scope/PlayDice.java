/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alia
 */
public class PlayDice {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
       int result;
       DiceGame dg = new DiceGame();
        System.out.println("Welcome to the Dice Game! What is your name?");
        dg.setName(sc.nextLine());
        dg.bet(-1);
        while(dg.getBet() != 0){
            System.out.println("You have " + dg.getPoints() + " points.");
            System.out.println("Enter an amount to bet. Enter a zero to finish the game.");
            dg.bet(sc.nextInt());
            if(dg.getBet() == 0){
                break;
            }else if(dg.getBet() < 0 || dg.getBet() > dg.getPoints()){
                System.out.println("Invalid bet; Try again.");
                continue;
            }else{
                dg.guess(-1);
                while(dg.getGuess() < 2 || dg.getGuess() > 12){
                    System.out.println("What do you think two dice will sum to? (2-12)");
                    dg.guess( sc.nextInt());
                    
                }
                result = r.nextInt(5) + r.nextInt(5) + 2;
                if(dg.getGuess() == result){
                    dg.win();
                    if(result == 2 || result == 12){
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 60));
                    } else if(result == 3 || result == 11){
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 50));
                    }else if(result == 4 || result == 10){
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 40));
                    }else if(result == 5 || result == 9){
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 30));
                    }else if(result == 6 || result == 8){
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 20));
                    }else if(result == 7) {
                        dg.setPoints(dg.getPoints() + (dg.getBet() * 30));
                    }
                    System.out.println("You win, "+ dg.getName() + ". Your guess was " + dg.getGuess() + " and the dice rolled " + result);
                }else{
                    dg.lose();
                    if(dg.getGuess() == 2 || dg.getGuess() == 12){
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 2));
                    } else if(dg.getGuess() == 3 || dg.getGuess() == 11){
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 3));
                    }else if(dg.getGuess() == 4 || dg.getGuess() == 10){
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 4));
                    }else if(dg.getGuess() == 5 || dg.getGuess() == 9){
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 5));
                    }else if(dg.getGuess() == 6 || dg.getGuess() == 8){
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 6));
                    }else if(dg.getGuess() == 7) {
                        dg.setPoints(dg.getPoints() - (dg.getBet() * 5));
                    }
                    System.out.println("Sorry you lost "+ dg.getName() + ". Your guess was " + dg.getGuess() + " but the dice rolled " + result);
                    if(dg.getPoints() <= 0){
                        break;
                    }
                }
                
            }
        }
        dg.finishGame();
    }
}
