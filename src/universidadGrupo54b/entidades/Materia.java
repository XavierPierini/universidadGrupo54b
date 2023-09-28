/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54b.entidades;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Materia {

    public static List<Materia> listarMaterias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int anioMateria, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
        
    }

    public Materia(int idMateria, String nombre, int anioMateria) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
    }

    
    public Materia(String nombre, int anioMateria) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
    }

    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        //return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioMateria=" + anioMateria + ", estado=" + estado + '}';
        return nombre+", "+anioMateria;
    }

 
   
    
   }
