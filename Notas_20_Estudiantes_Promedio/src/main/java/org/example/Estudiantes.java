package org.example;

public class Estudiantes {
    private String nombre;
    private String apellido;
    private int promedio;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, int promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

}
