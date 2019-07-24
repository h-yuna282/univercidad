
package universidad;

/**
 *
 * @author Juan Jose Millan, Aylyn Meza,Cristopher Duarte
 */
public class personal {
    protected String tipoDocumento, documento, Apellidos, nombres;
    protected int edad;
    protected boolean activo;
    
    public personal(String tipoDocumento,String documento,String Apellidos,String nombres,int edad,boolean activo){
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.Apellidos = Apellidos;
        this.nombres = nombres;
        this.edad = edad;
        this.activo = activo;
    }
    public String mostrarInfo(){
        String resultado = "";
        String estado = "";
        if(this.activo){
            estado = "activo";
        }else{
            estado = "inactivo";
        }
        resultado = tipoDocumento+"\t"+documento+"\t"+nombres+"\t"+Apellidos+"\t"+Integer.toString(edad)+"\t"+estado;
        return resultado;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
}

    

