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
        // Inisialisasi variabel untuk total pembayaran dan nomor barang
        int total_bayar = 0, num = 1;

        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scan = new Scanner(System.in);

        // Variabel boolean untuk menentukan apakah proses belanja dilanjutkan atau tidak
        boolean lanjut = true;

        // LinkedHashMap untuk menyimpan daftar belanja, dengan kunci berupa nama barang dan nilai berupa harga
        LinkedHashMap<String, String> daftar_belanja = new LinkedHashMap<>();

        // Menggunakan perulangan do-while untuk proses belanja
        do {
            // Menampilkan daftar barang yang tersedia
            System.out.println("Daftar Barang : \n 1. Pensil \t Rp.1000 \n 2. Buku \t Rp.3000 \n 3. Spidol \t Rp.5000");

            // Meminta pengguna untuk memasukkan pilihan barang
            System.out.println("Masukan Pilihan : ");

            // Validasi input: memeriksa apakah input adalah angka
            if (!scan.hasNextInt()) {
                System.out.println("Inputan tidak valid");
                continue;
            }else{

            }

            // Membaca pilihan barang dari pengguna
            int pilihan = scan.nextInt();

            // Validasi pilihan: memeriksa apakah pilihan berada dalam rentang yang valid
            if (pilihan > 3) {
                System.out.println("Inputan tidak valid");
                continue;
            }

            // Menentukan harga dan nama barang berdasarkan pilihan pengguna
            int harga = pilihan == 1 ? 1000 : pilihan == 2 ? 3000 : pilihan == 3 ? 5000 : 0;
            String barang = pilihan == 1 ? "Pensil" : pilihan == 2 ? "Buku" : pilihan == 3 ? "Spidol" : "Tidak Diketahui";

            // Menambahkan barang dan harga ke daftar belanja dengan format "<nomor>. <barang> -> <harga>"
            daftar_belanja.put(num + ". " + barang, "Rp. " + harga);
            num++;  // Increment nomor barang untuk daftar berikutnya

            // Menambah harga barang yang dipilih ke total pembayaran
            total_bayar += harga;

            // Menampilkan total pembayaran sementara
            System.out.println("Total Bayar : " + total_bayar);

            // Menanyakan apakah pengguna ingin melanjutkan proses belanja
            System.out.println("Lanjut ? (Y/n)");
            lanjut = scan.next().equalsIgnoreCase("Y");  // Lanjutkan jika pengguna memasukkan 'Y' atau 'y'
        } while (lanjut);  // Perulangan akan berhenti jika pengguna memilih 'n' atau selain 'Y'

        // Menutup objek Scanner
        scan.close();

        // Menampilkan daftar barang yang dibeli
        System.out.println("Daftar Barang yang dibeli:");
        daftar_belanja.forEach((barang, harga) -> System.out.println(barang + " \t \t" + harga));

        // Menampilkan garis pemisah
        System.out.println("-------------------------------------------");

        // Menampilkan total yang harus dibayar
        System.out.println("Total Yang Harus Dibayar : " + total_bayar);



    }
}

