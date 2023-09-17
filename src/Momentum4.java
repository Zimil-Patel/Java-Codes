import java.util.Scanner;

public class Momentum4 {

    public static void main(String[] args){

        //WAP to display day of the week with user input using switch case
        Scanner input = new Scanner(System.in);

        char day;

        System.out.print("Enter first alphabet of day : ");
        day = input.next().charAt(0);

        switch(day){

            case 'm':
                System.out.println("Monday");
                break;

            case 't':
                System.out.println("Tuesday");
                break;

            case 'w':
                System.out.println("Wednesday");
                break;

            case 'T':
                System.out.println("Thursday");
                break;

            case 'f':
                System.out.println("Friday");
                break;

            case 's':
                System.out.println("Saturday");
                break;

            case 'S':
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid day");
        }

    }
}
