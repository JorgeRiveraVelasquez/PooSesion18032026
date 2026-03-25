package org.example.modelos;

public class vehiculoModelo {
    private String marca;
    private String modelo;
    private String linea;
    private String color;
    private String tipo;

    public vehiculoModelo(){}

    public vehiculoModelo(String marca, String modelo, String linea, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
