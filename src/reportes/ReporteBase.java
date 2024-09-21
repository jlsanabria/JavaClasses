package reportes;

public abstract class ReporteBase {
    private String titulo;
    private String descripcion;
    private String logo;

    public ReporteBase(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logo = "FoodUp";
    }

    public void construirReporte() {
        System.out.println("================================================");
        System.out.println("===            " + this.logo +"            ===");
        System.out.println("================================================");
        System.out.println("===            " + getTitulo() +"            ===");
        System.out.println("===            " + getDescripcion() +"        ===");
        System.out.println("================================================");
        System.out.println(listarDatos());
        System.out.println("================================================");
    }

    public abstract String listarDatos();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
