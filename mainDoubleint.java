/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleint;

import java.util.Scanner;

public class mainDoubleint {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("angka depan koma      `: ");
        int angka = a.nextInt();
        System.out.print("angka belakang koma    : ");
        int koma = a.nextInt();
        System.out.println("========================");
        System.out.println("angka yang anda masukkan :");
        System.out.println(angka + "," + koma);
        Doubleint b = new Doubleint();
        if (koma > 0) {
            b.doublee();
        } else {
            b.integer();
        }
    }
}
