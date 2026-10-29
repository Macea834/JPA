package com.crud.jpa.dto;

public class PersonaDto {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String mombre) {
        this.nombre = mombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String nombre;
    private String direccion;
    private String telefono;
}
