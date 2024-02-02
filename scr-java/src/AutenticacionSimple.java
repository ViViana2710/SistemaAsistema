
import java.util.HashMap;
import java.util.Map;

public class AutenticacionSimple extends Autenticacion {
    private final Map<String, Usuario> usuarios = new HashMap<>();

    public AutenticacionSimple() {
        usuarios.put("estudiante1", new Estudiante("estudiante1", "contraseña1"));
        usuarios.put("profesor1", new Profesor("profesor1", "contraseña2"));
    }

    @Override
    public boolean autenticar(Usuario usuario) {
        return usuarios.containsKey(usuario.getNombreUsuario()) &&
                usuarios.get(usuario.getNombreUsuario()).getContraseña().equals(usuario.getContraseña());
    }
}
