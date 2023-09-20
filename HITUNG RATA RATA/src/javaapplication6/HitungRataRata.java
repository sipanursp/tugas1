package javaapplication6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int total = 0;
            int jumlahData = 0;

            try {
                System.out.print("Masukkan angka (0 untuk selesai): ");
                int angka = input.nextInt();

                while (angka != 0) {
                    total += angka;
                    jumlahData++;
                    System.out.print("Masukkan angka (0 untuk selesai): ");
                    angka = input.nextInt();
                }

                if (jumlahData > 0) {
                    double rataRata = (double) total / jumlahData;
                    System.out.println("Rata-rata: " + rataRata);
                } else {
                    System.out.println("Tidak ada data yang dimasukkan.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka bulat.");
                input.nextLine(); // Membersihkan buffer input
            }

            input.nextLine(); // Membersihkan newline

            // Menanyakan kepada pengguna apakah ingin melanjutkan atau keluar
            System.out.print("Lanjutkan? (ya/tidak): ");
            String jawaban = input.nextLine().toLowerCase();

            if (!jawaban.equals("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih! Program berakhir.");
        input.close();
    }
}
