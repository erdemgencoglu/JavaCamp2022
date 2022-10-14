package methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        DortIslem dt = new DortIslem();
        System.out.println(dt.topla(5, 15));
        System.out.println(dt.topla(5, 15, 123));
    }

}
