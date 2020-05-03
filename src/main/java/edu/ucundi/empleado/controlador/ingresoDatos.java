/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.empleado.controlador;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Eduard Fierro
 */
@Named(value = "ingresoDatos")
@RequestScoped
public class ingresoDatos {
    private String cedula;
    private String nombre;
}
