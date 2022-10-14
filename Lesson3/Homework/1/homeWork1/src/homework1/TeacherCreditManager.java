/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

/**
 *
 * @author pln226
 */
public class TeacherCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Öğretmen credisi hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("Öğretmen kredisi kaydedildi");
    }

}
