package soal2;

public class Negara {
    private String namaNegara;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String n, String k, String p, int tgl, int bln, int thn) {
        this.namaNegara = n;
        this.jenisKepemimpinan = k;
        this.namaPemimpin = p;
        this.tanggalKemerdekaan = tgl;
        this.bulanKemerdekaan = bln;
        this.tahunKemerdekaan = thn;
    }

    public String getNamaNegara() {
        return namaNegara;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
}