import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private StackRiwayat riwayatPeminjaman;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.riwayatPeminjaman = new StackRiwayat(100);
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil ditambahkan ke perpus.");
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\nDAFTAR BUKU PERPUSTAKAAN");
        for (Buku b : daftarBuku) {
            b.tampilkanInfoBuku();
        }
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota '" + anggota.getNama() + "' berhasil didaftarkan.");
    }

    public void tampilkanSemuaAnggota() {
        System.out.println("\nDAFTAR ANGGOTA");
        for (Anggota a : daftarAnggota) {
            a.tampilkanInfoAnggota();
        }
    }

    public void prosesPeminjaman(String idTransaksi, Buku buku, Anggota anggota, String tanggal) {
        Peminjaman transaksiBaru = new Peminjaman(idTransaksi, buku, anggota, tanggal);

        System.out.println("\nMemproses peminjaman untuk: " + anggota.getNama());

        if (transaksiBaru.cekStatusValidasi()) {
            buku.kurangiStok();
            anggota.tambahPinjaman();
            riwayatPeminjaman.push(transaksiBaru);

            System.out.println("Status: BERHASIL");
            transaksiBaru.tampilkanNota();
        } else {
            System.out.println("Status: GAGAL (Stok habis atau batas pinjaman maksimal tercapai)");
        }
    }

    public void cekRiwayatTerakhir() {
        System.out.println("\nTRANSAKSI TERAKHIR ");
        Peminjaman terakhir = riwayatPeminjaman.peek();
        if (terakhir != null) {
            terakhir.tampilkanNota();
        }
    }
}