package Classes;

public class Customer {
    private String nama;
    private int lama_sewa;
    private String kontak;

    //Method
    public void setNama(String Nama){
        nama = Nama;
    }

    public String getNama(){
        return nama;
    }

    public void setLama_sewa(int hari){
        lama_sewa = hari;
    }

    public int getLama_sewa(){
        return lama_sewa;
    }

    public void setKontak(String Kontak){
        kontak = Kontak;
    }

    public String getKontak(){
        return kontak;
    }

}
