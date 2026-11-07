public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM SPBU ===");


        Pertalite pertalite = new Pertalite("B01", 10000, 100, 20);
        Pertamax pertamax = new Pertamax("B02", 13500, 200);


        Layanan layananPertalite = pertalite;
        Layanan layananPertamax = pertamax;
        Pembayaran bayarPertamax = pertamax;


        System.out.println("\n--- TEST 1: PERTALITE ---");
        pertalite.info();
        System.out.println("\n> Coba isi 30 Liter (melebihi limit 20L):");
        pertalite.isiBBM(30);

        System.out.println("\n> Coba isi 10 Liter:");
        if (pertalite.isiBBM(10)) {
            System.out.println("Total: Rp" + pertalite.hitungHarga(10));
            layananPertalite.cetakStruk();
        }
        pertalite.info();


        System.out.println("\n--- TEST 2: PERTAMAX ---");
        pertamax.info();
        System.out.println("\n> Coba isi 15 Liter:");
        if (pertamax.isiBBM(15)) {
            double total = pertamax.hitungHarga(15);
            bayarPertamax.bayar(total);
            layananPertamax.cetakStruk();
        }
        pertamax.info();
    }
}
