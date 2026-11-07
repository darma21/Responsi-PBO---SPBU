
public class Pertamax extends BahanBakar implements Layanan, Pembayaran {
    private int poin;

    public Pertamax(String kode, double harga, double stok) {
        // 5. Super Chaining
        super(kode, "Pertamax", harga, stok);
        this.poin = 0;
    }


    @Override
    public boolean isiBBM(double liter) {
        if (liter > getStok()) {
            System.out.println("[GAGAL] Stok Pertamax habis!");
            return false;
        } else {
            setStok(getStok() - liter);
            this.poin += (int) liter * 2;
            System.out.println("[SUKSES] Berhasil isi Pertamax " + liter + " Liter.");
            return true;
        }
    }

    @Override
    public void bayar(double total) {
        System.out.println("-> Pembayaran sukses sebesar Rp" + total);
    }

    @Override
    public void cetakStruk() {
        System.out.println("-> Struk: Pembelian Pertamax (Poin: " + poin + ")");
    }
}
