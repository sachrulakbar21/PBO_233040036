package tugas_2;

/**
 * Kelas BankAccount merepresentasikan akun bank dengan nomor rekening unik
 * dan saldo yang bisa berubah.
 */
public class BankAccount {

    // Nomor rekening, diinisialisasi sekali dan tidak dapat diubah lagi
    private final String accountNumber;

    // Saldo akun, dapat diakses oleh subclass dan kelas dalam paket yang sama
    protected double balance;

    /**
     * Konstruktor untuk membuat akun bank baru dengan nomor rekening tertentu.
     * Saldo awal diatur ke 0.
     * @param accountNumber Nomor rekening unik
     */
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    /**
     * Menambahkan sejumlah uang ke saldo akun, hanya jika nilai positif.
     * @param amount Jumlah uang yang akan ditambahkan
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Jumlah deposit harus positif.");
        }
    }

    /**
     * Menampilkan informasi akun secara lengkap.
     * Method ini final agar tidak dapat dioverride oleh subclass.
     */
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.printf("Saldo         : Rp %.2f%n", balance);
    }
}
