import java.util.LinkedList;
import java.util.Scanner;

public class menu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        LinkedList<obj> l = new LinkedList<>();
        validaciones v = new validaciones();
        importar i = new importar();
            l = i.importarArch();        
        metodos m = new metodos();
        while (seguir) {
            System.out.println("bienvenido");
            System.out.println("ingrese la opcion que desea realizar: ");
            System.out.println("1) ingresar estudiante");
            System.out.println("2) consultar estudiante");
            System.out.println("3) modificar estudiante");
            System.out.println("4) eliminar estudiante");
            System.out.println("5) mostrar estudiante");
            System.out.println("6) salir");
            int opt = v.validarEnt(sc);
            opt = v.validarR(1, 6, opt, sc);

        switch (opt) {
            case 1:
                m.llenarL(l, sc);

                break;
            case 2:
                System.out.println("Ingrese la cedula del estudiante que desea consultar");
                int cedula = sc.nextInt();
                m.consultarE(opt, l);

                break;
            case 3:
                System.out.println("Ingrese la cedula del estudiante que desea modificar");
                int c = sc.nextInt();
                m.modificarE(opt, l, sc);

                break;
            case 4:
                System.out.println("pagina en mantenimiento");
                break;
            case 5:
                m.Mostrar(l);
                break;
        
            case 6:
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
