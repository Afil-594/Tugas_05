// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here
   public VIP() {
      jenis = "VIP";
      harga = 150;
  }

  @Override
  public int getHarga(String tahap) {
      if (tahap.equalsIgnoreCase("presale")) {
          return (int) (harga * 0.8);
      }
      return harga;
  }
}
