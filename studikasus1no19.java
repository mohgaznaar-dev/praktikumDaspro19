import java.util.Scanner;
public class studikasus1no19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = input.nextInt();
         totalHarga = kopi * jumlahCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Total harga:Rp " + totalHarga);
            System.out.println("Diskon:Rp " + diskon);
            System.out.println("Total bayar:Rp " + totalBayar);
            System.out.println("Kembalian:Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Total harga:Rp " + totalHarga);
            System.out.println("Diskon:Rp " + diskon);
            System.out.println("Total bayar:Rp " + totalBayar);
            System.out.println("Uang tidak cukup, kurang:Rp " + kurang);
        }
         
    }
}

