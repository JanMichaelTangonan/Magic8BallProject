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

        if (0<chosenNumber&&chosenNumber<=10){

            System.out.print(positiveAnswer1);}

        else if (10<chosenNumber&&chosenNumber<=20){

            System.out.print(positiveAnswer2);
        }
        if (20<chosenNumber&&chosenNumber<=30){

            System.out.print(positiveAnswer3);
        }

        else if (30<chosenNumber&&chosenNumber<=40){

            System.out.print(positiveAnswer4);
        }

        if (40<chosenNumber&&chosenNumber<=50){

            System.out.print(positiveAnswer5);
        }

        else if (50<chosenNumber&&chosenNumber<=60){

            System.out.print(negativeAnswer1);
        }

        if (60<chosenNumber&&chosenNumber<=70){

            System.out.print(negativeAnswer2);
        }

        else  if (70<chosenNumber&&chosenNumber<=80){

            System.out.print(negativeAnswer3);
        }
        if (80<chosenNumber&&chosenNumber<=90){

            System.out.print(negativeAnswer4);
        }
        else if (90<chosenNumber&&chosenNumber<=100){

            System.out.print(negativeAnswer5);
        }
    }
}

