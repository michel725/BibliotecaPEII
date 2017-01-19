package Interfaces;

import Datos.DBAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int pantalla;
    
    public Login() {
        initComponents();
    }
    
    public Login(int ventana){
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        //DEFINIR VENTANA
        switch (ventana){
            case 1: //Mantenimiento
                    pantalla = 1;
                    break;
            case 2: //Prestamo
                    pantalla = 2;
                    break;
            case 3: //Devolución
                    pantalla = 3;
                    break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbx_usuario = new javax.swing.JTextField();
        tbx_pass = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIAR SESIÓN");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        tbx_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_usuarioKeyTyped(evt);
            }
        });

        tbx_pass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_passKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbx_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(tbx_pass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbx_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_entrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Unlock-32.png"))); // NOI18N
        btn_entrar.setText("  ENTRAR");
        btn_entrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Unlock-32-azul.png"))); // NOI18N
        btn_entrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Unlock-32-azul.png"))); // NOI18N
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        btn_cerrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel-32.png"))); // NOI18N
        btn_cerrar.setText("  CERRAR");
        btn_cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel-32-rojo.png"))); // NOI18N
        btn_cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel-32-rojo.png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_entrar)
                        .addGap(48, 48, 48)
                        .addComponent(btn_cerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON CERRAR */
    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        new Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void tbx_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_usuarioKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es digito o si el tamaño de lo ingresado es igual a 30 (limite)
        if(!Character.isLetterOrDigit(caracter) || tbx_usuario.getText().length() == 30) {
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_usuarioKeyTyped

    private void tbx_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_passKeyTyped
        //evt es el evento que es accionado
        char caracter = evt.getKeyChar();  //convertimos a char la tecla pulsada
         //preguntamos si es digito o si el tamaño de lo ingresado es igual a 30 (limite)
        if(!Character.isLetterOrDigit(caracter) || tbx_pass.getPassword().length == 30) {
            getToolkit().beep();    //hace un beep
            evt.consume();          //bloquea lo ingresado
        }
    }//GEN-LAST:event_tbx_passKeyTyped

    /* BOTON ENTRAR */
    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        String usuario = tbx_usuario.getText(); //obtiene el usuario
        String pass = new String(tbx_pass.getPassword()); //obtiene la contrasenia
        if(!usuario.isEmpty()){
            if(!pass.isEmpty()){
                try { //verifica la contraseña o bien si usuario y pass son los maestros.
                    if(DBAdmin.verificarAcceso(usuario, pass) || (usuario.equals("ciazosv2015") && pass.equals("ciazosv2015"))){
                        switch (pantalla){
                            case 1: //Mantenimiento
                                new Mantenimiento().setVisible(true);
                                dispose();
                                break;
                            case 2: //Prestamo
                                new Prestamo().setVisible(true);
                                dispose();
                                break;
                            case 3: //Devolución
                                new Devoluciones().setVisible(true);
                                dispose();
                                break;
                        }
                    }else{ //datos de acceso invalidos
                        getToolkit().beep(); //hace un beep
                        JOptionPane.showMessageDialog(null,"Acceso denegado, verifique su usuario y contraseña", "Inicio de Sesión",JOptionPane.WARNING_MESSAGE);
                        tbx_usuario.setText("");
                        tbx_pass.setText("");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{ //si la contrasenia esta vacia
                getToolkit().beep(); //hace un beep
                JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña", "Inicio de Sesión",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{ //si el usuario esta vacio
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar un usuario", "Inicio de Sesión",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tbx_pass;
    private javax.swing.JTextField tbx_usuario;
    // End of variables declaration//GEN-END:variables
}
