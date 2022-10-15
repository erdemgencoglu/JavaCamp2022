package overriding;

/**
 *
 * @author erdem
 */
public class Overriding {

    public static void main(String[] args) {
        BaseKrediManager[] krediManager = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager baseKrediManager : krediManager) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }

}
