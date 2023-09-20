package javaapplication5;

import java.util.Scanner;

public class CekGenapGanjil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        while (true) {
            // Meminta pengguna memasukkan angka bulat
            System.out.print("Masukkan angka bulat (0 untuk keluar): ");
            int angka = input.nextInt();

            // Memeriksa apakah angka adalah 0 (untuk keluar dari program)
            if (angka == 0) {
                System.out.println("Terima kasih! Program berakhir.");
                break; // Keluar dari loop
            }

            // Memeriksa apakah angka genap atau ganjil
            if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }

        // Menutup objek Scanner
        input.close();
    }
}
