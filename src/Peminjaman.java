public class Peminjaman {
    // 1. Atribut
    private String idPeminjaman;
    private Buku bukuDipinjam;
    private Anggota peminjam;
    private String tanggalPinjam;

    // 2. Constructor Kosong
    public Peminjaman() {
    }

    // 3. Constructor parameter
    public Peminjaman(String id, Buku b, Anggota a, String tgl) {
        this.idPeminjaman = id;
        this.bukuDipinjam = b;
        this.peminjam = a;
        this.tanggalPinjam = tgl;
    }

    // 4. Getter dan Setter
    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Buku getBukuDipinjam() {
        return bukuDipinjam;
    }

    public void setBukuDipinjam(Buku bukuDipinjam) {
        this.bukuDipinjam = bukuDipinjam;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    // 5. Method untuk Validasi
    public boolean cekStatusValidasi() {
        if (bukuDipinjam == null || peminjam == null) {
            return false;
        }
        return (bukuDipinjam.getStok() > 0) && (peminjam.getJumlahPinjaman() < 3);
    }

    // 6. Method Tampilkan outputnya/nota
    public void tampilkanNota() {
        System.out.println("NOTA PEMINJAMAN ");
        System.out.println("ID Transaksi : " + idPeminjaman);
        System.out.println("Tanggal      : " + tanggalPinjam);
        System.out.println("Peminjam     : " + (peminjam != null ? peminjam.getNama() : "-"));
        System.out.println("Buku         : " + (bukuDipinjam != null ? bukuDipinjam.getJudul() : "-"));
        System.out.println("Status       : " + (cekStatusValidasi() ? "Valid" : "Tidak Valid"));
        System.out.println("okeeeee");
    }

    // 7. Method  untuk membatalkan
    public void batalkan() {
        System.out.println("Transaksi peminjaman " + idPeminjaman + " telah dibatalkan.");
        this.bukuDipinjam = null;
        this.peminjam = null;
    }
}
