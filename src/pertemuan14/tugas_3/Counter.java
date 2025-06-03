package tugas_3;

/**
 * Kelas Counter menghitung berapa banyak objek yang telah dibuat.
 */
public class Counter {

    // Static variable untuk menyimpan jumlah instance yang telah dibuat
    private static int count = 0;

    /**
     * Konstruktor Counter, setiap pemanggilan akan menambah total instance.
     */
    public Counter() {
        count++;
    }

    /**
     * Mengembalikan jumlah total objek Counter yang sudah dibuat.
     * Method static dapat dipanggil tanpa membuat objek.
     * @return jumlah instance Counter
     */
    public static int getCount() {
        return count;
    }
}
