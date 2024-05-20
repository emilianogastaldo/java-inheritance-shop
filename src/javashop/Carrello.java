package javashop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti acquisti?");
        int lunghezza = Integer.parseInt(scanner.nextLine());
        Prodotto[] carrello = new Prodotto[lunghezza];
        int i = 0;
        while(i < lunghezza) {
            System.out.println("Aggiunti una TV [T], uno Smartphone [S] oppure delle Cuffie [C]?");
            String scelta = scanner.nextLine().trim().toLowerCase();
            if(scelta.equals("t")){
//                Raccolgo le info per creare il prodotto
                System.out.println("Nome prodotto:");
                String nome = scanner.nextLine();
                System.out.println("Descrizione:");
                String descrizione = scanner.nextLine();
                System.out.println("Prezzo:");
                BigDecimal prezzo = new BigDecimal(scanner.nextLine());
                System.out.println("Iva:");
                BigDecimal iva = new BigDecimal(scanner.nextLine());
                System.out.println("Pollici:");
                double pollici = Double.parseDouble(scanner.nextLine());
                System.out.println("E' smart? Si [S], No [N]");
                String input = scanner.nextLine().trim().toLowerCase();
                boolean isSmart = input.equals("s") ? true : false;
//                Creo il prodotto TV
                Televisore tv = new Televisore(nome, descrizione, prezzo, iva,pollici,isSmart);
//                Salvo il prodotto nel carrello
                carrello[i] = tv;
                i++;
            } else if (scelta.equals("s")) {
//                Raccolgo le info per creare il prodotto
                System.out.println("Nome prodotto:");
                String nome = scanner.nextLine();
                System.out.println("Descrizione:");
                String descrizione = scanner.nextLine();
                System.out.println("Prezzo:");
                BigDecimal prezzo = new BigDecimal(scanner.nextLine());
                System.out.println("Iva:");
                BigDecimal iva = new BigDecimal(scanner.nextLine());
                System.out.println("Memoria:");
                int memoria = Integer.parseInt(scanner.nextLine());
//                Creo il prodotto Smartphone
                Smartphone phone = new Smartphone(nome, descrizione, prezzo, iva, memoria);
//                Salvo il prodotto nel carrello
                carrello[i]=phone;
                i++;
            } else if (scelta.equals("c")) {
                System.out.println("Nome prodotto:");
                String nome = scanner.nextLine();
                System.out.println("Descrizione:");
                String descrizione = scanner.nextLine();
                System.out.println("Prezzo:");
                BigDecimal prezzo = new BigDecimal(scanner.nextLine());
                System.out.println("Iva:");
                BigDecimal iva = new BigDecimal(scanner.nextLine());
                System.out.println("Colore:");
                String colore = scanner.nextLine();
                System.out.println("Sono wireless? Si [S], No [N]");
                String input = scanner.nextLine().trim().toLowerCase();
                boolean isWireless = input.equals("s") ? true : false;
//                Creo il prodotto Cuffie
                Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore, isWireless);
//                Salvo il prodotto nel carrello
                carrello[i]=cuffie;
                i++;
            }else {
                System.out.println("Mi dispiace, scrivi T, S o C");
            }
        }
        System.out.println("Il tuo carrello è:");
        for (int j = 0; j < lunghezza; j++) {
            System.out.println(carrello[j].toString());
        }
        scanner.close();
    }
}
