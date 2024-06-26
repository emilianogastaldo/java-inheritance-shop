package javashop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;
    Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless){
        super(nome, descrizione, prezzo, iva);
        this.colore = valueOrDefault(colore);
        this.wireless = wireless;
    }

//    Metodo di controllo per il colore:
    private String valueOrDefault(String value){
        if(value == null || value.isEmpty()){
            return "N.D.";
        }
        return value;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = valueOrDefault(colore);
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie: " + getNome() + " Colore: "+ colore+ " Prezzo: " + getFullPrice()+"€.";
    }
}
