package Classes;

public class Vehicle {
    private String nama;
    private String jenis;
    private String transmisi;
    private String tipebbm;
    private double harga;
    // ini adalah method
    public Vehicle(){

    }

    public Vehicle(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }

    protected void setHarga(double harga){
        this.harga = harga;
    }

    protected void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }

    protected void setTipeBbm(String tipebbm){
        this.tipebbm = tipebbm;
    }

    public double getHarga() {
        return harga;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public String getTipebbm() {
        return tipebbm;
    }
}
