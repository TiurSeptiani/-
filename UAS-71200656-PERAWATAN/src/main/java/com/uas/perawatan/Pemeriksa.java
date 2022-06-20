import java.util.Vector;

public class Pemeriksa {
    private String idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;
    public Pemeriksa() {
        // TODO Auto-generated constructor stub
    }

    public void cekStatus(Pengunjung pengunjung) {
        if(pengunjung.isStatus()==true) {
            System.out.println("Sembuh");
        }
        else {
            System.out.println("Sakit");
        }
    }

    public String getIdPemeriksa() {
        return idPemeriksa;
    }
    public void setIdPemeriksa(String idPemeriksa) {
        this.idPemeriksa = idPemeriksa;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSpesialis() {
        return spesialis;
    }
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    public String getRuangan() {
        return ruangan;
    }
    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }



}