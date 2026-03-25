package org.example;

import org.example.modelos.clienteModelo;
import org.example.modelos.inventarioModelo;
import org.example.modelos.mecanicoModelo;
import org.example.modelos.vehiculoModelo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner prueba = new Scanner(System.in); //esto nos permite ingresar datos por consola
        boolean menu = true; //Se crea una variable de tipo boleana para llamarla en el while.

        //Acá creamos los objetos con los cuales vamos a llamar nuestras clases creadas con anterioridad
        mecanicoModelo mecanico = new mecanicoModelo();
        clienteModelo cliente = new clienteModelo();
        vehiculoModelo vehiculo = new vehiculoModelo();
        inventarioModelo repuesto = new inventarioModelo();

       while(menu) {
           System.out.println("--------------------------------------");
           System.out.println("Ingrese una opcion del siguiente menu");
           System.out.println("1) Datos del Cliente");
           System.out.println("2) Datos del Vehiculo");
           System.out.println("3) Datos del Mecanico");
           System.out.println("4) Datos del Inventario de repuestos");
           System.out.println("5) Salir del sistema");

           int opcion = prueba.nextInt();
           prueba.nextLine();
           System.out.println("-------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del cliente");

                    System.out.println("Nombre: ");
                    String nombreCl = prueba.nextLine();
                    cliente.setNombre(nombreCl);

                    System.out.println("Dirección:");
                    String direccionCl = prueba.nextLine();
                    cliente.setDireccion(direccionCl);

                    System.out.println("DPI:");
                    String dpiCl = prueba.nextLine();
                    cliente.setDpi(dpiCl);

                    System.out.println("NIT:");
                    String nitCl = prueba.nextLine();
                    cliente.setNit(nitCl);

                    System.out.println("-------------Datos del Cliente-------------");
                    System.out.println("Nombre:            " + cliente.getNombre());
                    System.out.println("Dirección:         " + cliente.getDireccion());
                    System.out.println("Dpi:               " + cliente.getDpi());
                    System.out.println("Nit:               " + cliente.getNit());

                    break;
                case 2:
                    System.out.println("Ingrese los datos del vehiculo");

                    System.out.println("Marca:");
                    String marcaVl = prueba.nextLine();
                    vehiculo.setMarca(marcaVl);

                    System.out.println("Modelo:");
                    String modeloVl = prueba.nextLine();
                    vehiculo.setModelo(modeloVl);

                    System.out.println("Linea:");
                    String lineaVl = prueba.nextLine();
                    vehiculo.setLinea(lineaVl);

                    System.out.println("Color:");
                    String colorVl = prueba.nextLine();
                    vehiculo.setColor(colorVl);

                    System.out.println("-------------Datos del Vehiculo-------------");
                    System.out.println("Marca:            " + vehiculo.getMarca());
                    System.out.println("Modelo:           " + vehiculo.getModelo());
                    System.out.println("Linea:            " + vehiculo.getLinea());
                    System.out.println("Color:            " + vehiculo.getColor());

                    break;
                case 3:
                    System.out.println("Ingrese los datos del mecanico");

                    System.out.println("Nombre:");
                    String nombreMc = prueba.nextLine();
                    mecanico.setNombre(nombreMc);

                    System.out.println("Dirección:");
                    String direccionMc = prueba.nextLine();
                    mecanico.setDireccion(direccionMc);

                    System.out.println("DPI:");
                    String dpiMc = prueba.nextLine();
                    mecanico.setDpi(dpiMc);

                    System.out.println("Especialidad:");
                    String especialidadMc = prueba.nextLine();
                    mecanico.setEspecialidad(especialidadMc);

                    System.out.println("-------------Datos del Mecanico-------------");
                    System.out.println("Nombre:            " + mecanico.getNombre());
                    System.out.println("Dirección:         " + mecanico.getDireccion());
                    System.out.println("Dpi:               " + mecanico.getDpi());
                    System.out.println("Especialidad:      " + mecanico.getEspecialidad());

                    break;
                case 4:
                    System.out.println("Ingrese los datos del repuesto");

                    System.out.println("Tipo repuesto:");
                    String tipoRp = prueba.nextLine();
                    repuesto.setTipoProducto(tipoRp);

                    System.out.println("Marca:");
                    String marcaRp = prueba.nextLine();
                    repuesto.setMarca(marcaRp);

                    System.out.println("Costo del Repuesto:");
                    int costoRp = prueba.nextInt();
                    repuesto.setPrecioCosto(costoRp);

                    System.out.println("Precio de venta:");
                    int precioRp = prueba.nextInt();
                    repuesto.setPrecioVenta(precioRp);

                    System.out.println("-------------Datos del Mecanico-------------");
                    System.out.println("Tipo de repuesto:            " + repuesto.getTipoProducto());
                    System.out.println("Marca del repuesto:          " + repuesto.getMarca());
                    System.out.println("Precio costo:                " + repuesto.getPrecioCosto());
                    System.out.println("Precio de venta:             " + repuesto.getPrecioVenta());

                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción no valida, elija otra opción o 5 para salir del sistema");


            }
        }


    }
}
