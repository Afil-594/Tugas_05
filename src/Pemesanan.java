// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here
        int totalHarga = tiket.getHarga(tahap) * jumlah;
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp." + totalHarga);
    }
}
