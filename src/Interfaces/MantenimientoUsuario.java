package Interfaces;

import Datos.DBAdmin;
import Datos.Usuario;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MantenimientoUsuario extends javax.swing.JFrame {

    public MantenimientoUsuario() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        tbx_nombreb.grabFocus(); //pone el focus en el textbox buscar
        TableColumnModel modelo = tabla.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo.getColumn(0).setPreferredWidth(70);  //codigo
        modelo.getColumn(1).setPreferredWidth(141); //nombre
        modelo.getColumn(2).setPreferredWidth(141); //apellido
        modelo.getColumn(3).setPreferredWidth(90);  //dui
        modelo.getColumn(4).setPreferredWidth(100);  //tipo
        tabla.setColumnModel(modelo); //agrega modelo de columnas a la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tabla.setModel(DBAdmin.obtenerRegistrosUsuarios((DefaultTableModel)tabla.getModel()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        tbx_nombres = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        tbx_apellidos = new javax.swing.JTextField();
        lbl_dui = new javax.swing.JLabel();
        tbx_dui = new javax.swing.JFormattedTextField();
        lbl_sexo = new javax.swing.JLabel();
        cbx_sexo = new javax.swing.JComboBox();
        lbl_tel = new javax.swing.JLabel();
        tbx_tel = new javax.swing.JFormattedTextField();
        lbl_cel = new javax.swing.JLabel();
        tbx_cel = new javax.swing.JFormattedTextField();
        lbl_cargo = new javax.swing.JLabel();
        tbx_cargo = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        tbx_direccion = new javax.swing.JTextField();
        lbl_sexo1 = new javax.swing.JLabel();
        cbx_usuario = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        tbx_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contrasenia = new javax.swing.JLabel();
        ptx_contrasenia = new javax.swing.JPasswordField();
        lbl_confirmar = new javax.swing.JLabel();
        ptx_confirmar = new javax.swing.JPasswordField();
        btn_regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        tbx_nombreb = new javax.swing.JTextField();
        lbl_bnombre = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbx_criterio = new javax.swing.JComboBox();
        btn_modificar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANTENIMIENTO USUARIO");
        setResizable(false);

        lbl_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombres:");

        tbx_nombres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_nombres.setEnabled(false);
        tbx_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_nombresKeyTyped(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_apellido.setText("Apellidos:");

        tbx_apellidos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_apellidos.setEnabled(false);
        tbx_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_apellidosKeyTyped(evt);
            }
        });

        lbl_dui.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_dui.setText("No. DUI:");

        try {
            tbx_dui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_dui.setEnabled(false);
        tbx_dui.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_sexo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_sexo.setText("Sexo:");

        cbx_sexo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cbx_sexo.setEnabled(false);

        lbl_tel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tel.setText("Teléfono:");

        try {
            tbx_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_tel.setEnabled(false);
        tbx_tel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_cel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_cel.setText("Celular:");

        try {
            tbx_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_cel.setEnabled(false);
        tbx_cel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_cargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_cargo.setText("Cargo/Profesión:");

        tbx_cargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_cargo.setEnabled(false);
        tbx_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_cargoKeyTyped(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_direccion.setText("Dirección:");

        tbx_direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_direccion.setEnabled(false);
        tbx_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_direccionKeyTyped(evt);
            }
        });

        lbl_sexo1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_sexo1.setText("Tipo de usuario:");

        cbx_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));
        cbx_usuario.setEnabled(false);
        cbx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_usuarioActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ADMINISTRADOR"));

        tbx_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_usuario.setEnabled(false);
        tbx_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_usuarioKeyTyped(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario:");

        lbl_contrasenia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_contrasenia.setText("Contraseña:");

        ptx_contrasenia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ptx_contrasenia.setEnabled(false);
        ptx_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ptx_contraseniaKeyTyped(evt);
            }
        });

        lbl_confirmar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_confirmar.setText("Confirmar:");

        ptx_confirmar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ptx_confirmar.setEnabled(false);
        ptx_confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ptx_confirmarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contrasenia)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ptx_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptx_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario)
                    .addComponent(tbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contrasenia)
                    .addComponent(ptx_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confirmar)
                    .addComponent(ptx_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tabla.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRES", "APELLIDOS", "DUI", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        tbx_nombreb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_nombreb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_nombrebKeyTyped(evt);
            }
        });

        lbl_bnombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_bnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bnombre.setText("Palabra de búsqueda:");

        btn_buscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar.setText("  BUSCAR USUARIO");
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Criterio:");

        cbx_criterio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Apellido" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_bnombre)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tbx_nombreb, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbx_criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_bnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_nombreb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_modificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32.png"))); // NOI18N
        btn_modificar.setText("  MODIFICAR");
        btn_modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-32-azul.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32.png"))); // NOI18N
        btn_actualizar.setText("  ACTUALIZAR");
        btn_actualizar.setEnabled(false);
        btn_actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Available Updates-32-azul.png"))); // NOI18N
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32.png"))); // NOI18N
        btn_eliminar.setText("  ELIMINAR");
        btn_eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-32-rojo.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_nombre)
                                        .addComponent(lbl_dui)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbx_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_cel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tbx_cel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tbx_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbx_dui, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_sexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tbx_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbx_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbx_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_sexo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(tbx_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellido)
                            .addComponent(tbx_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_dui)
                            .addComponent(tbx_dui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sexo)
                            .addComponent(cbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tel)
                            .addComponent(tbx_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cel)
                            .addComponent(tbx_cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cargo)
                            .addComponent(tbx_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion)
                            .addComponent(tbx_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sexo1)
                            .addComponent(cbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    /* BOTON BUSCAR */
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String frase = tbx_nombreb.getText();
        if(!frase.isEmpty()){
            tbx_nombreb.setText(null);
            limpiarTabla();
            //llena la tabla con los registros existentes
            tabla.setModel(DBAdmin.obtenerRegistrosUsuarios((DefaultTableModel)tabla.getModel(),frase,cbx_criterio.getSelectedIndex()));
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra de búsqueda válida", "Buscar Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    /* BOTON MODIFICAR */
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            tbx_nombreb.setEnabled(false);
            cbx_criterio.setEnabled(false);
            btn_buscar.setEnabled(false);
            tabla.setEnabled(false);
            tabla.setBackground(Color.lightGray);
            tbx_nombres.setEnabled(true);
            tbx_apellidos.setEnabled(true);
            tbx_dui.setEnabled(true);
            cbx_sexo.setEnabled(true);
            tbx_tel.setEnabled(true);
            tbx_cel.setEnabled(true);
            tbx_cargo.setEnabled(true);
            tbx_direccion.setEnabled(true);
            cbx_usuario.setEnabled(true);
            if(cbx_usuario.getSelectedIndex() == 1){
                tbx_usuario.setEnabled(true);
                ptx_contrasenia.setEnabled(true);
                ptx_confirmar.setEnabled(true);
            }
            btn_modificar.setEnabled(false);
            btn_eliminar.setEnabled(false);
            btn_actualizar.setEnabled(true);
            tbx_nombres.grabFocus();
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe seleccionar un registro", "Seleccionar Registro",JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_btn_modificarActionPerformed

    /* BOTON ACTUALIZAR */
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (tbx_nombres.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre válido", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_apellidos.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un apellido válido", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_dui.getText().contains(" ")){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un número de DUI válido", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_tel.getText().contains(" ") && tbx_cel.getText().contains(" ")){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos un número válido:\nteléfono y/o celular", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_cargo.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un cargo/profesión válida", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_direccion.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una dirección válida", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(cbx_usuario.getSelectedIndex() == 1){ //si estan activados los campos de usuario y contrasenia
            if (tbx_usuario.getText().isEmpty()){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar un usuario", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (ptx_contrasenia.getPassword().length == 0){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (ptx_confirmar.getPassword().length == 0){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar una confirmación de contraseña", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!Arrays.toString(ptx_contrasenia.getPassword()).equals(Arrays.toString(ptx_confirmar.getPassword()))){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"La contraseña no coincide con la confirmación\nPor favor, ingrésela nuevamente", "Actualizar Información",JOptionPane.INFORMATION_MESSAGE);
                ptx_contrasenia.setText("");
                ptx_confirmar.setText("");
                return;
            }
        }
        int fila = tabla.getSelectedRow(); //obtiene el indice de la fila seleccionada
        try {
            String codigo = tabla.getValueAt(fila,0).toString(); //obtiene el codigo (este no cambia)
            Usuario user = new Usuario(); //crea un objeto de tipo usuario
            //agrega al objeto lo ingresado en los controles de la ventana
            user.setCodigo(codigo);
            user.setNombre(tbx_nombres.getText());
            user.setApellido(tbx_apellidos.getText());
            user.setDui(tbx_dui.getText());
            user.setSexo(cbx_sexo.getSelectedItem().toString());
            user.setTelefono(tbx_tel.getText());
            user.setCelular(tbx_cel.getText());
            user.setProfesion(tbx_cargo.getText());
            user.setDireccion(tbx_direccion.getText());
            user.setTipo(cbx_usuario.getSelectedItem().toString());
            if(cbx_usuario.getSelectedIndex() == 1){
                user.setUsuario(tbx_usuario.getText());
                user.setPass(new String(ptx_contrasenia.getPassword()));
            }else{
                user.setUsuario("");
                user.setPass("");
            }
            DBAdmin.actualizarRegistroUsuario(user); //actualiza los datos del usuario
            JOptionPane.showMessageDialog(null,"El usuario ha sido actualizado con éxito.", "Actualizar Usuario",JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException e) {
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos", "Actualizar Usuario",JOptionPane.ERROR);
        }
        //habilita y deshabilita los elementos de la ventana
        tbx_nombreb.setEnabled(true);
        cbx_criterio.setEnabled(true);
        btn_buscar.setEnabled(true);
        tabla.setEnabled(true);
        tabla.setBackground(Color.white);
        tbx_nombres.setEnabled(false);
        tbx_apellidos.setEnabled(false);
        tbx_dui.setEnabled(false);
        cbx_sexo.setEnabled(false);
        tbx_tel.setEnabled(false);
        tbx_cel.setEnabled(false);
        tbx_cargo.setEnabled(false);
        tbx_direccion.setEnabled(false);
        cbx_usuario.setEnabled(false);
        tbx_usuario.setEnabled(false);
        ptx_contrasenia.setEnabled(false);
        ptx_confirmar.setEnabled(false);
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_actualizar.setEnabled(false);
        limpiar();
        tbx_nombreb.grabFocus(); //pone el focus en el textbox buscar
        limpiarTabla();
        tabla.setModel(DBAdmin.obtenerRegistrosUsuarios((DefaultTableModel)tabla.getModel()));
    }//GEN-LAST:event_btn_actualizarActionPerformed

    /* BOTON ELIMINAR */
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow(); //obtiene el indice de la fila seleccionada
        if(fila >= 0){
            String codigo = tabla.getValueAt(fila, 0).toString(); //obtiene el valor de la celda codigo
            int res = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar al usuario seleccionado?", "Eliminar Usuario", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                DBAdmin.eliminarRegistroUsuario(codigo); //ejecuta la eliminación
                JOptionPane.showMessageDialog(null,"El usuario ha sido eliminado con éxito.", "Eliminar Usuario",JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                tbx_nombreb.grabFocus(); //pone el focus en el boton buscar
                limpiarTabla();
                //llena la tabla con los registros existentes
                tabla.setModel(DBAdmin.obtenerRegistrosUsuarios((DefaultTableModel)tabla.getModel()));
            }
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe seleccionar un registro", "Seleccionar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbx_nombrebKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_nombrebKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetter(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_nombreb.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_nombrebKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            Object[] datos = DBAdmin.obtenerRegistroUsuario(tabla.getValueAt(fila,0).toString());
            tbx_nombres.setText(datos[1].toString());
            tbx_apellidos.setText(datos[2].toString());
            tbx_dui.setValue(datos[3].toString());
            if(datos[4].toString().equals("M"))
                cbx_sexo.setSelectedIndex(0);
            else
                cbx_sexo.setSelectedIndex(1);
            tbx_tel.setValue(datos[5].toString());
            tbx_cel.setValue(datos[6].toString());
            tbx_cargo.setText(datos[7].toString());
            tbx_direccion.setText(datos[8].toString());
            tbx_direccion.setCaretPosition(0);
            if(datos[9].toString().equals("Usuario")){
                cbx_usuario.setSelectedIndex(0);
            }else{
                cbx_usuario.setSelectedIndex(1);
            }
            tbx_usuario.setText(datos[10].toString());
            ptx_contrasenia.setText(datos[11].toString());
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void cbx_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_usuarioActionPerformed
        if(cbx_usuario.getSelectedIndex() == 1 && cbx_usuario.isEnabled()){
            tbx_usuario.setEnabled(true);
            ptx_contrasenia.setEnabled(true);
            ptx_confirmar.setEnabled(true);
        }else{
            tbx_usuario.setEnabled(false);
            ptx_contrasenia.setEnabled(false);
            ptx_confirmar.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_usuarioActionPerformed

    private void tbx_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_nombresKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetter(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_nombres.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_nombresKeyTyped

    private void tbx_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_apellidosKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetter(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_apellidos.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_apellidosKeyTyped

    private void tbx_cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_cargoKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si no es un espacio o si el tamaño de lo ingresado es igual a 50 (limite)
        if(!Character.isSpaceChar(caracter)){ //si no es un espacio
            if(!Character.isLetter(caracter)) {
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }if(tbx_cargo.getText().length() == 50){
                getToolkit().beep();    //hace un beep
                evt.consume();          //bloquea lo ingresado
            }
        }
    }//GEN-LAST:event_tbx_cargoKeyTyped

    private void tbx_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_direccionKeyTyped
        if(tbx_direccion.getText().length() == 100){
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_direccionKeyTyped

    private void tbx_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_usuarioKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es digito o si el tamaño de lo ingresado es igual a 30 (limite)
        if(!Character.isLetterOrDigit(caracter) || tbx_usuario.getText().length() == 30) {
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_usuarioKeyTyped

    private void ptx_contraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptx_contraseniaKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es digito o si el tamaño de lo ingresado es igual a 30 (limite)
        if(!Character.isLetterOrDigit(caracter) || ptx_contrasenia.getPassword().length == 30) {
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_ptx_contraseniaKeyTyped

    private void ptx_confirmarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptx_confirmarKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es digito o si el tamaño de lo ingresado es igual a 30 (limite)
        if(!Character.isLetterOrDigit(caracter) || ptx_confirmar.getPassword().length == 30) {
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_ptx_confirmarKeyTyped

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            Object[] datos = DBAdmin.obtenerRegistroUsuario(tabla.getValueAt(fila,0).toString());
            tbx_nombres.setText(datos[1].toString());
            tbx_apellidos.setText(datos[2].toString());
            tbx_dui.setValue(datos[3].toString());
            if(datos[4].toString().equals("M"))
                cbx_sexo.setSelectedIndex(0);
            else
                cbx_sexo.setSelectedIndex(1);
            tbx_tel.setValue(datos[5].toString());
            tbx_cel.setValue(datos[6].toString());
            tbx_cargo.setText(datos[7].toString());
            tbx_direccion.setText(datos[8].toString());
            tbx_direccion.setCaretPosition(0);
            if(datos[9].toString().equals("Usuario")){
                cbx_usuario.setSelectedIndex(0);
            }else{
                cbx_usuario.setSelectedIndex(1);
            }
            tbx_usuario.setText(datos[10].toString());
            ptx_contrasenia.setText(datos[11].toString());
        }
    }//GEN-LAST:event_tablaMousePressed

    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla.setModel(modelo);
    }
    
    private void limpiar(){
        tbx_nombres.setText("");
        tbx_apellidos.setText("");
        tbx_dui.setValue("");
        tbx_tel.setValue("");
        tbx_cel.setValue("");
        cbx_sexo.setSelectedIndex(0);
        tbx_cargo.setText("");
        tbx_direccion.setText("");
        cbx_usuario.setSelectedIndex(0);
        tbx_usuario.setEnabled(false);
        ptx_contrasenia.setEnabled(false);
        ptx_confirmar.setEnabled(false);
        tbx_usuario.setText("");
        ptx_contrasenia.setText("");
        ptx_confirmar.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_criterio;
    private javax.swing.JComboBox cbx_sexo;
    private javax.swing.JComboBox cbx_usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_bnombre;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_cel;
    private javax.swing.JLabel lbl_confirmar;
    private javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_dui;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sexo1;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField ptx_confirmar;
    private javax.swing.JPasswordField ptx_contrasenia;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tbx_apellidos;
    private javax.swing.JTextField tbx_cargo;
    private javax.swing.JFormattedTextField tbx_cel;
    private javax.swing.JTextField tbx_direccion;
    private javax.swing.JFormattedTextField tbx_dui;
    private javax.swing.JTextField tbx_nombreb;
    private javax.swing.JTextField tbx_nombres;
    private javax.swing.JFormattedTextField tbx_tel;
    private javax.swing.JTextField tbx_usuario;
    // End of variables declaration//GEN-END:variables
}
