package arrays;

/**
 *
 * @author erdem
 */
public class Arrays {

    public static void main(String[] args) {
        //Diziler
        String[] isimler = new String[4];
        isimler[0] = "Erdem";
        isimler[1] = "Ekrem";
        isimler[2] = "Ali";
        isimler[3] = "Mehmet";

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Dizinin " + i + ". elemanı: " + isimler[i]);
        }
        System.out.println("-----------------");
        for (String item : isimler) {
            System.out.println(item);
        }
    }

}
