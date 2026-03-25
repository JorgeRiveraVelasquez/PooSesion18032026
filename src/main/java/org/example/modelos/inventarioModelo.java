package org.example.modelos;

public class inventarioModelo {
    private String tipoProducto;
    private String marca;
    private int precioCosto;
    private int precioVenta;

    public inventarioModelo(){}

    public inventarioModelo(String tipoProducto, String marca, int precioCosto, int precioVenta) {
        this.tipoProducto = tipoProducto;
        this.marca = marca;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
}
