package loops;

/**
 *
 * @author erdem
 */
public class Loops {

    public static void main(String[] args) {
        // For loop
        System.out.println("for döngüsü");
        for (int i = 0; i < 10; i++) {
            System.out.println("" + i);
        }
        System.out.println("Döngü bitti");
        System.out.println("while döngüsü");
        int sayi = 1;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }
        System.out.println("Döngü bitti");
        System.out.println("do-while döngüsü");
        int sayi2 = 1;
        do {
            System.out.println(sayi2);
            sayi2++;
        } while (sayi2 < 20);
        System.out.println("Döngü bitti");
    }

}
