package Modelos;

import java.util.Objects;

public class Pais {


    private String Nombre ;

    public Pais(String nombre) {
        Nombre = nombre;
    }

    public Pais() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(Nombre, pais.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}



