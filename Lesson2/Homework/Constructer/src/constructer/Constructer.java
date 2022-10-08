/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructer;

/**
 *
 * @author erdem
 */
public class Constructer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product(0, "Laptop", "Asus laptop", 3000, 2);
        System.out.println(product.getName());
    }

}
