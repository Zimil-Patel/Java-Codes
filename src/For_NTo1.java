import java.util.Scanner;

public class For_NTo1 {

    public static void main(String[] args){


        short n;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n :");
        n = in.nextShort();

        for(;n > 0; n--){

            System.out.print(n+" ");

        }

    }
}
