/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

/**
 *
 * @author pln226
 */
public abstract class BaseCreditManager {

    //Save heryerde aynı fakat calculate methodu farklı olan durumlarda kullanılır.
    public abstract void calculate();

    public void save() {
        System.out.println("Asker kredisi kaydedildi");
    }
}
