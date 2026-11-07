public abstract class BahanBakar {
    public static final String NAMA_SPBU = "SPBU Unsoed";
    private final String kode;


    private String nama;
    private double harga;
    private double stok;


    public BahanBakar(String kode, String nama) {
        this(kode, nama, 10000, 100);
    }


    public BahanBakar(String kode, String nama, double harga, double stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }


    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public double getStok() { return stok; }
    public void setStok(double stok) { this.stok = stok; }


    public double hitungHarga(double liter) {
        return liter * harga;
    }

    public void info() {
        System.out.println(NAMA_SPBU + " | " + nama + " [" + kode + "] | Harga: Rp" + harga + " | Stok: " + stok + "L");
    }


    public abstract boolean isiBBM(double liter);
}
