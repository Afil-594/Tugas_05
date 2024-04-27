// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    public VVIP() {
        jenis = "VVIP";
        harga = 200;
    }
  
    @Override
    public int getHarga(String tahap) {
        if (tahap.equalsIgnoreCase("presale")) {
            return (int) (harga * 0.8);
        }
        return harga;
    }
}
