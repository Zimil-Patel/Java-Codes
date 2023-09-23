import java.util.Scanner;

public class For_Sum {

    public static void main(String[] args){

        short x, n, sum = 0;

        Scanner in = new Scanner(System.in);


        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        for (x = 1 ; x <= n; x++){

            sum += x;
        }

        System.out.println("Sum of 1 To "+n+" = "+sum);

    }

}
