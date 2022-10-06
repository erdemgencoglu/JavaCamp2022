package conditionals;

/**
 *
 * @author erdem
 */
public class Conditionals {

    public static void main(String[] args) {
        boolean isMale = false;
        if (isMale) {
            System.err.println("Cinsiyet erkek");
        } else {
            System.out.println("Cinsiyet kadın");
        }
        //short if
        String result = isMale ? "E" : "K";
        System.out.println(result);
    }

}
