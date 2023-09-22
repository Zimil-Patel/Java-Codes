import java.util.Scanner;

public class DoWhileNTo1 {

    public static void main(String[] args){

        short n;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        do {

            System.out.println(n--);

        } while (n > 0);

    }
}
