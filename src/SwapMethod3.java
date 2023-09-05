import java.util.Scanner;

public class SwapMethod3 {

    public static void main(String[] args){

        Byte x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        x = input.nextByte();

        System.out.print("Enter value of y: ");
        y = input.nextByte();

        System.out.println("\n--Values Before swapping--\nx = "+x+"\ny = "+y);

        x = (byte) (x ^ y);
        y = (byte) (x ^ y);
        x = (byte) (x ^ y);

        System.out.println("\n--Values After swapping--\nx = "+x+"\ny = "+y);

    }

}
