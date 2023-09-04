import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args){

        int principleAmount;
        float interestRate;
        byte time;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        principleAmount = input.nextInt();

        System.out.print("Enter interest rate : ");
        interestRate = input.nextFloat();

        System.out.print("Enter time : ");
        time = input.nextByte();

        System.out.println("Simple interest is "+(principleAmount * interestRate * time)/100 );
    }

}
