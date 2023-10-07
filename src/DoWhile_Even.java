import java.util.Scanner;

public class DoWhile_Even {

    public static void main(String[] args){

        short n;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        do {
            if (n % 2 == 0)
                System.out.print(n+" ");
            n--;
        } while (n > 0);

    }

}
