import java.util.Scanner;

public class SwapMethod4 {

    public static void main(String[] args){
        short x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        x = input.nextShort();

        System.out.print("Enter value of y: ");
        y = input.nextShort();

        System.out.println("\n--Values Before swapping--\nx = "+x+"\ny = "+y);

        x = (short) (x * y);
        y = (short) (x / y);
        x = (short) (x / y);

        System.out.println("\n--Values After swapping--\nx = "+x+"\ny = "+y);
    }

}
