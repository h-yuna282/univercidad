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
public class planta extends Docente{
    protected String fechaContrato;
    protected int cantproyectos;

    public planta(String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activo, String profesion, String asignatura,String fechaContrato,int cantproyectos) {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechaContrato=fechaContrato;
        this.cantproyectos=cantproyectos;
    }

    
    public String mostrar(){
        String resultado="";
        resultado = mostrarInfo()+"\t"+asignatura+"\t"+profesion+"\t"+fechaContrato+"\t"+cantproyectos;
        return resultado;
    }

    public void setCantproyectos(int cantproyectos) {
        this.cantproyectos = cantproyectos;
    }
    
}
    
    

