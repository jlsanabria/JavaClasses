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

    }
}
