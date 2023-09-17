import java.util.Scanner;

public class Momentum1 {

    public static void main(String[] args){

        char x;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value : ");
        x = input.next().charAt(0);

        if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z'){

            System.out.println("is Alphabet");

        } else if (x >= '0' && x <= '9') {

            System.out.println("is Digit");

        } else {

            System.out.println("is Special character");

        }

    }

}
