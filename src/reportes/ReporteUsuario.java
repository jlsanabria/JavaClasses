package reportes;

public class ReporteUsuario extends ReporteBase {

    public ReporteUsuario() {
        super("Reporte de Usuarios", "Usuarios de la Academia");
    }

    @Override
    public String listarDatos() {
        return "\n1. Jose Sanabria   ---   Docente Java FullStack" +
                "\n2. Pablo Castro   ----  Estudiante" +
                "\n3. Mateo Merino   ----  Estudiante" +
                "\n4. Gustavo Alejabro  ---  Estudiante";
    }
}
