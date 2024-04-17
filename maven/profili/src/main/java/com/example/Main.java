package com.example;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println("Avvio applicazione");

        Properties properties=new Properties();
        InputStream is=Main.class.getResourceAsStream("/config.properties");
        try{
            properties.load(is);
        }catch(Exception e){
            System.out.println("Errore nella lettura del file: config.properties");
        }
        Enumeration em=properties.keys();
        while(em.hasMoreElements()){
            String key=(String) em.nextElement();
            System.out.println("Property: "+key+"="+properties.getProperty(key));
        }
    }
}
