package Interfaces;

import Datos.DBAdmin;
import Datos.Libro;
import Datos.Video;
import java.awt.HeadlessException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MantenimientoBB extends javax.swing.JFrame {
    //propiedad que se utiliza pra escuchar eventos de cambio de propiedad
    PropertyChangeListener pcl = new PropertyChangeListener(){
        @Override
        public void propertyChange(PropertyChangeEvent evt) { }
    };
    
    /* CONSTRUCTOR */
    public MantenimientoBB() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        //agrega la propiedad de escuchar cambios en la propiedad Text de los labels
        lbl_codigo_libro.addPropertyChangeListener("Text", pcl);
        lbl_codigo_video.addPropertyChangeListener("Text", pcl);
        llenarComboBoxEditorial(); //llena el contenido del combo box editorial
        Calendar c = Calendar.getInstance(); //Obtener el calendario actual
        jyc_anio_libro.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
        jyc_anio_video.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
        llenarComboBoxPais(); //llena el contenido de los combo box pais
        llenarComboBoxIdioma(); //llena el contenido de los combo box idioma
        llenarComboBoxUbicacion(); //llena el contenido del combo box ubicacion
        llenarComboBoxProductora(); //llena el contenido del combo box productora
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneles = new javax.swing.JTabbedPane();
        pnl_libro = new javax.swing.JPanel();
        pnl_codigo = new javax.swing.JPanel();
        lbl_codigo_libro = new javax.swing.JLabel();
        lbl_ISBN = new javax.swing.JLabel();
        tbx_isbn = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        tbx_titulo_libro = new javax.swing.JTextField();
        lbl_autor = new javax.swing.JLabel();
        tbx_autor = new javax.swing.JTextField();
        cbx_editorial = new javax.swing.JComboBox();
        lbl_editorial = new javax.swing.JLabel();
        lbl_anio_edicion = new javax.swing.JLabel();
        jyc_anio_libro = new com.toedter.calendar.JYearChooser();
        lbl_paginas = new javax.swing.JLabel();
        spr_paginas = new javax.swing.JSpinner();
        lbl_edicion = new javax.swing.JLabel();
        spr_edicion = new javax.swing.JSpinner();
        lbl_pais = new javax.swing.JLabel();
        cbx_pais_libro = new javax.swing.JComboBox();
        lbl_idioma = new javax.swing.JLabel();
        cbx_idioma_libro = new javax.swing.JComboBox();
        lbl_materia = new javax.swing.JLabel();
        tbx_materia = new javax.swing.JTextField();
        lbl_ubicacion = new javax.swing.JLabel();
        cbx_ubicacion_libro = new javax.swing.JComboBox();
        lbl_descripcion = new javax.swing.JLabel();
        tbx_descripcion = new javax.swing.JTextField();
        btn_modificar_libro = new javax.swing.JButton();
        btn_buscar_libro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_actualizar_libro = new javax.swing.JButton();
        btn_eliminar_libro = new javax.swing.JButton();
        btn_regresar_libro = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbx_tipo_libro = new javax.swing.JComboBox();
        pnl_videocinta = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tbx_titulo_video = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tbx_director = new javax.swing.JTextField();
        cbx_productora = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jyc_anio_video = new com.toedter.calendar.JYearChooser();
        jLabel25 = new javax.swing.JLabel();
        spr_duracion = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        cbx_pais_video = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cbx_idioma_video = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tbx_sinopsis = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        spr_clasificacion = new javax.swing.JSpinner();
        cbx_subtitulos = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cbx_ubicacion_video = new javax.swing.JComboBox();
        tbx_genero = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        cbx_tipo_video = new javax.swing.JComboBox();
        btn_modificar_video = new javax.swing.JButton();
        btn_actualizar_video = new javax.swing.JButton();
        btn_eliminar_video = new javax.swing.JButton();
        btn_regresar_video = new javax.swing.JButton();
        pnl_codigo1 = new javax.swing.JPanel();
        lbl_codigo_video = new javax.swing.JLabel();
        btn_buscar_video = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANTENIMIENTO BIBLIOTECA");
        setResizable(false);

        paneles.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        pnl_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        pnl_codigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        pnl_codigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_codigo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_codigo_libro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_codigo_libro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_codigo_libro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_codigo_libroPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnl_codigoLayout = new javax.swing.GroupLayout(pnl_codigo);
        pnl_codigo.setLayout(pnl_codigoLayout);
        pnl_codigoLayout.setHorizontalGroup(
            pnl_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_libro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_codigoLayout.setVerticalGroup(
            pnl_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_ISBN.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_ISBN.setText("ISBN:");

        tbx_isbn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_isbn.setEnabled(false);
        tbx_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_isbnKeyTyped(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_titulo.setText("Título:");

        tbx_titulo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_titulo_libro.setEnabled(false);
        tbx_titulo_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_titulo_libroKeyTyped(evt);
            }
        });

        lbl_autor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_autor.setText("Autor(es):");

        tbx_autor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_autor.setEnabled(false);
        tbx_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_autorKeyTyped(evt);
            }
        });

        cbx_editorial.setEditable(true);
        cbx_editorial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_editorial.setEnabled(false);

        lbl_editorial.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_editorial.setText("Editorial:");

        lbl_anio_edicion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_anio_edicion.setText("Año de Edición:");

        jyc_anio_libro.setEnabled(false);

        lbl_paginas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_paginas.setText("Número de Páginas:");

        spr_paginas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_paginas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_paginas.setEditor(new javax.swing.JSpinner.NumberEditor(spr_paginas, ""));
        spr_paginas.setEnabled(false);

        lbl_edicion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_edicion.setText("Número de Edición:");

        spr_edicion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_edicion.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_edicion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_edicion, ""));
        spr_edicion.setEnabled(false);

        lbl_pais.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_pais.setText("País:");

        cbx_pais_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_pais_libro.setEnabled(false);

        lbl_idioma.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_idioma.setText("Idioma:");

        cbx_idioma_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_idioma_libro.setEnabled(false);

        lbl_materia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_materia.setText("Materia:");

        tbx_materia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_materia.setEnabled(false);
        tbx_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_materiaKeyTyped(evt);
            }
        });

        lbl_ubicacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_ubicacion.setText("Ubicación:");

        cbx_ubicacion_libro.setEditable(true);
        cbx_ubicacion_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_ubicacion_libro.setEnabled(false);

        lbl_descripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_descripcion.setText("Descripción Física:");

        tbx_descripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_descripcion.setEnabled(false);
        tbx_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_descripcionKeyTyped(evt);
            }
        });

        btn_modificar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_modificar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32.png"))); // NOI18N
        btn_modificar_libro.setText("  MODIFICAR");
        btn_modificar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_libroActionPerformed(evt);
            }
        });

        btn_buscar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar_libro.setText("  BUSCAR CÓDIGO DE LIBRO");
        btn_buscar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_libroActionPerformed(evt);
            }
        });

        btn_actualizar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_actualizar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32.png"))); // NOI18N
        btn_actualizar_libro.setText("  ACTUALIZAR");
        btn_actualizar_libro.setEnabled(false);
        btn_actualizar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_libroActionPerformed(evt);
            }
        });

        btn_eliminar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_eliminar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32.png"))); // NOI18N
        btn_eliminar_libro.setText("  ELIMINAR");
        btn_eliminar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_libroActionPerformed(evt);
            }
        });

        btn_regresar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_regresar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32.png"))); // NOI18N
        btn_regresar_libro.setText("  REGRESAR");
        btn_regresar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar_libroActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setText("Tipo de Material:");

        cbx_tipo_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_tipo_libro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Libro", "Obra", "Tesis" }));
        cbx_tipo_libro.setEnabled(false);

        javax.swing.GroupLayout pnl_libroLayout = new javax.swing.GroupLayout(pnl_libro);
        pnl_libro.setLayout(pnl_libroLayout);
        pnl_libroLayout.setHorizontalGroup(
            pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_libroLayout.createSequentialGroup()
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_libroLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_tipo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_ubicacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_ubicacion_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_ISBN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_libroLayout.createSequentialGroup()
                                .addComponent(lbl_titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbx_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_autor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_libroLayout.createSequentialGroup()
                                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_libroLayout.createSequentialGroup()
                                        .addComponent(lbl_editorial)
                                        .addGap(4, 4, 4)
                                        .addComponent(cbx_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_anio_edicion)
                                        .addGap(4, 4, 4)
                                        .addComponent(jyc_anio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lbl_edicion)
                                        .addGap(4, 4, 4)
                                        .addComponent(spr_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_libroLayout.createSequentialGroup()
                                        .addComponent(lbl_pais)
                                        .addGap(4, 4, 4)
                                        .addComponent(cbx_pais_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_idioma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_idioma_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_materia)
                                        .addGap(4, 4, 4)
                                        .addComponent(tbx_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_libroLayout.createSequentialGroup()
                                        .addComponent(lbl_paginas)
                                        .addGap(4, 4, 4)
                                        .addComponent(spr_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_descripcion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tbx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_libroLayout.createSequentialGroup()
                                        .addComponent(pnl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_buscar_libro)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_modificar_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar_libro)))
                .addContainerGap())
        );
        pnl_libroLayout.setVerticalGroup(
            pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_libroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ISBN))
                        .addGap(13, 13, 13))
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_ubicacion_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_tipo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbx_titulo_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_titulo))
                    .addComponent(tbx_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_autor)))
                .addGap(11, 11, 11)
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jyc_anio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spr_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_editorial)
                            .addComponent(lbl_anio_edicion)
                            .addComponent(lbl_edicion))))
                .addGap(11, 11, 11)
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_pais_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_idioma_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pais)
                            .addComponent(lbl_idioma)
                            .addComponent(lbl_materia))))
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spr_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_libroLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_paginas)
                                    .addComponent(lbl_descripcion)))))
                    .addGroup(pnl_libroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_regresar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_modificar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_actualizar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_eliminar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        paneles.addTab(" LIBRO", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Literature-18.png")), pnl_libro); // NOI18N

        pnl_videocinta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel19.setText("Título:");

        tbx_titulo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_titulo_video.setEnabled(false);
        tbx_titulo_video.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_titulo_videoKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel20.setText("Director:");

        tbx_director.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_director.setEnabled(false);
        tbx_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_directorKeyTyped(evt);
            }
        });

        cbx_productora.setEditable(true);
        cbx_productora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_productora.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel21.setText("Productora:");

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel22.setText("Año:");

        jyc_anio_video.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel25.setText("Duración (min):");

        spr_duracion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_duracion.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spr_duracion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_duracion, ""));
        spr_duracion.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel26.setText("País:");

        cbx_pais_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_pais_video.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel27.setText("Idioma:");

        cbx_idioma_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_idioma_video.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel29.setText("Genero(s):");

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel30.setText("Sinopsis:");

        tbx_sinopsis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_sinopsis.setEnabled(false);
        tbx_sinopsis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_sinopsisKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel32.setText("Clasificación:");

        spr_clasificacion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        spr_clasificacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spr_clasificacion.setEditor(new javax.swing.JSpinner.NumberEditor(spr_clasificacion, ""));
        spr_clasificacion.setEnabled(false);

        cbx_subtitulos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_subtitulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        cbx_subtitulos.setEnabled(false);

        jLabel45.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel45.setText("Subtitulos:");

        jLabel46.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel46.setText("Ubicación:");

        cbx_ubicacion_video.setEditable(true);
        cbx_ubicacion_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_ubicacion_video.setEnabled(false);

        tbx_genero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_genero.setEnabled(false);
        tbx_genero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_generoKeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel47.setText("Tipo de Material:");

        cbx_tipo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_tipo_video.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Videocinta (VHS)", "DVD" }));
        cbx_tipo_video.setEnabled(false);

        btn_modificar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_modificar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32.png"))); // NOI18N
        btn_modificar_video.setText("  MODIFICAR");
        btn_modificar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_videoActionPerformed(evt);
            }
        });

        btn_actualizar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_actualizar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32.png"))); // NOI18N
        btn_actualizar_video.setText("  ACTUALIZAR");
        btn_actualizar_video.setEnabled(false);
        btn_actualizar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_videoActionPerformed(evt);
            }
        });

        btn_eliminar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_eliminar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32.png"))); // NOI18N
        btn_eliminar_video.setText("  ELIMINAR");
        btn_eliminar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_videoActionPerformed(evt);
            }
        });

        btn_regresar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_regresar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32.png"))); // NOI18N
        btn_regresar_video.setText("  REGRESAR");
        btn_regresar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar_videoActionPerformed(evt);
            }
        });

        pnl_codigo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        pnl_codigo1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_codigo_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_codigo_video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_codigo_video.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_codigo_video.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_codigo_videoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnl_codigo1Layout = new javax.swing.GroupLayout(pnl_codigo1);
        pnl_codigo1.setLayout(pnl_codigo1Layout);
        pnl_codigo1Layout.setHorizontalGroup(
            pnl_codigo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_video, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_codigo1Layout.setVerticalGroup(
            pnl_codigo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_codigo_video, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_buscar_video.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar_video.setText("  BUSCAR CÓDIGO DE VIDEO");
        btn_buscar_video.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_video.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_videoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_videocintaLayout = new javax.swing.GroupLayout(pnl_videocinta);
        pnl_videocinta.setLayout(pnl_videocintaLayout);
        pnl_videocintaLayout.setHorizontalGroup(
            pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_videocintaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
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
                    .addComponent(jSeparator2)
                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_videocintaLayout.createSequentialGroup()
                            .addComponent(btn_modificar_video)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_actualizar_video)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_eliminar_video)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_regresar_video))
                        .addGroup(pnl_videocintaLayout.createSequentialGroup()
                            .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbx_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbx_productora, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(4, 4, 4)
                                            .addComponent(tbx_titulo_video, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_videocintaLayout.createSequentialGroup()
                                            .addComponent(jLabel46)
                                            .addGap(4, 4, 4)
                                            .addComponent(cbx_ubicacion_video, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(4, 4, 4)
                                                .addComponent(jyc_anio_video, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spr_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tbx_director, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                            .addComponent(jLabel47)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbx_tipo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(pnl_videocintaLayout.createSequentialGroup()
                                    .addComponent(pnl_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_buscar_video)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_videocintaLayout.setVerticalGroup(
            pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_videocintaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(cbx_tipo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbx_ubicacion_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel46)))
                .addGap(13, 13, 13)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbx_titulo_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))))
                .addGap(11, 11, 11)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_productora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jyc_anio_video, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spr_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22))))
                .addGap(11, 11, 11)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_pais_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_idioma_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_subtitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spr_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(tbx_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_videocintaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel30))
                    .addComponent(tbx_sinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnl_videocintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_regresar_video, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paneles.addTab(" VIDEOCINTA (VHS) / DVD", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Movie-18.png")), pnl_videocinta); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneles, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneles, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON MODIFICAR VIDEO */
    private void btn_modificar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_videoActionPerformed
        String codigo = lbl_codigo_video.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            cbx_ubicacion_video.setEnabled(true);
            cbx_tipo_video.setEnabled(true);
            tbx_titulo_video.setEnabled(true);
            tbx_director.setEnabled(true);
            cbx_productora.setEnabled(true);
            jyc_anio_video.setEnabled(true);
            spr_duracion.setEnabled(true);
            cbx_pais_video.setEnabled(true);
            cbx_idioma_video.setEnabled(true);
            cbx_subtitulos.setEnabled(true);
            spr_clasificacion.setEnabled(true);
            tbx_genero.setEnabled(true);
            tbx_sinopsis.setEnabled(true);
            //-----------------------------------
            btn_buscar_video.setEnabled(false);
            btn_modificar_video.setEnabled(false);
            btn_actualizar_video.setEnabled(true);
            btn_eliminar_video.setEnabled(false);
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe buscar un código de video", "Buscar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificar_videoActionPerformed

    /* BOTON ACTUALIZAR VIDEO */
    private void btn_actualizar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_videoActionPerformed
        int id;
        if (tbx_titulo_video.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un título válido", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_director.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un director válido", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_productora = (JTextField) cbx_productora.getEditor().getEditorComponent();
        if (tbx_productora.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una productora válida.\nTambién puede seleccionar una opción.", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_productora.getText().length() >= 100){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una productora con menos carácteres.\nTambién puede seleccionar una opción.", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_ubicacion_video = (JTextField) cbx_ubicacion_video.getEditor().getEditorComponent();
        if(tbx_ubicacion_video.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación válida.\nFormato: STN001", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tbx_ubicacion_video.getText().length() != 6){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación con 6 carácteres.\nFormato: STN001", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            Video vd = new Video(); //crea un objeto de tipo video
            //agrega al objeto lo ingresado en los controles de la ventana
            vd.setCodigo(lbl_codigo_video.getText());
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
            DBAdmin.actualizarRegistroVideo(vd); //inserta los datos del video en la tabla
            JOptionPane.showMessageDialog(null,"La información del video ha sido actualizada con éxito.", "Actualizar Video",JOptionPane.INFORMATION_MESSAGE);
        }catch (ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar el video", "Ingresar Video",JOptionPane.ERROR_MESSAGE);
        }
        //habilita y deshabilita los elementos de la ventana
        cbx_ubicacion_video.setEnabled(false);
        cbx_tipo_video.setEnabled(false);
        tbx_titulo_video.setEnabled(false);
        tbx_director.setEnabled(false);
        cbx_productora.setEnabled(false);
        jyc_anio_video.setEnabled(false);
        spr_duracion.setEnabled(false);
        cbx_pais_video.setEnabled(false);
        cbx_idioma_video.setEnabled(false);
        cbx_subtitulos.setEnabled(false);
        spr_clasificacion.setEnabled(false);
        tbx_genero.setEnabled(false);
        tbx_sinopsis.setEnabled(false);
        //-----------------------------------
        btn_buscar_video.setEnabled(true);
        btn_modificar_video.setEnabled(true);
        btn_actualizar_video.setEnabled(false);
        btn_eliminar_video.setEnabled(true);
        limpiarVideos();
        btn_buscar_video.grabFocus(); //pone el focus en el boton buscar video
    }//GEN-LAST:event_btn_actualizar_videoActionPerformed

    /* BOTON ELIMINAR VIDEO */
    private void btn_eliminar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_videoActionPerformed
        String codigo = lbl_codigo_video.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            int res = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el video actual?", "Eliminar Video", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                DBAdmin.eliminarRegistroVideo(codigo); //ejecuta la eliminación
                JOptionPane.showMessageDialog(null,"El video ha sido eliminado con éxito.", "Eliminar Video",JOptionPane.INFORMATION_MESSAGE);
                limpiarVideos();
                btn_buscar_video.grabFocus(); //pone el focus en el boton buscar video
            }
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe buscar un código de video", "Buscar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_videoActionPerformed

    /* BOTON REGRESAR DESDE VIDEO */
    private void btn_regresar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar_videoActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresar_videoActionPerformed

    /* BOTON BUSCAR VIDEO */
    private void btn_buscar_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_videoActionPerformed
        new BuscarCodVideo(this).setVisible(true);
        this.setEnabled(false); //deshabilita la ventana
    }//GEN-LAST:event_btn_buscar_videoActionPerformed

    /* BOTON REGRESAR DESDE LIBRO */
    private void btn_regresar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar_libroActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresar_libroActionPerformed

    /* BOTON ELIMINAR LIBRO */
    private void btn_eliminar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_libroActionPerformed
        String codigo = lbl_codigo_libro.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            int res = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el libro actual?", "Eliminar Libro", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                DBAdmin.eliminarRegistroLibro(codigo); //ejecuta la eliminación
                JOptionPane.showMessageDialog(null,"El libro ha sido eliminado con éxito.", "Eliminar Libro",JOptionPane.INFORMATION_MESSAGE);
                limpiarLibros();
                btn_buscar_libro.grabFocus(); //pone el focus en el boton buscar
            }
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe buscar un código de libro", "Buscar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_libroActionPerformed

    /* BOTON ACTUALIZAR LIBRO */
    private void btn_actualizar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_libroActionPerformed
        int id;
        if (tbx_titulo_libro.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un titulo válido", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_autor.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un autor válido", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_editorial = (JTextField) cbx_editorial.getEditor().getEditorComponent();
        if (tbx_editorial.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un editorial válido.\nTambién puede seleccionar una opción.", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_editorial.getText().length() >= 100){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un editorial con menos carácteres.\nTambién puede seleccionar una opción.", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JTextField tbx_ubicacion = (JTextField) cbx_ubicacion_libro.getEditor().getEditorComponent();
        if(tbx_ubicacion.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación válida.\nFormato: STN001", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tbx_ubicacion.getText().length() != 6){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una ubicación con 6 carácteres.\nFormato: STN001", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            Libro lb = new Libro(); //crea un objeto de tipo Libro
            //agrega al objeto lo ingresado en los controles de la ventana
            lb.setCodigo(lbl_codigo_libro.getText());
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
            DBAdmin.actualizarRegistroLibro(lb); //actualiza los datos del libro en la tabla
            JOptionPane.showMessageDialog(null,"La información del libro ha sido actualizada con éxito.", "Actualizar Libro",JOptionPane.INFORMATION_MESSAGE);
        }catch (ClassNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar el libro", "Actualizar Libro",JOptionPane.ERROR_MESSAGE);
        }
        //habilita y deshabilita los elementos de la ventana
        tbx_titulo_libro.setEnabled(false);
        tbx_autor.setEnabled(false);
        cbx_editorial.setEnabled(false);
        tbx_isbn.setEnabled(false);
        jyc_anio_libro.setEnabled(false);
        spr_edicion.setEnabled(false);
        cbx_pais_libro.setEnabled(false);
        cbx_idioma_libro.setEnabled(false);
        tbx_materia.setEnabled(false);
        spr_paginas.setEnabled(false);
        cbx_ubicacion_libro.setEnabled(false);
        tbx_descripcion.setEnabled(false);
        cbx_tipo_libro.setEnabled(false);
        //-----------------------------------
        btn_buscar_libro.setEnabled(true);
        btn_modificar_libro.setEnabled(true);
        btn_actualizar_libro.setEnabled(false);
        btn_eliminar_libro.setEnabled(true);
        limpiarLibros();
        btn_buscar_libro.grabFocus(); //pone el focus en el boton buscar libro
    }//GEN-LAST:event_btn_actualizar_libroActionPerformed

    /* BOTON BUSCAR LIBRO */
    private void btn_buscar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_libroActionPerformed
        new BuscarCodLibro(this).setVisible(true);
        this.setEnabled(false); //deshabilita la ventana
    }//GEN-LAST:event_btn_buscar_libroActionPerformed

    /* BOTON MODIFICAR LIBRO */
    private void btn_modificar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_libroActionPerformed
        String codigo = lbl_codigo_libro.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            tbx_titulo_libro.setEnabled(true);
            tbx_autor.setEnabled(true);
            cbx_editorial.setEnabled(true);
            tbx_isbn.setEnabled(true);
            jyc_anio_libro.setEnabled(true);
            spr_edicion.setEnabled(true);
            cbx_pais_libro.setEnabled(true);
            cbx_idioma_libro.setEnabled(true);
            tbx_materia.setEnabled(true);
            spr_paginas.setEnabled(true);
            cbx_ubicacion_libro.setEnabled(true);
            tbx_descripcion.setEnabled(true);
            cbx_tipo_libro.setEnabled(true);
            //-----------------------------------
            btn_buscar_libro.setEnabled(false);
            btn_modificar_libro.setEnabled(false);
            btn_actualizar_libro.setEnabled(true);
            btn_eliminar_libro.setEnabled(false);
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe buscar un código de libro", "Buscar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificar_libroActionPerformed

    /* SI HAY UN CAMBIO EN LA PROPIEDAD TEXT DEL CODIGO LIBRO */
    private void lbl_codigo_libroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_codigo_libroPropertyChange
        String codigo = lbl_codigo_libro.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            Object[] datos = DBAdmin.obtenerRegistroLibro(codigo);
            tbx_titulo_libro.setText(datos[1].toString());
            tbx_autor.setText(datos[2].toString());
            cbx_editorial.setSelectedIndex(((int) datos[3])-1);
            tbx_isbn.setText(datos[4].toString());
            jyc_anio_libro.setYear(Integer.parseInt(datos[5].toString()));
            spr_edicion.setValue((int) datos[6]);
            cbx_pais_libro.setSelectedIndex(((int) datos[7])-1);
            cbx_idioma_libro.setSelectedIndex(((int) datos[8])-1);
            tbx_materia.setText(datos[9].toString());
            spr_paginas.setValue((int) datos[10]);
            cbx_ubicacion_libro.setSelectedItem(datos[11]);
            tbx_descripcion.setText(datos[12].toString());
            cbx_tipo_libro.setSelectedItem(datos[13]);
            //------------------------------------------------------------
            tbx_titulo_libro.setCaretPosition(0); //coloca el inicio el texto
            tbx_autor.setCaretPosition(0);
            tbx_materia.setCaretPosition(0);
            tbx_descripcion.setCaretPosition(0);
        }
    }//GEN-LAST:event_lbl_codigo_libroPropertyChange

    /* SI HAY UN CAMBIO EN LA PROPIEDAD TEXT DEL CODIGO VIDEO */
    private void lbl_codigo_videoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_codigo_videoPropertyChange
        String codigo = lbl_codigo_video.getText(); //obtiene el codigo
        if(!codigo.isEmpty()){ //si codigo no esta vacio
            Object[] datos = DBAdmin.obtenerRegistroVideo(codigo);
            tbx_titulo_video.setText(datos[1].toString());
            tbx_director.setText(datos[2].toString());
            cbx_productora.setSelectedIndex(((int) datos[3])-1);
            if(datos[4].toString().equals("VHS")){
                cbx_tipo_video.setSelectedIndex(0); //VHS
            }else{
                cbx_tipo_video.setSelectedIndex(1); //DVD
            }
            jyc_anio_video.setYear(Integer.parseInt(datos[5].toString()));
            spr_duracion.setValue((int) datos[6]);
            cbx_pais_video.setSelectedIndex(((int) datos[7])-1);
            cbx_idioma_video.setSelectedIndex(((int) datos[8])-1);
            cbx_subtitulos.setSelectedItem(datos[9]);
            spr_clasificacion.setValue((int) datos[10]);
            tbx_genero.setText(datos[11].toString());
            cbx_ubicacion_video.setSelectedItem(datos[12]);
            tbx_sinopsis.setText(datos[13].toString());
            //--------------------------------------------------------------
            tbx_titulo_video.setCaretPosition(0);
            tbx_director.setCaretPosition(0);
            tbx_genero.setCaretPosition(0);
            tbx_sinopsis.setCaretPosition(0);
        }
    }//GEN-LAST:event_lbl_codigo_videoPropertyChange

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
        tbx_isbn.setText("");
        tbx_titulo_libro.setText("");
        tbx_autor.setText("");
        spr_edicion.setValue(1);
        tbx_materia.setText("");
        spr_paginas.setValue(1);
        tbx_descripcion.setText("");
        cbx_tipo_libro.setSelectedIndex(0);
        lbl_codigo_libro.setText("");
    }
    
    /* METODO PARA LIMPIAR LOS CAMPOS DE VIDEOS */
    public void limpiarVideos(){
        Calendar c = Calendar.getInstance(); //Obtener el calendario actual
        jyc_anio_video.setYear(c.get(Calendar.YEAR)); //asigna el anio actual
        llenarComboBoxPais(); //llena el contenido de los combo box pais
        llenarComboBoxIdioma(); //llena el contenido de los combo box idioma
        llenarComboBoxUbicacion(); //llena el contenido del combo box ubicacion
        llenarComboBoxProductora(); //llena el contenido del combo box productora
        cbx_tipo_video.setSelectedIndex(0);
        tbx_titulo_video.setText("");
        tbx_director.setText("");
        spr_duracion.setValue(1);
        cbx_subtitulos.setSelectedIndex(0);
        spr_clasificacion.setValue(1);
        tbx_genero.setText("");
        tbx_sinopsis.setText("");
        lbl_codigo_video.setText("");
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_libro;
    private javax.swing.JButton btn_actualizar_video;
    private javax.swing.JButton btn_buscar_libro;
    private javax.swing.JButton btn_buscar_video;
    private javax.swing.JButton btn_eliminar_libro;
    private javax.swing.JButton btn_eliminar_video;
    private javax.swing.JButton btn_modificar_libro;
    private javax.swing.JButton btn_modificar_video;
    private javax.swing.JButton btn_regresar_libro;
    private javax.swing.JButton btn_regresar_video;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JYearChooser jyc_anio_libro;
    private com.toedter.calendar.JYearChooser jyc_anio_video;
    private javax.swing.JLabel lbl_ISBN;
    private javax.swing.JLabel lbl_anio_edicion;
    private javax.swing.JLabel lbl_autor;
    public static javax.swing.JLabel lbl_codigo_libro;
    public static javax.swing.JLabel lbl_codigo_video;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_edicion;
    private javax.swing.JLabel lbl_editorial;
    private javax.swing.JLabel lbl_idioma;
    private javax.swing.JLabel lbl_materia;
    private javax.swing.JLabel lbl_paginas;
    private javax.swing.JLabel lbl_pais;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_ubicacion;
    private javax.swing.JTabbedPane paneles;
    private javax.swing.JPanel pnl_codigo;
    private javax.swing.JPanel pnl_codigo1;
    private javax.swing.JPanel pnl_libro;
    private javax.swing.JPanel pnl_videocinta;
    private javax.swing.JSpinner spr_clasificacion;
    private javax.swing.JSpinner spr_duracion;
    private javax.swing.JSpinner spr_edicion;
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
