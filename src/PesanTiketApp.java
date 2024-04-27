import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Masukkan pilihan Anda (1/2): ");
        int tahapPilihan = scanner.nextInt();
        String tahap;

        if (tahapPilihan == 1) {
            tahap = "Presale";
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Masukkan pilihan Anda (1/2): ");
            int tiketPilihan = scanner.nextInt();
            Tiket tiket;
            switch (tiketPilihan) {
                case 1:
                    tiket = new VIP();
                    break;
                case 2:
                    tiket = new VVIP();
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    return;
            }

            System.out.print("\nMasukkan jumlah tiket: ");
            int jumlah = scanner.nextInt();

            Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlah);
            pemesanan.cetakNota();
        } else if (tahapPilihan == 2) {
            tahap = "Reguler";
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");
            int tiketPilihan = scanner.nextInt();
            Tiket tiket;
            switch (tiketPilihan) {
                case 1:
                    tiket = new Festival();
                    break;
                case 2:
                    tiket = new VIP();
                    break;
                case 3:
                    tiket = new VVIP();
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    return;
            }

            System.out.print("\nMasukkan jumlah tiket: ");
            int jumlah = scanner.nextInt();

            Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlah);
            pemesanan.cetakNota();
        } else {
            System.out.println("Input tidak valid!");
        }
    }
}
