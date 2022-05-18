package com.formulario1.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String id;
    private String Nombre;
    private String Apellidos;
    private String Password;
    private LocalDate fecha;

    public Usuario() {

    }

    public Usuario(String id, String nombre, String apellidos, String password, LocalDate fecha) {
        this.id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Password = password;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(Nombre, usuario.Nombre) && Objects.equals(Apellidos, usuario.Apellidos) && Objects.equals(Password, usuario.Password) && Objects.equals(fecha, usuario.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Nombre, Apellidos, Password, fecha);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Password='" + Password + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

