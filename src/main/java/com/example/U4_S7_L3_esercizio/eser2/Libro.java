package com.example.U4_S7_L3_esercizio.eser2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ElementoLibro {
    //root, contiene l insieme di sezioni e pagine
    private String titolo;
    private List<ElementoLibro> elementi = new ArrayList<>();
    private List<String> autori;
    private double prezzo;

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungiElemento(ElementoLibro e){
        elementi.add(e);
    }

    @Override
    public void stampa() {
        System.out.println(titolo);
        System.out.println(prezzo);
        autori.forEach(autore-> System.out.println(autore));
        for (ElementoLibro e: elementi){
            e.stampa();
        }

    }

    @Override
    public int getTotalePagine() {
        int totale = 0;
        for(ElementoLibro e: elementi){
            totale += e.getTotalePagine();
        }
        return totale;
    }
}
