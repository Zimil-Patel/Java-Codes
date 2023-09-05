import java.util.Scanner;

public class SwapMethod1 {

    public static void main(String[] args){

        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x : ");
        x = input.nextInt();

        System.out.print("Enter value of y: ");
        y = input.nextInt();

        System.out.println("\n--Values Before swapping--\nx = "+x+" y = "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\n--Values After swapping--\nx = "+x+" y = "+y);
    }
}
