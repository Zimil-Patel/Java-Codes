import java.util.Scanner;

public class While_Even {


    public static void main(String[] args){

        byte n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(n > 0){

            if(n % 2 == 0)
                System.out.println(n);

            n--;

        }

    }
}
