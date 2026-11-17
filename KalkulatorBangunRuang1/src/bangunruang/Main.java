/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   KALKULATOR BANGUN RUANG");
        System.out.println("================================");

        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");

        System.out.print("Pilih bangun ruang: ");
        int pilihan = input.nextInt();

        BangunRuang bangun = null;

        if (pilihan == 1) {

            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();

            bangun = new kubus(sisi);

        } else if (pilihan == 2) {

            System.out.print("Masukkan panjang: ");
            double p = input.nextDouble();

            System.out.print("Masukkan lebar: ");
            double l = input.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();

            bangun = new Balok(p, l, t);

        } else if (pilihan == 3) {

            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();

            bangun = new Tabung(r, t);

        } else if (pilihan == 4) {

            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();

            bangun = new kerucut(r, t);

        } else {

            System.out.println("Pilihan tidak tersedia!");

        }

        if (bangun != null) {

            System.out.println("\n===== HASIL PERHITUNGAN =====");

            System.out.println("Volume: " +
                    bangun.hitungVolume());

            System.out.println("Luas Permukaan: " +
                    bangun.hitungLuasPermukaan());

        }

        input.close();
    }
}