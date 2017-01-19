package Interfaces;

import Datos.DBAdmin;
import Datos.Usuario;
import static Interfaces.AgregarBB.crearCodigo;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarUsuario extends javax.swing.JFrame {
    String codigoUsuario;
    int correlativoCodUsuario;
    
    public AgregarUsuario() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        try {
            //obtiene el codigo del usuario a ingresar
            correlativoCodUsuario = DBAdmin.obtenerCorrelativo("usuario");
            codigoUsuario = crearCodigo("U",correlativoCodUsuario + 1);
        } catch (ParseException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        tbx_nombres = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        tbx_apellidos = new javax.swing.JTextField();
        lbl_dui = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        tbx_tel = new javax.swing.JFormattedTextField();
        lbl_cel = new javax.swing.JLabel();
        tbx_cel = new javax.swing.JFormattedTextField();
        tbx_dui = new javax.swing.JFormattedTextField();
        lbl_sexo = new javax.swing.JLabel();
        cbx_sexo = new javax.swing.JComboBox();
        lbl_cargo = new javax.swing.JLabel();
        tbx_cargo = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        tbx_direccion = new javax.swing.JTextField();
        lbl_sexo1 = new javax.swing.JLabel();
        cbx_usuario = new javax.swing.JComboBox();
        btn_agregar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tbx_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contrasenia = new javax.swing.JLabel();
        ptx_contrasenia = new javax.swing.JPasswordField();
        lbl_confirmar = new javax.swing.JLabel();
        ptx_confirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR USUARIO");
        setResizable(false);

        lbl_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombres:");

        tbx_nombres.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_nombresKeyTyped(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_apellido.setText("Apellidos:");

        tbx_apellidos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_apellidosKeyTyped(evt);
            }
        });

        lbl_dui.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_dui.setText("No. DUI:");

        lbl_tel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_tel.setText("Teléfono:");

        try {
            tbx_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_tel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_cel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_cel.setText("Celular:");

        try {
            tbx_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_cel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        try {
            tbx_dui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tbx_dui.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lbl_sexo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_sexo.setText("Sexo:");

        cbx_sexo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        lbl_cargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_cargo.setText("Cargo/Profesión:");

        tbx_cargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_cargoKeyTyped(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_direccion.setText("Dirección:");

        tbx_direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_direccionKeyTyped(evt);
            }
        });

        lbl_sexo1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_sexo1.setText("Tipo de usuario:");

        cbx_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));
        cbx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_usuarioActionPerformed(evt);
            }
        });

        btn_agregar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32.png"))); // NOI18N
        btn_agregar.setText("  GUARDAR");
        btn_agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-32-azul.png"))); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
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
                    .addComponent(tbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptx_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar)
                        .addGap(19, 19, 19)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
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
                            .addComponent(cbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON GUARDAR */
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (tbx_nombres.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre válido", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_apellidos.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un apellido válido", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_dui.getText().contains(" ")){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un número de DUI válido", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_tel.getText().contains(" ") && tbx_cel.getText().contains(" ")){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos un número válido:\nteléfono y/o celular", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_cargo.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un cargo/profesión válida", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tbx_direccion.getText().isEmpty()){
            getToolkit().beep();    //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una dirección válida", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(cbx_usuario.getSelectedIndex() == 1){ //si estan activados los campos de usuario y contrasenia
            if (tbx_usuario.getText().isEmpty()){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar un usuario", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (ptx_contrasenia.getPassword().length == 0){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (ptx_confirmar.getPassword().length == 0){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar una confirmación de contraseña", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!Arrays.toString(ptx_contrasenia.getPassword()).equals(Arrays.toString(ptx_confirmar.getPassword()))){
                getToolkit().beep();    //hace un beep
                JOptionPane.showMessageDialog(null,"La contraseña no coincide con la confirmación\nPor favor, ingrésela nuevamente", "Ingresar Información",JOptionPane.INFORMATION_MESSAGE);
                ptx_contrasenia.setText("");
                ptx_confirmar.setText("");
                return;
            }
        }
        try {
            Usuario user = new Usuario(); //crea un objeto de tipo usuario
            //agrega al objeto lo ingresado en los controles de la ventana
            user.setCodigo(codigoUsuario);
            user.setNombre(tbx_nombres.getText());
            user.setApellido(tbx_apellidos.getText());
            user.setDui(tbx_dui.getText());
            user.setSexo(cbx_sexo.getSelectedItem().toString());
            user.setTelefono(tbx_tel.getText());
            user.setCelular(tbx_cel.getText());
            user.setProfesion(tbx_cargo.getText());
            user.setDireccion(tbx_direccion.getText());
            user.setTipo(cbx_usuario.getSelectedItem().toString());
            user.setUsuario(tbx_usuario.getText());
            user.setPass(new String(ptx_contrasenia.getPassword()));
            DBAdmin.insertarUsuario(user); //inserta los datos del usuario en la tabla
            //obtiene el codigo del usuario a ingresar
            correlativoCodUsuario = DBAdmin.obtenerCorrelativo("usuario");
            codigoUsuario = crearCodigo("U",correlativoCodUsuario + 1);
            JOptionPane.showMessageDialog(null,"El usuario ha sido ingresado con éxito.", "Ingresar Usuario",JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error al ingresar el usuario", "Ingresar Usuario",JOptionPane.ERROR);
        } catch (ParseException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    /* ACTIVA Y DESACTIVA EL INGRESO DE UN USUARIO Y CONTRASENIA */
    private void cbx_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_usuarioActionPerformed
        if(cbx_usuario.getSelectedIndex() == 1){
            tbx_usuario.setEnabled(true);
            ptx_contrasenia.setEnabled(true);
            ptx_confirmar.setEnabled(true);
        }else{
            tbx_usuario.setEnabled(false);
            ptx_contrasenia.setEnabled(false);
            ptx_confirmar.setEnabled(false);
            tbx_usuario.setText("");
            ptx_contrasenia.setText("");
            ptx_confirmar.setText("");
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
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_sexo;
    private javax.swing.JComboBox cbx_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellido;
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
    private javax.swing.JTextField tbx_apellidos;
    private javax.swing.JTextField tbx_cargo;
    private javax.swing.JFormattedTextField tbx_cel;
    private javax.swing.JTextField tbx_direccion;
    private javax.swing.JFormattedTextField tbx_dui;
    private javax.swing.JTextField tbx_nombres;
    private javax.swing.JFormattedTextField tbx_tel;
    private javax.swing.JTextField tbx_usuario;
    // End of variables declaration//GEN-END:variables
}
