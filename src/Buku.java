public class Buku {
    // 1. Atribut buku
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private int stok;

    // 2. Constructor Kosong
    public Buku() {
    }

    // 3. Constructor
    public Buku(String kode, String judul, String pengarang, int stok) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    // 4. Getter dan Setter lengkap
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // 5. Methodnya disini
    public void kurangiStok() {
        if (this.stok > 0) {
            this.stok--;
        } else {
            System.out.println("Stok buku habis, tidak dapat dikurangi.");
        }
    }

    public void tambahStok() {
        this.stok++;
    }

    // 6. Method Tampilkan Info
    public void tampilkanInfoBuku() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stok      : " + stok );
        System.out.println("oke");
    }
}