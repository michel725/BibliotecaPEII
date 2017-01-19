package Interfaces;

import Datos.DBAdmin;
import Datos.Libro;
import Datos.Video;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AgregarBB extends javax.swing.JFrame {
    String codigoLibro, codigoVideo;
    int correlativoCodLibro, correlativoCodVideo;
    

    public AgregarBB() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        try {
            //obtiene el codigo del libro a ingresar
            correlativoCodLibro = DBAdmin.obtenerCorrelativo("libro");
            codigoLibro = crearCodigo("L",correlativoCodLibro + 1);
            lbl_codigo_libro.setText(codigoLibro);
            
            //obtiene el codigo del video a ingresar
            correlativoCodVideo = DBAdmin.obtenerCorrelativo("video");
            codigoVideo = crearCodigo("V",correlativoCodVideo + 1);
            lbl_codigo_video.setText(codigoVideo);
            
            llenarComboBoxEditorial(); //llena el contenido del combo box editorial
            Calendar c = Calendar.getInstance(); //Obtener el calendario actual
            jyc_anio_libro.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
            jyc_anio_video.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
            llenarComboBoxPais(); //llena el contenido de los combo box pais
            llenarComboBoxIdioma(); //llena el contenido de los combo box idioma
            llenarComboBoxUbicacion(); //llena el contenido del combo box ubicacion
            llenarComboBoxProductora(); //llena el contenido del combo box productora
        } catch (ParseException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jp_libros = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_codigo_libro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbx_isbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbx_titulo_libro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbx_autor = new javax.swing.JTextField();
        cbx_editorial = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jyc_anio_libro = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        spr_paginas = new javax.swing.JSpinner();
        spr_ejemplares = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spr_edicion = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        cbx_pais_libro = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbx_idioma_libro = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        tbx_materia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbx_ubicacion_libro = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        tbx_descripcion = new javax.swing.JTextField();
        btn_agregar_libro = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbx_tipo_libro = new javax.swing.JComboBox();
        jp_videos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_codigo_video = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tbx_titulo_video = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tbx_director = new javax.swing.JTextField();
        cbx_productora = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jyc_anio_video = new com.toedter.calendar.JYearChooser();
        spr_copias = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        spr_duracion = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        cbx_pais_video = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cbx_idioma_video = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tbx_sinopsis = new javax.swing.JTextField();
        btn_agregar_video = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        spr_clasificacion = new javax.swing.JSpinner();
        cbx_subtitulos = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cbx_ubicacion_video = new javax.swing.JComboBox();
        tbx_genero = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        cbx_tipo_video = new javax.swing.JComboBox();
        btn_regresar = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Año de Edición:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Editorial:");

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR A BIBLIOTECA");
        setResizable(false);

        jTabbedPane7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jp_libros.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_codigo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_codigo_libro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_codigo_libro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lbl_codigo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("ISBN:");

        tbx_isbn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_isbnKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Título:");

        tbx_titulo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_titulo_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_titulo_libroKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Autor(es):");

        tbx_autor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_autorKeyTyped(evt);
            }
        });

        cbx_editorial.setEditable(true);
        cbx_editorial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Editorial:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Año de Edición:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Número de Páginas:");

        spr_paginas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_paginas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_paginas.setEditor(new javax.swing.JSpinner.NumberEditor(spr_paginas, ""));

        spr_ejemplares.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_ejemplares.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_ejemplares.setEditor(new javax.swing.JSpinner.NumberEditor(spr_ejemplares, ""));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Ejemplares:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Número de Edición:");

        spr_edicion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_edicion.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_edicion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_edicion, ""));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("País:");

        cbx_pais_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Idioma:");

        cbx_idioma_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Materia:");

        tbx_materia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_materiaKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Ubicación:");

        cbx_ubicacion_libro.setEditable(true);
        cbx_ubicacion_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setText("Descripción Física:");

        tbx_descripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_descripcionKeyTyped(evt);
            }
        });

        btn_agregar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_agregar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32.png"))); // NOI18N
        btn_agregar_libro.setText("  GUARDAR");
        btn_agregar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_libroActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setText("Tipo de Material:");

        cbx_tipo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_tipo_libro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Libro", "Obra", "Tesis" }));

        javax.swing.GroupLayout jp_librosLayout = new javax.swing.GroupLayout(jp_libros);
        jp_libros.setLayout(jp_librosLayout);
        jp_librosLayout.setHorizontalGroup(
            jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_librosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(cbx_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jyc_anio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(spr_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(cbx_pais_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_idioma_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(tbx_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_librosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(spr_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(4, 4, 4)
                                .addComponent(cbx_ubicacion_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_librosLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_tipo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn_agregar_libro))
                    .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jp_librosLayout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel9)
                            .addGap(4, 4, 4)
                            .addComponent(spr_ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbx_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_librosLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(4, 4, 4)
                            .addComponent(tbx_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(tbx_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_librosLayout.setVerticalGroup(
            jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_agregar_libro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_librosLayout.createSequentialGroup()
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_librosLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9))
                            .addGroup(jp_librosLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(spr_ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(11, 11, 11)
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbx_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(11, 11, 11)
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jyc_anio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spr_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))))
                .addGap(11, 11, 11)
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_pais_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_idioma_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spr_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_librosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15)))
                            .addComponent(cbx_ubicacion_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_librosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_librosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addGroup(jp_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_tipo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane7.addTab(" LIBRO", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Literature-18.png")), jp_libros); // NOI18N

        jp_videos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_codigo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_codigo_video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_codigo_video.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_video, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbl_codigo_video, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel19.setText("Título:");

        tbx_titulo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_titulo_video.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_titulo_videoKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel20.setText("Director:");

        tbx_director.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_directorKeyTyped(evt);
            }
        });

        cbx_productora.setEditable(true);
        cbx_productora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel21.setText("Productora:");

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel22.setText("Año:");

        spr_copias.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_copias.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_copias.setEditor(new javax.swing.JSpinner.NumberEditor(spr_copias, ""));

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel24.setText("Copias:");

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel25.setText("Duración (min):");

        spr_duracion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_duracion.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_duracion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_duracion, ""));

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel26.setText("País:");

        cbx_pais_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel27.setText("Idioma:");

        cbx_idioma_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel29.setText("Genero(s):");

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel30.setText("Sinopsis:");

        tbx_sinopsis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_sinopsis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_sinopsisKeyTyped(evt);
            }
        });

        btn_agregar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_agregar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32.png"))); // NOI18N
        btn_agregar_video.setText("  GUARDAR");
        btn_agregar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_videoActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel32.setText("Clasificación:");

        spr_clasificacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_clasificacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spr_clasificacion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_clasificacion, ""));

        cbx_subtitulos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_subtitulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));

        jLabel45.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel45.setText("Subtitulos:");

        jLabel46.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel46.setText("Ubicación:");

        cbx_ubicacion_video.setEditable(true);
        cbx_ubicacion_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tbx_genero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_genero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_generoKeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel47.setText("Tipo de material:");

        cbx_tipo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_tipo_video.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Videocinta (VHS)", "DVD" }));

        javax.swing.GroupLayout jp_videosLayout = new javax.swing.GroupLayout(jp_videos);
        jp_videos.setLayout(jp_videosLayout);
        jp_videosLayout.setHorizontalGroup(
            jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_videosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(4, 4, 4)
                        .addComponent(cbx_pais_video, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_idioma_video, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45)
                        .addGap(4, 4, 4)
                        .addComponent(cbx_subtitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spr_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)
                                .addGap(4, 4, 4)
                                .addComponent(cbx_ubicacion_video, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar_video))
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jp_videosLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(4, 4, 4)
                                    .addComponent(spr_copias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_videosLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_productora, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_videosLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(4, 4, 4)
                                        .addComponent(tbx_titulo_video, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jp_videosLayout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(4, 4, 4)
                                    .addComponent(jyc_anio_video, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spr_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp_videosLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_director, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(4, 4, 4)
                                .addComponent(cbx_tipo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_videosLayout.setVerticalGroup(
            jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_videosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24))
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_tipo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel47))
                            .addComponent(spr_copias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbx_titulo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))))
                .addGap(11, 11, 11)
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_productora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jyc_anio_video, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spr_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22))))
                .addGap(11, 11, 11)
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_pais_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_idioma_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_subtitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spr_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))))
                .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_videosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(tbx_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_ubicacion_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel46)))
                        .addGap(11, 11, 11)
                        .addGroup(jp_videosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_videosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel30))
                            .addComponent(tbx_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane7.addTab(" VIDEOCINTA (VHS) / DVD", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Movie-18.png")), jp_videos); // NOI18N

        btn_regresar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32.png"))); // NOI18N
        btn_regresar.setText("  REGRESAR");
        btn_regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_regresar)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    /* BOTON AGREGAR LIBRO */
    private void btn_agregar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_libroActionPerformed
        int id, ejemplares;
        if (tbx_titulo_libro.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un título válido", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_autor.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un autor válido", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_editorial = (JTextField) cbx_editorial.getEditor().getEditorComponent();
        if (tbx_editorial.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un editorial válido.\nTambién puede seleccionar una opción.", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_editorial.getText().length() >= 100){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un editorial con menos carácteres.\nTambién puede seleccionar una opción.", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_ubicacion = (JTextField) cbx_ubicacion_libro.getEditor().getEditorComponent();
        if(tbx_ubicacion.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación válida.\nFormato: STN001", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tbx_ubicacion.getText().length() != 6){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación con 6 carácteres.\nFormato: STN001", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            Libro lb = new Libro(); //crea un objeto de tipo Libro
            ejemplares = (int)spr_ejemplares.getValue();
            while(ejemplares > 0){
                //agrega al objeto lo ingresado en los controles de la ventana
                lb.setCodigo(codigoLibro);
                lb.setTitulo(tbx_titulo_libro.getText());
                lb.setAutor(tbx_autor.getText());
                id = DBAdmin.obtenerIDEditorial(tbx_editorial.getText());
                if(id < 0){
                    DBAdmin.guardarEditorial(tbx_editorial.getText());
                    lb.setEditorial(DBAdmin.obtenerIDEditorial(tbx_editorial.getText()));
                }else{ lb.setEditorial(id); }
                lb.setISBN(tbx_isbn.getText());
                lb.setAnioEdicion(String.valueOf(jyc_anio_libro.getYear()));
                lb.setNumEdicion((int)spr_edicion.getValue());
                lb.setPais(cbx_pais_libro.getSelectedIndex()+1);
                lb.setIdioma(cbx_idioma_libro.getSelectedIndex()+1);
                lb.setMateria(tbx_materia.getText());
                lb.setPaginas((int)spr_paginas.getValue());
                lb.setUbicacion(tbx_ubicacion.getText());
                lb.setDescripcion(tbx_descripcion.getText());
                lb.setTipo(cbx_tipo_libro.getSelectedItem().toString());
                lb.setEstado("activo"); //estado "activo" siempre al inicio
                DBAdmin.insertarLibro(lb); //inserta los datos del libro en la tabla
                //obtiene el codigo del libro a ingresar
                correlativoCodLibro = DBAdmin.obtenerCorrelativo("libro");
                codigoLibro = crearCodigo("L",correlativoCodLibro + 1);
                lbl_codigo_libro.setText(codigoLibro);
                ejemplares--;
            } //fin del while
            JOptionPane.showMessageDialog(null,"El libro ha sido ingresado con éxito.", "Ingresar Libro",JOptionPane.INFORMATION_MESSAGE);
            limpiarLibros();
        }catch (ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar el libro", "Ingresar Libro",JOptionPane.ERROR_MESSAGE);
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregar_libroActionPerformed

    /* BOTON AGREGAR VIDEO */
    private void btn_agregar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_videoActionPerformed
        int id, copias;
        if (tbx_titulo_video.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un título válido", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_director.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un director válido", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_productora = (JTextField) cbx_productora.getEditor().getEditorComponent();
        if (tbx_productora.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una productora válida.\nTambién puede seleccionar una opción.", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_productora.getText().length() >= 100){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una productora con menos carácteres.\nTambién puede seleccionar una opción.", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_ubicacion_video = (JTextField) cbx_ubicacion_video.getEditor().getEditorComponent();
        if(tbx_ubicacion_video.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación válida.\nFormato: STN001", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tbx_ubicacion_video.getText().length() != 6){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación con 6 carácteres.\nFormato: STN001", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            Video vd = new Video(); //crea un objeto de tipo video
            copias = (int)spr_copias.getValue();
            while(copias > 0){
                //agrega al objeto lo ingresado en los controles de la ventana
                vd.setCodigo(codigoVideo);
                vd.setTitulo(tbx_titulo_video.getText());
                vd.setDirector(tbx_director.getText());
                id = DBAdmin.obtenerIDProductora(tbx_productora.getText());
                if(id < 0){
                    DBAdmin.guardarProductora(tbx_productora.getText());
                    vd.setProductora(DBAdmin.obtenerIDProductora(tbx_productora.getText()));
                }else{ vd.setProductora(id); }
                if(cbx_tipo_video.getSelectedIndex() == 0){
                    vd.setTipo("VHS");
                }else{ vd.setTipo("DVD"); }
                vd.setAnio(String.valueOf(jyc_anio_video.getYear()));
                vd.setDuracion((int)spr_duracion.getValue());
                vd.setPais(cbx_pais_video.getSelectedIndex()+1);
                vd.setIdioma(cbx_idioma_video.getSelectedIndex()+1);
                vd.setSubtitulo(cbx_subtitulos.getSelectedItem().toString());
                vd.setClasificacion((int)spr_clasificacion.getValue());
                vd.setGenero(tbx_genero.getText());
                vd.setUbicacion(tbx_ubicacion_video.getText());
                vd.setSinopsis(tbx_sinopsis.getText());
                DBAdmin.insertarVideo(vd); //inserta los datos del video en la tabla
                //obtiene el codigo del video a ingresar
                correlativoCodVideo = DBAdmin.obtenerCorrelativo("video");
                codigoVideo = crearCodigo("V",correlativoCodVideo + 1);
                lbl_codigo_video.setText(codigoVideo);
                copias--;
            } //fin del while
            JOptionPane.showMessageDialog(null,"El video ha sido ingresado con éxito.", "Ingresar Video",JOptionPane.INFORMATION_MESSAGE);
            limpiarVideos();
        }catch (ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar el video", "Ingresar Video",JOptionPane.ERROR_MESSAGE);
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregar_videoActionPerformed

    private void tbx_titulo_libroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_titulo_libroKeyTyped
        //evt es el evento que es accionado
        if(tbx_titulo_libro.getText().length() == 100){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_titulo_libroKeyTyped

    private void tbx_titulo_videoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_titulo_videoKeyTyped
        //evt es el evento que es accionado
        if(tbx_titulo_video.getText().length() == 100){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_titulo_videoKeyTyped

    private void tbx_isbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_isbnKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es un espacio o si el tamaño de lo ingresado es igual a 13 (limite)
        if(Character.isSpaceChar(caracter) || !Character.isDigit(caracter) || tbx_isbn.getText().length() == 13){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_isbnKeyTyped

    private void tbx_autorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_autorKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 100 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(Character.isDigit(caracter)) { //si es digito
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_autor.getText().length() == 100){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_autorKeyTyped

    private void tbx_materiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_materiaKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 200 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(Character.isDigit(caracter)) { //si es digito
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_materia.getText().length() == 200){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_materiaKeyTyped

    private void tbx_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_descripcionKeyTyped
        if(tbx_descripcion.getText().length() == 300){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_descripcionKeyTyped

    private void tbx_directorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_directorKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 100 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(Character.isDigit(caracter)) { //si es digito
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_director.getText().length() == 100){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_directorKeyTyped

    private void tbx_generoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_generoKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 100 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(Character.isDigit(caracter)) { //si es digito
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_genero.getText().length() == 100){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_generoKeyTyped

    private void tbx_sinopsisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_sinopsisKeyTyped
        if(tbx_sinopsis.getText().length() == 300){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_sinopsisKeyTyped

    /* METODO PARA CREAR EL CODIGO DEL LIBRO / VIDEO / USUARIO A INGRESAR */
    public static String crearCodigo(String inicial, int contador) {
        String codigo;
        if(contador > 0 && contador < 10){ //para poner los digitos de unidades
            codigo = "" + inicial + "000000" + contador; //L0000009
        }else{
            if(contador >= 10 && contador < 100){ //para poner los digitos de decenas
                codigo = "" + inicial + "00000" + contador; //L0000099
            }else{
                if(contador >= 100 && contador < 1000){ //para poner los digitos de centenas 
                    codigo = "" + inicial + "0000" + contador; //L0000999
                }else{
                    if(contador >= 1000 && contador < 10000){ //para poner los digitios de mil 
                        codigo = "" + inicial + "000" + contador; //L0009999
                    }else{
                        if(contador >= 10000 && contador < 100000){ //para poner los digitos de diez mil 
                            codigo = "" + inicial + "00" + contador; //L0099999
                        }else{
                            if(contador >= 100000 && contador < 1000000){ //para poner los digitos de cien mil 
                                codigo = "" + inicial + "0" + contador; //L0999999
                            }else{
                                if(contador >= 1000000 && contador < 10000000){ //para poner los digitos de millon 
                                    codigo = "" + inicial + contador; //L9999999
                                }else{ //si no hay registros
                                    codigo = "" + inicial + "0000001";
                                }
                            }
                        }
                    }
                }
            }
        }
        return codigo;
    }
    
    /* METODO PARA LLENAR EL COMBOBOX EDITORIAL EXISTENTES */
    private void llenarComboBoxEditorial(){
        cbx_editorial.removeAllItems();
        String sql = "SELECT DISTINCT * FROM editorial";
        Connection cn;
        try {
            cn = DBAdmin.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee linea por linea de la tabla
                cbx_editorial.addItem(rs.getString(2));
            }
            cn.close();
            cbx_editorial.setSelectedIndex(-1); //no seleccionar ninguno
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /* METODO PARA LLENAR EL COMBOBOX PAIS EXISTENTES */
    private void llenarComboBoxPais(){
        cbx_pais_libro.removeAllItems();
        cbx_pais_video.removeAllItems();
        String sql = "SELECT DISTINCT * FROM pais";
        Connection cn;
        try {
            cn = DBAdmin.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee linea por linea de la tabla
                cbx_pais_libro.addItem(rs.getString(2));
                cbx_pais_video.addItem(rs.getString(2));
            }
            cn.close();
            cbx_pais_libro.setSelectedIndex(0);
            cbx_pais_video.setSelectedIndex(0);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /* METODO PARA LLENAR EL COMBOBOX IDIOMA EXISTENTES */
    private void llenarComboBoxIdioma(){
        cbx_idioma_libro.removeAllItems();
        cbx_idioma_video.removeAllItems();
        String sql = "SELECT DISTINCT * FROM idioma";
        Connection cn;
        try {
            cn = DBAdmin.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee linea por linea de la tabla
                cbx_idioma_libro.addItem(rs.getString(2));
                cbx_idioma_video.addItem(rs.getString(2));
            }
            cn.close();
            cbx_idioma_libro.setSelectedIndex(0);
            cbx_idioma_video.setSelectedIndex(0);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /* METODO PARA LLENAR EL COMBOBOX UBICACION EXISTENTES */
    private void llenarComboBoxUbicacion(){
        cbx_ubicacion_libro.removeAllItems();
        cbx_ubicacion_video.removeAllItems();
        String sql = "(SELECT DISTINCT ubicacion FROM libro) "+
                     "UNION DISTINCT (SELECT DISTINCT ubicacion FROM video) "+
                     "ORDER BY ubicacion ASC";
        Connection cn;
        try {
            cn = DBAdmin.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee linea por linea de la tabla
                cbx_ubicacion_libro.addItem(rs.getString(1));
                cbx_ubicacion_video.addItem(rs.getString(1));
            }
            cn.close();
            cbx_ubicacion_libro.setSelectedIndex(-1); //no seleccionar ninguno
            cbx_ubicacion_video.setSelectedIndex(-1); //no seleccionar ninguno
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /* METODO PARA LLENAR EL COMBOBOX PRODUCTORAS EXISTENTES */
    private void llenarComboBoxProductora(){
        cbx_productora.removeAllItems();
        String sql = "SELECT DISTINCT nombre FROM productora";
        Connection cn;
        try {
            cn = DBAdmin.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ //lee linea por linea de la tabla
                cbx_productora.addItem(rs.getString(1));
            }
            cn.close();
            cbx_productora.setSelectedIndex(-1); //no seleccionar ninguno
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarBB.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    /* METODO PARA LIMPIAR LOS CAMPOS DE LIBROS */
    public void limpiarLibros(){
        llenarComboBoxEditorial();
        Calendar c = Calendar.getInstance();
        jyc_anio_libro.setYear(c.get(Calendar.YEAR));
        llenarComboBoxPais();
        llenarComboBoxIdioma();
        llenarComboBoxUbicacion();
        spr_ejemplares.setValue(1);
        tbx_isbn.setText("");
        tbx_titulo_libro.setText("");
        tbx_autor.setText("");
        spr_edicion.setValue(1);
        tbx_materia.setText("");
        spr_paginas.setValue(1);
        tbx_descripcion.setText("");
        cbx_tipo_libro.setSelectedIndex(0);
    }
    
    /* METODO PARA LIMPIAR LOS CAMPOS DE VIDEOS */
    public void limpiarVideos(){
        Calendar c = Calendar.getInstance(); //Obtener el calendario actual
        jyc_anio_video.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
        llenarComboBoxPais(); //llena el contenido de los combo box pais
        llenarComboBoxIdioma(); //llena el contenido de los combo box idioma
        llenarComboBoxUbicacion(); //llena el contenido del combo box ubicacion
        llenarComboBoxProductora(); //llena el contenido del combo box productora
        spr_copias.setValue(1);
        cbx_tipo_video.setSelectedIndex(0);
        tbx_titulo_video.setText("");
        tbx_director.setText("");
        spr_duracion.setValue(1);
        cbx_subtitulos.setSelectedIndex(0);
        spr_clasificacion.setValue(1);
        tbx_genero.setText("");
        tbx_sinopsis.setText("");
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_libro;
    private javax.swing.JButton btn_agregar_video;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_editorial;
    private javax.swing.JComboBox cbx_idioma_libro;
    private javax.swing.JComboBox cbx_idioma_video;
    private javax.swing.JComboBox cbx_pais_libro;
    private javax.swing.JComboBox cbx_pais_video;
    private javax.swing.JComboBox cbx_productora;
    private javax.swing.JComboBox cbx_subtitulos;
    private javax.swing.JComboBox cbx_tipo_libro;
    private javax.swing.JComboBox cbx_tipo_video;
    private javax.swing.JComboBox cbx_ubicacion_libro;
    private javax.swing.JComboBox cbx_ubicacion_video;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JPanel jp_libros;
    private javax.swing.JPanel jp_videos;
    private com.toedter.calendar.JYearChooser jyc_anio_libro;
    private com.toedter.calendar.JYearChooser jyc_anio_video;
    private javax.swing.JLabel lbl_codigo_libro;
    private javax.swing.JLabel lbl_codigo_video;
    private javax.swing.JSpinner spr_clasificacion;
    private javax.swing.JSpinner spr_copias;
    private javax.swing.JSpinner spr_duracion;
    private javax.swing.JSpinner spr_edicion;
    private javax.swing.JSpinner spr_ejemplares;
    private javax.swing.JSpinner spr_paginas;
    private javax.swing.JTextField tbx_autor;
    private javax.swing.JTextField tbx_descripcion;
    private javax.swing.JTextField tbx_director;
    private javax.swing.JTextField tbx_genero;
    private javax.swing.JTextField tbx_isbn;
    private javax.swing.JTextField tbx_materia;
    private javax.swing.JTextField tbx_sinopsis;
    private javax.swing.JTextField tbx_titulo_libro;
    private javax.swing.JTextField tbx_titulo_video;
    // End of variables declaration//GEN-END:variables
}
