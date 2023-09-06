import java.util.Scanner;

public class Formula4 {

    public static void main(String[] args){

        short x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x :");
        x = input.nextShort();

        System.out.print("Enter value of y :");
        y = input.nextShort();

        System.out.println("(x - y)^3 = "+(short)((x * x * x) - (y * y * y) - (3*(x * x)*y) + (3 * x *(y * y))));

    }
}
