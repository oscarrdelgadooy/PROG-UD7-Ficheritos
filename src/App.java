import net.salesianos.actividades.actividaduno.ActividadUno;

import java.util.ArrayList;

import net.salesianos.actividades.actividadcuatro.Mesa;
import net.salesianos.actividades.actividadcuatro.MesasMethods;
import net.salesianos.actividades.actividaddos.ActividadDos;
import net.salesianos.actividades.actividadtres.ActividadTres;;

public class App {
    public static void main(String[] args) throws Exception {
        ActividadUno.saveTextInFile();
        ActividadDos.backupTextFromFile();
        ActividadTres.fuseFiles();

        System.out.println("\n"); // Esto es para que se vea bonito el sout, me estaba dando mucho toc como mostraba los objetos.

        ArrayList<Mesa> mesitas = new ArrayList<>();

        Mesa uno = new Mesa("rojo", 40);
        Mesa dos = new Mesa("verde", 30);
        Mesa tres = new Mesa("azul", 20);

        mesitas.add(uno);
        mesitas.add(dos);
        mesitas.add(tres);

        MesasMethods.saveTable(mesitas);
        MesasMethods.showTables();
    }
}
