package Interfaces;

import Datos.DBAdmin;
import Datos.Prestamos;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Prestamo extends javax.swing.JFrame {

    public Prestamo() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        tbx_frase.grabFocus(); //pone el focus en el textbox buscar
        TableColumnModel modelo = tabla_libros.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo.getColumn(0).setPreferredWidth(70);  //codigo
        modelo.getColumn(1).setPreferredWidth(250); //titulo
        modelo.getColumn(2).setPreferredWidth(250); //autor
        modelo.getColumn(3).setPreferredWidth(60);  //estado
        tabla_libros.setColumnModel(modelo); //agrega modelo de columnas a la tabla
        tabla_libros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tabla_libros.setModel(DBAdmin.obtenerRegistrosLibro1((DefaultTableModel)tabla_libros.getModel()));
        //----------------------------------------------------------
        TableColumnModel modelo1 = tabla_usuarios.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo1.getColumn(0).setPreferredWidth(70);  //codigo
        modelo1.getColumn(1).setPreferredWidth(141); //nombre
        modelo1.getColumn(2).setPreferredWidth(141); //apellido
        modelo1.getColumn(3).setPreferredWidth(90);  //tipo
        tabla_usuarios.setColumnModel(modelo1); //agrega modelo de columnas a la tabla
        tabla_usuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tabla_usuarios.setModel(DBAdmin.obtenerRegistrosUsuarios1((DefaultTableModel)tabla_usuarios.getModel()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbx_frase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx_criterio_libro = new javax.swing.JComboBox();
        btn_buscar_libro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tbx_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_criterio_usuario = new javax.swing.JComboBox();
        btn_buscar_usuario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_prestamo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        dch_devolucion = new com.toedter.calendar.JDateChooser();
        btn_prestamo = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRÉSTAMO DE LIBROS");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda de Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tbx_frase.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_frase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_fraseKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Frase o palabra de búsqueda:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Criterio:");

        cbx_criterio_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio_libro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Autor", "Materia", "Código" }));

        btn_buscar_libro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar_libro.setText("BUSCAR");
        btn_buscar_libro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_libroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tbx_frase, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_criterio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_libro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_frase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_criterio_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados de Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tabla_libros.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TÍTULO", "AUTOR", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_libros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_libros.getTableHeader().setResizingAllowed(false);
        tabla_libros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_libros);
        if (tabla_libros.getColumnModel().getColumnCount() > 0) {
            tabla_libros.getColumnModel().getColumn(0).setResizable(false);
            tabla_libros.getColumnModel().getColumn(1).setResizable(false);
            tabla_libros.getColumnModel().getColumn(2).setResizable(false);
            tabla_libros.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tbx_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_nombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Nombre o apellido:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Criterio:");

        cbx_criterio_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Apellido" }));

        btn_buscar_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar_usuario.setText("BUSCAR");
        btn_buscar_usuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_usuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tbx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_criterio_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_usuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_criterio_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tabla_usuarios.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "APELLIDO", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_usuarios.getTableHeader().setResizingAllowed(false);
        tabla_usuarios.getTableHeader().setReorderingAllowed(false);
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_usuariosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_usuarios);
        if (tabla_usuarios.getColumnModel().getColumnCount() > 0) {
            tabla_usuarios.getColumnModel().getColumn(0).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(1).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(2).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Préstamos Activos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tabla_prestamo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabla_prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "CÓDIGO LIBRO", "FECHA PRÉSTAMO", "FECHA LÍMITE DE DEVOLUCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_prestamo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_prestamo.getTableHeader().setResizingAllowed(false);
        tabla_prestamo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabla_prestamo);
        if (tabla_prestamo.getColumnModel().getColumnCount() > 0) {
            tabla_prestamo.getColumnModel().getColumn(0).setResizable(false);
            tabla_prestamo.getColumnModel().getColumn(1).setResizable(false);
            tabla_prestamo.getColumnModel().getColumn(2).setResizable(false);
            tabla_prestamo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Fecha límite de devolución:");

        dch_devolucion.setDateFormatString("dd-MM-yyyy");
        dch_devolucion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btn_prestamo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_prestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32.png"))); // NOI18N
        btn_prestamo.setText(" PRÉSTAMO");
        btn_prestamo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32-azul.png"))); // NOI18N
        btn_prestamo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32-azul.png"))); // NOI18N
        btn_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamoActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(dch_devolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_prestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dch_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Principal().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    /* BOTON BUSCAR LIBRO */
    private void btn_buscar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_libroActionPerformed
        String frase = tbx_frase.getText();
        if(!frase.isEmpty()){
            tbx_frase.setText(null);
            limpiarTablaLibros();
            //llena la tabla con los registros existentes
            tabla_libros.setModel(DBAdmin.obtenerRegistrosLibro1((DefaultTableModel)tabla_libros.getModel(),frase,cbx_criterio_libro.getSelectedIndex()));
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra o frase válida", "Buscar Registro Libro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_libroActionPerformed

    private void tbx_fraseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_fraseKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetterOrDigit(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_frase.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_fraseKeyTyped

    private void tbx_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_nombreKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetter(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_nombre.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_nombreKeyTyped

    /* BOTON BUSCAR USUARIO */
    private void btn_buscar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_usuarioActionPerformed
        String frase = tbx_nombre.getText();
        if(!frase.isEmpty()){
            tbx_nombre.setText(null);
            limpiarTablaUsuarios();
            //llena la tabla con los registros existentes
            tabla_usuarios.setModel(DBAdmin.obtenerRegistrosUsuarios1((DefaultTableModel)tabla_usuarios.getModel(),frase,cbx_criterio_usuario.getSelectedIndex()));
            limpiarTablaPrestamo();
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra de búsqueda válida", "Buscar Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_usuarioActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        int fila = tabla_usuarios.getSelectedRow();
        if(fila >= 0){
            limpiarTablaPrestamo();
            //llena la tabla con los registros existentes
            tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila,0).toString()));
        }
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    /* BOTON PRESTAMO */
    private void btn_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamoActionPerformed
        int fila_libro = tabla_libros.getSelectedRow();
        int fila_usuario = tabla_usuarios.getSelectedRow();
        if(fila_libro >= 0){
            if(tabla_libros.getValueAt(fila_libro,3).toString().equals("prestado")){
                getToolkit().beep(); //hace un beep
                JOptionPane.showMessageDialog(null,"El libro seleccionado se encuentra prestado\nPor favor elija otro libro con un estado activo", "Seleccionar Libro",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(fila_usuario >= 0){
                if(dch_devolucion.getDate() == null){
                    getToolkit().beep(); //hace un beep
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una fecha de devolución", "Seleccionar Fecha",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(dch_devolucion.getDate().before(new Date())){
                    getToolkit().beep(); //hace un beep
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una fecha posterior a la fecha actual", "Seleccionar Fecha",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }else{ //si todo esta ok, para ingresar el registro
                    SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd"); //crea el formato
                    String fechaD = Formato.format(dch_devolucion.getDate()); //obtiene la fecha con formato
                    //Obtener fecha actual
                    Calendar c = Calendar.getInstance();
                    int annio = c.get(Calendar.YEAR);
                    int mes = c.get(Calendar.MONTH);
                    int dia = c.get(Calendar.DAY_OF_MONTH);
                    //Formato de fecha
                    String fechaA = "" + annio + "-" + (mes + 1) + "-" + dia;
                    Prestamos p = new Prestamos();
                    p.setCodigoLibro(tabla_libros.getValueAt(fila_libro,0).toString());
                    p.setCodigoUsuario(tabla_usuarios.getValueAt(fila_usuario,0).toString());
                    p.setFechaPrestamo(fechaA);
                    p.setFechaDevolucion(fechaD);
                    try {
                        DBAdmin.insertarPrestamo(p);
                        JOptionPane.showMessageDialog(null,"El préstamo ha sido registrado con éxito","Ingresar Prestamo",JOptionPane.INFORMATION_MESSAGE);
                        limpiarTablaPrestamo();
                        tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila_usuario,0).toString()));
                        tabla_prestamo.clearSelection();
                        limpiarTablaLibros();
                        tabla_libros.setModel(DBAdmin.obtenerRegistrosLibro1((DefaultTableModel)tabla_libros.getModel()));
                        tabla_libros.clearSelection();
                        limpiarTablaUsuarios();
                        tabla_usuarios.setModel(DBAdmin.obtenerRegistrosUsuarios1((DefaultTableModel)tabla_usuarios.getModel()));
                        tabla_usuarios.clearSelection();
                        dch_devolucion.setDate(null);
                        cbx_criterio_libro.setSelectedIndex(0);
                        cbx_criterio_usuario.setSelectedIndex(0);
                    } catch (ParseException | ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Prestamo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                getToolkit().beep(); //hace un beep
                JOptionPane.showMessageDialog(null,"Debe seleccionar un usuario", "Seleccionar Usuario",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe seleccionar un libro", "Seleccionar Libro",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btn_prestamoActionPerformed

    private void tabla_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMousePressed
        int fila = tabla_usuarios.getSelectedRow();
        if(fila >= 0){
            limpiarTablaPrestamo();
            //llena la tabla con los registros existentes
            tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila,0).toString()));
        }
    }//GEN-LAST:event_tabla_usuariosMousePressed

    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTablaLibros(){
        DefaultTableModel modelo = (DefaultTableModel)tabla_libros.getModel();
        for (int i = 0; i < tabla_libros.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla_libros.setModel(modelo);
    }
    
    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTablaUsuarios(){
        DefaultTableModel modelo = (DefaultTableModel)tabla_usuarios.getModel();
        for (int i = 0; i < tabla_usuarios.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla_usuarios.setModel(modelo);
    }
    
    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTablaPrestamo(){
        DefaultTableModel modelo = (DefaultTableModel)tabla_prestamo.getModel();
        for (int i = 0; i < tabla_prestamo.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla_prestamo.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_libro;
    private javax.swing.JButton btn_buscar_usuario;
    private javax.swing.JButton btn_prestamo;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_criterio_libro;
    private javax.swing.JComboBox cbx_criterio_usuario;
    private com.toedter.calendar.JDateChooser dch_devolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_libros;
    private javax.swing.JTable tabla_prestamo;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField tbx_frase;
    private javax.swing.JTextField tbx_nombre;
    // End of variables declaration//GEN-END:variables
}
