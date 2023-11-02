import java.util.Scanner;

public class Mahasiswa {
  public static void main(String[] args) {
    String grade, ket;
    Scanner input = new Scanner(System.in);
    System.out.print("NPM : ");
    String npm = input.nextLine();
    System.out.print("Nama : ");
    String nama = input.nextLine();
    System.out.print("Nilai kehadiran : ");
    double nhadir = input.nextDouble();
    System.out.print("Nilai Tugas : ");
    double ntugas = input.nextDouble();
    System.out.print("Nilai UTS : ");
    double nuts = input.nextDouble();
    System.out.print("Nilai UAS : ");
    double nuas = input.nextDouble();

    double nakhir = 0.1 * nhadir + 0.2 * ntugas + 0.3 * nuts + 0.4 * nuas;
    if (nakhir > 75) {
      grade = "A";
      ket = "Istimewa";
    } else if (nakhir > 65) {
      grade = "B";
      ket = "Baik";
    } else if (nakhir > 55) {
      grade = "C";
      ket = "Cukup";
    } else if (nakhir > 45) {
      grade = "D";
      ket = "Kurang";
    } else {
      grade = "E";
      ket = "Kurang Sekali";
    }

    System.out.println("NPM Mahasiswa : " + npm);
    System.out.println("Nama Mahasiswa : " + nama);
    System.out.println("Nilai akhir : " + nakhir);
    System.out.println("Grade : " + grade);
    System.out.println("Keterangan : " + ket);
  }
}
