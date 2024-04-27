// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    protected String jenis;
    protected int harga;

    public abstract int getHarga(String tahap);
}
