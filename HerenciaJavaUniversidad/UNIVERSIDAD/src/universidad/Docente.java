/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Juan Jose Millan, Aylyn Meza,Cristopher Duarte
 */
public class Docente extends personal{
    protected String profesion, asignatura;

    public Docente(String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activo,String profesion, String asignatura) {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo);
        this.profesion=profesion;
        this.asignatura=asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    
    
    
}
