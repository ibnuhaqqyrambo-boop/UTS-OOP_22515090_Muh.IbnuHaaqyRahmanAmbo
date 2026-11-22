public class StackRiwayat {
    // 1. Atributnya
    private Peminjaman[] dataTransaksi;
    private int top;
    private int kapasitas;

    // 2. Constructor
    public StackRiwayat(int kapasitas) {
        this.kapasitas = kapasitas;
        this.dataTransaksi = new Peminjaman[kapasitas];
        this.top = -1; // -1 menandakan tumpukan (stack) masih kosong
    }

    // 3. Method Mengecek apakah kapasitas riwayat penuh
    public boolean isFull() {
        return top == kapasitas - 1;
    }

    // 4. Method Mengecek apakah riwayat kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // 5. Method push: Menambahkan riwayat transaksi baru
    public void push(Peminjaman p) {
        if (!isFull()) {
            top++;
            dataTransaksi[top] = p;
        } else {
            System.out.println("Riwayat penuh! sudah tidak bisa menyimpan riwayat .");
        }
    }

    // 6. Method pop: Mengambil dan MENGHAPUS riwayat transaksi paling atas
    public Peminjaman pop() {
        if (!isEmpty()) {
            Peminjaman p = dataTransaksi[top];
            top--;
            return p;
        } else {
            System.out.println("Riwayat kosong!");
            return null;
        }
    }

    // 7. Method peek: Hanya MELIHAT riwayat transaksi paling atas (tanpa menghapus)
    public Peminjaman peek() {
        if (!isEmpty()) {
            return dataTransaksi[top];
        } else {
            System.out.println("Riwayat kosong!");
            return null;
        }
    }

    // 8. Method size: Mengetahui jumlah riwayat yang ada saat ini
    public int size() {
        return top + 1;
    }
}