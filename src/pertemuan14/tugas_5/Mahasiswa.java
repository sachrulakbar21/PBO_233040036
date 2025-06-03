package tugas_5;

/**
 * Kelas Mahasiswa menyimpan data mahasiswa dan menghitung total mahasiswa yang dibuat.
 */
public class Mahasiswa {

    // NIM bersifat final, hanya di-set saat pembuatan objek
    private final String nim;

    // Nama mahasiswa yang bisa diubah
    private String nama;

    // Variabel static untuk menghitung jumlah objek Mahasiswa
    private static int jumlahMahasiswa = 0;

    // Konstanta batas maksimal SKS yang dapat diambil
    public static final int BATA_SKS = 24;

    /**
     * Konstruktor untuk membuat objek Mahasiswa baru.
     * @param nim Nomor Induk Mahasiswa (unik dan tetap)
     * @param nama Nama lengkap mahasiswa
     */
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        jumlahMahasiswa++;
    }

    /**
     * Menampilkan data mahasiswa ke layar.
     */
    public void tampilkanInfo() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Batas SKS    : " + BATA_SKS);
        System.out.println("============================");
    }

    /**
     * Mendapatkan jumlah total mahasiswa yang telah dibuat.
     * @return total mahasiswa
     */
    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    // Getter dan setter untuk nama (opsional)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
