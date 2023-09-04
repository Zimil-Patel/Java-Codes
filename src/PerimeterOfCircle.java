import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] ars){

        short radius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        radius = input.nextShort();

        System.out.println("Perimeter of circle is "+(2 * 3.14 * radius));

    }


}
