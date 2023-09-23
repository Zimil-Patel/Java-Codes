public class Temperate1 {

    public static void main(String[] args){

        byte x = 65;

        do{

            System.out.print((char) x);

            if (x < 90)
                System.out.print(", ");

            x++;

        } while(x <= 90);

    }

}
