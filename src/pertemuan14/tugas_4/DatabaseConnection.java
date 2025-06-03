package tugas_4;

/**
 * Kelas DatabaseConnection menyimpan konfigurasi koneksi database secara statis.
 */
public class DatabaseConnection {

    // Static variable yang menyimpan URL koneksi ke database
    public static String connectionString;

    // Static initializer block untuk menginisialisasi connectionString saat kelas dimuat
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("[Static Block] connectionString berhasil diinisialisasi.");
    }

    /**
     * Konstruktor default, kosong karena kelas ini hanya berfungsi sebagai penyimpan konfigurasi.
     */
    public DatabaseConnection() {
        // Tidak ada inisialisasi tambahan di konstruktor
    }
}
