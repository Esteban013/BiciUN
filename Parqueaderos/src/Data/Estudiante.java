/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

public class Estudiante extends Usuario {
    private String usuarioSia;
    private String tipo;
    private String carrera;

    public Estudiante(String nombre, String contraseña, String estado,String cedula,String usuarioSia, String tipo, String carrera, String pregunta) {
        super.setNombre(nombre);
        super.setContraseña(contraseña);
        super.setPregunta(pregunta);
        super.setEstado(estado);
        super.setCedula(cedula);
        super.setRol("Estudiante");
        this.usuarioSia = usuarioSia;
        this.tipo = tipo;
        this.carrera = carrera;
    }

    public String getUsuarioSia() {
        return usuarioSia;
    }

    public void setUsuarioSia(String usuarioSia) {
        this.usuarioSia = usuarioSia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString(){
        return  super.getNombre() + "\t" + super.getContraseña() + "\t" + super.getEstado() + "\t" +super.getCedula() +"\t" + usuarioSia + "\t" + tipo + "\t" + carrera +"\t" + super.getPregunta()+"\r\n";
    }
    
}
