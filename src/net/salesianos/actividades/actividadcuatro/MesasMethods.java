package net.salesianos.actividades.actividadcuatro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MesasMethods {
    public static void saveTable(ArrayList<Mesa> mesitas) {
        try {
            File file = new File("mesitas.txt");
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);

            objectOutput.writeObject(mesitas);

            objectOutput.close();
        } catch (InvalidClassException ice) {
            System.out.println("No se encontró la clase.");
            ice.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("No se encontró la ruta.");
            npe.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo.");
        } catch (NotSerializableException nse) {
            nse.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void showTables() {
        try {
            File file = new File("mesitas.txt");

            FileInputStream inputStream = new FileInputStream(file);

            ObjectInputStream objectInput = new ObjectInputStream(inputStream);

            ArrayList<Mesa> mesasLeidas = (ArrayList<Mesa>) objectInput.readObject();

            for (Mesa mesa : mesasLeidas) {
                System.out.println(mesa);
            }
            
            objectInput.close();
        } catch (InvalidClassException ice) {
            System.out.println("No se encontró la clase.");
            ice.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("No se encontró la ruta.");
            npe.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo.");
        } catch (NotSerializableException nse) {
            nse.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            System.out.println("Clase no encontrada");
            cnfe.printStackTrace();
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}