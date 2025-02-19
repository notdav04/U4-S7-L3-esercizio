package com.example.U4_S7_L3_esercizio.eser1;

import java.time.LocalDate;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info i;

    public InfoAdapter(Info i) {
        this.i = i;
    }


    @Override
    public String getNomeCompleto() {
        String nome = i.getNome();
        String cognome = i.getCognome();
        return nome + " " + cognome;
    }

    @Override
    public int getEta() {
        int  now = LocalDate.now().getYear();
        int annoDiNascita = i.getDataDiNascita().getYear();
        return now - annoDiNascita;
    }
}
