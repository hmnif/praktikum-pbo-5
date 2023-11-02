import java.util.Scanner;

public class KriteriaBerat {
  public static void main(String[] args) {
    String kriteria;
    Scanner input = new Scanner(System.in);

    System.out.print("Berat badan : ");
    double bb = input.nextDouble();
    System.out.print("Tinggi badan : ");
    double tb = input.nextDouble();

    // Indeks Massa Tubuh
    double imt = bb / tb * tb;
    if (imt >= 40) {
      kriteria = "Sangat Gemuk";
    } else if (imt >= 30) {
      kriteria = "Gemuk";
    } else if (imt >= 25) {
      kriteria = "Berat Badan Lebih";
    } else if (imt >= 18.5) {
      kriteria = "Berat Badan Ideal";
    } else {
      kriteria = "Berat Badan Kurang";
    }

    System.out.println(imt);
    System.out.println(kriteria);
  }
}
