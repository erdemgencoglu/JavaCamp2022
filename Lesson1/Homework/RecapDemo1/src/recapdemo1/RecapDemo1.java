package recapdemo1;

/**
 *
 * @author erdem
 */
public class RecapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = 65;
        int sayi3 = 18;

        int enbuyuksayi = sayi1;
        if (sayi2 > enbuyuksayi) {
            enbuyuksayi = sayi2;
        }
        if (sayi3 > enbuyuksayi) {
            enbuyuksayi = sayi3;
        }
        System.out.println("En büyük sayi -> " + enbuyuksayi);
    }

}
