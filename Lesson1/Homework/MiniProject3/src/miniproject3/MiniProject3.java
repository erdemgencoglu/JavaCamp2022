/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniproject3;

public class MiniProject3 {

    public static void main(String[] args) {
        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println("Sayı mükemmel sayıdır");
        } else {
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }

}
