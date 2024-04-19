package com.example;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class Startup extends HttpServlet {

    Logger logger=Logger.getLogger(Startup.class);

    private Properties properties=new Properties();
    private String path="";

    public Properties getProperties() {
        return properties;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        path=config.getServletContext().getRealPath("/");
        initializeLog4j();
        initializeProperties();
        logger.info("Avvio dell'applicazione web");
    }

    protected void initializeLog4j(){
        String file = path + "WEB-INF/log4j.properties";
        System.out.println("Load log4j file:"+file);
        PropertyConfigurator.configure(file);
    }

    protected void initializeProperties(){
        String file = path + "WEB-INF/application.properties";
        try{
            properties.load(new FileInputStream(file));
            Enumeration em=properties.keys();
            while(em.hasMoreElements()){
                String key=(String) em.nextElement();
                String value=properties.getProperty(key);
                logger.info("Property: "+key+"="+value);
            }
        }catch(Exception e){
            logger.error(e);
        }
    }
}
