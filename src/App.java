import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        backupTextFromFile();
    }

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
