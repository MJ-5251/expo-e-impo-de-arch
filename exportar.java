import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
public class exportar {

       public void Exportararch (LinkedList<obj> lista ){
        if (lista.isEmpty()) {
            System.out.println("La listaa está vacia, no se puede subir el archivo");
            return;
        }
        else{
            try(FileWriter e = new FileWriter("estudiantes")){
                for (obj obj : lista) {
                    e.write("Nombre " + obj.getNombre() + "\n");
                    e.write("Carnet "+ obj.getCarnet() + "\n");
                    e.write("Cedula " + obj.getCedula() + "\n");
                    e.write("_______________________________________ \n");

                }
                System.out.println("Archivo exportado correctamente");
            
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }
}
}