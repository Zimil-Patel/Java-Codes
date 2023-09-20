import java.util.Scanner;

public class While_NTo1 {

    public static void main(String[] args){

        byte n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = in.nextByte();

        while(n > 0){

            System.out.println(n--);

        }

    }
}
