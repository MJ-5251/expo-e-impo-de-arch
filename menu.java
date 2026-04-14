import java.util.LinkedList;
import java.util.Scanner;

public class menu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        LinkedList<obj> l = new LinkedList<>();
        metodos m = new metodos();
        while (seguir) {
            System.out.println("bienvenido");
            System.out.println("ingrese la opcion que desea realizar: ");
            System.out.println("1) ingresar estudiante");
            System.out.println("2) consultar estudiante");
            System.out.println("3) modificar estudiante");
            System.out.println("4) eliminar estudiante");
            System.out.println("5) mostrar estudiante");
            System.out.println("6) exportar");
            System.out.println("7) importar");
            System.out.println("8) salir");
            int opt = sc.nextInt();

        switch (opt) {
            case 1:
                m.llenarL(l, sc);

                break;
            case 2:
                System.out.println("pagina en mantenimiento");
                break;
            case 3:
                System.out.println("pagina en mantenimiento");
                break;
            case 4:
                System.out.println("pagina en mantenimiento");
                break;
            case 5:
                m.Mostrar(l);
                break;
            case 6:
                System.out.println("pagina en mantenimiento");
                break;
            case 7:
                System.out.println("pagina en mantenimiento");
                break;
            case 8:
                System.out.println("hasta luego");
                seguir= false;
                break;
        
            default:
                System.out.println("esta opcion no es valida");
                break;
        }
        }
    }
}
