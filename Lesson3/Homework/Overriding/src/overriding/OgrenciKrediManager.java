/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author erdem
 */
public class OgrenciKrediManager extends BaseKrediManager {

    @Override
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }

}
