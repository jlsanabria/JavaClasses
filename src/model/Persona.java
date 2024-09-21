package model;

import enumerator.EstadoCivil;

import java.util.Objects;

public class Persona {
    private Integer ci;
    private String nombres;
    private String apellidos;
    private EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(Integer ci) {
        this.ci = ci;
    }

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(ci, persona.ci) && Objects.equals(nombres, persona.nombres) && Objects.equals(apellidos, persona.apellidos) && estadoCivil == persona.estadoCivil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ci, nombres, apellidos, estadoCivil);
    }
}
