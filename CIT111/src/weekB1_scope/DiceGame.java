/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

/**
 *
 * @author Alia
 */
public class DiceGame {

    private String name;
    private int points;
    private int startPoints;
    private int wins;
    private int losses;
    private int guess;
    private int bet;

    public DiceGame() {
        points = 100;
        startPoints = points;
        wins = 0;
        losses = 0;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPoints(int p) {
        points = p;
    }

    public int getPoints() {
        return points;
    }

    public void setStartPoints(int sp) {
        startPoints = sp;
    }

    public int getStartPoints() {
        return startPoints;
    }

    public void win() {
        wins += 1;
    }

    public int getWins() {
        return wins;
    }

    public void lose() {
        losses += 1;
    }

    public int getLosses() {
        return losses;
    }

    public void guess(int g) {
        guess = g;
    }

    public int getGuess() {
        return guess;
    }

    public void bet(int b) {
        bet = b;
    }

    public int getBet() {
        return bet;
    }

    public void finishGame() {
        System.out.println("Game Over");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Points: " + points);
        if (points >= startPoints) {
            System.out.println("Congratulations, you gained " + (points - startPoints) + " points! ");

        } else {
            System.out.println("Sorry, you lost " + (startPoints - points) + " points! ");
        }
    }
}
