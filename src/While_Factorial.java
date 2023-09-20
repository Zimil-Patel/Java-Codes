import java.util.Scanner;

public class While_Factorial {

    public static void main(String[] args){

        byte x = 1, n;
        int factorial = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(x <= n){

            factorial *= x;
            x++;

        }

        System.out.println("factorial of 1 to "+n+" is "+factorial);

    }

}
