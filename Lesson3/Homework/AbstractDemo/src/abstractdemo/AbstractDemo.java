/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractdemo;

/**
 *
 * @author erdem
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        cm.databaseManager = new OracleDatabaseManager();   
        cm.getCustomer();
    }

}
