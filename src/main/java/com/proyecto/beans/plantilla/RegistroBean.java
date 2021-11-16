/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.proyecto.beans.plantilla;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Verito
 */
@ManagedBean(name = "registro")
@SessionScoped
public class RegistroBean implements Serializable {

    /**
     * Creates a new instance of RegistroBean
     */
    public RegistroBean() {
    }
    public String index(){
        return "/registro/registro?faces-redirect=true";
    }
}
