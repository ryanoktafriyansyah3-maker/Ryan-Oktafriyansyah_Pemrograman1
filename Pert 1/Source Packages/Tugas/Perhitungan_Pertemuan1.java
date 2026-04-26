public class perhitungan_pertemuan1
{
    public static void main(String[] args) 
    {
        double makanHarian = 20000;
        double transportHarian = 10000;
        double belanjaHarian = 50000;

        //Perhitungan dana dalam 1 hari
        double totalHarian = makanHarian + transportHarian + belanjaHarian;

        System.out.println("Perhitungan Dana dalam 1 Hari:");
        System.out.println("Makan        : " + makanHarian);
        System.out.println("Transportasi : " + transportHarian);
        System.out.println("Belanja      : " + belanjaHarian);
        System.out.println("Hitung Total : " + totalHarian);
        
        System.out.println("\nPersentase Harian:");
        System.out.println("Makan        : " + (makanHarian / totalHarian * 100) + "%");
        System.out.println("Transportasi : " + (transportHarian / totalHarian * 100) + "%");
        System.out.println("Belanja      : " + (belanjaHarian / totalHarian * 100) + "%");

        System.out.println("\n==============================\n");

        //Perhitungan dana dalam 1 minggu
        double makanMingguan = makanHarian * 7;
        double transportMingguan = transportHarian * 7;
        double belanjaMingguan = belanjaHarian * 7;
        double totalMingguan = totalHarian * 7;

        System.out.println("Perhitungan Dana dalam 1 Minggu:");
        System.out.println("Makan        : " + makanMingguan);
        System.out.println("Transportasi : " + transportMingguan);
        System.out.println("Belanja      : " + belanjaMingguan);
        System.out.println("Hitung Total : " + totalMingguan);
        
        System.out.println("\nPersentase Mingguan:");
        System.out.println("Makan        : " + (makanMingguan / totalMingguan * 100) + "%");
        System.out.println("Transportasi : " + (transportMingguan / totalMingguan * 100) + "%");
        System.out.println("Belanja      : " + (belanjaMingguan / totalMingguan * 100) + "%");
    }
}