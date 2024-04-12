package com.example;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Application");

        String stringaCasuale=RandomStringUtils.randomAlphanumeric(10);
        System.out.println("stringaCasuale="+stringaCasuale);

        String path="cartella1/cartella2/Esempio.txt";
        String nomeFile=FilenameUtils.getName(path);
        System.out.println("nomeFile="+nomeFile);

    }
}