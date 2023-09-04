import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] ars){

        short side;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side of square : ");
        side = input.nextShort();

        System.out.println("Area of square is "+(side * side));

    }

}
