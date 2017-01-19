package Interfaces;

import Datos.DBAdmin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Devoluciones extends javax.swing.JFrame {

    public Devoluciones() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        TableColumnModel modelo = tabla_prestamo.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo.getColumn(0).setPreferredWidth(150);  //usuario
        modelo.getColumn(1).setPreferredWidth(150); //codigo libro
        modelo.getColumn(2).setPreferredWidth(150); //fecha prestamo
        modelo.getColumn(3).setPreferredWidth(170);  //fecha devolucion
        tabla_prestamo.setColumnModel(modelo); //agrega modelo de columnas a la tabla
        tabla_prestamo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //----------------------------------------------------------------------------------
        TableColumnModel modelo1 = tabla_usuarios.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo1.getColumn(0).setPreferredWidth(70);  //codigo
        modelo1.getColumn(1).setPreferredWidth(141); //nombre
        modelo1.getColumn(2).setPreferredWidth(141); //apellido
        modelo1.getColumn(3).setPreferredWidth(100);  //tipo
        tabla_usuarios.setColumnModel(modelo1); //agrega modelo de columnas a la tabla
        tabla_usuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tabla_usuarios.setModel(DBAdmin.obtenerRegistrosUsuarios1((DefaultTableModel)tabla_usuarios.getModel()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_devolucion = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEVOLUCIONES");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tbx_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_nombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Nombre o apellido del usuario:");

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tbx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_criterio_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_usuario)
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_devolucion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32.png"))); // NOI18N
        btn_devolucion.setText(" DEVOLUCIÓN");
        btn_devolucion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32-azul.png"))); // NOI18N
        btn_devolucion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrow Book-32-azul.png"))); // NOI18N
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_devolucion)
                            .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Principal().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        int fila = tabla_usuarios.getSelectedRow();
        if(fila >= 0){
            limpiarTablaPrestamo();
            //llena la tabla con los registros existentes
            tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila,0).toString()));
        }
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void tabla_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMousePressed
        int fila = tabla_usuarios.getSelectedRow();
        if(fila >= 0){
            limpiarTablaPrestamo();
            //llena la tabla con los registros existentes
            tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila,0).toString()));
        }
    }//GEN-LAST:event_tabla_usuariosMousePressed

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

    /* BOTON BUSCAR */
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

    /* BOTON DEVOLUCION */
    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        int fila_devolucion = tabla_prestamo.getSelectedRow();
        int fila_usuario = tabla_usuarios.getSelectedRow();
        if(fila_usuario >= 0){
            if(fila_devolucion >= 0){
                DBAdmin.eliminarPrestamo(tabla_prestamo.getValueAt(fila_devolucion,1).toString());
                JOptionPane.showMessageDialog(null,"La devolución se ha realizado con exito", "Devolución",JOptionPane.INFORMATION_MESSAGE);
                limpiarTablaPrestamo();
                tabla_prestamo.setModel(DBAdmin.obtenerRegistrosUsuario1((DefaultTableModel)tabla_prestamo.getModel(), tabla_usuarios.getValueAt(fila_usuario,0).toString()));
                tabla_prestamo.clearSelection();
                limpiarTablaUsuarios();
                tabla_usuarios.setModel(DBAdmin.obtenerRegistrosUsuarios1((DefaultTableModel)tabla_usuarios.getModel()));
                tabla_usuarios.clearSelection();
                cbx_criterio_usuario.setSelectedIndex(0);
                tbx_nombre.grabFocus();
            }else{
                getToolkit().beep(); //hace un beep
                JOptionPane.showMessageDialog(null,"Debe seleccionar un registro de préstamo activo", "Seleccionar Préstamo",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe seleccionar un usuario", "Seleccionar Usuario",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btn_devolucionActionPerformed

    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTablaPrestamo(){
        DefaultTableModel modelo = (DefaultTableModel)tabla_prestamo.getModel();
        for (int i = 0; i < tabla_prestamo.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla_prestamo.setModel(modelo);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_usuario;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_criterio_usuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_prestamo;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField tbx_nombre;
    // End of variables declaration//GEN-END:variables
}
