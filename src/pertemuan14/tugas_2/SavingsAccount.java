package tugas_2;

/**
 * Kelas SavingsAccount merupakan subclass dari BankAccount yang merepresentasikan
 * rekening tabungan dengan fitur tambahan untuk menampilkan informasi lebih detail.
 */
public class SavingsAccount extends BankAccount {

    /**
     * Konstruktor yang menerima nomor rekening dan meneruskannya ke kelas induk.
     * @param accountNumber Nomor rekening tabungan
     */
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    /**
     * Menampilkan informasi lengkap rekening tabungan, termasuk jenis rekening.
     */
    public void showDetailedInfo() {
        // Memanggil method final dari kelas induk untuk menampilkan info dasar
        super.displayAccountInfo();
        // Menambahkan informasi khusus untuk rekening tabungan
        System.out.println("Jenis Rekening: Tabungan");
    }
}
