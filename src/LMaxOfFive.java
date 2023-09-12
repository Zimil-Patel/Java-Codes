import java.util.Scanner;

public class LMaxOfFive {

    public static void main(String[] args){

        short num1, num2, num3, num4, num5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of num1 : ");
        num1 = input.nextShort();

        System.out.print("Enter the value of num2 : ");
        num2 = input.nextShort();

        System.out.print("Enter the value of num3 : ");
        num3 = input.nextShort();

        System.out.print("Enter the value of num4 : ");
        num4 = input.nextShort();

        System.out.print("Enter the value of num5 : ");
        num5 = input.nextShort();


        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){

            System.out.println("num1("+num1+") is maximum");

        } else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){

            System.out.println("num2("+num2+") is maximum");

        } else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){

            System.out.println("num3("+num3+") is maximum");
        } else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){

            System.out.println("num4("+num4+") is maximum");
        } else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){

            System.out.println("num5("+num5+") is maximum");
        }
    }
}
