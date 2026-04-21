import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class importar {
    public LinkedList<obj> importarArch (){
        String rutaArch = "Estudiante.txt";
        LinkedList<obj> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArch))){
            String linea;
            obj o = null;
        while ((linea = br.readLine()) != null) {
            if (linea.startsWith("Nombre: ")) {
                if (o != null) {
                    lista.add(o);
                }
                o = new obj();
                o.setNombre(linea.substring(0));
            }
            else if (linea.startsWith("Carnet: ")) {
                if (o != null) {
                    lista.add(o);
                    
                }
                o.setCarnet(linea.substring(0));
            }
            else if (linea.startsWith("Cedula: ")) {
                if (o != null) {
                    lista.add(o);
                    
                }
                o.setCedula(Integer.parseInt(rutaArch));
                
            }
            else if (linea.startsWith("Catnet: ")) {
                if (o != null) {
                    lista.add(o);
                    
                }
                
            }
            
            
        }
            
        } catch (Exception e) {
            // TODO: handle exception
        }    
    
    }
}
