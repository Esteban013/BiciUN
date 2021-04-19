/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.Principal;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private String pregunta;
    private String cedula;
    private String estado;
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void modificarCupos(ArrayList lista){
        for(Object o : lista){
            Usuario u=(Usuario)o;
            if(u.getNombre().equals(nombre)){
               u.setNombre(nombre);
               u.setEstado(estado);
               u.setCedula(cedula);
               u.setContraseña(contraseña);
               u.setPregunta(pregunta);
            }
        }
    }
    
}
