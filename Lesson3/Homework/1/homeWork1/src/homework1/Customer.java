/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

public class Customer {

    public int id;


    public Customer() {
        System.out.println("Müşteri nesnesi yapıcı method başlatıldı");
    }

    public Customer(int id) {
        this.id = id;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
