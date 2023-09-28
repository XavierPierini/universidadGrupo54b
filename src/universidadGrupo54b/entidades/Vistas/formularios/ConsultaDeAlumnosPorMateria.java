/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54b.entidades.Vistas.formularios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadGrupo54b.AccesoADatos.AlumnoData;
import universidadGrupo54b.AccesoADatos.InscripcionData;
import universidadGrupo54b.AccesoADatos.MateriaData;
import universidadGrupo54b.entidades.Alumno;
import universidadGrupo54b.entidades.Materia;

/**
 *
 * @author Otras
 */
public class ConsultaDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private MateriaData matData;
    private AlumnoData aluData;

    

    
    /**
     * Creates new form ConsultaDeAlumnosPorMateria
     */
    public ConsultaDeAlumnosPorMateria() {
        initComponents();
        
        
        
        aluData = new AlumnoData();
        List<Alumno> listaA = aluData.listarAlumnos();
        modelo = new DefaultTableModel();
        InscripcionData inscData = new InscripcionData();
        matData = new MateriaData();

         cargarMaterias();
        armarCabecera();

        
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBoxMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlumno = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jRBmostrar = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Alumnos por Materia:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 82, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar una Materia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 26));

        jCBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jCBoxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 227, -1));

        jTAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTAlumno);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 198, 520, 102));

        jBsalir.setBackground(new java.awt.Color(102, 102, 102));
        jBsalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, 30));

        jRBmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jRBmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("mostrar: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 168, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM7.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/55.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 570, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmostrarActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
jRBmostrar.setSelected(true);
obtenerAlumnosPorMateria();


    }//GEN-LAST:event_jRBmostrarActionPerformed

    private void jCBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxMateriaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jCBoxMateriaActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    
    private void cargarMaterias() {
        List<Materia>materia = matData.listarMaterias();
        for(Materia mat:materia){
        jCBoxMateria.addItem(mat);
        }
    }
    

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("idAlumno");
        filaCabecera.add("Dni");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTAlumno.setModel(modelo);

    }

    
     private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void obtenerAlumnosPorMateria(){
     InscripcionData inscData=new InscripcionData();
    //borrarFilasTabla();
    Materia selec = (Materia) jCBoxMateria.getSelectedItem();
    List <Alumno> lista = (ArrayList) inscData.obtenerAlumnosXMateria(selec.getIdMateria());
       
    for(Alumno alumno: lista){
            modelo.addRow(new Object[] { alumno.getIdAlumno(),alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
            System.out.println(alumno.getNombre());
    }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCBoxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBmostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumno;
    // End of variables declaration//GEN-END:variables
}