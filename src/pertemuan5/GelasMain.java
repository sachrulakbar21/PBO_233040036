package pertemuan5;

public class GelasMain {
    public static void main(String[] args) {
        // Membuat dua objek Gelas dengan warna awal
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        // Menampilkan warna sebelum pertukaran
        System.out.println("Sebelum ditukar:");
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());

        // Menukar warna gelas
        tukarWarnaGelas(g1, g2);

        // Menampilkan warna setelah pertukaran
        System.out.println("\nSetelah ditukar:");
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());
    }

    // Method untuk menukar warna gelas
    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
        String temp = g1.getWarna();
        g1.setWarna(g2.getWarna());
        g2.setWarna(temp);
    }
}
