import abstractas.Cilindro;
import abstractas.FiguraGeometrica;
import abstractas.Triangulo;

public class MainAbstract {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 7, "Rojo", "Mi nombre es Triángulo Saltarín");
        System.out.println("Triangulo: " + triangulo);
        System.out.println("Área: " + triangulo.calcularArea());

        Cilindro cilindro = new Cilindro(12, "Verde", 5, "Mi nombre es parecido a un vaso");
        System.out.println("Cilindro: " + cilindro);
        System.out.println("Area: " + cilindro.calcularArea());

        FiguraGeometrica figuraGeometrica = new Triangulo(7, 6 , "g", "hhhh");
    }
}
