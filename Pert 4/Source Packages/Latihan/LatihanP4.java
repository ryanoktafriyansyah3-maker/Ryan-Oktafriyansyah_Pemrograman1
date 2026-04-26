import java.util.Scanner;
public class LatihanP4 
{
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    int kehadiran, tugas, uts, uas;

    System.out.print("input kehadiran: ");
    kehadiran = input.nextInt();

    System.out.print("input tugas: ");
    tugas = input.nextInt();
    
    System.out.print("input uts: ");
    uts = input.nextInt();

    System.out.print("input uas: ");
    uas = input.nextInt();

    int Kehadiran = (kehadiran * 10) / 21;
    int bobotTugas = tugas * 20 / 100;
    int bobotUts = uts * 30 / 100;
    int bobotUas = uas * 40 / 100;

    int total = Kehadiran + bobotTugas + bobotUts + bobotUas;
    
    System.out.println();
    
    System.out.println("==========");
    System.out.println("kehadiran: " + kehadiran);
    System.out.println("tugas: " + tugas);
    System.out.println("uts: " + uts);
    System.out.println("uas: " + uas);
    System.out.println("==========");
    System.out.println("Kehadiran: " + Kehadiran);
    System.out.println("Bobot Tugas: " + bobotTugas);
    System.out.println("Bobot UTS: " + bobotUts);
    System.out.println("Bobot UAS: " + bobotUas);
    System.out.println("Total: " + total);
    System.out.println("==========");
    }
}