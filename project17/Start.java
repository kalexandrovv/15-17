package project17;
import java.util.ArrayList;
import java.util.Arrays;

public class Start {

  
    public static void main(String[] args) {

        // syzdawam avtokyshta
        avtokyshta avtokyshta = new avtokyshta();
        project17.avtokyshta.name = "Avtokyshta Obelq";
        // syzdavam proizwoditeli
        proizwoditel bmw = new proizwoditel();
        bmw.name = "BMW";
        proizwoditel mercedes = new proizwoditel();
        mercedes.name = "Mercedes";
        // syzdawam modeli
        kola kola1 = new kola();
        kola1.proizwoditel = bmw;
        kola1.model = "x5 3.0d";
        kola kola2 = new kola();
        kola2.proizwoditel = mercedes;
        kola2.model = "s65 AMG";
        // slagam kolite w awtokyshtata
        avtokyshta.koli = Arrays.asList(kola1, kola2);
        // pokazwam nalichnite koli w awtokyshtata
        System.out.println("Nalichni v " + avtokyshta.name);
        for (kola nalichnost : avtokyshta.koli) {
            System.out.println(nalichnost.model + " " + nalichnost.proizwoditel.name);

        }
    }

}



