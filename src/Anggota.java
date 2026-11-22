public class Anggota {
    // 1. Atribut sesuai
    private String idAnggota;
    private String nama;
    private String noTelp;
    private int jumlahPinjaman;

    // 2. Constructor Kosong
    public Anggota() {
        this.jumlahPinjaman = 0;
    }

    // 3. Constructor parameter
    public Anggota(String id, String nama, String noTelp) {
        this.idAnggota = id;
        this.nama = nama;
        this.noTelp = noTelp;
        this.jumlahPinjaman = 0;
    }

    // 4. Getter dan Setter
    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // 5. Method Pinjaman /batasnya hanya tiga kasian
    public void tambahPinjaman() {
        if (this.jumlahPinjaman < 3) {
            this.jumlahPinjaman++;
        } else {
            System.out.println("tabe, bats cuman tiga buku yang bisa dipinjam.");
        }
    }

    public void kurangiPinjaman() {
        if (this.jumlahPinjaman > 0) {
            this.jumlahPinjaman--;
        } else {
            System.out.println("Anggota tidak memiliki pinjaman aktif.");
        }
    }

    // 6. Tampilkan Info
    public void tampilkanInfoAnggota() {
        System.out.println("ID Anggota      : " + idAnggota);
        System.out.println("Nama            : " + nama);
        System.out.println("No. Telepon     : " + noTelp);
        System.out.println("Pinjaman Aktif  : " + jumlahPinjaman + " / 3 buku");
        System.out.println("okeeeeeeee");
    }
}