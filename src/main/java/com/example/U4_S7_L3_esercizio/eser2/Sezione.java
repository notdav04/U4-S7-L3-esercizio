package com.example.U4_S7_L3_esercizio.eser2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro{
    //composite, contiene elementi foglia o composite
    private String titolo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(ElementoLibro e){
        this.elementi.add(e);
    }
    @Override
    public void stampa() {
        System.out.println(titolo);
        for (ElementoLibro e : elementi){
            e.stampa();
        }
    }

    @Override
    public int getTotalePagine() {
        int total = 0;
        for (ElementoLibro e: elementi){
            total += e.getTotalePagine();
        }
        return total;
    }
}
