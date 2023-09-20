import java.util.Scanner;

public class While_Odd {

    public static void main(String[] args){

        byte x = 1, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(x <= n){

            if (x % 2 != 0)
                System.out.println(x);

            x++;

        }

    }
}
