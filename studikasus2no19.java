import java.util.Scanner;
public class studikasus2no19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String kegiatan;
        int dokumen;
        int juara;
        int pkm;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya) : ");
        kegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        dokumen = sc.nextInt();
        if (kegiatan.equalsIgnoreCase("BELMAWA") ||
            kegiatan.equalsIgnoreCase("BAKORMA") ||
            kegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang 1 dokumen). "
                            + "Dana penghargaan tidak diberikan.");
                    System.out.println("Dokumen masih kurang: " + (4 - dokumen));
                }
            } else {
                System.out.println("Status: Bukan juara 1, 2, atau 3. "
                        + "Dana penghargaan tidak diberikan.");
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            pkm = sc.nextInt();

            if (pkm == 1) {
                if (dokumen == 4) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap . "
                            + "Dana penghargaan tidak diberikan.");
                    System.out.println("Dokumen masih kurang: " + (4 - dokumen));
                }
            } else {
                System.out.println("Status: PKM tidak lolos pendanaan. "
                        + "Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status: Kegiatan lainnya. "
                    + "Dana penghargaan tidak diberikan.");
        }

}
}