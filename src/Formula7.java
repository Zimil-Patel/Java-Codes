import java.util.Scanner;

public class Formula7 {

    public static void main(String[] args){

        short x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x :");
        x = input.nextShort();

        System.out.print("Enter value of y :");
        y = input.nextShort();

        System.out.print("Enter value of y :");
        z = input.nextShort();

        System.out.println("(x - y - z)^3 = "+(short)((x * x * x) - (y * y * y) - (z * z * z) + 3 * ((x - y) * ( -y - z) * (x - z)))+"\n");
    }
}
