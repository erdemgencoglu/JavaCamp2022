package homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        Product pr = new Product();
        pr.setId(1);
        pr.setName("Laptop");
        pr.setDescription("Asus");
        pr.setPrice(5000);
        pr.setStockAmount(5);
        System.out.println(pr.getName());
    }

}
