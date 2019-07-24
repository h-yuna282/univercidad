/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author CBN
 */
public class catedraticos extends Docente{
    
    private String fechainicio, fechafin;
    
    public catedraticos(String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activo, String profesion, String asignatura, String fechainicio, String fechafin) {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechainicio=fechainicio;
        this.fechafin=fechafin;
        
    }
    public String mostrar(){
        String resultado="";
        resultado = mostrarInfo()+"\t"+asignatura+"\t"+profesion+"\t"+fechainicio+"\t"+fechafin;
        return resultado;
    }
    
}
