package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Applicazione avviata");

        String value1=Modulo1Utils.generaStringaCasuale();
        System.out.println("Stringa casuale="+value1);

        List<String> lista=new ArrayList<>(List.of("Uno","Due","Tre","Quattro","Cinque"));
        Modulo1Utils.mescolaElenco(lista);
        lista.stream().forEach(x->System.out.println(x));

        boolean value2=Modulo1Utils.stringaVuota(value1);
        if (value2){
            System.out.println("La string casuale e' vuota");
        }else{
            System.out.println("La string casuale non e' vuota");
        }
    }
}
