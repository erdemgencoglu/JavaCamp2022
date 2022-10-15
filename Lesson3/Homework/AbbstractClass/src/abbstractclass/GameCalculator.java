/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abbstractclass;

/**
 *
 * @author erdem
 */
public abstract class GameCalculator {

    //Bu classı extend eden tüm classlar hesapla methodunu içermek zorunda ve değiştirebilir
    public abstract void hesapla();

    //Hiç bir zaman değişmiyecek bir kuraldır
    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
