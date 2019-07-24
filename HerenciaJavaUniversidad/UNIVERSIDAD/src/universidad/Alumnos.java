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
public class Alumnos extends personal{
    protected String codigo, facultad, programa;
    protected int semestre;

    public Alumnos(String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activo, String codigo, String facultad, String programa, int semestre) {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo);
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
    }
     public String mostrarInfoAlumnos(){
        String resultado = "";
        String estado = "";
        if(this.activo){
            estado = "activo";
        }else{
            estado = "inactivo";
        }
        resultado =mostrarInfo()+"\t"+codigo+"\t"+facultad+"\t"+programa+"\t"+Integer.toString(semestre);
        return resultado;
    }

    

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

 
    }

    
    

