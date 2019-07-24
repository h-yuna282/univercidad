/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Jose Millan, Aylyn Meza,Cristopher Duarte
 */
public class UNIVERSIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ArrayList <Alumnos> listaalumnos = new ArrayList();
        Alumnos alumno1;
       int a,b;
       boolean F =true;
           do{
       System.out.println("(1) Ingresar alumno"+"\n"+"(2) Eliminar alumno"+"\n"+"(3) Editar alumno"); 
       a=leer.nextInt();
        switch(a){
            case 1:
                
                 String tipoDocumento,documento,Apellidos,nombres,codigo,facultad,programa;
        int p,edad,semestre;
        boolean activo;
        boolean desicion=true;
        while(desicion){
        System.out.println("Ingrese el tipo de documento");
        tipoDocumento=leer.next();
            System.out.println("Documento");
       documento=leer.next();
            System.out.println("apellidos");
            Apellidos=leer.next();
            System.out.println("nombres");
            nombres=leer.next();
            System.out.println("edad");
            edad=leer.nextInt();
           System.out.println("activo");
        activo=leer.nextBoolean();
            System.out.println("codigo");
         codigo=leer.next();
         System.out.println("facultad");
        facultad=leer.next();
         System.out.println("programa");
        programa=leer.next();
         System.out.println("semestre");
        semestre=leer.nextInt();
            System.out.println("Desea cambiar/ingresar a alguien (1 si) (2 no)");
            p=leer.nextInt();
            if(p==2){
                desicion = false;
            }
             alumno1= new Alumnos(tipoDocumento,documento,Apellidos,nombres,edad,activo,codigo,facultad,programa,semestre);
            listaalumnos.add(alumno1);
            

            
        }
                break;
            case 2:
                for(int x=0;x<listaalumnos.size();x++){
                    System.out.println(listaalumnos.get(x).mostrarInfoAlumnos());    
                }
                
                break;
        }
        
        }while(F!=false);
     
                
                
    }
    
  }
