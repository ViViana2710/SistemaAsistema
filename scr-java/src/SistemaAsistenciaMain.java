public class SistemaAsistenciaMain {
    public static void main(String[] args) {
        Autenticacion autenticacion = new AutenticacionSimple();
        ManejadorAsistencia manejadorAsistencia = new ManejadorAsistencia();
        InterfazUsuario interfazUsuario = new InterfazUsuario(autenticacion, manejadorAsistencia);

        Usuario usuario = interfazUsuario.iniciarSesion();
        if (usuario != null) {
            interfazUsuario.menuPrincipal(usuario);
        }
    }
}
