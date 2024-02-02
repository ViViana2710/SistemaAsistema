// Archivo: ManejadorAsistencia.java
import java.util.HashMap;
import java.util.Map;

public class ManejadorAsistencia {
    private final Map<String, Map<String, Map<String, Asistencia>>> asistenciaMap = new HashMap<>();

    public void registrarAsistencia(Asistencia asistencia) {
        asistenciaMap.computeIfAbsent(asistencia.getMateria(), k -> new HashMap<>())
                .computeIfAbsent(asistencia.getParalelo(), k -> new HashMap<>())
                .put(asistencia.getHora(), asistencia);
    }

    public void verAsistencia() {
        // Implementación para ver la asistencia
        System.out.println("Implementación para ver la asistencia");
    }
}
