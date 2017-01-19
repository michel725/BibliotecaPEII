package Interfaces;

import Datos.DBAdmin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class BuscarCodVideo extends javax.swing.JFrame {
    MantenimientoBB MBB;
    
    public BuscarCodVideo(MantenimientoBB MBB) {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        this.MBB = MBB; //acá transfiere el objeto de la ventana MantenimientoBB
        tbx_frase.grabFocus(); //pone el focus en el textbox buscar
        TableColumnModel modelo = tabla.getColumnModel(); //obtiene modelo de columnas actual
        //se define un ancho fijo para las columnas
        modelo.getColumn(0).setPreferredWidth(70);  //codigo
        modelo.getColumn(1).setPreferredWidth(250); //titulo
        modelo.getColumn(2).setPreferredWidth(160); //director
        modelo.getColumn(3).setPreferredWidth(70);  //ubicacion
        modelo.getColumn(4).setPreferredWidth(50);  //tipo de material
        tabla.setColumnModel(modelo); //agrega modelo de columnas a la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tabla.setModel(DBAdmin.obtenerRegistrosVideo((DefaultTableModel)tabla.getModel()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbx_frase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx_criterio = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_limpiar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUSCAR VIDEO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda de VHS / DVD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tbx_frase.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tbx_frase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_fraseKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Frase o palabra de busqueda:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Criterio:");

        cbx_criterio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Director", "Género" }));

        btn_buscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
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
                    .addComponent(tbx_frase, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_frase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tabla.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TÍTULO", "DIRECTOR", "UBICACIÓN", "TIPO"
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
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
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

        btn_limpiar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32.png"))); // NOI18N
        btn_limpiar.setText("  LIMPIAR");
        btn_limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
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

        btn_enviar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-32.png"))); // NOI18N
        btn_enviar.setText("  UTILIZAR INFORMACIÓN");
        btn_enviar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-32-azul.png"))); // NOI18N
        btn_enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-32-azul.png"))); // NOI18N
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_enviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_regresar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        MBB.setEnabled(true); //habilita la ventana MantenimientoBB
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        int fila = tabla.getSelectedRow(); //el indice de la fila seleccionada
        if(fila >= 0){
            //el lbl_codigo_video es un componente public static para poderse llamar
            MantenimientoBB.lbl_codigo_video.setText(tabla.getValueAt(fila,0).toString());
            MBB.setEnabled(true); //habilita la ventana MantenimientoBB
            dispose();
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe seleccionar un registro", "Seleccionar Registro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String frase = tbx_frase.getText();
        if(!frase.isEmpty()){
            tbx_frase.setText(null);
            limpiarTabla();
            //llena la tabla con los registros existentes
            tabla.setModel(DBAdmin.obtenerRegistrosVideo((DefaultTableModel)tabla.getModel(),frase,cbx_criterio.getSelectedIndex()));
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra o frase válida", "Buscar Registro Video",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

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

    private void limpiar(){
        tbx_frase.setText(null);
        cbx_criterio.setSelectedIndex(0);
        limpiarTabla();
        //llena la tabla con los registros existentes
        tabla.setModel(DBAdmin.obtenerRegistrosVideo((DefaultTableModel)tabla.getModel()));
        tabla.clearSelection();
    }
    
    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA */
    private void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tabla.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_criterio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tbx_frase;
    // End of variables declaration//GEN-END:variables
}
