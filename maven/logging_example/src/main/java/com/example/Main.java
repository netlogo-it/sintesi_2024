package com.example;

import org.apache.log4j.Logger;

public class Main {

    private static Logger logger=Logger.getLogger(Main.class);
    
    private static Startup startup=new Startup();
    
    public static void main(String[] args) {
       logger.info("Applicazione Avviata");

       logger.debug("Verifica delle variabili applicative.");

       logger.error("Si e' verificato un errore.");
    }
}