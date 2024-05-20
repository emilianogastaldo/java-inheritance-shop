package javashop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{

    private int imei;
    private int memoria;

    Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int imei, int memoria){
        super(nome, descrizione, prezzo, iva);
        this.imei = imeiGenerator();
        this.memoria = memoria;
    };

    private int imeiGenerator(){
        Random random = new Random();
        return random.nextInt(10000000);
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
