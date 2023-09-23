import java.util.Scanner;

public class For_1ToN {

    public static void main(String[] args){

        short x, n;

        Scanner in = new Scanner(System.in);


        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        for (x = 1 ; x <= n; x++){


            System.out.println(x);
        }

    }
}
