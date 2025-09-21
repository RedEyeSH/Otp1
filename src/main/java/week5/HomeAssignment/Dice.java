package week5.HomeAssignment;

import java.util.Random;

public class Dice {
    private Random random;
    private int die1;
    private int die2;

    public Dice() {
        this.random = new Random();
    }

    public void roll() {
        this.die1 = random.nextInt(6) + 1;
        this.die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble(int die1, int die2) {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int attempts = 0;

        System.out.println("Rolling the dice...");

        do {
            dice.roll();
            attempts++;
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
        } while (!dice.isDouble(dice.getDie1(), dice.getDie2()));

        System.out.println("You rolled a double!");
        System.out.println("After " + attempts + " try both reach the same value");
    }
}
