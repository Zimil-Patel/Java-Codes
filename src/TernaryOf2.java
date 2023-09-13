import java.util.Scanner;

public class TernaryOf2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Byte x, y;
        String result;

        System.out.print("Enter the value of x :");
        x = input.nextByte();

        System.out.print("Enter the value of y :");
        y = input.nextByte();

        result = (x > y) ? "x is maximum" : "y is maximum";

        System.out.println(result);
    }
}
