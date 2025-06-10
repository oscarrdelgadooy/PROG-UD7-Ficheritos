package net.salesianos.actividades.actividadtres;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ActividadTres {
    public static void fuseFiles() {
        readFirstFile();
        readSecondFile();
    }

    public static void readFirstFile() {
        try {

            File file = new File("hola.txt");

            FileWriter writer = new FileWriter("fusedFiles.txt");
            InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file),
                    StandardCharsets.UTF_8);

            writer.write("- Contenido del fichero Uno: ");

            int currentCharInt = inputStream.read();

            while (currentCharInt != -1) {
                char character = (char) currentCharInt;
                writer.write(character);
                writer.flush();
                currentCharInt = inputStream.read();
            }
            writer.close();
            inputStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("El fichero no se encontró.");
        } catch (IOException ioe) {
            System.out.println("Error leyendo el fichero.");
        }
    }

    public static void readSecondFile() {
        try {

            File file = new File("backup.txt");

            FileWriter writer = new FileWriter("fusedFiles.txt", true);
            InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file),
                    StandardCharsets.UTF_8);

            writer.write("\n- Contenido del fichero Dos: ");

            int currentCharInt = inputStream.read();

            while (currentCharInt != -1) {
                char character = (char) currentCharInt;
                writer.write(character);
                writer.flush();
                currentCharInt = inputStream.read();
            }
            writer.close();
            inputStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("El fichero no se encontró.");
        } catch (IOException ioe) {
            System.out.println("Error leyendo el fichero.");
        }
    }
}