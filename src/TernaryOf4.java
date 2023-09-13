import java.util.Scanner;

public class TernaryOf4 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            Byte a, b, c, d;
            String result;

            System.out.print("Enter the value of a :");
            a = input.nextByte();

            System.out.print("Enter the value of b :");
            b = input.nextByte();

            System.out.print("Enter the value of c :");
            c = input.nextByte();

            System.out.print("Enter the value of d :");
            d = input.nextByte();

            result = (a>b) ? (a>c) ? (a>d) ? "a is maximum":"d is maximum": (c>d) ? "c is maximum":"d is maximum": (b>c) ? (b>d) ? "b is maximum":"d is maximum": (c>d) ? "c is maximum":"d is maximum";

            System.out.println(result);

        }
}
