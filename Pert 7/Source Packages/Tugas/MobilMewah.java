import java.util.Scanner;

public class MobilMewah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SHOWROOM MOBIL MEWAH ===");
        System.out.println("1. Lamborghini Aventador");
        System.out.println("2. Ferrari SF90 Stradale");
        System.out.print("Input Pilihan (1/2): ");
        
        int pilihan = sc.nextInt();
        sc.nextLine();

        String mobil = "";
        double harga = 0.0;
        
        switch (pilihan) {
            case 1:
                mobil = "Lamborghini Aventador";
                harga = 8500000000.0; // 8.5 Miliar
                break;
            case 2:
                mobil = "Ferrari SF90 Stradale";
                harga = 9200000000.0; // 9.2 Miliar
                break;
            default:
                System.out.println("\nPilihan tidak valid! Silahkan pilih:");
                System.out.println("a. Lamborghini Aventador (8.5 Miliar)");
                System.out.println("b. Ferrari SF90 Stradale (9.2 Miliar)");
                System.out.print("Pilih (a/b): ");
                String ulang = sc.nextLine().toLowerCase();

                if (ulang.equals("a")) {
                    mobil = "Lamborghini Aventador";
                    harga = 8500000000.0;
                } else {
                    mobil = "Ferrari SF90 Stradale";
                    harga = 9200000000.0;
                }
                break;
        }

        // Tampilan hasil yang lebih menarik
        System.out.println("\n" + "=".repeat(40));
        System.out.println("SELAMAT! Anda memilih:");
        System.out.println("Mobil  : " + mobil);
        System.out.printf("Harga  : Rp %.0f\n", harga);
        System.out.println("Status : Ready Stock!");
        System.out.println("=".repeat(40));

        sc.close();
    }
}