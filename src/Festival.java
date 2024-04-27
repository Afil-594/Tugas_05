// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here
    public Festival() {
        jenis = "Festival";
        harga = 100;
    }

    @Override
    public int getHarga(String tahap) {
        return harga;
    }
}
