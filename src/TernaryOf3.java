import java.util.Scanner;

public class TernaryOf3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Byte x, y, z;
        String result;

        System.out.print("Enter the value of x :");
        x = input.nextByte();

        System.out.print("Enter the value of y :");
        y = input.nextByte();

        System.out.print("Enter the value of z :");
        z = input.nextByte();

        result = (x > y) ? (x > z) ? "x is maximum" : "z is maximum": (y > z) ?"y is maximum" :"z is maximum";

        System.out.println(result);

    }
}
