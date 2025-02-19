package com.example.U4_S7_L3_esercizio;

import com.example.U4_S7_L3_esercizio.eser1.Info;
import com.example.U4_S7_L3_esercizio.eser1.InfoAdapter;
import com.example.U4_S7_L3_esercizio.eser1.UserData;
import com.example.U4_S7_L3_esercizio.eser2.Libro;
import com.example.U4_S7_L3_esercizio.eser2.Pagina;
import com.example.U4_S7_L3_esercizio.eser2.Sezione;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class U4S7L3EsercizioApplication {

    public static void main(String[] args) {

        //eser 1
        Info i = new Info("davide", "alonzi", LocalDate.of(2004, 2, 26));
        InfoAdapter ia = new InfoAdapter(i);
        UserData userData = new UserData();
        userData.getData(ia);

        System.out.println(userData);


        //eser 2
        Pagina pagina1 = new Pagina("pagina1");
        Pagina pagina2 = new Pagina("pagina2");
        Pagina pagina3 = new Pagina("pagina3");

        Sezione s1 = new Sezione("cap 1");
        s1.aggiungiElemento(pagina2);
        s1.aggiungiElemento(pagina3);
        Sezione s2 = new Sezione("cap 2");
        s2.aggiungiElemento(pagina1);

        Libro l1 = new Libro("libro1", List.of("io", "tu"), 14.99);
        l1.aggiungiElemento(s1);
        l1.aggiungiElemento(s2);

        l1.stampa();
        System.out.println(l1.getTotalePagine());
    }


}
