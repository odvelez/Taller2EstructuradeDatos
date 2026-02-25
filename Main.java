import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n====== SISTEMA DE USUARIOS ======");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Buscar usuario");
            System.out.println("3. Modificar usuario");
            System.out.println("4. Borrar usuario");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {

                System.out.print("Ingrese ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese correo: ");
                String correo = sc.nextLine();

                Usuario nuevo = new Usuario(id, nombre, correo);
                System.out.println("Usuario agregado correctamente.");

            } else if (opcion == 2) {

                System.out.print("Ingrese ID a buscar: ");
                int idBuscar = sc.nextInt();
                sc.nextLine();

                Leerusuario.leer(idBuscar);

            } else if (opcion == 3) {

                Actualizarusuario.actualizar();

            } else if (opcion == 4) {

                Eliminarusuario.eliminar();

            } else if (opcion == 5) {

                System.out.println("Programa finalizado.");

            } else {

                System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }
}