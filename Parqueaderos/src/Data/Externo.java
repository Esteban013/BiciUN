/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import UI.Menu;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class Externo extends Usuario{
    private int deuda;
    private int hora;
    private int minutos;
    private int segundos;

    public Externo(String nombre, String contraseña, String pregunta, String estado,String cedula, int deuda, int hora,int minutos,int segundos) {
        super.setNombre(nombre);
        super.setContraseña(contraseña);
        super.setPregunta(pregunta);
        super.setEstado(estado);
        super.setCedula(cedula);
        super.setRol("Externo");
        this.deuda = deuda;
        this.hora = hora;
        this.minutos = minutos;
        this.segundos =segundos;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    @Override
    public String toString(){
        return  super.getNombre() + "\t" + super.getContraseña() + "\t" + super.getEstado() + "\t" +super.getCedula() +"\t" + deuda + "\t" + hora + "\t" + minutos + "\t" + segundos + "\t" + super.getPregunta()+"\r\n";
    }
    
    @Override
    public void modificarCupos(ArrayList lista){  
        if(getEstado().equals("Ninguno")){
            Calendar calendario= new GregorianCalendar();
            Date fechaactual = new Date();
            calendario.setTime(fechaactual);
            int hora=calendario.get(Calendar.HOUR_OF_DAY);
            setDeuda((hora-getHora())*500+500);          
            setHora(0);
            setMinutos(0);
            setSegundos(0);
            Menu.actualizarHora(0,0,0);
            for(Object o : lista){
                Externo u=(Externo)o;
                if(u.getNombre().equals(super.getNombre())){
                   u.getHora();
                   u.getMinutos();
                   u.getSegundos();
                }
            }
        }else{
            Calendar calendario= new GregorianCalendar();
            Date fechaactual = new Date();
            calendario.setTime(fechaactual);
            setHora(calendario.get(Calendar.HOUR_OF_DAY));
            setMinutos(calendario.get(Calendar.MINUTE));
            setSegundos(calendario.get(Calendar.SECOND));
            Menu.actualizarHora(hora,minutos,segundos);
            for(Object o : lista){
                Externo u=(Externo)o;
                if(u.getNombre().equals(super.getNombre())){
                   u.getHora();
                   u.getMinutos();
                   u.getSegundos();
                }
            }
        }
    }
}
