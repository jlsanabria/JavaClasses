import enumerator.EstadoCivil;
import model.Persona;
import records.Empleado;

public class MainRecord {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Empleado empleado = new Empleado("E-0076", "Bruno", "Sanabria", EstadoCivil.CASADO);
        Empleado empleado2 = new Empleado("E-1111", "Fuentes", EstadoCivil.VIUDO);
        Empleado empleado3 = new Empleado("E-0001", "Ricardo", "Freire", EstadoCivil.SOLTERO);

        System.out.println(empleado.volverMayusculas());
        System.out.println(empleado2.volverMayusculas());
        System.out.println(empleado.apellido());
        System.out.println(empleado2.codEmpleado());
        System.out.println(empleado);
        System.out.println(empleado2);
    }
}
