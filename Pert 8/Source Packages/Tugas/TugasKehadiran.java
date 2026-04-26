import java.util.ArrayList;
import java.util.Scanner;

public class Tugaskehadiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> namaList = new ArrayList<>();
        ArrayList<String> statusList = new ArrayList<>();

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU KEHADIRAN ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Cetak Kehadiran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan jumlah data: ");
                    int jumlah = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nData ke-" + (i + 1));

                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();

                        System.out.print("Masukkan status kehadiran (Hadir/Izin/Sakit/Alpa): ");
                        String status = input.nextLine();

                        namaList.add(nama);
                        statusList.add(status);
                    }

                    System.out.println("Data kehadiran berhasil disimpan.");
                    break;

                case "2":
                    if (namaList.isEmpty()) {
                        System.out.println("Belum ada data kehadiran.");
                    } else {
                        System.out.println("\n=== DATA KEHADIRAN ===");

                        for (int i = 0; i < namaList.size(); i++) {
                            System.out.println((i + 1) + ". " + namaList.get(i) + " - " + statusList.get(i));
                        }
                    }
                    break;

                case "3":
                    System.out.println("Program selesai.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Menu tidak tersedia. Silakan pilih menu yang benar.");
                    break;
            }
        }

        input.close();
    }
}