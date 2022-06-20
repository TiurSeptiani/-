public interface DAO {
    String getPemeriksaByID(String idPemeriksa);
    String getPerawatByID(String idPerawat);
    void inputPengunjung();
    void inputDaftar();
    String getPengunjungSembuh(String pengunjung);
    void updateStatusPengunjung();
}