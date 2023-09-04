import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] ars){

        short height, base;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of triangle : ");
        height = input.nextShort();

        System.out.print("Enter base of triangle : ");
        base = input.nextShort();

        System.out.println("Area of triangle is "+(height * base)/2);

    }

}
