/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author erdem
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new TarimKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
        
    }
    
}
