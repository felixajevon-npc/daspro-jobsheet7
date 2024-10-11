import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml_tiket;
        int harga_tiket = 50000;

        int total_tiket = 0; 
        int total_uang = 0; 

        while (true) {
            System.out.print("Masukkan Jumlah Tiket Anda (ketik 0 untuk keluar): ");
            jml_tiket = sc.nextInt();

            if (jml_tiket == 0) {
                System.out.println("Program selesai.");
                break;
            }

            if (jml_tiket < 0) {
                System.out.println("Nilai Tidak Valid. Silahkan masukkan lagi nilai yang valid.");
            } else {
                int total_harga = jml_tiket * harga_tiket;
                total_tiket += jml_tiket;
                total_uang += total_harga;
                if (jml_tiket > 10) {
                    double total_diskon = total_harga * 0.15;
                    total_harga -= total_diskon;
                    System.out.println("Anda mendapat diskon 15%");
                } else if (jml_tiket > 4) {
                    double total_diskon = total_harga * 0.1;
                    total_harga -= total_diskon;
                    System.out.println("Anda mendapat diskon 10%");
                }

                System.out.println("Total harga tiket: " + total_harga);
            }
        }

        System.out.println("Total Tiket yang Dipesan: " + total_tiket);
        System.out.println("Total Uang yang Diterima: Rp " + total_uang);

        sc.close();
    }
}
