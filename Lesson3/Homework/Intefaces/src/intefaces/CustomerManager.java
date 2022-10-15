/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intefaces;

/**
 *
 * @author erdem
 */
public class CustomerManager {

    private ICustomerDal ıCustomerDal;

    public CustomerManager(ICustomerDal ıCustomerDal) {
        this.ıCustomerDal = ıCustomerDal;
    }


    public void add() {
        ıCustomerDal.add();
    }
}
