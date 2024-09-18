import enumerator.EstadoCivil;
import model.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Persona persona1 = new Persona();
        persona1.setCi(6555343);
        persona1.setNombres("Monica");
        persona1.setApellidos("Paredes");
        persona1.setEstadoCivil(EstadoCivil.SOLTERO);

        System.out.println("Persona 1: " + persona1);
        System.out.println(persona1.getEstadoCivil().getValorEstadoCivil());

        System.out.println("Confirmar/Actualizar el estado civil");
        for (EstadoCivil estadoCivil: EstadoCivil.values()) {
            System.out.println(estadoCivil.getValorEstadoCivil() + " (" + estadoCivil.getCodigoEstadoCivil() + ")");
        }
        System.out.print("Establezca el valor del estado civil: ");
        int codigo  = teclado.nextInt();
        teclado.nextLine();
        persona1.setEstadoCivil(EstadoCivil.getEstadoCivil(codigo));
        System.out.println("Persona 1 (actualizada): " + persona1);

    }
}