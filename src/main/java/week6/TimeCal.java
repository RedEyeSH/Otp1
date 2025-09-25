package week6;

public class TimeCal {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java -jar Otp1-1.0-SNAPSHOT.jar <distance> <speed>");
            return;
        }

        double distance = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);

        System.out.println("The required time to reach: " + calculateTime(distance, speed) + "h");
    }

    public static double calculateTime(double x, double y) {
        return x / y;
    }
}
