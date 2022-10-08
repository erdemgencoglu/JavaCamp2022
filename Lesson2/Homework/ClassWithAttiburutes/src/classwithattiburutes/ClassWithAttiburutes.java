/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwithattiburutes;

/**
 *
 * @author erdem
 */
public class ClassWithAttiburutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.price = 3000;
        product.description = "Asus laptop";
        product.stockAmount = 3;*/
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(3000);
        product.setDescription("Asus laptop");
        product.setStockAmount(3);
        ProductManager pManager = new ProductManager();
        pManager.Add(product);
        //System.out.println(product.name);
        pManager.Add2(0, "", "", 0, 0);
        pManager.Add2(0, "", "", 0, 0);
        pManager.Add2(0, "", "", 0, 0);
        pManager.Add2(0, "", "", 0, 0);
        pManager.Add2(0, "", "", 0, 0);
    }
    
}
