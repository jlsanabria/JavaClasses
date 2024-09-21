import reportes.ReporteNotas;
import reportes.ReporteUsuario;

public class MainReportes {
    public static void main(String[] args) {
        ReporteUsuario reporteUsuario = new ReporteUsuario();
        reporteUsuario.listarDatos();
        reporteUsuario.construirReporte();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        ReporteNotas reporteNotas = new ReporteNotas();
        reporteNotas.listarDatos();
        reporteNotas.construirReporte();
    }
}
