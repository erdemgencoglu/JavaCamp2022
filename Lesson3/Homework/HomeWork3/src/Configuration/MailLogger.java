/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

/**
 *
 * @author erdem
 */
public class MailLogger implements Logger {

    @Override
    public void log(String logMessage) {
        System.out.println("Mail Logger : " + logMessage);
    }

}
