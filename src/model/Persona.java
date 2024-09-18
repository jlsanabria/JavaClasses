package model;

import enumerator.EstadoCivil;

public class Persona {
    private Integer ci;
    private String nombres;
    private String apellidos;
    private EstadoCivil estadoCivil;

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ci=" + ci +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", codigoEstadoCivil=" + estadoCivil.getCodigoEstadoCivil() +
                '}';
    }
}
