package abstractas;

public class Cilindro extends FiguraGeometrica {
    private double radio;

    public Cilindro() {
    }

    public Cilindro(int altura, String color, double radio, String name) {
        super(altura, color, name);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio * (radio + getAltura());
    }

    @Override
    public void opacarColor(byte opacity) {
        System.out.println("Cilindro " + getColor() + " opacado en --> " + opacity);
    }

    // Getter & setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Cilindro{" +
                "radio=" + radio +
                "} ";
    }
}
