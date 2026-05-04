import java.util.Scanner;
import java.util.LinkedList;
public class validaciones {
   public int validarEnt(Scanner sc){
    while (!sc.hasNextInt()) {

        System.out.println("Por favor ingrese un digito numerico");
        sc.next();
        
    }
    return sc.nextInt();
   } 

   public int validarR(int n1, int n2, int opt, Scanner sc){
    validaciones v = new validaciones();
    while (opt < n1 || opt > n2) {
        System.out.println("por fvor ingrese un numero en el rango: " + n1 + " " + n2);
        opt = v.validarEnt(sc);
    }
    return opt;

   }

   public boolean validarC( int cedula, LinkedList<obj> l){
    for (obj o : l) {
        if (o.getCedula() == cedula) {
            return true;
        }
    }
    return false;
   }

   
}
