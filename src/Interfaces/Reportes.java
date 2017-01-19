package Interfaces;

import Datos.DBAdmin;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes extends javax.swing.JFrame {
    boolean activar = false; //true = package, false = carpeta Reportes

    public Reportes() {
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

        jPanel1 = new javax.swing.JPanel();
        cbx_reporte = new javax.swing.JComboBox();
        btn_regresar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPORTES");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        cbx_reporte.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_reporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Libros Registrados", "Videos (VHS/DVD) Registrados", "Usuarios del Sistema", "Prestamos Activos de Libros" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_reporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btn_mostrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bill-32.png"))); // NOI18N
        btn_mostrar.setText("  MOSTRAR");
        btn_mostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bill-32-azul.png"))); // NOI18N
        btn_mostrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bill-32-azul.png"))); // NOI18N
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_regresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Mantenimiento().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        String archivo;
        switch (cbx_reporte.getSelectedIndex()) { //obtiene la prueba seleccionada
                case 0: //Libros Registrados
                        try{
                            if(activar){
                                archivo = getClass().getResource("/Reportes/LibrosRegistrados.jasper").getPath();
                            }else{
                                archivo = "/Reportes/LibrosRegistrados.jasper";
                            } //activar para compilacion final
                            //quitamos el primer caracter que es una "/" para obtener la ruta.
                            archivo = archivo.substring(1,archivo.length());
                            //creamos el objeto reporte con el archivo, los parametros y la conexion
                            JasperPrint reporte = JasperFillManager.fillReport(archivo,new HashMap(),DBAdmin.conexion());
                            //creamos el visor (ventana para visualizar el reporte)
                            JasperViewer visor = new JasperViewer(reporte,false); //false para dispose
                            visor.setExtendedState(JasperViewer.MAXIMIZED_BOTH);//Coloca el visor maximizado
                            visor.setTitle("Libros Registrados"); //titulo de la ventana del reporte
                            visor.setVisible(true); //hacer visible la ventana
                        } catch (JRException | ClassNotFoundException | SQLException ex) {
                            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                case 1: //Videos (VHS/DVD) Registrados
                        try{
                            if(activar){
                                archivo = getClass().getResource("/Reportes/VideosRegistrados.jasper").getPath();
                            }else{
                                archivo = "/Reportes/VideosRegistrados.jasper";
                            } //activar para compilacion final
                            //quitamos el primer caracter que es una "/" para obtener la ruta.
                            archivo = archivo.substring(1,archivo.length());
                            //creamos el objeto reporte con el archivo, los parametros y la conexion
                            JasperPrint reporte = JasperFillManager.fillReport(archivo,new HashMap(),DBAdmin.conexion());
                            //creamos el visor (ventana para visualizar el reporte)
                            JasperViewer visor = new JasperViewer(reporte,false); //false para dispose
                            visor.setExtendedState(JasperViewer.MAXIMIZED_BOTH);//Coloca el visor maximizado
                            visor.setTitle("Videos (VHS/DVD) Registrados"); //titulo de la ventana del reporte
                            visor.setVisible(true); //hacer visible la ventana
                        } catch (JRException | ClassNotFoundException | SQLException ex) {
                            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                case 2: //Usuarios del Sistema
                        try{
                            if(activar){
                                archivo = getClass().getResource("/Reportes/UsuariosSistema.jasper").getPath();
                            }else{
                                archivo = "/Reportes/UsuariosSistema.jasper";
                            } //activar para compilacion final
                            //quitamos el primer caracter que es una "/" para obtener la ruta.
                            archivo = archivo.substring(1,archivo.length());
                            //creamos el objeto reporte con el archivo, los parametros y la conexion
                            JasperPrint reporte = JasperFillManager.fillReport(archivo,new HashMap(),DBAdmin.conexion());
                            //creamos el visor (ventana para visualizar el reporte)
                            JasperViewer visor = new JasperViewer(reporte,false); //false para dispose
                            visor.setExtendedState(JasperViewer.MAXIMIZED_BOTH);//Coloca el visor maximizado
                            visor.setTitle("Usuarios del Sistema"); //titulo de la ventana del reporte
                            visor.setVisible(true); //hacer visible la ventana
                        } catch (JRException | ClassNotFoundException | SQLException ex) {
                            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                case 3: //Prestamos Activos de Libros
                        try{
                            if(activar){
                                archivo = getClass().getResource("/Reportes/PrestamosLibros.jasper").getPath();
                            }else{
                                archivo = "/Reportes/PrestamosLibros.jasper";
                            } //activar para compilacion final
                            //quitamos el primer caracter que es una "/" para obtener la ruta.
                            archivo = archivo.substring(1,archivo.length());
                            //creamos el objeto reporte con el archivo, los parametros y la conexion
                            JasperPrint reporte = JasperFillManager.fillReport(archivo,new HashMap(),DBAdmin.conexion());
                            //creamos el visor (ventana para visualizar el reporte)
                            JasperViewer visor = new JasperViewer(reporte,false); //false para dispose
                            visor.setExtendedState(JasperViewer.MAXIMIZED_BOTH);//Coloca el visor maximizado
                            visor.setTitle("Préstamos Activos de Libros"); //titulo de la ventana del reporte
                            visor.setVisible(true); //hacer visible la ventana
                        } catch (JRException | ClassNotFoundException | SQLException ex) {
                            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_reporte;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
