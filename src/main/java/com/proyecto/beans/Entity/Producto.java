/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.beans.Entity;

/**
 *
 * @author Verito
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String distribuidora;
    private Double precio;
    private int cantidad;
    
    public Producto(){
        codigo = "L01";
        nombre = "Leche en polvo";
        distribuidora = "Nestle";
        precio = 45.5;
        cantidad = 24;
    }

    public Producto(String codigo, String nombre, String distribuidora, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.distribuidora = distribuidora;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
