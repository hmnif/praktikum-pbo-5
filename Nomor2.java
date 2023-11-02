import java.util.Scanner;

public class Nomor2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Uang Pembayaran : ");
    double pembelian = input.nextDouble();
    double potongan;
    if (pembelian < 50000) {
      potongan = 0.05 * pembelian;
      System.out.println("Potongan sebesar : 5%");
    } else {
      potongan = 0.2 * pembelian;
      System.out.println("Potongan sebesar : 20%");
    }

    System.out.println("Pembelian : " + pembelian);
    System.out.println("Besarnya potongan sebesar = " + potongan);
    double jumlah = pembelian - potongan;
    System.out.println("Jumlah yang harus dibayar = " + jumlah);
  }

}
