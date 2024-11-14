/*
 * Studi Kasus
 *
 * input ---
 * inputan Toko Kelontog, menjual berbagai barang.
 *
 * proses ---
 * dimana pembeli bisa membeli barang dari toko tersebut. beli barang bisa lebih dari satu, dan ada proses perhitungan transaksi barang.
 *
 * Output ---
 * serta output
 *
 * */

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total_bayar = 0, num = 1;
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        LinkedHashMap<String, String> daftar_belanja = new LinkedHashMap<>();

        do {
            System.out.println("Daftar Barang : \n 1. Pensil \t Rp.1000 \n 2. Buku \t Rp.3000 \n 3. Spidol \t Rp.5000");
            System.out.println("Masukan Pilihan : ");
            if (!scan.hasNextInt()){
                System.out.println("Inputan tidak valid");
                continue;
            }
            int pilihan = scan.nextInt();

            if (pilihan > 3){
                System.out.println("Inputan tidak valid");
                continue;
            }

            int harga = pilihan == 1 ? 1000 : pilihan == 2 ? 3000 : pilihan == 3 ? 5000 : 0;
            String barang = pilihan == 1 ? "Pensil" : pilihan == 2 ? "Buku" : pilihan == 3 ? "Spidol" : "Tidak Diketahui";
            daftar_belanja.put(num + ". " + barang, "Rp. " + harga);
            num++;
            total_bayar += harga;

            System.out.println("Total Bayar : " + total_bayar);
            System.out.println("Lanjut ? (Y/n)");
            lanjut = scan.next().equalsIgnoreCase("Y");
        } while (lanjut);

        scan.close();
        System.out.println("Daftar Barang yang dibeli:");
        daftar_belanja.forEach((barang, harga) -> System.out.println(barang + " \t \t" + harga));
        System.out.println("-------------------------------------------");
        System.out.println("Total Yang Harus Dibayar : " + total_bayar);
    }
}
