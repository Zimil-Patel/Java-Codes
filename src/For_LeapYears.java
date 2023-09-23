
public class For_LeapYears {

    public static void main(String[] args){

        short x;

        System.out.println("Leap years between 200 to 3000 :");

        for (x = 2000 ; x <= 3000; x++){

            if (x % 4 == 0)
                System.out.println(x);
        }

    }

}
