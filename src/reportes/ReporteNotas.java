package reportes;

public class ReporteNotas extends ReporteBase {
    public ReporteNotas() {
        super("Reporte Notas", "Notas de los estudiantes");
    }

    @Override
    public String listarDatos() {
        return "Curso:  Java Fundamentos Mod.2 " +
                "1. Pablo Castro   --->   90"  +
                "2. Juanito Perez   --->   86";
    }
}
