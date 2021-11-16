/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.proyecto.beans;

import com.proyecto.beans.Entity.Producto;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Verito
 */
@ManagedBean(name = "gestorp")
@SessionScoped
public class ProductoBean implements Serializable {

    private Producto producto = new Producto();
    private List<Producto> productos;
    /**
     * Creates a new instance of GestorMascotasBean
     */
    public ProductoBean() {
        producto = new Producto("L01", "Leche en polvo","Nestle", 45.5, 24);
        productos = new LinkedList<>();
        productos.add(new Producto("L01", "Leche en polvo","Nestle", 45.5, 24));
    }
    
    public String registrar(){
        
        productos.add(new Producto(producto.getCodigo(),producto.getNombre(),producto.getDistribuidora(),producto.getPrecio(),producto.getCantidad()));        
        return "/ver/ver?faces-redirect=true";
       
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
   public String verProducto(Producto prod){
        producto = prod;
        //System.out.println("Mascota lista!");
        return "/ver/detalles?faces-redirect=true";
    }
    
}
