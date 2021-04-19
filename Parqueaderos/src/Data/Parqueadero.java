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
public class Parqueadero {
    private String nombre;
    private String id;
    private String cupos;
    private String seguridad;
    private String descripcion;
    private String multa;

    public Parqueadero(String id,String nombre,String cupos,String descripcion, String seguridad) {
        this.nombre = nombre;
        this.id = id;
        this.cupos = cupos;
        this.seguridad = seguridad;
        this.descripcion = descripcion;
        this.multa = "500";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCupos() {
        return cupos;
    }

    public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMulta() {
        return multa;
    }  
    
    
    
    public void disminuirCupos(ArrayList lista){
        int enteroCupo=Integer.parseInt(cupos);
        enteroCupo-=1;
        String cupo=Integer.toString(enteroCupo);
        setCupos(cupo);
        for(Object o : lista){
            Parqueadero u=(Parqueadero)o;
            if(u.getId().equals(id)){
                u.setCupos(cupos);
            }
        }
    }
    
    public void aumentarCupos(ArrayList lista){
        int enteroCupo=Integer.parseInt(cupos);
        enteroCupo+=1;
        String cupo=Integer.toString(enteroCupo);
        setCupos(cupo);
        for(Object o : lista){
            Parqueadero u=(Parqueadero)o;
            if(u.getId().equals(id)){
                u.setCupos(cupos);
            }
        }
    }
    
    @Override
    public String toString(){
        return  id + "\t" + nombre + "\t" + cupos + "\t" + descripcion +"\t" + seguridad+"\r\n";
    }
    
}
