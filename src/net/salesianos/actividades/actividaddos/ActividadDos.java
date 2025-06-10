package net.salesianos.actividades.actividaddos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ActividadDos {
        public static void backupTextFromFile() {
        try {
            File file = new File("backup.txt");

            InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file),
                    StandardCharsets.UTF_8);

            int currentCharInt = inputStream.read();
            while (currentCharInt != -1) {
                char text = (char) currentCharInt;
                System.out.print(text + "_" + currentCharInt + ", ");


                currentCharInt = inputStream.read();
            }
            inputStream.close();
        } catch (NullPointerException npe) {
            System.out.println("No existe la ruta.");
        } catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado.");
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
