package enumerator;

public enum EstadoCivil {
    SOLTERO(15, "Soltero"),
    CASADO(20, "Casado"),
    VIUDO(25, "Viudo");

    private int codigoEstadoCivil;
    private String valorEstadoCivil;

    EstadoCivil(int codigoEstadoCivil, String valorEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
        this.valorEstadoCivil = valorEstadoCivil;
    }

    public int getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public String getValorEstadoCivil() {
        return valorEstadoCivil;
    }

    public static EstadoCivil getEstadoCivil(int codigoEstadoCivil) {
        for (EstadoCivil estadoCivil : EstadoCivil.values()) {
            if (estadoCivil.getCodigoEstadoCivil() == codigoEstadoCivil) {
                return estadoCivil;
            }
        }
        return EstadoCivil.SOLTERO;
    }
}
