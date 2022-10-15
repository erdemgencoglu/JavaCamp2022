/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intefaces;

/**
 *
 * @author erdem
 */
public class Intefaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager(new OracleCustomerDal());
        cm.add();
    }

}
