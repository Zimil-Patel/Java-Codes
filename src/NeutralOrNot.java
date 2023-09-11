import java.util.Scanner;

public class NeutralOrNot {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Byte num;

        System.out.print("Enter value of num :");
        num = input.nextByte();

        if (num > 0){
            System.out.println("Given number("+num+") is positive number");
        } else if (num < 0){
            System.out.println("Given number("+num+") is negative number");
        } else {
            System.out.println("Given number("+num+") is neutral number");
        }
    }
}
