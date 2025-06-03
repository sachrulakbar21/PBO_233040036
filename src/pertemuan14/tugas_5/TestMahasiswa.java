package tugas_5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan nama yang berbeda
        Mahasiswa mahasiswa1 = new Mahasiswa("230101", "Dewi");
        Mahasiswa mahasiswa2 = new Mahasiswa("230102", "Fajar");
        Mahasiswa mahasiswa3 = new Mahasiswa("230103", "Rina");

        // Menampilkan informasi masing-masing mahasiswa
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();

        // Menampilkan total jumlah mahasiswa yang telah dibuat
        System.out.println("Total mahasiswa terdaftar: " + Mahasiswa.getJumlahMahasiswa());
    }
}
