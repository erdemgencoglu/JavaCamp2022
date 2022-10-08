package metotlar;

public class Metotlar {

    public static void main(String[] args) {
        sayiBul();
        sayiBul();

    }

    public static void sayiBul() {
        int sayiListesi[] = {1, 59, 6, 78, 9, 12, 35, 4, 6, 2};
        boolean sayiVarmi = false;
        int arananSayi = 9;
        for (int sayı : sayiListesi) {
            if (sayı == arananSayi) {
                sayiVarmi = true;
                break;
            }
        }
        mesajVer(sayiVarmi);
    }

    public static void mesajVer(boolean sayiVarmi) {
        if (sayiVarmi) {
            System.out.println("Sayı listede bulunmaktadır");
        } else {
            System.out.println("Sayı bulunamadı");
        }
    }
}
