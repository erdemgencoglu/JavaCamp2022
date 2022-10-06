package switchcase;

/**
 *
 * @author erdem
 */
public class SwitchCase {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel geçtiniz");
                break;
            case 'c':
                System.out.println("İyi geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not");
        }
    }

}
