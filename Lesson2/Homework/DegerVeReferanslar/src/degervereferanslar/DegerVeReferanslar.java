package degervereferanslar;

/**
 *
 * @author erdem
 */
public class DegerVeReferanslar {

    public static void main(String[] args) {
        //Değer(value) tip örneği
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        //Referans tipi örnekler
        int[] sayilar1 = {1, 5, 8, 69};
        int[] sayilar2 = {21, 55, 88, 1, 8};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }

}
