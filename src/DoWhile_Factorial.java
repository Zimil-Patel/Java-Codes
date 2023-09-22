import java.util.Scanner;

public class DoWhile_Factorial {

    public static void main(String[] args){

        short x = 1, n;
        int factorial = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = in.nextShort();

        do {
            factorial *= x;
            x++;
        } while (x <= n);

        System.out.println("Factorial of 1 to "+n+" is "+factorial);
    }

}
