import java.util.Scanner;

public class NMaxOfFour {

    public static void main(String[] args){

        short num1, num2, num3, num4;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of num1 : ");
        num1 = input.nextShort();

        System.out.print("Enter the value of num2 : ");
        num2 = input.nextShort();

        System.out.print("Enter the value of num3 : ");
        num3 = input.nextShort();

        System.out.print("Enter the value of num4 : ");
        num4 = input.nextShort();

        if(num1 > num2){

            if(num1 > num3){

                if(num1 > num4){
                    System.out.println("num1("+num1+") is maximum");
                }

            } else {

                if(num3 > num4){
                    System.out.println("num3("+num3+") is maximum");
                } else {
                    System.out.println("num4("+num4+") is maximum");
                }
            }
        } else {

            if(num2 > num3){

                System.out.println("num2("+num2+") is maximum");
            } else {

                if(num3 > num4){
                    System.out.println("num3("+num3+") is maximum");
                } else {
                    System.out.println("num4("+num4+") is maximum");
                }
            }
        }
    }
}
