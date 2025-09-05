package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a type of degree (BSc/MSc/PhD): ");

        String degreeType = scanner.nextLine();

        System.out.println("Returning a respective number of years: " + Degree.getDegree(degreeType));

        Degree.getDuration(degreeType);
    }
}
