import java.text.MessageFormat;
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
            return "you are to fat";
        } else if (BMI < 15) {
            return "you need to eat more!";
        } else {
            return "you BMI is perfect";
        }
    }

    public static void main (String [] args) {
        //declare
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your height in inches?");
        int height= keyboard.nextInt();
        System.out.println("what is your weight in pounds?");
        int weight= keyboard.nextInt();
        double BMI;
        BMI = calculate(weight,height);


//        //initialize
//        keyboard= new Scanner(System.in);
//
//
//        System.out.println("Hello my name is Abdi, what is yours?");
//        name=keyboard.nextLine();
//        System.out.println("what is your height in feet?");
//        feet= keyboard.nextInt();
//        System.out.println("what is your height in inches?");
//        inch=keyboard.nextInt();
//        System.out.println("what is your weight in pounds");
//        weight= keyboard.nextInt();
//
//
//        inch= inch + (feet*12);
//        meter =  (inch * 0.0254);
//        kg= keyboard.nextInt();




            }

        }
































































