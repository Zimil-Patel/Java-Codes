import java.util.Scanner;

public class DoWhile_Odd {

    public static void main(String[] args){

        short x = 1, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = in.nextShort();

        do {
            if( x % 2 != 0)
                System.out.print(x+" ");

            x++;
        } while (x <= n);


    }

}
