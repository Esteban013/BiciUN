/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Flujos {
    
    public static void Guardar(ArrayList lista, String base){
    FileWriter escribir = null;
        try {
            escribir = new FileWriter(base+".txt");
            for(Object c : lista){
                escribir.write(c.toString());
            }
            escribir.close();
            System.out.println(lista);
        }catch(Exception exception){
        }
    }
    
    public static void Eliminar(ArrayList lista,String key, String base){
    FileWriter escribir = null;
        try {
            escribir = new FileWriter(base+".txt");
            for(Object c : lista){
                Usuario u=(Usuario)c;
                if(u.getNombre()!=key){
                    escribir.write(c.toString());
                }else{
                    JFrame parentFrame = new JFrame();
                    JOptionPane.showMessageDialog(parentFrame, "Se ha borrado el contacto");
                }
            }
            escribir.close();
        }catch(Exception exception){
        }
    }
      
    public static void Cargar(ArrayList lista, String base){
    try {
        File archivo = new File(base+".txt");
        FileReader fread = new FileReader(archivo);
        BufferedReader read = new BufferedReader(fread);
        String line = null;
        switch(base){
            case "Estudiante": 
                while((line=read.readLine())!= null){
                    StringTokenizer token = new StringTokenizer(line,"\t");
                    String Nombre = token.nextToken().trim();
                    String Contraseña = token.nextToken().trim();
                    String Estado = token.nextToken().trim();
                    String Cedula = token.nextToken().trim();
                    String Usuariosia=token.nextToken().trim();
                    String Tipo=token.nextToken().trim();
                    String Carrera=token.nextToken().trim();
                    String Pregunta = token.nextToken().trim();
                    Estudiante person = new Estudiante(Nombre,Contraseña,Estado,Cedula,Usuariosia,Tipo,Carrera,Pregunta);
                    lista.add(person);
                }
                read.close();
                break;
            case "Profesor": 
                while((line=read.readLine())!= null){
                    StringTokenizer token = new StringTokenizer(line,"\t");
                    String Nombre = token.nextToken().trim();
                    String Contraseña = token.nextToken().trim();                    
                    String Estado = token.nextToken().trim();
                    String Cedula = token.nextToken().trim();
                    String Facultad=token.nextToken().trim();
                    String Usuariosia=token.nextToken().trim();
                    String Pregunta = token.nextToken().trim();
                    Profesor person = new Profesor(Nombre,Contraseña,Pregunta,Estado,Cedula,Facultad,Usuariosia);
                    lista.add(person);
                }
                read.close();
                break;
            case "Externo": 
                while((line=read.readLine())!= null){
                    StringTokenizer token = new StringTokenizer(line,"\t");
                    String Nombre = token.nextToken().trim();
                    String Contraseña = token.nextToken().trim();
                    String Estado = token.nextToken().trim();
                    String Cedula=token.nextToken().trim();
                    String deuda=token.nextToken().trim();
                    int Deuda=Integer.parseInt(deuda);
                    String hora=token.nextToken().trim();
                    int Hora=Integer.parseInt(hora);      
                    String minutos=token.nextToken().trim();
                    int Minutos=Integer.parseInt(minutos);  
                    String segundos=token.nextToken().trim();
                    int Segundos=Integer.parseInt(segundos);  
                    String Pregunta = token.nextToken().trim();
                    Externo person = new Externo(Nombre,Contraseña,Pregunta,Estado,Cedula,Deuda,Hora,Minutos,Segundos);
                    lista.add(person);
                }
                read.close();
                break;
            case "Controlador": 
                while((line=read.readLine())!= null){
                    StringTokenizer token = new StringTokenizer(line,"\t");
                    String Nombre = token.nextToken().trim();
                    String Contraseña = token.nextToken().trim();
                    String Estado = token.nextToken().trim();
                    String Cedula = token.nextToken().trim();                                       
                    String Pregunta = token.nextToken().trim();
                    String Acumulo=token.nextToken().trim(); 
                    Controlador person = new Controlador(Nombre,Contraseña,Pregunta,Estado,Cedula,Acumulo);
                    lista.add(person);
                }
                read.close();
                break;
            case "Parqueadero": 
                while((line=read.readLine())!= null){
                    StringTokenizer token = new StringTokenizer(line,"\t");
                    String ID = token.nextToken().trim();
                    String Nombre = token.nextToken().trim();
                    String Cupos = token.nextToken().trim();
                    String Descripcion = token.nextToken().trim();
                    String Seguridad = token.nextToken().trim();
                    Parqueadero person = new Parqueadero(ID,Nombre,Cupos,Descripcion,Seguridad);
                    lista.add(person);
                }
                read.close();
                break;
        }
    }catch(Exception exception){
    }
    }
}
