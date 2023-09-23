import java.util.Scanner;

public class Temperate5 {


        public static void main(String[] args){

            int x, n, factorial = 1;

            Scanner in = new Scanner(System.in);


            System.out.print("Enter the value of n : ");
            n = in.nextShort();

            for (x = 1 ; x <= n; x++){

                factorial *= x;
            }

            System.out.println("Factorial of 1 To "+n+" = "+factorial);

        }

}
