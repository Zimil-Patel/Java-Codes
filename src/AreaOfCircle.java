import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] ars){

        short radius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        radius = input.nextShort();

        System.out.println("Area of circle is : "+(3.14 * radius *radius));

    }

}
