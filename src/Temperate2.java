import java.util.Scanner;

public class Temperate2 {


    public static void main(String[] args){

        short x, n;

        Scanner in = new Scanner(System.in);


        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        for (x = 1 ; x <= 10; x++){

            System.out.println(n+" * "+x+" = "+(n*x));

        }

    }
}
