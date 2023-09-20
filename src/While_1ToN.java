import java.util.Scanner;

public class While_1ToN {

    public static void main(String[] args){

        byte x = 1, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(x <= n){

            System.out.println(x++);

        }

    }
}
