import java.util.Scanner;

public class LMaxOfTwo {

    public static void main(String[] args){

        short num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of num1 : ");
        num1 = input.nextShort();

        System.out.print("Enter the value of num2 : ");
        num2 = input.nextShort();

        if(num1 > num2){

            System.out.println("num1("+num1+") is maximum");

        } else if(num2 > num1){

            System.out.println("num2("+num2+") is maximum");

        } else {

            System.out.println("Both numbers are equals");

        }

    }
}
