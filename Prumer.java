import java.util.Scanner;
import java.util.Random;

public class Prumer {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Kolik cisel chcete zadat: ");
        int pocet = scan.nextInt();


        System.out.println("Random cisla jsou");

        double cisla;
        double vse = 0;

        for (int i = 0; i < pocet; i++){
            cisla = ran.nextInt();
            System.out.println((i+1) + " cislo = "+ cisla);
            vse += cisla;
        }

        double vysledek = vse/pocet;
        System.out.println("prumer je = " + vysledek);
    }
}