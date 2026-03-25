package org.example.modelos;

public class clienteModelo {
 private String codigo;
 private String nombre;
 private String direccion;
 private String dpi;
 private String nit;

 public clienteModelo(){}

    public clienteModelo(String codigo, String nombre, String direccion, String dpi, String nit) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dpi = dpi;
        this.nit = nit;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
