import java.util.Scanner;

public class BioData{

    public static void main(String[] args){

        String name,dateOfBirth;
        byte age;
        short mark;
        long contactNumber;
        int pinCode;
        boolean graduated;
        float percentage;
        char languageSkilled;

        Scanner input = new Scanner(System.in);

        //Full Name
        System.out.print("Enter your full name :");
        name = input.nextLine();

        //Age
        System.out.print("Enter your age :");
        age = input.nextByte();

        //Date of Birth
        System.out.print("Enter your DOB :");
        dateOfBirth = input.nextLine();
        dateOfBirth = input.nextLine();

        //Contact number
        System.out.print("Enter your contact number :");
        contactNumber = input.nextLong();

        //Area pinCode
        System.out.print("Enter area pin code :");
        pinCode = input.nextInt();

        //10th obtained mark
        System.out.print("Enter marks obtained in 10th :");
        mark = input.nextShort();

        //graduated or not
        System.out.print("Are you graduated or not enter true or false :");
        graduated = input.nextBoolean();

        //percentage obtained in 10th
        System.out.print("Enter percentage obtained in 10th :");
        percentage = input.nextFloat();

        //Language Skilled
        System.out.print("Enter name of language you have skilled :");
        languageSkilled = input.next().charAt(0);

        //Prepared BioData
        System.out.println("--- Bio Data ---");
        System.out.println("Full name: "+name);
        System.out.println("Date of Birth: "+dateOfBirth);
        System.out.println("Age: "+age);
        System.out.println("10th marks: "+mark);
        System.out.print("10th percentage: "+percentage+"%\n");
        System.out.println("Graduated: "+graduated);
        System.out.println("Contact number: "+contactNumber);
        System.out.println("Are pin code: "+pinCode);
        System.out.println("language Skilled: "+languageSkilled);
    }
}