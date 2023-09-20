public class While_LeapYear {

    public static void main(String[] args){

        short x = 2000;

        System.out.println("Leap years between 2000 to 3000 :");

        while(x <= 3000){

            if (x % 4 == 0)
                System.out.println(x);

            x++;

        }
    }
}
