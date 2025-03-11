import java.util.Scanner;
import java.util.Random;

class Estudiantes{
    String nombre;
    int edad;
    int matricula;
    String carrera;
}

public class Registro {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estudiantes[] estudiantes = new Estudiantes[100];
        int numEstudiantes = 0;
        int op = 0;
        int flag = 0;

        do {
            System.out.println("---------- BIENVENIDO ----------");
            System.out.println("--- REGISTRO DE ESTUDIANTES ---");
            System.out.println("1.- Registrar estudiante");
            System.out.println("2.- Mostrar estudiantes");
            System.out.println("3.- Buscar estudiantes por matricula");
            System.out.println("4.- Eliminar estudiante");
            System.out.println("5.- Salir");
            System.out.println("Elija la opcion que guste...");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    flag = RegistrarEstudiante(scanner, numEstudiantes, estudiantes);
                    if (flag == 0)
                        numEstudiantes++;
                    break;
                case 2:
                    break;
                case 3:
                    BuscarEstudiantePorMatricula(scanner, estudiantes, numEstudiantes);
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

        } while (op != 5);

        scanner.close();
    }

    public static int RegistrarEstudiante(Scanner scanner, int numEstudiantes, Estudiantes[] estudiantes) {
        Random random = new Random();
        int numeroAleatorio = 1000 + random.nextInt(9000); // Genera entre 1000 y 9999

        if (numEstudiantes >= 99) {
            System.out.println("No es posible agregar un estudiante mas, borre alguno y vuelva a intentar...");
            return 1;
        }

        Estudiantes nuevoEstudiante = new Estudiantes();
        System.out.println("Ingrese el nombre del estudiante: ");
        nuevoEstudiante.nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        nuevoEstudiante.edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la carrera del estudiante: ");
        nuevoEstudiante.carrera = scanner.nextLine();
        nuevoEstudiante.matricula = 20250000 + numeroAleatorio;
        estudiantes[numEstudiantes] = nuevoEstudiante;
        System.out.println("Estudiante registrado correctamente... ");
        System.out.println("Matricula asignada: " + nuevoEstudiante.matricula);

        return 0;
    }

    public static void BuscarEstudiantePorMatricula(Scanner scanner, Estudiantes[] estudiantes, int numEstudiantes) {
        System.out.println("Ingrese la matricula del estudiante que desea buscar: ");
        int matriculaBuscada = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].matricula == matriculaBuscada) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Edad: " + estudiantes[i].edad);
                System.out.println("Carrera: " + estudiantes[i].carrera);
                System.out.println("Matricula: " + estudiantes[i].matricula);
                return;
            }
        }
        System.out.println("No se encontró un estudiante con esa matrícula.");
    }
}
