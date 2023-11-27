import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Byte num1, num2;

        System.out.print("Enter value of num1 :");
        num1 = input.nextByte();

        System.out.print("Enter value of num2 :");
        num2= input.nextByte();

        if(num1 != num2){
            if(num1 > num2){
                System.out.println("num1 ("+num1+") is Max number!");
                System.out.println("num2 ("+num2+") is Min number!");
            } else{
                System.out.println("num2 ("+num2+") is Max number!");
                System.out.println("num1 ("+num1+") is Min number!");
            }
        } else {
            System.out.println("both numbers are equals!\n");
        }
    }

}
