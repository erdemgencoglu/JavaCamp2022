/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfizm;

/**
 *
 * @author pln226
 */
public class CustomerManager {
    
    private BaseLogger baseLogger;
    
    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }
    
    public void add() {
        System.out.println("Müşteri eklendi");
        this.baseLogger.log("log mesajı");
    }
}
