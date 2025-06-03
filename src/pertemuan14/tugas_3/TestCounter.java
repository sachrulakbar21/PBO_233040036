package tugas_3;

public class TestCounter {
    public static void main(String[] args) {
        // Membuat 4 objek Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        // Menampilkan total objek Counter yang sudah dibuat menggunakan method getCount()
        System.out.println("Jumlah objek Counter yang telah dibuat: " + Counter.getCount());
    }
}
