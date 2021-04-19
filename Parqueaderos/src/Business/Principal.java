/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Data.*;
import UI.Inicio;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Principal {
    
    public static ArrayList<Parqueadero> BDParqueadero=new ArrayList<>();;
    public static ArrayList<Estudiante> BDEstudiante=new ArrayList<>();
    public static ArrayList<Profesor> BDProfesor=new ArrayList<>();;
    public static ArrayList<Externo> BDExterno=new ArrayList<>();;
    public static ArrayList<Controlador> BDControlador=new ArrayList<>();
    public static String base;
    
    
    
    public static void Actualizar(ArrayList lista,String base){
        lista.clear();
        Flujos.Cargar(lista,base);
    }
    public static void guardarB(Object person, String base){
        switch(base){
            case "Estudiante": 
                Estudiante es=(Estudiante)person;
                BDEstudiante.add(es);
                Flujos.Guardar(BDEstudiante, base);
                Actualizar(BDControlador,base);
                break;
            case "Profesor": 
                Profesor p =(Profesor)person;
                BDProfesor.add(p);
                Flujos.Guardar(BDProfesor, base);
                Actualizar(BDProfesor,base);
                break;
            case "Externo": 
                Externo ex=(Externo)person;
                BDExterno.add(ex);
                Flujos.Guardar(BDExterno, base);
                Actualizar(BDExterno,base);
                break;
            case "Controlador":
                Controlador c=(Controlador)person;
                BDControlador.add(c); 
                Flujos.Guardar(BDControlador, base);
                Actualizar(BDControlador,base);
                break;
        }
    }
    
    public static void eliminarB(Object person, String base){
        switch(base){
            case "Estudiante": 
                Estudiante es=(Estudiante)person;
                Flujos.Eliminar(BDEstudiante,es.getNombre(),base);
                Actualizar(BDControlador,base);
                break;
            case "Profesor": 
                Profesor p =(Profesor)person;
                Flujos.Eliminar(BDProfesor,p.getNombre(),base);
                Actualizar(BDProfesor,base);
                break;
            case "Externo": 
                Externo ex=(Externo)person;
                Flujos.Eliminar(BDExterno,ex.getNombre(),base);
                Actualizar(BDExterno,base);
                break;
            case "Controlador":
                Controlador c=(Controlador)person;
                Flujos.Eliminar(BDControlador,c.getNombre(),base);
                Actualizar(BDControlador,base);
                break;
        }
    }
    
    public static void editarB(String base){
        switch(base){
            case "Estudiante": 
                Inicio.usuarioActual.modificarCupos(BDEstudiante);
                Flujos.Guardar(BDEstudiante, base);
                Actualizar(BDControlador,base);
                break;
            case "Profesor": 
                Inicio.usuarioActual.modificarCupos(BDProfesor);
                Flujos.Guardar(BDProfesor, base);
                Actualizar(BDProfesor,base);
                break;
            case "Externo": 
                Inicio.usuarioActual.modificarCupos(BDExterno);
                Flujos.Guardar(BDExterno, base);
                Actualizar(BDExterno,base);
                break;
            case "Controlador":
                Inicio.usuarioActual.modificarCupos(BDProfesor);
                Flujos.Guardar(BDControlador, base);
                Actualizar(BDControlador,base);
                break;
            case "Parqueadero":
                Flujos.Guardar(BDParqueadero,"Parqueadero");
                Actualizar(BDParqueadero,"Parqueadero");
                break;                
        }        
    }
    
    
    public static Usuario validarUsuario(ArrayList lista,String bus){
        Usuario usuario=null;
        for(Object e: lista){
            Usuario u =(Usuario)e;
            if(u.getNombre().equals(bus)){
                usuario=u;                
            }
        }
        return usuario;
    }
    
    public static String recordarContraseña(Usuario usuario, String pregunta){
        String controlador=null;
        if(usuario.getPregunta().equals(pregunta)){
            JFrame parentFrame = new JFrame();
            JOptionPane.showMessageDialog(parentFrame, "Su contraseña es: "+usuario.getContraseña());
            controlador=usuario.getContraseña();
            Inicio menuInicio = new Inicio();
            menuInicio.setVisible(true);  
        }else{
            JFrame parentFrame = new JFrame();
            JOptionPane.showMessageDialog(parentFrame, "Respuesta incorrecta");
        }
        return controlador;
    }
                
    public static void buscarParqueadero(String id){
        for(Parqueadero p : BDParqueadero){
            if(p.getId().equals(id)){               
                Inicio.parqueaderoActual=new Parqueadero(p.getId(),p.getNombre(),p.getCupos(),p.getDescripcion(),p.getSeguridad());                 
            }
        }
    }        
                  
    public static void cargaDatos(){
        Flujos.Cargar(BDParqueadero, "Parqueadero");
        Flujos.Cargar(BDEstudiante, "Estudiante");
        Flujos.Cargar(BDProfesor, "Profesor");
        Flujos.Cargar(BDExterno, "Externo");
        Flujos.Cargar(BDControlador, "Controlador");
    }    
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio menuInicio = new Inicio();
        menuInicio.setVisible(true);       
        
    }
    
}
