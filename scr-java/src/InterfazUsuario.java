import java.util.Scanner;

public class InterfazUsuario {
    private final Autenticacion autenticacion;
    private final ManejadorAsistencia manejadorAsistencia;

    public InterfazUsuario(Autenticacion autenticacion, ManejadorAsistencia manejadorAsistencia) {
        this.autenticacion = autenticacion;
        this.manejadorAsistencia = manejadorAsistencia;
    }

    public Usuario iniciarSesion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        Usuario usuario = new Usuario(nombreUsuario, contraseña);

        if (autenticacion.autenticar(usuario)) {
            return usuario;
        } else {
            System.out.println("Error de autenticación. Usuario o contraseña incorrectos.");
            return null;
        }
    }

    public void menuPrincipal(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Asistencia");
            System.out.println("2. Ver Asistencia");
            System.out.println("3. Cerrar Sesión");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarAsistencia(usuario);
                    break;
                case 2:
                    manejadorAsistencia.verAsistencia();
                    break;
                case 3:
                    System.out.println("Cerrando sesión. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    private void registrarAsistencia(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la materia: ");
        String materia = scanner.nextLine();

        System.out.print("Ingrese el paralelo (A o B): ");
        String paralelo = scanner.nextLine().toUpperCase();
    }
}

