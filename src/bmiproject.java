import java.util.Scanner;

public class bmiproject {

    public static void main(String[]  args){
        //declare
        Scanner keyboard;
         String name;
         int height;
        int feet;
        int inch;
        double meter;
        int BMI;
        int kg;
        int lbs;



        //initialize
        keyboard= new Scanner(System.in);


        System.out.println("Hello my name is Abdi, what is yours?");
        name=keyboard.nextLine();
        System.out.println("what is your height in feet?");
        feet= keyboard.nextInt();
        System.out.println("what is your height in inches?");
        inch=keyboard.nextInt();



        inch= inch + (feet*12);
        meter =  (inch * 0.0254);










        BMI= kg/(meter*meter);











        }




}



