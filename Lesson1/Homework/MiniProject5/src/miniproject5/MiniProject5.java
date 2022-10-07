package miniproject5;

/**
 *
 * @author pln226
 */
public class MiniProject5 {

    public static void main(String[] args) {
        int sayiListesi[] = {1, 59, 6, 78, 9, 12, 35, 4, 6, 2};
        boolean sayiVarmi = false;
        int arananSayi = 9;
        for (int sayı : sayiListesi) {
            if (sayı == arananSayi) {
                sayiVarmi = true;
                break;
            }
        }
        if (sayiVarmi) {
            System.out.println("Sayı listede bulunmaktadır");
        } else {
            System.out.println("Sayı bulunamadı");
        }
    }

}
