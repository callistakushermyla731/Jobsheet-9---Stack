import java.util.Scanner;

public class MainSurat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat ss = new StackSurat(10);

        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    ss.push(new Surat04(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    ss.prosesSurat();
                    break;

                case 3:
                    ss.lihatTerakhir();
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = sc.nextLine();
                    ss.cari(cari);
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilih != 0);
    }
}

