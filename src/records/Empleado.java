package records;

import enumerator.EstadoCivil;
import model.Persona;

/**
 * Patrón DTO (Data Transfer Object)
 * Permite manejar REGISTROS con la estructura proporcionada por los atributos dados.
 * @param codEmpleado
 * @param nombre
 * @param apellido
 */
public record Empleado(String codEmpleado, String nombre, String apellido, EstadoCivil estadoCivil) {
    public Empleado {
        if(codEmpleado.equals("E-0001")) {
            System.out.println("Valores por defecto, no es recomendable!");
        } else {
            System.out.println("Validación OK");
        }
        //volverMayusculas();
    }

    public Empleado(String codEmpleado, String apellido, EstadoCivil estadoCivil) {
        this(codEmpleado, "", apellido.toUpperCase(), estadoCivil);
    }

    public String volverMayusculas() {
        return apellido.toUpperCase();
    }
}
