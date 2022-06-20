public abstract class Pendaftaran implements DAO {
    private String idPendaftaran;
    private String nama;
    public Pendaftaran() {
        // TODO Auto-generated constructor stub
    }

    public void mengaturDaftar(Pengunjung pengunjung,Pemeriksa pemeriksa, Daftar daftar) {

    }

    public String getIdPendaftaran() {
        return idPendaftaran;
    }
    public void setIdPendaftaran(String idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }


}