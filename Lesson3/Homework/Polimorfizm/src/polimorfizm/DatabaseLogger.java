package polimorfizm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pln226
 */
public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("Logged to database");
    }

}
