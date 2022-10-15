/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intefaces;

/**
 *
 * @author erdem
 */
public class MySqlCustomerDal implements ICustomerDal,IRepository {

    @Override
    public void add() {
        System.out.println("My sql e eklemdi");
    }

}
