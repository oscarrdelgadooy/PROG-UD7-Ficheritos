package net.salesianos.actividades.actividaduno;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ActividadUno {
    public static void saveTextInFile() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame una longitud de caracteres(30)");
            String text = sc.nextLine();

            while (text.length() < 30) {
                System.out.println("Te faltaron " + (30 - text.length()) + " caracteres.");
                System.out.println("Dame una longitud de caracteres(30)");
                text = sc.nextLine();
            }
            text = text.toUpperCase().replace(" ", "_");

            FileWriter wr = new FileWriter("./hola.txt", StandardCharsets.UTF_8);

            wr.write(text);
            wr.flush();

            wr.close();
            sc.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("Ruta no encontrada");
        }
    }
}
