import java.util.Scanner;

public class SwapMethod2 {

    public static void main(String[] args){

        Byte x, y, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        x = input.nextByte();

        System.out.print("Enter value of y: ");
        y = input.nextByte();

        System.out.println("\n--Values Before swapping--\nx = "+x+"\ny = "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("\n--Values After swapping--\nx = "+x+"\ny = "+y);

    }
}
