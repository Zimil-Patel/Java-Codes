import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        short divisor, x, n, sum = 0;
        boolean isPrime;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = in.nextShort();

        x = 2;

        while (x <= n) {

            isPrime = true;

            for (divisor = 2; divisor <= x; divisor++) {

                if (divisor == x) {

                    continue;

                } else {

                    if (x % divisor == 0) {

                        isPrime = false;
                        break;

                    }

                }

            }

            if (isPrime) {

                System.out.print(x + " ");
                sum += x;
            }

            x++;
        }

        System.out.println("\nsum : "+sum);

    }

}
