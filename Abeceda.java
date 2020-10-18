import java.util.Scanner;
import java.util.Random;


public class Abeceda {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("zadejte větu");
        String veta = scan.nextLine();

        System.out.println("zadejte pismeno o kterém chcete vedet kolikrat se vyskytuje ve vete");
        String pismeno = scan.nextLine();

        int a = 1;

        for (int i = 0; i < veta.length(); i++) {
            if (pismeno == veta.charAt(i)) {
                a++;
            } else {
                System.out.println("pismeno neni ve vete");
            }
        }

        System.out.println("Pismeno je ve vete : " + a);
    }
}