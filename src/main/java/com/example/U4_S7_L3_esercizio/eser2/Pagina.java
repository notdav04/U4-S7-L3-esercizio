package com.example.U4_S7_L3_esercizio.eser2;

public class Pagina implements ElementoLibro{
    //foglia non contiene nessun elemento
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + contenuto);
    }

    @Override
    public int getTotalePagine() {
        return 1;
    }
}
