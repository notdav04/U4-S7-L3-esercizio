package com.example.U4_S7_L3_esercizio.eser1;

public class UserData {

    private String nomeCompleto;
    private int eta;

    
    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();

    }

    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
