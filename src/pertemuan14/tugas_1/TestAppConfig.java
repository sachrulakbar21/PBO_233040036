package tugas_1;

/**
 * Kelas TestAppConfig digunakan untuk menguji dan menampilkan
 * nilai-nilai konfigurasi dari kelas AppConfig.
 */
public class TestAppConfig {

    public static void main(String[] args) {
        displayConfig();
    }

    // Metode terpisah untuk menampilkan konfigurasi, agar main lebih rapi
    private static void displayConfig() {
        System.out.println("=== Konfigurasi Aplikasi ===");
        System.out.printf("URL API        : %s%n", AppConfig.BASE_URL);
        System.out.printf("Versi Aplikasi : %s%n", AppConfig.APP_VERSION);
        System.out.printf("Timeout Default: %d ms%n", AppConfig.DEFAULT_TIMEOUT);
    }
}
