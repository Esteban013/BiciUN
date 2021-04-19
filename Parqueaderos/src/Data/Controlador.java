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
public class Controlador extends Usuario{
    private String acumulodeuda;

    public String getAcumulodeuda() {
        return acumulodeuda;
    }

    public void setAcumulodeuda(String acumulodeuda) {
        this.acumulodeuda = acumulodeuda;
    }

    public Controlador(String nombre, String contraseña, String pregunta, String estado,String cedula,String acumulodeuda) {
        super.setNombre(nombre);
        super.setContraseña(contraseña);
        super.setPregunta(pregunta);
        super.setEstado(estado);
        super.setCedula(cedula);
        super.setRol("Controlador");
        this.acumulodeuda=acumulodeuda;
    }
   
    @Override
    public String toString(){
        return  super.getNombre() + "\t" + super.getContraseña() + "\t" + super.getEstado() + "\t" + super.getCedula() + "\t" + super.getPregunta()+ "\t" +acumulodeuda+"\r\n";
    }
    
    public void acumularDeuda(int deuda){
        int suma=Integer.parseInt(acumulodeuda);
        setAcumulodeuda(Integer.toString(suma+=deuda));
    }
}
