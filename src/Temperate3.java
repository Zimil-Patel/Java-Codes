import java.util.Scanner;

public class Temperate3 {

    public static void main(String[] args){

        int n;
        Byte counter = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = in.nextInt();

        while (n > 0){

            counter++;
            n /= 10;

        }

        System.out.println("There are "+counter+" digits");


    }

}
