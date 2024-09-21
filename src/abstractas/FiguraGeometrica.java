package abstractas;

public abstract class FiguraGeometrica {
    private int base;
    private int altura;
    private String color;
    private String nombre;

    // Constructor
    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int altura, String color, String nombre) {
        this.altura = altura;
        this.color = color;
        System.out.println("El nombre de la figura geométrica es " + nombre);
    }

    public FiguraGeometrica(int base, int altura, String color, String nombre) {
        this.base = base;
        this.altura = altura;
        this.color = color;
        System.out.println("El nombre de la figura geométrica es " + nombre);
    }

    // Método abstracto
    public abstract double calcularArea();

    public abstract void opacarColor(byte opacity); // opacity --> 20%

    // Getter and setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeométrica{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
