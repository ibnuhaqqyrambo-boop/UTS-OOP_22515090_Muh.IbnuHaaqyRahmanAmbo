import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        boolean jalan = true;

        // Memasukkan 3 data awal Buku sesuai permintaan
        perpus.tambahBuku(new Buku("B001", "Laut Bercerita", "Leila S. Chudori", 5));
        perpus.tambahBuku(new Buku("B002", "Janji", "Tere Liye", 4));
        perpus.tambahBuku(new Buku("B003", "Bumi Manusia", "Pramoedya Ananta Toer", 3));

        // Memasukkan 4 data awal Anggota
        perpus.tambahAnggota(new Anggota("A001", "Andi", "08111222333"));
        perpus.tambahAnggota(new Anggota("A002", "Bina", "08222333444"));
        perpus.tambahAnggota(new Anggota("A003", "Citra", "08333444555"));
        perpus.tambahAnggota(new Anggota("A004", "Doni", "08444555666"));

        System.out.println("=========================================");
        System.out.println("  SELAMAT DATANG DI SISTEM PERPUSTAKAAN  ");
        System.out.println("=========================================");

        while (jalan) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Semua Buku");
            System.out.println("2. Tampilkan Semua Anggota");
            System.out.println("3. Proses Peminjaman Buku");
            System.out.println("4. Cek Riwayat Transaksi Terakhir (Stack)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan sisa enter (newline)

            switch (pilihan) {
                case 1:
                    perpus.tampilkanSemuaBuku();
                    break;
                case 2:
                    perpus.tampilkanSemuaAnggota();
                    break;
                case 3:
                    System.out.println("\n--- Form Peminjaman ---");
                    System.out.print("Masukkan ID Transaksi : ");
                    String idTrans = input.nextLine();

                    // Simulasi menggunakan data buku pertama dan anggota pertama
                    System.out.println("Menggunakan Anggota Default: Andi (A001)");
                    System.out.println("Menggunakan Buku Default: Laut Bercerita (B001)");
                    System.out.print("Masukkan Tanggal (DD/MM/YYYY): ");
                    String tgl = input.nextLine();

                    // Mengambil objek dummy dari index 0 untuk simulasi
                    Buku bukuDipinjam = new Buku("B001", "Laut Bercerita", "Leila S. Chudori", 5);
                    Anggota peminjam = new Anggota("A001", "Andi", "08111222333");

                    perpus.prosesPeminjaman(idTrans, bukuDipinjam, peminjam, tgl);
                    break;
                case 4:
                    perpus.cekRiwayatTerakhir();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini. Program selesai.");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        input.close();
    }
}