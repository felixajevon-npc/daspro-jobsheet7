import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml_tiket;
        int harga_tiket = 50000;

        while (true) {
            System.out.print("Masukkan Jumlah Tiket Anda : ");
            jml_tiket = sc.nextInt();

            if (jml_tiket < 0) {
                System.out.println("Nilai Tidak Valid. Silahkan masukkan lagi nilai yang valid.");
            } else {
                break;
            }
        }

        int total_harga = jml_tiket * harga_tiket;

        if (jml_tiket > 4) {
            double total_diskon = total_harga * 0.1;
            total_harga -= total_diskon;
            System.out.println("Anda mendapat diskon 10%");
        } else if (jml_tiket > 10) {
            double total_diskon = total_harga * 1.5;
            total_harga -= total_diskon;
            System.out.println("Anda mendapat diskon 15%");
        }

        System.out.println("Total harga tiket: " + total_harga);
    }
}
