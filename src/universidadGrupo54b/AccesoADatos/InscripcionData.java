package universidadGrupo54b.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadGrupo54b.entidades.Alumno;
import universidadGrupo54b.entidades.Inscripcion;
import universidadGrupo54b.entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    //se importa de la clase entidadades la clase Inscripcion
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripto(rs.getInt(1));
                //insc.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {

                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion. ");

        }

    }
    
    //List ES EL SUPER TIPO PUEDO RETORNAR UN ARRAYLIST DESDE UNA LIST

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Inscripcion inscripto = new Inscripcion();
                inscripto.setIdInscripto(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                inscripto.setAlumno(alu);
                inscripto.setMateria(mat);
                inscripto.setNota(rs.getDouble("nota"));
                cursadas.add(inscripto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }

    public List<Inscripcion> obtenerInscripcionPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripto(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idAlumno"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia "
                + "WHERE inscripcion.idMateria = materia.idMateria "
                + "AND inscripcion.idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();

//    String sql="SELECT * "
//            + "FROM materia "
//            + "WHERE estado = 1 "
//            + "AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)"; 
//     
        String sql = "SELECT * "
                + "FROM materia "
                + "WHERE idMateria "
                + "NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();

        String sql = "SELECT a.idAlumno, dni, apellido, nombre, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a "//se unen las 2 tablas de inscripcion y alumno
                + "WHERE i.idAlumno = a.idAlumno "//clave foranea clave primaria
                + "AND idMateria = ? "//clave de la materia por parametro
                + "AND a.estado = 1 ";   //el estado de la materia debe ser true     

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return alumnosMateria;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public List<Inscripcion> unirMateriaYNota(Alumno alumno) {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();

        String sql = "SELECT inscripcion.idMateria, materia.nombre, inscripcion.nota from inscripcion "
                + "JOIN materia "
                + "ON materia.idMateria = inscripcion.idMateria "
                + "WHERE inscripcion.idAlumno = ? ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idMateria1=rs.getInt("idMateria");
                MateriaData matData= new MateriaData();
                Materia mat =  matData.buscarMateria(idMateria1);
               double not= rs.getDouble("nota");
               Inscripcion insc = new Inscripcion(alumno, mat, not);
               cursadas.add(insc);
                     
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }

    public Iterable<Materia> unirMateriaYNota(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//
//SELECT inscripcion.idMateria, materia.nombre, inscripcion.nota: Esto especifica las columnas que deseas seleccionar 
//en el resultado de la consulta. Estás seleccionando la columna idMateria de la tabla inscripcion, la columna nombre de
//la tabla materia, y la columna nota de la tabla inscripcion.
//
//FROM inscripcion: Esto indica la tabla principal desde la cual se seleccionarán los datos, que es inscripcion.
//
//JOIN materia: Esto agrega una tabla adicional llamada materia a la consulta. El JOIN se basa en la igualdad entre 
//inscripcion.idMateria y materia.idMateria, lo que significa que estás combinando filas de ambas tablas donde los valores
//de idMateria coinciden.
//
//ON materia.idMateria = inscripcion.idMateria: Esto especifica la condición de unión. Estás uniendo las filas de las 
//tablas inscripcion y materia donde los valores de idMateria coinciden.
//
//WHERE inscripcion.idAlumno = ?: Esto agrega una cláusula WHERE que filtra los resultados para un estudiante 
//específico. El signo de interrogación (?) es un marcador de posición que generalmente se utilizaría en una consulta 
//parametrizada. El valor real del estudiante se proporcionaría cuando se ejecute la consulta.
//
//En resumen, esta consulta SQL selecciona información sobre las inscripciones de un estudiante en diversas materias, 
//incluyendo el nombre de la materia y la nota asociada. El resultado será una lista de materias en las que el estudiante está
//inscrito y la nota que obtuvo en cada una de ellas.








//"SELECT a.idAlumno, dni, apellido, nombre, fechaNacimiento, estado "
//                + "FROM inscripcion i, alumno a "
//                + "WHERE i.idAlumno = a.idAlumno "
//                + "AND idMateria = ?"
//                + "AND a.estado = true"
//La línea de código que has proporcionado en Java se utiliza para preparar una sentencia SQL parametrizada utilizando un objeto de tipo PreparedStatement. El uso de PreparedStatement es una práctica recomendada cuando trabajas con bases de datos en Java, ya que proporciona ventajas importantes en términos de seguridad y rendimiento en comparación con las sentencias SQL estáticas.
//Aquí hay una explicación de lo que hace esta línea de código:
//
//PreparedStatement es una interfaz en Java que pertenece al paquete java.sql. Permite crear consultas SQL parametrizadas, lo que significa que puedes escribir consultas SQL con marcadores de posición para los valores que serán proporcionados más tarde. Esto ayuda a prevenir la inyección de SQL y mejora la reutilización de la consulta.
//La línea de código que has proporcionado en Java se utiliza para preparar una sentencia SQL parametrizada utilizando un objeto de tipo PreparedStatement. El uso de PreparedStatement es una práctica recomendada cuando trabajas con bases de datos en Java, ya que proporciona ventajas importantes en términos de seguridad y rendimiento en comparación con las sentencias SQL estáticas.
//
//Aquí hay una explicación de lo que hace esta línea de código:
//
//PreparedStatement es una interfaz en Java que pertenece al paquete java.sql. Permite crear consultas SQL parametrizadas, lo que significa que puedes escribir consultas SQL con marcadores de posición para los valores que serán proporcionados más tarde. Esto ayuda a prevenir la inyección de SQL y mejora la reutilización de la consulta.
//
//con.prepareStatement(sql) crea un objeto PreparedStatement a partir de una conexión a la base de datos (con) y una cadena SQL (sql) que contiene la consulta SQL parametrizada que deseas ejecutar.
//El objeto PreparedStatement generado se puede utilizar para asignar valores a los marcadores de posición en la consulta SQL y luego ejecutar la consulta. Esto se hace para evitar problemas de seguridad, como la inyección SQL, ya que los valores se asignan de manera segura y automáticamente se escapan para prevenir ataques maliciosos.
//
//En resumen, PreparedStatement se utiliza para ejecutar consultas SQL de manera segura y eficiente en Java al permitir la parametrización de las consultas y evitar la inyección SQL.
