package javashop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private double pollici;
    private boolean isSmart;
    public Televisore(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, double pollici, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public double getPollici() {
        return pollici;
    }

    public void setPollici(double pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
