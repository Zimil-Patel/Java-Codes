import java.util.Scanner;

public class Momentum2 {

    public static void main(String[] args){

        short x;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        x = input.nextShort();

        result = (x % 2 == 0) ? "Even number!" : "Odd number!";

        System.out.println(result);
    }

}
