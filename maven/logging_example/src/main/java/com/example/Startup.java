package com.example;

import org.apache.log4j.PropertyConfigurator;

public class Startup {
    
    public Startup(){
        try{
            this.initializeLog4j();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
	
    protected void initializeLog4j(){
        String file = "log4j.properties";
        System.out.println("Load log4j file:"+file);
        PropertyConfigurator.configure(file);
    }
}
