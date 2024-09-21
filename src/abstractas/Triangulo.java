package abstractas;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(int base, int altura, String color, String name) {
        super(base, altura, color, name);
    }

    @Override
    public double calcularArea() {
        return (double) (getBase() * getAltura()) / 2;
    }

    @Override
    public void opacarColor(byte opacity) {
        System.out.println("Opacando el color " + getColor() + " en " + opacity + "%");
    }
}
