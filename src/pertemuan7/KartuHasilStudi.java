package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    public void addMatakuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }
    public double hitungIPS() {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (MataKuliah mk : daftarMatakuliah) {
            totalNilai += mk.hitungNilaiTotal();
            totalSKS += mk.getSks();
        }
        ips = totalSKS > 0 ? totalNilai / totalSKS : 0.0;
        return ips;
    }
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }
    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}