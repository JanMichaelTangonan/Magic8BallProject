import java.util.Scanner;

public class Magic8Ball {


    public static void main(String[] args) {

        //Declaring Variables
        Scanner input = new Scanner(System.in);

        String positiveAnswer1 = ("Yes");
        String positiveAnswer2 = ("Definitely");
        String positiveAnswer3 = ("Absolutely");
        String positiveAnswer4 = ("Most likely");
        String positiveAnswer5 = ("For sure!");
        String negativeAnswer1 = ("No");
        String negativeAnswer2 = ("Probably not");
        String negativeAnswer3 = ("Most likely not");
        String negativeAnswer4 = ("That's a negative");
        String negativeAnswer5 = ("I don't know what you need");

        //Coding phase
        System.out.println ("Ask a question and type a number to find the answer that you seek");
        int chosenNumber= input.nextInt();

        if (chosenNumber <= 10){

            System.out.print(positiveAnswer1);}

        else if (chosenNumber <=21){

            System.out.print(positiveAnswer2);
        }
        if (chosenNumber <=31){

            System.out.print(positiveAnswer3);
        }

        else if (chosenNumber <= 41){

            System.out.print(positiveAnswer4);
        }

        if (chosenNumber <=51){

            System.out.print(positiveAnswer5);
        }

        else if (chosenNumber <=61){

            System.out.print(negativeAnswer1);
        }

        if (chosenNumber <=71){

            System.out.print(negativeAnswer2);
        }

        else  if (chosenNumber <=81){

            System.out.print(negativeAnswer3);
        }
        if (chosenNumber <=91){

            System.out.print(negativeAnswer4);
        }
        else if (chosenNumber <=100){

            System.out.print(negativeAnswer5);
        }
    }
}

