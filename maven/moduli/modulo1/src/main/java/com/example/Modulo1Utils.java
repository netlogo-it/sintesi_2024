package com.example;

import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class Modulo1Utils {

    public static boolean stringaVuota(String value){
        return StringUtils.isBlank(value);
    }

    public static String generaStringaCasuale(){
        return RandomStringUtils.randomAlphanumeric(10);
    }

    public static void mescolaElenco(List<String> elenco){
        Collections.shuffle(elenco);
    }

}
