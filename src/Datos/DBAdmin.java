package Datos;

import Propiedades.Propiedad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DBAdmin {
    
    /* METODO PARA CREAR CONEXIÓN CON MYSQL */
    public static Connection conexion() throws ClassNotFoundException, SQLException {
        Properties prop = Propiedad.getProp();
        String url = "jdbc:mysql://" + prop.getProperty("dbHost") + ":" + prop.getProperty("dbPort") + "/" + prop.getProperty("dbName");
        String driver = "com.mysql.jdbc.Driver";
        String user = prop.getProperty("dbUser");
        String pass = prop.getProperty("dbPass");
        Class.forName(driver);
        Connection cn = DriverManager.getConnection(url, user, pass);
        return cn; //devuelve la conexion
    }
    
    /* METODO PARA VERIFICAR EL ACCESO DEL USUARIO ADMINISTRADOR */
    public static boolean verificarAcceso(String usuario, String pass) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM acceso WHERE usuario = '"+usuario+"' and contrasenia = '"+pass+"'";
        Connection cn = conexion();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs.first(); //si en el primer reg. hay una fila, entonces el usuario y su pass existen
    }
    
    /* METODO QUE DEVUELVE EL NUMERO CORRELATIVO DE LOS REGISTROS EN LA TABLA DADA POR PARAMETRO */
    public static int obtenerCorrelativo(String tabla) throws ParseException, ClassNotFoundException, SQLException {
        String sql = "SELECT codigo FROM "+tabla;
        int correlativo;
        int contador = 0;
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee codigo por codigo de la tabla
                correlativo = Integer.parseInt(rs.getString(1).substring(1, 8)); 
                if (correlativo >= contador){
                    contador = correlativo;
                }
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + ex.getMessage());
        }
        return contador; //retorna el contador con el numero de correlativo
    }
    
    /* METODO PARA OBTENER EL ID DEL EDITORIAL DADO EL NOMBRE */
    public static int obtenerIDEditorial(String nombre) throws ClassNotFoundException{
        String sql = "SELECT * FROM editorial";
        int id = -1;
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee codigo por codigo de la tabla
                if(rs.getString(2).equals(nombre)){
                    id = rs.getInt(1);
                }
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + ex.getMessage());
        }
        return id; //retorna el contador con el numero de correlativo
    }
    
    /* METODO PARA OBTENER EL ID DE LA PRODUCTORA DADO EL NOMBRE */
    public static int obtenerIDProductora(String nombre) throws ClassNotFoundException{
        String sql = "SELECT * FROM productora";
        int id = -1;
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee codigo por codigo de la tabla
                if(rs.getString(2).equals(nombre)){
                    id = rs.getInt(1);
                }
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + ex.getMessage());
        }
        return id; //retorna el contador con el numero de correlativo
    }
    
    /* METODO PARA AGREGAR EDITORIAL DADO UN NOMBRE */
    public static void guardarEditorial(String nombre){
        Connection cn;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert = "INSERT INTO editorial (nombre) VALUES(?)";
            PreparedStatement ps = cn.prepareStatement(queryInsert);
            ps.setString(1, nombre);
            ps.executeUpdate(); //ejecuta la inserción a la tabla editorial
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO PARA AGREGAR EDITORIAL DADO UN NOMBRE */
    public static void guardarProductora(String nombre){
        Connection cn;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert = "INSERT INTO productora (nombre) VALUES(?)";
            PreparedStatement ps = cn.prepareStatement(queryInsert);
            ps.setString(1, nombre);
            ps.executeUpdate(); //ejecuta la inserción a la tabla editorial
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO PARA INSERTAR LOS DATOS DE UN LIBRO */
    public static void insertarLibro(Libro lb) throws ParseException, ClassNotFoundException, SQLException {
        Connection cn;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert = "INSERT INTO libro (codigo, titulo, autor, editorial, ISBN, "+
                                 "anioEdicion, numEdicion, pais, idioma, materia, paginas, "+
                                 "ubicacion, descripcion, tipo, estado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(queryInsert);
            ps.setString(1, lb.getCodigo());
            ps.setString(2, lb.getTitulo());
            ps.setString(3, lb.getAutor());
            ps.setInt(4, lb.getEditorial());
            ps.setString(5, lb.getISBN());
            ps.setString(6, lb.getAnioEdicion());
            ps.setInt(7, lb.getNumEdicion());
            ps.setInt(8, lb.getPais());
            ps.setInt(9, lb.getIdioma());
            ps.setString(10, lb.getMateria());
            ps.setInt(11, lb.getPaginas());
            ps.setString(12, lb.getUbicacion());
            ps.setString(13, lb.getDescripcion());
            ps.setString(14, lb.getTipo());
            ps.setString(15, lb.getEstado());
            ps.executeUpdate(); //ejecuta la inserción a la tabla participante
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO PARA INSERTAR LOS DATOS DE UN LIBRO */
    public static void insertarVideo(Video vd) throws ParseException, ClassNotFoundException, SQLException {
        Connection cn;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert = "INSERT INTO video (codigo, titulo, director, productora, tipo, "+
                                 "anio, duracion, pais, idioma, subtitulo, clasificacion, "+
                                 "genero, ubicacion, sinopsis) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(queryInsert);
            ps.setString(1, vd.getCodigo());
            ps.setString(2, vd.getTitulo());
            ps.setString(3, vd.getDirector());
            ps.setInt(4, vd.getProductora());
            ps.setString(5, vd.getTipo());
            ps.setString(6, vd.getAnio());
            ps.setInt(7, vd.getDuracion());
            ps.setInt(8, vd.getPais());
            ps.setInt(9, vd.getIdioma());
            ps.setString(10, vd.getSubtitulo());
            ps.setInt(11, vd.getClasificacion());
            ps.setString(12, vd.getGenero());
            ps.setString(13, vd.getUbicacion());
            ps.setString(14, vd.getSinopsis());
            ps.executeUpdate(); //ejecuta la inserción a la tabla participante
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA LIBRO*/
    public static TableModel obtenerRegistrosLibro(DefaultTableModel modelo){
        String[] datos = new String [4];
        String sql = "SELECT * FROM libro";
        Connection cn;
        try{
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(12); //ubicacion
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA LIBRO*/
    public static TableModel obtenerRegistrosLibro1(DefaultTableModel modelo){
        String[] datos = new String [4];
        String sql = "SELECT * FROM libro";
        Connection cn;
        try{
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(15); //estado
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA LIBRO*/
    public static TableModel obtenerRegistrosLibro2(DefaultTableModel modelo){
        String[] datos = new String [15];
        String sql = "select l.codigo, l.titulo, l.autor, e.nombre as editorial, l.ubicacion, "+
                "l.anioEdicion, l.numEdicion, p.nombre as pais, i.nombre as idioma, l.ISBN, "+
                "l.materia, l.paginas, l.tipo, l.estado, l.descripcion from libro l " +
                "inner join editorial e on e.codigo = l.editorial "+
                "inner join pais p on p.codigo = l.pais "+
                "inner join idioma i on i.codigo = l.idioma "+
                "order by l.codigo asc";
        Connection cn;
        try{
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(4); //editorial
                datos[4] = rs.getString(5); //ubicacion
                datos[5] = rs.getString(6); //anio Edicion
                datos[6] = rs.getString(7); //num Edicion
                datos[7] = rs.getString(8); //pais
                datos[8] = rs.getString(9); //idioma
                datos[9] = rs.getString(10); //ISBN
                datos[10] = rs.getString(11); //materia
                datos[11] = rs.getString(12); //paginas
                datos[12] = rs.getString(13); //tipo
                datos[13] = rs.getString(14); //estado
                datos[14] = rs.getString(15); //descripcion
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosLibro(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [4];
        String sql = null;
        switch(criterio){
            case 0: //por titulo
                    sql = "SELECT * FROM libro WHERE titulo like '%"+frase+"%'";
                    break;
            case 1: //por autor
                    sql = "SELECT * FROM libro WHERE autor like '%"+frase+"%'";
                    break;
            case 2: //por materia
                    sql = "SELECT * FROM libro WHERE materia like '%"+frase+"%'";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(12); //ubicacion
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosLibro1(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [4];
        String sql = null;
        switch(criterio){
            case 0: //por titulo
                    sql = "SELECT * FROM libro WHERE titulo like '%"+frase+"%'";
                    break;
            case 1: //por autor
                    sql = "SELECT * FROM libro WHERE autor like '%"+frase+"%'";
                    break;
            case 2: //por materia
                    sql = "SELECT * FROM libro WHERE materia like '%"+frase+"%'";
                    break;
            case 3: //codigo
                    sql = "SELECT * FROM libro WHERE codigo like '%"+frase+"%'";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(15); //estado
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosLibro2(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [15];
        String sql = null;
        switch(criterio){
            case 0: //por titulo
                    sql = "select l.codigo, l.titulo, l.autor, e.nombre as editorial, l.ubicacion, "+
                        "l.anioEdicion, l.numEdicion, p.nombre as pais, i.nombre as idioma, l.ISBN, "+
                        "l.materia, l.paginas, l.tipo, l.estado, l.descripcion from libro l " +
                        "inner join editorial e on e.codigo = l.editorial "+
                        "inner join pais p on p.codigo = l.pais "+
                        "inner join idioma i on i.codigo = l.idioma "+
                        "where l.titulo like '%"+frase+"%' order by l.codigo asc";
                    break;
            case 1: //por autor
                    sql = "select l.codigo, l.titulo, l.autor, e.nombre as editorial, l.ubicacion, "+
                        "l.anioEdicion, l.numEdicion, p.nombre as pais, i.nombre as idioma, l.ISBN, "+
                        "l.materia, l.paginas, l.tipo, l.estado, l.descripcion from libro l " +
                        "inner join editorial e on e.codigo = l.editorial "+
                        "inner join pais p on p.codigo = l.pais "+
                        "inner join idioma i on i.codigo = l.idioma "+
                        "where l.autor like '%"+frase+"%' order by l.codigo asc";
                    break;
            case 2: //por materia
                    sql = "select l.codigo, l.titulo, l.autor, e.nombre as editorial, l.ubicacion, "+
                        "l.anioEdicion, l.numEdicion, p.nombre as pais, i.nombre as idioma, l.ISBN, "+
                        "l.materia, l.paginas, l.tipo, l.estado, l.descripcion from libro l " +
                        "inner join editorial e on e.codigo = l.editorial "+
                        "inner join pais p on p.codigo = l.pais "+
                        "inner join idioma i on i.codigo = l.idioma "+
                        "where l.materia like '%"+frase+"%' order by l.codigo asc";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getString(4); //editorial
                datos[4] = rs.getString(5); //ubicacion
                datos[5] = rs.getString(6); //anio Edicion
                datos[6] = rs.getString(7); //num Edicion
                datos[7] = rs.getString(8); //pais
                datos[8] = rs.getString(9); //idioma
                datos[9] = rs.getString(10); //ISBN
                datos[10] = rs.getString(11); //materia
                datos[11] = rs.getString(12); //paginas
                datos[12] = rs.getString(13); //tipo
                datos[13] = rs.getString(14); //estado
                datos[14] = rs.getString(15); //descripcion
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UNA MATRIZ DE TIPO OBJETO CON UN REGISTRO DE LA TABLA X CODIGO */
    public static Object[] obtenerRegistroLibro(String codigo){
        Object[] datos = new Object[15];
        String sql = "SELECT * FROM libro WHERE codigo = '"+codigo+"'";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //autor
                datos[3] = rs.getInt(4);    //editorial
                datos[4] = rs.getString(5); //ISBN
                datos[5] = rs.getString(6); //anio edicion
                datos[6] = rs.getInt(7);    //numero edicion
                datos[7] = rs.getInt(8);    //pais
                datos[8] = rs.getInt(9);    //idioma
                datos[9] = rs.getString(10);    //materia
                datos[10] = rs.getInt(11);  //paginas
                datos[11] = rs.getString(12);   //ubicacion
                datos[12] = rs.getString(13);   //descripcion
                datos[13] = rs.getString(14);   //tipo
                datos[14] = rs.getString(15);   //estado
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    /* METODO PARA ACTUALIZAR LOS DATOS DE UN LIBRO */
    public static void actualizarRegistroLibro(Libro lb){
        Connection cn;
        try {
            cn = conexion();
            String QuertyUpdate = "UPDATE libro SET titulo=?,autor=?,editorial=?,ISBN=?,"+
                                  "anioEdicion=?,numEdicion=?,pais=?,idioma=?,materia=?,"+
                                  "paginas=?,ubicacion=?,descripcion=?,tipo=? WHERE codigo=?";
            PreparedStatement ps = cn.prepareStatement(QuertyUpdate);
            ps.setString(1, lb.getTitulo());
            ps.setString(2, lb.getAutor());
            ps.setInt(3, lb.getEditorial());
            ps.setString(4, lb.getISBN());
            ps.setString(5, lb.getAnioEdicion());
            ps.setInt(6, lb.getNumEdicion());
            ps.setInt(7, lb.getPais());
            ps.setInt(8, lb.getIdioma());
            ps.setString(9, lb.getMateria());
            ps.setInt(10, lb.getPaginas());
            ps.setString(11, lb.getUbicacion());
            ps.setString(12, lb.getDescripcion());
            ps.setString(13, lb.getTipo());
            ps.setString(14, lb.getCodigo());
            ps.executeUpdate(); //ejecuta la altualización en la tabla libro
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO PARA ELIMINAR UN LIBRO DADO SU CODIGO */
    public static void eliminarRegistroLibro(String codigo){
        Connection cn;
        try {
            cn = conexion();
            String QuertyDelete = "DELETE FROM libro WHERE codigo='"+codigo+"'";
            PreparedStatement ps = cn.prepareStatement(QuertyDelete);
            ps.executeUpdate();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA VIDEO */
    public static TableModel obtenerRegistrosVideo(DefaultTableModel modelo){
        String[] datos = new String [5];
        String sql = "SELECT * FROM video";
        Connection cn;
        try{
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);  //codigo
                datos[1] = rs.getString(2);  //titulo
                datos[2] = rs.getString(3);  //director
                datos[3] = rs.getString(13); //ubicacion
                datos[4] = rs.getString(5);  //tipo de material
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA VIDEO */
    public static TableModel obtenerRegistrosVideo2(DefaultTableModel modelo){
        String[] datos = new String [14];
        String sql = "select v.codigo, v.titulo, v.director, d.nombre as productora, v.ubicacion, "+
                "v.tipo, v.anio, v.duracion, p.nombre as pais, i.nombre as idioma, v.subtitulo, "+
                "v.clasificacion, v.genero, v.sinopsis from video v inner join productora d on "+
                "d.codigo = v.productora inner join pais p on p.codigo = v.pais inner join "+
                "idioma i on i.codigo = v.idioma order by v.codigo asc";
        Connection cn;
        try{
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);  //codigo
                datos[1] = rs.getString(2);  //titulo
                datos[2] = rs.getString(3);  //director
                datos[3] = rs.getString(4);  //productora
                datos[4] = rs.getString(5);  //ubicacion
                datos[5] = rs.getString(6);  //tipo
                datos[6] = rs.getString(7);  //anio
                datos[7] = rs.getString(8);  //duracion
                datos[8] = rs.getString(9);  //pais
                datos[9] = rs.getString(10); //idioma
                datos[10] = rs.getString(11); //subtitulo
                datos[11] = rs.getString(12); //clasificacion
                datos[12] = rs.getString(13); //genero
                datos[13] = rs.getString(14); //sinopsis
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosVideo(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [5];
        String sql = null;
        switch(criterio){
            case 0: //por titulo
                    sql = "SELECT * FROM video WHERE titulo like '%"+frase+"%'";
                    break;
            case 1: //por director
                    sql = "SELECT * FROM video WHERE director like '%"+frase+"%'";
                    break;
            case 2: //por genero
                    sql = "SELECT * FROM video WHERE genero like '%"+frase+"%'";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);  //codigo
                datos[1] = rs.getString(2);  //titulo
                datos[2] = rs.getString(3);  //director
                datos[3] = rs.getString(13); //ubicacion
                datos[4] = rs.getString(5);  //tipo de material
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosVideo2(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [14];
        String sql = null;
        switch(criterio){
            case 0: //por titulo
                    sql = "select v.codigo, v.titulo, v.director, d.nombre as productora, v.ubicacion, "+
                        "v.tipo, v.anio, v.duracion, p.nombre as pais, i.nombre as idioma, v.subtitulo, "+
                        "v.clasificacion, v.genero, v.sinopsis from video v inner join productora d on "+
                        "d.codigo = v.productora inner join pais p on p.codigo = v.pais inner join "+
                        "idioma i on i.codigo = v.idioma where v.titulo like '%"+frase+"%' order by v.codigo asc";
                    break;
            case 1: //por director
                    sql = "select v.codigo, v.titulo, v.director, d.nombre as productora, v.ubicacion, "+
                        "v.tipo, v.anio, v.duracion, p.nombre as pais, i.nombre as idioma, v.subtitulo, "+
                        "v.clasificacion, v.genero, v.sinopsis from video v inner join productora d on "+
                        "d.codigo = v.productora inner join pais p on p.codigo = v.pais inner join "+
                        "idioma i on i.codigo = v.idioma where v.director like '%"+frase+"%' order by v.codigo asc";
                    break;
            case 2: //por genero
                    sql = "select v.codigo, v.titulo, v.director, d.nombre as productora, v.ubicacion, "+
                        "v.tipo, v.anio, v.duracion, p.nombre as pais, i.nombre as idioma, v.subtitulo, "+
                        "v.clasificacion, v.genero, v.sinopsis from video v inner join productora d on "+
                        "d.codigo = v.productora inner join pais p on p.codigo = v.pais inner join "+
                        "idioma i on i.codigo = v.idioma where v.genero like '%"+frase+"%' order by v.codigo asc";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);  //codigo
                datos[1] = rs.getString(2);  //titulo
                datos[2] = rs.getString(3);  //director
                datos[3] = rs.getString(4);  //productora
                datos[4] = rs.getString(5);  //ubicacion
                datos[5] = rs.getString(6);  //tipo
                datos[6] = rs.getString(7);  //anio
                datos[7] = rs.getString(8);  //duracion
                datos[8] = rs.getString(9);  //pais
                datos[9] = rs.getString(10); //idioma
                datos[10] = rs.getString(11); //subtitulo
                datos[11] = rs.getString(12); //clasificacion
                datos[12] = rs.getString(13); //genero
                datos[13] = rs.getString(14); //sinopsis
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UNA MATRIZ DE TIPO OBJETO CON UN REGISTRO DE LA TABLA X CODIGO */
    public static Object[] obtenerRegistroVideo(String codigo){
        Object[] datos = new Object[14];
        String sql = "SELECT * FROM video WHERE codigo = '"+codigo+"'";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //titulo
                datos[2] = rs.getString(3); //director
                datos[3] = rs.getInt(4);    //productora
                datos[4] = rs.getString(5); //tipo
                datos[5] = rs.getString(6); //anio
                datos[6] = rs.getInt(7);    //duracion
                datos[7] = rs.getInt(8);    //pais
                datos[8] = rs.getInt(9);    //idioma
                datos[9] = rs.getString(10);    //subtitulo
                datos[10] = rs.getInt(11);  //clasificacion
                datos[11] = rs.getString(12);   //genero
                datos[12] = rs.getString(13);   //ubicacion
                datos[13] = rs.getString(14);   //sinopsis
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    /* METODO PARA ACTUALIZAR LOS DATOS DE UN LIBRO */
    public static void actualizarRegistroVideo(Video vd){
        Connection cn;
        try {
            cn = conexion();
            String QuertyUpdate = "UPDATE video SET titulo=?,director=?,productora=?,tipo=?,"+
                                  "anio=?,duracion=?,pais=?,idioma=?,subtitulo=?,"+
                                  "clasificacion=?,genero=?,ubicacion=?,sinopsis=? WHERE codigo=?";
            PreparedStatement ps = cn.prepareStatement(QuertyUpdate);
            ps.setString(1, vd.getTitulo());
            ps.setString(2, vd.getDirector());
            ps.setInt(3, vd.getProductora());
            ps.setString(4, vd.getTipo());
            ps.setString(5, vd.getAnio());
            ps.setInt(6, vd.getDuracion());
            ps.setInt(7, vd.getPais());
            ps.setInt(8, vd.getIdioma());
            ps.setString(9, vd.getSubtitulo());
            ps.setInt(10, vd.getClasificacion());
            ps.setString(11, vd.getGenero());
            ps.setString(12, vd.getUbicacion());
            ps.setString(13, vd.getSinopsis());
            ps.setString(14, vd.getCodigo());
            ps.executeUpdate(); //ejecuta la inserción a la tabla participante
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO PARA ELIMINAR UN LIBRO DADO SU CODIGO */
    public static void eliminarRegistroVideo(String codigo){
        Connection cn;
        try {
            cn = conexion();
            String QuertyDelete = "DELETE FROM video WHERE codigo='"+codigo+"'";
            PreparedStatement ps = cn.prepareStatement(QuertyDelete);
            ps.executeUpdate();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO PARA INSERTAR LOS DATOS DE UN PARTICIPANTE */
    public static void insertarUsuario(Usuario user) throws ParseException, ClassNotFoundException, SQLException {
        Connection cn;
        PreparedStatement ps;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert1 = "INSERT INTO usuario (codigo, nombre, apellido, dui, sexo, "+
                                 "telefono, celular, profesion, direccion, tipo) VALUES (?,?,?,?,?,?,?,?,?,?)";
            String queryInsert2 = "INSERT INTO acceso (codigoUsuario, usuario, contrasenia) VALUES (?,?,?)";
            ps = cn.prepareStatement(queryInsert1);
            ps.setString(1, user.getCodigo());
            ps.setString(2, user.getNombre());
            ps.setString(3, user.getApellido());
            ps.setString(4, user.getDui());
            ps.setString(5, user.getSexo());
            ps.setString(6, user.getTelefono());
            ps.setString(7, user.getCelular());
            ps.setString(8, user.getProfesion());
            ps.setString(9, user.getDireccion());
            ps.setString(10, user.getTipo());
            ps.executeUpdate(); //ejecuta la inserción a la tabla usuario
            ps.clearParameters();
            ps = cn.prepareStatement(queryInsert2);
            ps.setString(1, user.getCodigo());
            ps.setString(2, user.getUsuario());
            ps.setString(3, user.getPass());
            ps.executeUpdate(); //ejecuta la inserción a la tabla acceso
            ps.clearParameters();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA USUARIO */
    public static TableModel obtenerRegistrosUsuarios(DefaultTableModel modelo){
        String[] datos = new String [5];
        String sql = "SELECT * FROM usuario";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //nombre
                datos[2] = rs.getString(3); //apellido
                datos[3] = rs.getString(4); //dui
                datos[4] = rs.getString(10); //tipo
                modelo.addRow(datos);
            }
            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE LA TABLA USUARIO */
    public static TableModel obtenerRegistrosUsuarios1(DefaultTableModel modelo){
        String[] datos = new String [4];
        String sql = "SELECT * FROM usuario";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //nombre
                datos[2] = rs.getString(3); //apellido
                datos[3] = rs.getString(10); //tipo
                modelo.addRow(datos);
            }
            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosUsuarios(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [5];
        String sql = null;
        switch(criterio){
            case 0: //por nombre
                    sql = "SELECT * FROM usuario WHERE nombre like '%"+frase+"%'";
                    break;
            case 1: //por apellido
                    sql = "SELECT * FROM usuario WHERE apellido like '%"+frase+"%'";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //nombre
                datos[2] = rs.getString(3); //apellido
                datos[3] = rs.getString(4); //dui
                datos[4] = rs.getString(10); //tipo
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON UN REGISTRO DE LA TABLA BUSCA FRASE X CRITERIO */
    public static TableModel obtenerRegistrosUsuarios1(DefaultTableModel modelo, String frase, int criterio){
        String[] datos = new String [5];
        String sql = null;
        switch(criterio){
            case 0: //por nombre
                    sql = "SELECT * FROM usuario WHERE nombre like '%"+frase+"%'";
                    break;
            case 1: //por apellido
                    sql = "SELECT * FROM usuario WHERE apellido like '%"+frase+"%'";
                    break;
        }
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //nombre
                datos[2] = rs.getString(3); //apellido
                datos[3] = rs.getString(10); //tipo
                modelo.addRow(datos);
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO QUE RETORNA UNA MATRIZ DE TIPO OBJETO CON UN REGISTRO DE LA TABLA X CODIGO */
    public static Object[] obtenerRegistroUsuario(String codigo){
        Object[] datos = new Object[12];
        String sql = "SELECT * FROM usuario u, acceso a WHERE u.codigo = '"+codigo+"' AND a.codigoUsuario = '"+codigo+"'";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1); //codigo
                datos[1] = rs.getString(2); //nombre
                datos[2] = rs.getString(3); //apellido
                datos[3] = rs.getString(4); //dui
                datos[4] = rs.getString(5); //sexo
                datos[5] = rs.getString(6); //telefono
                datos[6] = rs.getString(7); //celular
                datos[7] = rs.getString(8); //profesion
                datos[8] = rs.getString(9); //direccion
                datos[9] = rs.getString(10); //tipo
                datos[10] = rs.getString(12); //usuario
                datos[11] = rs.getString(13); //contrasenia
            }
            cn.close();
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    /* METODO QUE RETORNA UN TABLEMODEL CON TODOS LOS REGISTROS DE PRESTAMO UN USUARIO */
    public static TableModel obtenerRegistrosUsuario1(DefaultTableModel modelo, String codigo){
        String[] datos = new String [4];
        String sql = "SELECT * FROM prestamo WHERE codigoUsuario = '"+codigo+"'";
        Connection cn;
        try {
            cn = conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(2); //codigo usuario
                datos[1] = rs.getString(1); //codigo libro
                datos[2] = rs.getString(3); //fecha prestamo
                datos[3] = rs.getString(4); //fecha devolucion
                modelo.addRow(datos);
            }
            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    /* METODO PARA ACTUALIZAR LOS DATOS DE UN USUARIO */
    public static void actualizarRegistroUsuario(Usuario user){
        Connection cn;
        try {
            cn = conexion();
            String QuertyUpdate = "UPDATE usuario u, acceso a SET u.nombre=?, u.apellido=?, "+
                                  "u.dui=?, u.sexo=?, u.telefono=?, u.celular=?, u.profesion=?, "+
                                  "u.direccion=?, u.tipo=?, a.usuario=?, a.contrasenia=? WHERE "+
                                  "u.codigo=? AND a.codigoUsuario=?";
            PreparedStatement ps = cn.prepareStatement(QuertyUpdate);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getDui());
            ps.setString(4, user.getSexo());
            ps.setString(5, user.getTelefono());
            ps.setString(6, user.getCelular());
            ps.setString(7, user.getProfesion());
            ps.setString(8, user.getDireccion());
            ps.setString(9, user.getTipo());
            ps.setString(10, user.getUsuario());
            ps.setString(11, user.getPass());
            ps.setString(12, user.getCodigo());
            ps.setString(13, user.getCodigo());
            ps.executeUpdate(); //ejecuta la altualización en la tabla participante
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO PARA ELIMINAR UN USUARIO DADO SU CODIGO */
    public static void eliminarRegistroUsuario(String codigo){
        Connection cn;
        try {
            cn = conexion();
            String QuertyDelete = "DELETE FROM usuario WHERE codigo='"+codigo+"'";
            PreparedStatement ps = cn.prepareStatement(QuertyDelete);
            ps.executeUpdate();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* METODO PARA INSERTAR LOS DATOS DE PRESTAMO */
    public static void insertarPrestamo(Prestamos p) throws ParseException, ClassNotFoundException, SQLException {
        PreparedStatement ps;
        Connection cn;
        try {
            cn = conexion(); //optiene la conexión
            String queryInsert = "INSERT INTO prestamo (codigoLibro, codigoUsuario, fechaPrestamo, fechaDevolucion) "+
                                 "VALUES(?,?,?,?)";
            String QuertyUpdate = "UPDATE libro SET estado=? WHERE codigo=?";
            ps = cn.prepareStatement(queryInsert);
            ps.setString(1, p.getCodigoLibro());
            ps.setString(2, p.getCodigoUsuario());
            ps.setString(3, p.getFechaPrestamo());
            ps.setString(4, p.getFechaDevolucion());
            ps.executeUpdate(); //ejecuta la inserción a la tabla prestamo
            //Cambia el estado en el libro
            ps.clearParameters();
            ps = cn.prepareStatement(QuertyUpdate);
            ps.setString(1, "prestado");
            ps.setString(2, p.getCodigoLibro());
            ps.executeUpdate(); //ejecuta la inserción a la tabla acceso
            ps.clearParameters();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión a la base de datos");
        }
    }
    
    /* METODO PARA ELIMINAR UN USUARIO DADO SU CODIGO */
    public static void eliminarPrestamo(String codLibro){
        Connection cn;
        try {
            cn = conexion();
            String QuertyDelete = "DELETE FROM prestamo WHERE codigoLibro='"+codLibro+"'";
            String QuertyUpdate = "UPDATE libro SET estado=? WHERE codigo=?";
            PreparedStatement ps = cn.prepareStatement(QuertyDelete);
            ps.executeUpdate();
            //Cambia el estado en el libro
            ps.clearParameters();
            ps = cn.prepareStatement(QuertyUpdate);
            ps.setString(1, "activo");
            ps.setString(2, codLibro);
            ps.executeUpdate(); //ejecuta la inserción a la tabla acceso
            ps.clearParameters();
            cn.close(); //cierra la conexión al servidor MySQL
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
