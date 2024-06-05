package ru.job4j.calculator;

public class Fit {

    private static double calculateWeight(short height, int adjustment) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        return (height - adjustment) * 1.15;
    }

    /**
     * Calculate ideal weight for men based on height.
     * @param height height in centimeters
     * @return ideal weight in kilograms
     */
    public static double manWeight(short height) {
        return calculateWeight(height, 100);
    }

    /**
     * Calculate ideal weight for women based on height.
     * @param height height in centimeters
     * @return ideal weight in kilograms
     */
    public static double womanWeight(short height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        short height = 187;
        try {
            double manWeight = Fit.manWeight(height);
            System.out.println("Ideal weight for a man with height 187 cm is " + manWeight + " kg");
            double womanWeight = Fit.womanWeight(height);
            System.out.println("Ideal weight for a woman with height 187 cm is " + womanWeight + " kg");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}




