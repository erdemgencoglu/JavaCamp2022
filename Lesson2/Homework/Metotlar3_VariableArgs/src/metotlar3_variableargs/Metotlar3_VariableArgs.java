package metotlar3_variableargs;

public class Metotlar3_VariableArgs {

    public static void main(String[] args) {
        int toplam = topla(2, 3, 5, 4, 8, 6, 78);
        System.out.println(toplam);
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int i : sayilar) {
            toplam += i;
        }
        return toplam;
    }
}