package tugas_2;

/**
 * Kelas Main untuk menjalankan aplikasi dan menguji kelas SavingsAccount.
 */
public class Main {

    public static void main(String[] args) {
        // Inisialisasi rekening tabungan dengan nomor unik
        SavingsAccount savingsAccount = new SavingsAccount("9876543210");

        // Melakukan penyetoran sejumlah dana ke rekening tabungan
        double depositAmount = 2_500_000;
        savingsAccount.deposit(depositAmount);

        // Menampilkan detail lengkap rekening tabungan
        System.out.println("=== Informasi Rekening Tabungan ===");
        savingsAccount.showDetailedInfo();
    }
}
