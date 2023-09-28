/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54b;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import universidadGrupo54b.entidades.Alumno;
import universidadGrupo54b.entidades.Inscripcion;
import universidadGrupo54b.entidades.Materia;
import universidadGrupo54b.AccesoADatos.AlumnoData;
import universidadGrupo54b.AccesoADatos.Conexion;
import universidadGrupo54b.AccesoADatos.InscripcionData;
import universidadGrupo54b.AccesoADatos.MateriaData;



/**
 *
 * @author Usuario
 */
public class universidadGrupo54b {



    public static void main(String[] args) {

        //MenuPrincipal mp = new MenuPrincipal();
        //mp.setVisible(true);
        
        //   Connection con = Conexion.getConexion();
//METODO GUARDAR ALUMNO (SIN ID TERCER CONSTRUCTOR
//DNI, APELLIDO, NOMBRE, FECHA NACIMIENTO, ESTADO)
        
     /*Alumno Ricardo = new Alumno(32222, "Ricardo", "Ford", LocalDate.of(1970, 04, 12), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(Ricardo);*/
    
// EL METODO FUNCIONA GUARDA AL ALUMNO (RICARDO FORD ID 37)
//************************************************************************************************************       
//METODO MODIFICAR ALUMNO

     /*Alumno Ricardo = new Alumno(37,32222, "Ricardo Alexis", "Ford", LocalDate.of(1970, 04, 12), true);
        AlumnoData alu = new AlumnoData();
        alu.modificarAlumno(Ricardo);*/
     
 //ALUMNO MODIFICADO EXITOSAMENTE SE LE ADICIONO "Ricardo Alexis"       
 //************************************************************************************************************       
  
 //METODO ELIMINAR ALUMNO
         
     /*Alumno Ricardo = new Alumno(37,32222, "Ricardo Alexis", "Ford", LocalDate.of(1970, 04, 12), true);
        AlumnoData alu = new AlumnoData();     
        alu.eliminarAlumno(37);*/
     
 //ELIMINA EXITOSAMENTE ALUMNO ID(37) 
 //***********************************************************************************************************************************
         
//METODO BUSCAR ALUMNO POR ID 

//          AlumnoData alu=new AlumnoData();
//       Alumno alumnoEncontrado=alu.buscarAlumno(2);
//      ////if(alumnoEncontrado!=null){//para que no muestre el nullpointerexception
//        System.out.println("dni: "+alumnoEncontrado.getDni());
//        System.out.println("apellido: "+alumnoEncontrado.getApellido());
  
//RESULTADO ENCUENTRA AL ALUMNO CON  DNI :222, APELLIDO: CARRERA 
//************************************************************************************************************************++  

//BUSCAR ALUMNO POR DNI
          /*AlumnoData alu=new AlumnoData();
       Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(333);
         if(alumnoEncontrado!=null){//para que no muestre el nullpointerexception
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());*/
        
//BUSQUEDA EXITOSA ENCUENTRA AL ALUMNO CON DNI:333 APELLIDO RODRIGUEZ.

//********************************************************************************************************************************+++

//MUESTRA LA LISTA DE ALUMNOS ACTIVOS
          /*AlumnoData alu = new AlumnoData();
          for (Alumno alumno : alu.listarAlumnos()) {
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNacimiento());
        }*/
          
// RESULTADO EXITOSO MUESTRA LOA ALUMNOS ACTIVOS run 111,Muños,Federico,2001-05-31; 222, Carrera, Andres, 2003-09-23;
//333,Rodriguez, juan, 2000-06-05; 12345, Dimarco, Belen, 1996-01-06; 212121, Lopez, juan, 2000-08-29; 424241, Arjona, Ricardo, 1964-01-19;
//171700, Sosa, Pedro, 1964-01-19; 151514,  Solaris, Gabriela Analia, 1976-11-02 BUILD SUCCESSFUL (total time: 6 seconds)
         
//*************************************************************************************************************************************************

//PROCEDIMIENTO PARA GUARDAR MATERIAS (SIN ID 
//SE USA EL TERCER CONSTRUCTOR NOMBRE,AÑO,ESTADO)

        /*Materia frances1=new Materia("frances 1", 1, true);
        MateriaData matData=new MateriaData();
        matData.guardarMateria(frances1);*/ 
//RESULTADO METODO FUNCIONA GUARDA  LA MATERIA        
////******************************************************************************************************* 
//PROCEDIMIENTO MODIFICAR MATERIA
            
        /*Materia frances1=new Materia(10, "Frances Técnico I",1 );
        MateriaData matData=new MateriaData();
        matData.modificarMateria(frances1);*/

//RESULTADO SE MODIFICO LA MATERIA (IDMATERIA 10, NOMBRE "frances tecnico1", AÑO 1)
//*********************************************************************************************************        
  
//METODO ELIMINAR MATERIA

       /* Materia frances1=new Materia(10, "Frances Técnico I",1 );
        MateriaData matData=new MateriaData();
        matData.eleminarMateria(10); */

//RESULTADO SE ELIMINO EXITOSAMENTE (BORRADO LOGICO)LA MATERIA CON IDMATERIA(10)
//**************************************************************************************************************++
// METODO BUSCAR MATERIA POR ID

      /* MateriaData matData = new MateriaData();
       Materia materiaEncontrada=matData.buscarMateria(2);
        if(materiaEncontrada!=null){//para que no muestre el nullpointerexception
        System.out.println("nombre: "+materiaEncontrada.getNombre());
        System.out.println("año: "+materiaEncontrada.getAnioMateria());*/
        
//RESULTADO EXITOSO BUSCO LA MATERIA NOMBRE: MATEMATICAS 1, AÑO:1
//*********************************************************************************************************************************
//METODO LISTAR MATERIA

                /*MateriaData matData = new MateriaData();
                for(Materia materia:matData.listarMaterias()){
                System.out.println(materia.getIdMateria());
                System.out.println(materia.getNombre());
                System.out.println(materia.getAnioMateria());

            }*/

// EL METODO FUNCIONA RESULTADO DE LA BUSQUEDA run: 1, lengua y literatura, 1; 2, matematicas 1, 1;
// 3, lengua 2, 2; 4, Matematica 2, 2; 5, Carpinteria 3, 3; 6, Laboratorio 4, 4; 7, Laboratorio 2,  2; 8, Ingles Tecnico 2, 2;      
 //**************************************************************************************************************************************   
  
 //METODO GUARDAR INSCRIPCION
 
               /* AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno federico=aluData.buscarAlumno(1);
                Materia mate=matData.buscarMateria(2);
                Inscripcion insc= new Inscripcion(federico, mate, 6);
                id.guardarInscripcion(insc);*/
                
//RESULTADO EXITOSO: INSCRIPCION REGISTRADA.
//****************************************************************************************************************************************
  
//METODO ACTUALIZAR NOTA
                /*AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno andres=aluData.buscarAlumno(2);
                Materia mate=matData.buscarMateria(2);
                Inscripcion inscripto= new Inscripcion(andres, mate, 9);
                id.actualizarNota(2, 2, 8);*/

//RESULTADO EXITOSO SE ACTUALIZO LA NOTA (PASO DE UN 9 A UN 8, EN EL ALUMNO ANDRES ID 2, MATERIA ID 2)                
 //****************************************************************************************************************************************               
//METODO BORRAR INSCRIPCION
                 /*AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno andres=aluData.buscarAlumno(2);
                Materia mate=matData.buscarMateria(2);
                Inscripcion inscripto= new Inscripcion(andres, mate, 9);
                id.borrarInscripcionMateriaAlumno(7, 2);*/
                
 //RESULTADO EXITOSO SE LOGRO BORRAR [CON UN BORRADO FISICO] (AL ALUMNO CON ID 7, EN LA MATERIA ID 2)    
 //**************************************************************************************************************************************************
//METODO OBTENER INSCRIPCIONES

                /*AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno andres=aluData.buscarAlumno(2);
                Materia mate=matData.buscarMateria(2);
                Inscripcion inscripto= new Inscripcion(andres, mate, 9);
 
                for(Inscripcion inscriptos: id.obtenerInscripciones()){
                    System.out.println("id: "+inscriptos.getIdInscripto());
                    System.out.println("Apellido: "+inscriptos.getAlumno().getApellido());
                     System.out.println("Materia: "+inscriptos.getMateria().getNombre());
                }*/
                
 //RESULTADO EXITOSO MUESTRA A LOS ALUMNOS EXISTENTES run: id: 9, Apellido: Solaris, Materia: Laboratorio 4; id: 10, Apellido: Arjona, Materia: Carpinteria 3,
 //d: 14, Apellido: Dimarco, Materia: Laboratorio 4; id: 17, Apellido: Arjona, Materia: lengua 2; id: 18, Apellido: Arjona, Materia: lengua y literatura
//id: 19, Apellido: Arjona, Materia: Matematica 2; id: 23, Apellido: Carrera, Materia: matematicas 1; BUILD SUCCESSFUL (total time: 3 seconds)               

//*****************************************************************************************************************************************                
//OBTENER INSCRIPCIONES POR ALUMNO(int ID ALUMNO)

              /* AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno Andres=aluData.buscarAlumno(2);
                Materia matematicas1 =matData.buscarMateria(2);
                Inscripcion insc= new Inscripcion(Andres, matematicas1, 2);
                id.obtenerInscripcionPorAlumno(2);
                    System.out.println("idAlumno: "+insc.getAlumno().getIdAlumno());
                    System.out.println("Apellido: "+insc.getAlumno().getApellido());
                    System.out.println("Nombre: "+insc.getAlumno().getNombre());
                    System.out.println("idMateria: "+insc.getMateria().getIdMateria());
                    System.out.println("Materia: "+insc.getMateria().getNombre()); */
               
   //RESULTADO EXITOSO run: idAlumno: 2, Apellido: Carrera, Nombre: Andres, idMateria: 2, Materia: matematicas 1, BUILD SUCCESSFUL (total time: 3 seconds)

//SEGUNDA PRUEBA

               /* AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno ricardo=aluData.buscarAlumno(7);
                Materia lengua2=matData.buscarMateria(3);
                Inscripcion insc= new Inscripcion(ricardo, lengua2, 17);
                id.obtenerInscripcionPorAlumno(9);
                    System.out.println("idAlumno: "+insc.getAlumno().getIdAlumno());
                    System.out.println("Apellido: "+insc.getAlumno().getApellido());
                    System.out.println("Nombre: "+insc.getAlumno().getNombre());
                    System.out.println("idMateria: "+insc.getMateria().getIdMateria());
                    System.out.println("Materia: "+insc.getMateria().getNombre());*/
                     
// //RESULTADO  EXITOSO run: idAlumno: 7, Apellido: Arjona, Nombre: Ricardo, idMateria: 3, Materia: lengua 2, BUILD SUCCESSFUL (total time: 3 seconds)
                    
//********************************************************************************************************************************** 
//METODO OBTENER MATERIAS CURSADAS    
               /* AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                Alumno ricardo=aluData.buscarAlumno(7);
                Materia lengua2=matData.buscarMateria(3);
                Inscripcion insc= new Inscripcion(ricardo, lengua2, 7);
               
                 for(Materia materia: id.obtenerMateriasCursadas(7)){
 
                    System.out.println("id: "+materia.getIdMateria());
                    System.out.println("Nombre: "+materia.getNombre());
                 }*/     
                 
               //  RESULTADO EXITOSO CONSULTA REALIZADA 7:      run: id: 1,Nombre: lengua y literatura, id: 3,Nombre: lengua 2;
               //id: 4, Nombre: Matematica 2; id: 5, Nombre: Carpinteria 3; id: 9, Nombre: Emprendedorismo BUILD SUCCESSFUL (total time: 3 seconds)           
 
               
        //CONSULTA REALIZADA EN LA BASE DE DATOS SQL  CON EL ALUMNO ID 7 
//MATERIAS QUE SE ENCUENTRA CURSANDO EL ALUMNO 7
//RESULTADO DE LA BUSQUEDA idMateria         	nombre	                      año Ascendente 1	
//                                                         1              lengua y literatura                     1
//                                                         4                   Matematica 2                        2
//                                                         3                       lengua 2                             2
//                                                         5                    Carpinteria 3                         3
//                                                         9                Emprendedorismo                    3

//MATERIAS QUE NO SE ENCUENTRA CURSANDO
    //resultado busqueda sql idMateria Ascendente 1	nombre	    año	
//                                                             1                               lengua y literatura   1 
//                                                             3                               lengua 2                    2 
//                                                             4                               Matematica 2            2 
//                                                             5                               Carpinteria 3             3
//****************************************************************************************************************************+
//*************************************************************************************************************************************
//METODO OBTENER MATERIA NO CURSADAS

                        /*AlumnoData aluData = new AlumnoData();
                            MateriaData matData = new MateriaData();
                            InscripcionData id = new InscripcionData();
                            Alumno ricardo=aluData.buscarAlumno(7);
                           Materia lengua2=matData.buscarMateria(3);
                           Inscripcion insc=new Inscripcion(ricardo, lengua2, 9);
                
                          for(Materia materia:id.obtenerMateriasNOCursadas(22)){
                              System.out.println("nombre: "+materia.getNombre());
                          }*/

//RESULTADO EXITOSO: run: nombre: lengua y literatura; nombre: matematicas 1; nombre: lengua 2; nombre: Matematica 2;
//nombre: Carpinteria 3; nombre: Laboratorio 2; nombre: Ingles Tecnico 2; nombre: Frances Técnico I BUILD SUCCESSFUL (total time: 3 seconds)
   
                
//FORMA EN LA QUE SE CONSTRUYE LA SENTENCIA SQL
//String sql = "SELECT * "
//                + "FROM materia "
//                + "WHERE idMateria "
//                + "NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        


//RESULTADO DE LA CONSULTA EN LA BASE DE DATOS (CON EL IDAlumno 22) esta inscripto en (id 6 laboratorio 4) e (id 9 Emprendedorismo)
//LISTADO DE MATERIA QUE NO CURSA EL ALUMNO (ID 22)
//Textos completos idMateria     	nombre	año	estado	
//	              1                lengua y literatura    1                   1
//                	              2                  matematicas 1         1                   1
//	              3                            lengua 2         2                   1
//	              4                   Matematica 2          2                   1
//                                5                     Carpinteria 3         3                   1
//                                7                     Laboratorio 2        2                   1
//	               8                  Ingles Tecnico 2      2                   1

//MATERIAS QUE SE ENCUENTRA CURSANDO EL ALUMNO (ID 22)
//  idMateria           nombre	año	
//          6             Laboratorio 4              4
//          9         Emprendedorismo           3

//********************************************************************************************************************************************
//METODO OBTENER ALUMNOSXMATERIA

                        /*    AlumnoData aluData=new AlumnoData();
                            MateriaData matData=new MateriaData();
                             InscripcionData id=new InscripcionData();

                           Alumno ricardo=aluData.buscarAlumno(7);
                           Materia lengua2=matData.buscarMateria(3);
                           Inscripcion insc=new Inscripcion(ricardo, lengua2, 9);
                
                 for (Alumno alumno : id.obtenerAlumnosXMateria(6)){
    System.out.println("ID Alumno: " + alumno.getIdAlumno());
    System.out.println("DNI: " + alumno.getDni());
    System.out.println("Apellido: " + alumno.getApellido());
    System.out.println("Nombre: " + alumno.getNombre());
    System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento());
    System.out.println("Estado: " + (alumno.isEstado()));
    System.out.println("--------");
}*/
                 
// RESULTADO EXITOSO CONSULTA REALIZADA CON LA MATERIA ID 6:  run: ID Alumno: 22, DNI: 151514, Apellido: Solaris, Nombre: Gabriela Analia, Fecha de Nacimiento: 1976-11-02, Estado: true--------
//ID Alumno: 4, DNI: 12345, Apellido: Dimarco, Nombre: Belen, Fecha de Nacimiento: 1996-01-06, Estado: true -------- BUILD SUCCESSFUL (total time: 4 seconds)
                 

 //METODO OBTENER ALUMNOS POR MATERIA

//COMO SE CONSTRUYE LA CONSULTA SQL
//SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado
//FROM inscripcion i, alumno a 
//WHERE i.idAlumno = a.idAlumno 
//AND idMateria = 6
//AND a.estado = 1; 


//RESULTADO DE LA BASE DE DATOS (sobre la consulta del idMateria 6)
//Textos completos   idAlumno	dni	nombre	apellido	fechaNacimiento	estado	
//                     	22              151514     Gabriela Analia   Solaris            1976-11-02                        1
//                   	4                12345                Belen          Dimarco          1996-01-06                        1

//alumnos que no estan cursando la materia id 6
//Textos completos idAlumno Ascendente 	dni	nombre	apellido	fechaNacimiento	estado	
//	                                                    2         222              Andres         Carrera             2003-09-23                       1
//	                                                    2         222              Andres         Carrera             2003-09-23                       1
//                                                                      4        12345           Belen           Dimarco           1996-01-06                       1
//                                                                      4        12345           Belen           Dimarco           1996-01-06                       1
//                                                                      7        424241         Ricardo        Arjona              1964-01-19                       1
//                                                                      7        424241         Ricardo        Arjona              1964-01-19                       1
//                                                                      7        424241         Ricardo        Arjona              1964-01-19                       1
//                                                                      7        424241         Ricardo        Arjona              1964-01-19                       1
//                                                                      7        424241         Ricardo        Arjona              1964-01-19                       1	
//                                                                     22       151514   Gabriela Analia  Solaris             1976-11-02                       1
//	                                                    22       151514  Gabriela Analia   Solaris             1976-11-02                       1

 //********************************************************************************************************************              


    
}
}