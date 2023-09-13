import java.util.Scanner;

public class TernaryOf5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Byte a, b, c, d, e;
        String result;

        System.out.print("Enter the value of a :");
        a = input.nextByte();

        System.out.print("Enter the value of b :");
        b = input.nextByte();

        System.out.print("Enter the value of c :");
        c = input.nextByte();

        System.out.print("Enter the value of d :");
        d = input.nextByte();

        System.out.print("Enter the value of e :");
        e = input.nextByte();

        result = (a>b) ? (a>c) ? (a>d) ? (a>e) ? "a is maximum":"e is maximum": (d>e) ?"d is maximum":"e is maximum": (c>d) ? (c>e) ?"c is maximum":"e is maximum":(d>e) ? "d is maximum":"e is maximum": (b>c) ? (b>d) ? (b>e) ?"b is maximum":"e is maximum":(d>e) ? "d is maximum":"e is maximum":(c>d) ? (c>e) ?"c is maximum":"e is maximum": (d>e) ?"d is maximum":"e is maximum";

        System.out.println(result);

    }

}
