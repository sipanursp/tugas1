package javaapplication3;

import java.util.Scanner;

public class InputDataPengguna {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Meminta pengguna memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        // Meminta pengguna memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
        double tinggiBadan = input.nextDouble();

        // Menampilkan hasil
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");

        // Menutup objek Scanner
        input.close();
    }
}
