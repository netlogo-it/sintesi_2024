package example;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;

public class GestioneFileEsempio {
	
    public static void main(String[] args){

        System.out.println("Avvio del progamma");
        String path="cartella1/cartella2/Esempio.txt";

        String[] part=path.split("/");

        System.out.println(part[part.length-1]);

        String nomeFile=FilenameUtils.getName(path);
        System.out.println("Nome del file: "+nomeFile);

        String fullPath=FilenameUtils.getFullPath(path);
		System.out.println("Percorso completo: "+fullPath);
		
        String estensione=FilenameUtils.getExtension(path);
        System.out.println("Estensione del file: "+estensione);

        String stringaCasuale=RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Stringa casuale="+stringaCasuale);
    }
	
}

