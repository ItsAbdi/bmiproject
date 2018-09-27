import java.util.Scanner;

public class bmiproject {
    public static void main(String[] args) {

        final double KILOGRAMS_PER_POUND = 0.453;
        final double METERS_PER_INCH = 0.026;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKilogram = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilogram /
                (heightInMeters * heightInMeters);

        System.out.printf("Your Body Mass Index is " + bmi);

        if (bmi < 16)
            System.out.println("You are seriously underweight");
        else if (bmi < 18)
            System.out.println("You are underweight");
        else if (bmi < 24)
            System.out.println("You are normal weight");
        else if (bmi < 29)
            System.out.println("You are overweight");
        else if (bmi < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");
    }
}


//






































































