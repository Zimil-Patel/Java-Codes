import java.util.Scanner;

public class DoWhile_Sum {

    public static void main(String[] args){

        short x = 1, n, sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = in.nextShort();

        do {
            sum += x;
            x++;
        } while (x <= n);

        System.out.println("Sum of 1 to "+n+" is "+sum);
    }

}
