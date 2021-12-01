package Classes;

public class Car extends Vehicle {
    private double HARGA;
    private String TRANSMISI;
    private String TIPEBBM;

    public Car(){
        
    }
    public Car(String nama, String jenis){
        super(nama, jenis);
        super.setHarga(HARGA);
        super.setTransmisi(TRANSMISI);
        super.setTipeBbm(TIPEBBM);
    }
}