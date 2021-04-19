/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author user
 */
public class Profesor extends Usuario {
    private String facultad;
    private String usuarioSia;

    public Profesor(String nombre, String contraseña, String pregunta, String estado,String cedula,String facultad, String usuarioSia) {
        super.setNombre(nombre);
        super.setContraseña(contraseña);
        super.setPregunta(pregunta);
        super.setEstado(estado);
        super.setCedula(cedula);
        super.setRol("Profesor");
        this.facultad = facultad;
        this.usuarioSia = usuarioSia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getUsuarioSia() {
        return usuarioSia;
    }

    public void setUsuarioSia(String usuarioSia) {
        this.usuarioSia = usuarioSia;
    }
    
    @Override
    public String toString(){
        return  super.getNombre() + "\t" + super.getContraseña() + "\t" + super.getEstado() + "\t" + super.getCedula() +"\t" + facultad + "\t" + usuarioSia + "\t" + super.getPregunta()+"\r\n";
    }
    
}
