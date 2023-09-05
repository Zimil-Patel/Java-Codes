import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args){


        short x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x :");
        x = input.nextShort();

        System.out.print("Enter value of y :");
        y = input.nextShort();

        System.out.println("(x + y)^2 = "+(short)((x * x)+(2 * x * y)+(y * y)));
    }

}
