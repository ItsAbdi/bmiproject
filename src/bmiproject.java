import java.util.Scanner;

public class bmiproject {
    //(weight (in lbs)*703)/ (height (in inches)^2)

    public static double calculate(int weight,int height){
        weight= (weight*703);
        height= height*weight;
        return weight/height;
    }
    public static String message(double BMI) {
        if (BMI < 730) {
            return " you are to fat";
        } if (BMI < 15) {
            return " you need to eat more!";
        } else return " your BMI is perfect";
    }

    public static void main (String [] args) {
        //declare
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your height in inches?");
        int height = keyboard.nextInt();
        System.out.println("what is your weight in pounds?");
        int weight = keyboard.nextInt();
        double BMI;
        BMI = calculate(weight, height);
        String output = BMI + "" + message(BMI);
        System.out.println(output);
    }


//



            }


































































