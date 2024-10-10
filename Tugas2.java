import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukkan Jenis Kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Anda keluar dari program.");
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi : ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total = 12500;
                } else if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                }

                System.out.println("Total Biaya Parkir: Rp." + total);
            } else {
                System.out.println("Input tidak valid. Masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk Keluar.");
            }
        }
    }
}
