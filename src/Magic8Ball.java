import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {


    public static void main(String[] args) {

        //Declaring Variables
        Scanner input = new Scanner(System.in);
        String positiveAnswer = ("Yes");
        String positiveAnswer2 = ("Definitely");
        String positiveAnswer3 = ("Absolutely");
        String positiveAnswer4;
        String positiveAnswer5;


        //Coding phase
        System.out.println ("Give me a question and a number");
        input.nextInt();
        if (input.nextInt() <= 10) {

            System.out.print(positiveAnswer); }
        else {

        }
        if (input.nextInt() >= 11){

            System.out.print(positiveAnswer2);
            }







    }
}

