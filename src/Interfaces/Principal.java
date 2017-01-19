package Interfaces;

import Datos.DBAdmin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {

    public Principal() {
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

        lbl_titulo = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_imagen = new javax.swing.JLabel();
        pnl_admin = new javax.swing.JPanel();
        btn_mantenimiento = new javax.swing.JButton();
        btn_prestamo = new javax.swing.JButton();
        btn_devolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA BIBLIOTECA");
        setMinimumSize(new java.awt.Dimension(700, 448));
        setResizable(false);

        lbl_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo1.png"))); // NOI18N

        btn_consultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-64.png"))); // NOI18N
        btn_consultar.setText("<html><center>\nCONSULTAR</br>\nBIBLIOTECA\n</center></html>");
        btn_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_consultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-64-azul.png"))); // NOI18N
        btn_consultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-64-azul.png"))); // NOI18N
        btn_consultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown-32.png"))); // NOI18N
        btn_salir.setText("<html>\n<center>\nCERRAR</br>\nAPLICACIÓN\n</center>\n</html>");
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown-32-rojo.png"))); // NOI18N
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown-32-rojo.png"))); // NOI18N
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada2.png"))); // NOI18N

        pnl_admin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        btn_mantenimiento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrative Tools-32.png"))); // NOI18N
        btn_mantenimiento.setText("<html><center>\nMANTENIMIENTO</br>\nBIBLIOTECA\n</center></html>");
        btn_mantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mantenimiento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrative Tools-32-azul.png"))); // NOI18N
        btn_mantenimiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrative Tools-32-azul.png"))); // NOI18N
        btn_mantenimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantenimientoActionPerformed(evt);
            }
        });

        btn_prestamo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_prestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32.png"))); // NOI18N
        btn_prestamo.setText("<html><center> PRÉSTAMOS</br> DE LIBROS </center></html>");
        btn_prestamo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_prestamo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32-azul.png"))); // NOI18N
        btn_prestamo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return Book-32-azul.png"))); // NOI18N
        btn_prestamo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamoActionPerformed(evt);
            }
        });

        btn_devolucion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32.png"))); // NOI18N
        btn_devolucion.setText("<html><center>\nDEVOLUCIONES</br>\nDE LIBROS\n</center></html>");
        btn_devolucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_devolucion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32-azul.png"))); // NOI18N
        btn_devolucion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32-azul.png"))); // NOI18N
        btn_devolucion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_adminLayout = new javax.swing.GroupLayout(pnl_admin);
        pnl_admin.setLayout(pnl_adminLayout);
        pnl_adminLayout.setHorizontalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_adminLayout.setVerticalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adminLayout.createSequentialGroup()
                .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_devolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mantenimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_prestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_titulo)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_imagen)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(pnl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_consultar.getAccessibleContext().setAccessibleName("btn_consultar");
        btn_consultar.getAccessibleContext().setAccessibleDescription("");
        btn_salir.getAccessibleContext().setAccessibleName("<html><center>CERRAR</br>APLICACIÓN</center></html>");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        new Consultar().setVisible(true); //Abre la ventana consultar
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        System.exit(0); //salir del sistema
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantenimientoActionPerformed
        new Login(1).setVisible(true); //Abre la ventana login desde mantenimiento
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_mantenimientoActionPerformed

    private void btn_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamoActionPerformed
        new Login(2).setVisible(true); //Abre la ventana login desde prestamo
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_prestamoActionPerformed

    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        new Login(3).setVisible(true); //Abre la ventana login desde devolucion
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_devolucionActionPerformed

    /**
     * @param args the command line arguments
    /****************************************************************/
    /* FUNCIÓN PRINCIPAL */
    public static void main(String args[]) {
        //Cambiar apariencia al sistema operativo actual
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { 
            System.out.println(e.getMessage()); 
        } //Fin cambiar apariencia
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    /****************************************************************/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_mantenimiento;
    private javax.swing.JButton btn_prestamo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_admin;
    // End of variables declaration//GEN-END:variables
}
