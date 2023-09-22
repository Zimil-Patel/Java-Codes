import java.util.Scanner;

public class DoWhile1ToN {


    public static void main(String[] args){

        short x = 1, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = in.nextShort();

        do {

            System.out.println(x++);
        } while (x <= n);


    }
}
