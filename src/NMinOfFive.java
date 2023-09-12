import java.util.Scanner;

public class NMinOfFive {

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

        if(num1 < num2){

            if(num1 < num3){

                if(num1 < num4){

                    if(num1 < num5){

                        System.out.println("num1("+num1+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                } else {

                    if(num4 < num5){
                        System.out.println("num4("+num4+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                }
            } else {

                if(num3 < num4){

                    if(num3 < num5){
                        System.out.println("num3("+num3+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                } else {

                    if(num4 < num5){
                        System.out.println("num4("+num4+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                }
            }
        } else {

            if(num2 < num3){

                if(num2 < num4){

                    if(num2 < num5){

                        System.out.println("num2("+num2+") is minimum");
                    } else {

                        System.out.println("num5("+num5+") is minimum");
                    }
                } else {

                    if(num4 < num5){
                        System.out.println("num4("+num4+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                }
            } else {

                if(num3 < num4){

                    if(num3 < num5){
                        System.out.println("num3("+num3+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                } else {

                    if(num4 < num5){

                        System.out.println("num4("+num4+") is minimum");
                    } else {
                        System.out.println("num5("+num5+") is minimum");
                    }
                }
            }
        }

    }
}
