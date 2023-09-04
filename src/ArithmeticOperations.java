import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] main){

        float x, y;

        Scanner input = new Scanner(System.in);

        //Addition
        System.out.println("\n--Enter values of Addition--");
        System.out.print("x : ");
        x = input.nextFloat();
        System.out.print("y : ");
        y = input.nextFloat();
        System.out.println(x+" + "+y +" = "+(x + y));

        //Subtraction
        System.out.println("\n--Enter values of Subtraction--");
        System.out.print("x : ");
        x = input.nextFloat();
        System.out.print("y : ");
        y = input.nextFloat();
        System.out.println(x+" - "+y +" = "+(x - y));

        //Multiplication
        System.out.println("\n--Enter values of Multiplication--");
        System.out.print("x : ");
        x = input.nextFloat();
        System.out.print("y : ");
        y = input.nextFloat();
        System.out.println(x+" * "+y +" = "+(x * y));

        //Division
        System.out.println("\n--Enter values of Division--");
        System.out.print("x : ");
        x = input.nextFloat();
        System.out.print("y : ");
        y = input.nextFloat();
        System.out.println(x+" / "+y +" = "+(x / y));

        //Modulus
        System.out.println("\n--Enter values of Modulus--");
        System.out.print("x : ");
        x = input.nextFloat();
        System.out.print("y : ");
        y = input.nextFloat();
        System.out.println(x+" % "+y +" = "+(x % y));

    }
}
