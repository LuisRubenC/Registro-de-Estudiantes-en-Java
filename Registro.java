import java.util.Scanner;

class Estudiantes{
    String nombre;
    int edad;
    String matricula;
    String carrera;
}

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Estudiantes[] estudiantes = new Estudiantes[100];
    int numEstudiantes=0;
    int op=0;

    do{
        System.out.println("---------- BIENVENIDO ----------");
        System.out.println("--- REGISTRO DE ESTUDIANTES ---");
        System.out.println("1.- Registrar estudiante");
        System.out.println("2.- Mostrar estudiantes");
        System.out.println("3.- Buscar estudiantes por matricula");
        System.out.println("4.- Eliminar estudiante");
        System.out.println("5.- Salir");
        System.out.println("Elija la opcion que guste...");
        op= scanner.nextInt();

        switch(op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Gracias por utilizar el programa...");
                break;
            default:
                System.out.println("Esa opcion no es valida...");
                break;
        }

    }while(op != 5);

    }

}
