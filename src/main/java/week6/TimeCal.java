package week6;

import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter speed in km/h: ");
        double speed = sc.nextDouble();

        System.out.println("The required time to reach: " + calculateTime(distance, speed) + "h");
    }

    public static double calculateTime(double x, double y) {
        return x / y;
    }
}
