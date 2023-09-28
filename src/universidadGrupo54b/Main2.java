/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54b;

import java.sql.Connection;
import universidadGrupo54b.AccesoADatos.AlumnoData;
import universidadGrupo54b.AccesoADatos.Conexion;
import universidadGrupo54b.AccesoADatos.InscripcionData;
import universidadGrupo54b.AccesoADatos.MateriaData;
import universidadGrupo54b.entidades.Alumno;
import universidadGrupo54b.entidades.Inscripcion;
import universidadGrupo54b.entidades.Materia;

/**
 *
 * @author Otras
 */
public class Main2 {
    
    public static void main(String[] args) {
        // Connection con = Conexion.getConexion
              /*  AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno andres=aluData.buscarAlumno(2);
                Materia mate=matData.buscarMateria(2);
                Inscripcion inscripto= new Inscripcion(andres, mate, 9);
 
                for(Inscripcion inscriptos: id.obtenerInscripcionPorAlumno(2)){
                    System.out.println("id: "+inscriptos.getIdInscripto());
                    System.out.println("Apellido: "+inscriptos.getAlumno().getApellido());
                     System.out.println("Materia: "+inscriptos.getMateria().getNombre());
                }*/
                
        
        
        
                AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                
                for(Alumno alumno:id.obtenerAlumnosXMateria(22)){
                    System.out.println(alumno);
                }
               
        
}
}