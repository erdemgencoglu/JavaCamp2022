package metotlar2;

public class Metotlar2 {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayiTopla = topla(3, 12);
        System.out.println(sayiTopla);
    }

    public static void ekle() {
        System.out.println("");
    }

    public static void sil() {
        System.out.println("");
    }

    public static void guncelle() {
        System.out.println("");
    }

    public static int topla(int sayi, int sayi2) {
        return sayi + sayi2;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
