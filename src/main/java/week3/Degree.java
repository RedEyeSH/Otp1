package week3;

public class Degree {
    public static int getDegree(String degree) {

        if (degree == null) {
            throw new RuntimeException("Degree is null.");
        }

        return switch (degree.trim().toLowerCase()) {
            case "bsc" -> 4;
            case "msc" -> 6;
            case "phd" -> 3;
            default -> throw new RuntimeException("does not match...");
        };
    }

    public static void getDuration(String degree) {
        System.out.println("The input: " + degree + ", years: " + getDegree(degree));
    }
}
