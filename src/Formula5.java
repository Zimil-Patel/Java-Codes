import java.util.Scanner;

public class Formula5 {

    public static void main(String[] args){

        short x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x :");
        x = input.nextShort();

        System.out.print("Enter value of y :");
        y = input.nextShort();

        System.out.print("Enter value of y :");
        z = input.nextShort();

        System.out.println("(x + y + z)^2 = "+(short)((x * x) + (y * y) + (z * z) + 2 * ((x * y) + (y * z) + (z * x))));
    }
}
