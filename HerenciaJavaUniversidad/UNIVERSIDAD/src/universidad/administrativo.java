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
public class administrativo extends personal{
    protected String cargo, fechaCont;

    public administrativo(String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activo, String cargo, String fechaCont) {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo);
        this.cargo = cargo;
        this.fechaCont = fechaCont;
    }
    
    public String mostrar(){
        String resultado =" ";
        resultado=mostrarInfo()+"\t"+cargo+"\t"+fechaCont;
        return resultado;    }
    
public void setCargo(String cargo){
this.cargo=cargo;
}}
