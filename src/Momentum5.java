import java.util.Scanner;

public class Momentum5 {

    public static void main(String[] args){


        //5. Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
        //    Calculate the percentage and grade according to the following
        //        Percentage >= 90% : Grade A
        //        Percentage >= 80% : Grade B
        //        Percentage >= 70% : Grade C
        //        Percentage >= 60% : Grade D
        //        Percentage >= 50% : Grade E
        //        Percentage >= 40% : Grade F

        short Physics, Chemistry, Biology, Mathematics, Computer;
        float percentage;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks obtained in Physics : ");
        Physics = input.nextShort();

        System.out.print("Enter marks obtained in Chemistry : ");
        Chemistry = input.nextShort();

        System.out.print("Enter marks obtained in Biology : ");
        Biology = input.nextShort();

        System.out.print("Enter marks obtained in Mathematics : ");
        Mathematics = input.nextShort();

        System.out.print("Enter marks obtained in Computer : ");
        Computer = input.nextShort();

        percentage = ((float) (Physics + Chemistry + Biology + Mathematics + Computer) / 500 ) * 100;

        System.out.print(percentage);

        if(percentage >= 40 && percentage < 50){

            System.out.print(" : F Grade");

        } else if (percentage >= 50 && percentage < 60){

            System.out.print(" : E Grade");

        } else if (percentage >= 60 && percentage < 70){

            System.out.print(" : D Grade");

        } else if (percentage >= 70 && percentage < 80){

            System.out.print(" : C Grade");

        } else if (percentage >= 80 && percentage < 90){

            System.out.print(" : B Grade");

        } else if (percentage >= 90 && percentage <= 100){

            System.out.print(" : A Grade");

        } else {

            System.out.print(" : Failed!");

        }

    }
}
