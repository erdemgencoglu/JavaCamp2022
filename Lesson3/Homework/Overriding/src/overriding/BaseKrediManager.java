/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author erdem
 */
public class BaseKrediManager {

    //method final yapılırsa override edilemez
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}
