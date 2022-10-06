package strings;

/**
 *
 * @author erdem
 */
public class Strings {

    public static void main(String[] args) {
        String mesaj = "Bugun hava çok güzel.  ";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı" + mesaj.length());
        System.out.println("4. eleman" + mesaj.charAt(3));
        System.out.println(mesaj.concat(" Yaşasın!"));//birleştirme
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println(karakterler);
        System.out.println("-----------------------");
        String yeniMesaj = mesaj.replace(" ", "+");
        System.out.println(yeniMesaj);
        System.out.println(yeniMesaj.substring(2));
        System.out.println(yeniMesaj.substring(2, 4));
        System.out.println("--Kelimeler--");
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }

}
