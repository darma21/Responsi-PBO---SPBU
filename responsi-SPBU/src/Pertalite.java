
public class Pertalite extends BahanBakar implements Layanan {
    private double limitKuota;

    public Pertalite(String kode, double harga, double stok, double limitKuota) {
        // 5. Super Chaining
        super(kode, "Pertalite", harga, stok);
        this.limitKuota = limitKuota;
    }


    @Override
    public boolean isiBBM(double liter) {
        if (liter > limitKuota) {
            System.out.println("[GAGAL] Melebihi limit kuota harian (" + limitKuota + "L)!");
            return false;
        } else if (liter > getStok()) {
            System.out.println("[GAGAL] Stok SPBU tidak cukup!");
            return false;
        } else {
            setStok(getStok() - liter);
            System.out.println("[SUKSES] Berhasil isi Pertalite " + liter + " Liter.");
            return true;
        }
    }

    @Override
    public void info() {

        super.info();
        System.out.println("Limit Kuota: " + limitKuota + "L");
    }

    @Override
    public void cetakStruk() {
        System.out.println("-> Struk: Pembelian Pertalite (Subsidi)");
    }
}
