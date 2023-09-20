package javaapplication4;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan dua angka bulat
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Melakukan operasi penjumlahan
        int hasilPenjumlahan = angka1 + angka2;

        // Melakukan operasi pengurangan
        int hasilPengurangan = angka1 - angka2;

        // Melakukan operasi perkalian
        int hasilPerkalian = angka1 * angka2;

        // Melakukan operasi pembagian (menggunakan tipe data double untuk hasil pembagian)
        double hasilPembagian = (double) angka1 / angka2;

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        System.out.println("Hasil pembagian: " + hasilPembagian);

        // Menutup objek Scanner
        input.close();
    }
}
