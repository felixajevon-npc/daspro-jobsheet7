import java.util.Scanner;

public class KafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan Nama Pelanggan (Ketik 'batal' Untuk Keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("Masukkan Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan Jumlah Roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total Yang Harus Dibayar : Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi Selesai");
    }
}
