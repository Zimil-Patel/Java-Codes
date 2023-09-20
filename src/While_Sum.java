import java.util.Scanner;

public class While_Sum {

    public static void main(String[] args){

        byte x = 1, n, sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(x <= n){

            sum += x;
            x++;

        }

        System.out.println("sum of 1 to "+n+" is "+sum);

    }
}
