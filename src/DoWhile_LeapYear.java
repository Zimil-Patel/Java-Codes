public class DoWhile_LeapYear {

    public static void main(String[] args){

        short x = 2000;
        System.out.println("Leap Years 2000-3000 : ");
        do{

            if (x % 4 == 0)
                System.out.print(x+" ");
            x++;
        } while(x <= 3000);

    }

}
