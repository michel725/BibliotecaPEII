package Interfaces;

import Propiedades.Propiedad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Mantenimiento extends javax.swing.JFrame {

    JFileChooser chooser = new JFileChooser();
    
    public Mantenimiento() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregarbb = new javax.swing.JButton();
        btn_mantenbb = new javax.swing.JButton();
        btn_crear_usuario = new javax.swing.JButton();
        btn_manten_usuario = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        btn_ayuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        btn_copia_seguridad = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANTENIMIENTO BIBLIOTECA");
        setResizable(false);

        btn_agregarbb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_agregarbb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book-64.png"))); // NOI18N
        btn_agregarbb.setText("<html><center>AGREGAR A</br> BIBLIOTECA</center></html>");
        btn_agregarbb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregarbb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book-64-azul.png"))); // NOI18N
        btn_agregarbb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book-64-azul.png"))); // NOI18N
        btn_agregarbb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agregarbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarbbActionPerformed(evt);
            }
        });

        btn_mantenbb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_mantenbb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book Stack-64.png"))); // NOI18N
        btn_mantenbb.setText("<html><center>\nMANTENIMIENTO</br>\nBIBLIOTECA\n</center></html>");
        btn_mantenbb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mantenbb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book Stack-64-azul.png"))); // NOI18N
        btn_mantenbb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Book Stack-64-azul.png"))); // NOI18N
        btn_mantenbb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mantenbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantenbbActionPerformed(evt);
            }
        });

        btn_crear_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_crear_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add User-64.png"))); // NOI18N
        btn_crear_usuario.setText("<html><center>\nCREAR NUEVO</br>\nUSUARIO\n</center></html>");
        btn_crear_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_crear_usuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add User-64-azul.png"))); // NOI18N
        btn_crear_usuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add User-64-azul.png"))); // NOI18N
        btn_crear_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuarioActionPerformed(evt);
            }
        });

        btn_manten_usuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_manten_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit User-64.png"))); // NOI18N
        btn_manten_usuario.setText("<html><center>\nMANTENIMIENTO</br>\nUSUARIO\n</center></html>");
        btn_manten_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_manten_usuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit User-64-azul.png"))); // NOI18N
        btn_manten_usuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit User-64-azul.png"))); // NOI18N
        btn_manten_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_manten_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manten_usuarioActionPerformed(evt);
            }
        });

        btn_reportes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purchase Order-64.png"))); // NOI18N
        btn_reportes.setText("<html><center>\nGENERAR</br>\nREPORTES\n</center></html>");
        btn_reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purchase Order-64-azul.png"))); // NOI18N
        btn_reportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Purchase Order-64-azul.png"))); // NOI18N
        btn_reportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_ayuda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help-64.png"))); // NOI18N
        btn_ayuda.setText("<html><center>\nINFORMACIÓN &</br>\nAYUDA\n</center></html>");
        btn_ayuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ayuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help-64-azul.png"))); // NOI18N
        btn_ayuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help-64-azul.png"))); // NOI18N
        btn_ayuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayudaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo2.png"))); // NOI18N

        btn_regresar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32.png"))); // NOI18N
        btn_regresar.setText(" REGRESAR\n");
        btn_regresar.setActionCommand("REGRESAR\n");
        btn_regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Left Circular-32-azul.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_copia_seguridad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_copia_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Data Backup-64.png"))); // NOI18N
        btn_copia_seguridad.setText("<html><center> COPIA DE </br> SEGURIDAD </center></html>");
        btn_copia_seguridad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_copia_seguridad.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Data Backup-64-azul.png"))); // NOI18N
        btn_copia_seguridad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Data Backup-64-azul.png"))); // NOI18N
        btn_copia_seguridad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_copia_seguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copia_seguridadActionPerformed(evt);
            }
        });

        btn_cerrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel-32.png"))); // NOI18N
        btn_cerrar.setText("  CERRAR\n");
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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_copia_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregarbb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mantenbb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manten_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_manten_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mantenbb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarbb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_copia_seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
        System.exit(0); //salir del sistema
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Principal().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_agregarbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarbbActionPerformed
        new AgregarBB().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_agregarbbActionPerformed

    private void btn_mantenbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantenbbActionPerformed
        new MantenimientoBB().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_mantenbbActionPerformed

    private void btn_crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuarioActionPerformed
        new AgregarUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_usuarioActionPerformed

    private void btn_manten_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manten_usuarioActionPerformed
        new MantenimientoUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_manten_usuarioActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        new Reportes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayudaActionPerformed
        new Ayuda().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ayudaActionPerformed

    private void btn_copia_seguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copia_seguridadActionPerformed
        crearBackupDB("biblioteca");
    }//GEN-LAST:event_btn_copia_seguridadActionPerformed

    /* METODO PARA CREAR UNA COPIA DE SEGURIDAD DE LA BASE DE DATOS DADO EL NOMBRE DE LA DB */
    private void crearBackupDB(String db){
        Properties prop = Propiedad.getProp();
        int resp;
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH)+1);
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
        //se muestra la ventana donde se elige el lugar donde se guarda el backup
        resp = chooser.showSaveDialog(this);
        if(resp == JFileChooser.APPROVE_OPTION){
            try{
                Runtime rt = Runtime.getRuntime();
                File archivo = new File(String.valueOf(chooser.getSelectedFile().toString())+"_"+fecha+".sql");
                InputStreamReader isr;
                BufferedReader br;
                try (FileWriter fw = new FileWriter(archivo)) {
                    //pongo el archivo C:\Program Files\MySQL\MySQL Server 5.6\bin\mysqldump.exe en la direccion
                    //donde se ejecuta mi programa llamando a System.getProperty("user.dir")
                    Process child = rt.exec(System.getProperty("user.dir")+"\\mysqldump --opt --password="+
                            prop.getProperty("dbPass")+" --user="+prop.getProperty("dbUser")+" --databases "+db+" -R");
                    isr = new InputStreamReader(child.getInputStream());
                    br = new BufferedReader(isr);
                    String line;
                    while((line = br.readLine()) != null){
                        fw.write(line + "\n");
                    }
                }
                isr.close();
                br.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al generar el archivo Backup", "Copia de Seguridad",JOptionPane.INFORMATION_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Copia de Seguridad Exitosa", "Copia de Seguridad",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarbb;
    private javax.swing.JButton btn_ayuda;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_copia_seguridad;
    private javax.swing.JButton btn_crear_usuario;
    private javax.swing.JButton btn_manten_usuario;
    private javax.swing.JButton btn_mantenbb;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
