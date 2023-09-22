import java.util.Scanner;

public class DoWhile_Table {

    public static void main(String[] args){

        short x = 1, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n = in.nextShort();

        do {
            System.out.println(n +" * "+x+" = "+(n * x));
            x++;
        } while (x <= 10);

    }

}
