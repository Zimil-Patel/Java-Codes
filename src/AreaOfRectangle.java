import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] ars){

        short length, width;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle : ");
        length = input.nextShort();

        System.out.print("Enter width of rectangle : ");
        width = input.nextShort();

        System.out.println("\n\nArea of rectangle is "+(length * width));

    }

}
