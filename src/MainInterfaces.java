import interfaces.Operaciones;
import interfaces.OperacionesImpl;
import interfaces.OpercionesDosImpl;

public class MainInterfaces {
    public static void main(String[] args) {
        Operaciones operaciones = new OperacionesImpl();
        Operaciones operaciones2 = new OpercionesDosImpl();
        System.out.println("Suma 1 --> " + operaciones.suma(5,6));
        System.out.println("Suma 2 --> " + operaciones2.suma(5,6));

        System.out.println("Factorial de 5 --> " + operaciones.factorial(5));
        System.out.println("Factorial de 4 --> " + operaciones2.factorial(5));

        /**
         * Ejercicio de interfaces  (3 puntos)
         * Declarar tres métodos en la interface Operaciones y posteriormente implementar los mismos
         * Mostrar su uso en la clase principal
         * (8 minutos)
         */

        /**
         * Práctica (7 puntos)
         * Implementar una interface para aplicar funciones sobre textos con al menos 5 métodos declarados
         * String -->  split()
         * Realizar la clase de implementación de la interface
         * Clase principal para mostrar la funcionalidad de los métodos declarados e implementados
         */

    }
}
