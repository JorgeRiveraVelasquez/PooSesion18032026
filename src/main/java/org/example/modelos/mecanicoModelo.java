package org.example.modelos;

public class mecanicoModelo {
    private String nombre;
    private String direccion;
    private String telefono;
    private String dpi;
    private String email;
    private String especialidad;
    private int edad;

    public mecanicoModelo(){
        //el objetivo de tener un constructor vacio es para crear ese constructor y despues utilizarlo
        //se pueden crear "n" cantidad de constructores y llamarlos posteriormente.

    }

    public mecanicoModelo(String nombre, String direccion, String telefono, String dpi, String email, String especialidad, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dpi = dpi;
        this.email = email;
        this.especialidad = especialidad;
        this.edad = edad;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
