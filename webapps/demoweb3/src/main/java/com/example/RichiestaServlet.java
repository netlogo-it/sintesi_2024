package com.example;

import java.io.IOException;
import org.apache.log4j.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RichiestaServlet extends HttpServlet {

    Logger logger=Logger.getLogger(RichiestaServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String cognome=req.getParameter("cognome");
            String nome=req.getParameter("nome");
            String email=req.getParameter("email");
            String richiesta=req.getParameter("richiesta");
            logger.info("Richiedente: "
                .concat(cognome).concat(" ")
                .concat(nome).concat(" ")
                .concat(email));
            logger.info("Richiesta: ".concat(richiesta));

            if (cognome.equals("testerror")){
                throw new Exception("Simula errore di programmazione!!!");
            }
            /*
            * SEND MAIL
            * - a chi mi ha fatto richiesta
            * - a chi deve riceverla lato applicativo
            */        
            resp.sendRedirect(req.getContextPath() + "/page/success.jsp");
        }catch(Exception e){
            logger.error(e.toString());
            resp.sendRedirect(req.getContextPath() + "/page/error.jsp");
        }
    }

}
