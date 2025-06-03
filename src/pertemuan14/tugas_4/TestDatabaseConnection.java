package tugas_4;

/**
 * Kelas TestDatabaseConnection untuk menguji inisialisasi static pada DatabaseConnection.
 */
public class TestDatabaseConnection {

    public static void main(String[] args) {
        // Mengakses variabel static connectionString
        // Static block pada kelas DatabaseConnection akan otomatis dijalankan sekali saat kelas ini di-load
        System.out.println("Connection String yang digunakan: " + DatabaseConnection.connectionString);
    }
}
