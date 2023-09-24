import java.util.Scanner;

public class Temperate4 {

    public static void main(String[] args){

        long sum = 0, remainder = 0;
        long n, temp;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = in.nextLong();

        sum += n%10;
        
        temp = n;
        
        while (n > 0){
            
            remainder = n % 10;
            n /= 10;
            
        }

        System.out.println("Sum of first and last digit of "+temp+" = "+(sum+remainder));

    }

}
