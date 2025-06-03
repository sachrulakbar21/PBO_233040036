package tugas_1;

/**
 * Kelas AppConfig digunakan untuk menyimpan konfigurasi global aplikasi.
 * Semua atribut bersifat static dan final agar bersifat konstan dan dapat
 * diakses langsung tanpa harus membuat objek dari kelas ini.
 */
public class AppConfig {

    // URL utama untuk mengakses API aplikasi
    public static final String BASE_URL = "https://www.myapp.com/api";

    // Versi aplikasi yang sedang berjalan
    public static final String APP_VERSION = "1.0.0";

    // Waktu tunggu maksimum (dalam milidetik) untuk request jaringan
    public static final int DEFAULT_TIMEOUT = 5000;

    // Private constructor untuk mencegah instansiasi kelas
    private AppConfig() {
        throw new UnsupportedOperationException("AppConfig adalah kelas utilitas dan tidak dapat diinstansiasi.");
    }
}
