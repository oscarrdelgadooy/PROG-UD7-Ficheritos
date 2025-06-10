import net.salesianos.actividades.actividaduno.ActividadUno;
import net.salesianos.actividades.actividaddos.ActividadDos;
import net.salesianos.actividades.actividadtres.ActividadTres;;
public class App {
    public static void main(String[] args) throws Exception {
        ActividadUno.saveTextInFile();
        ActividadDos.backupTextFromFile();
        ActividadTres.fuseFiles();
    }
}
