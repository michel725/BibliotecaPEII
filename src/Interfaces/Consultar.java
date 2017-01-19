package Interfaces;

import Datos.DBAdmin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Consultar extends javax.swing.JFrame {

    public Consultar() {
        initComponents();
        this.setResizable(false); //la ventana no se puede redimensionar
        this.setLocationRelativeTo(null); //centrar la ventana en la pantalla
        try{ //agrega un icono para la aplicación
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //muestra el exepción en consola
        }
        tbx_frase1.grabFocus(); //pone el focus en el textbox buscar
        TableColumnModel modelo1 = tablaLibro.getColumnModel(); //obtiene modelo de columnas actual
        modelo1.getColumn(0).setPreferredWidth(70);  //codigo
        modelo1.getColumn(1).setPreferredWidth(350); //titulo
        modelo1.getColumn(2).setPreferredWidth(350); //autor
        modelo1.getColumn(3).setPreferredWidth(200); //editorial
        modelo1.getColumn(4).setPreferredWidth(70); //ubicación
        modelo1.getColumn(5).setPreferredWidth(40);  //año
        modelo1.getColumn(6).setPreferredWidth(55);  //num Edicion
        modelo1.getColumn(7).setPreferredWidth(150); //pais
        modelo1.getColumn(8).setPreferredWidth(120); //idioma
        modelo1.getColumn(9).setPreferredWidth(105); //ISNB
        modelo1.getColumn(10).setPreferredWidth(200);  //materia
        modelo1.getColumn(11).setPreferredWidth(55);  //paginas
        modelo1.getColumn(12).setPreferredWidth(60);  //tipo
        modelo1.getColumn(13).setPreferredWidth(100); //estado
        modelo1.getColumn(14).setPreferredWidth(1100);  //descripcion
        tablaLibro.setColumnModel(modelo1); //agrega modelo de columnas a la tabla
        tablaLibro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tablaLibro.setModel(DBAdmin.obtenerRegistrosLibro2((DefaultTableModel)tablaLibro.getModel()));
        //------------------------------------------------------------------------------------------------
        TableColumnModel modelo2 = tablaVideo.getColumnModel(); //obtiene modelo de columnas actual
        modelo2.getColumn(0).setPreferredWidth(70);  //codigo
        modelo2.getColumn(1).setPreferredWidth(350); //titulo
        modelo2.getColumn(2).setPreferredWidth(350); //director
        modelo2.getColumn(3).setPreferredWidth(200); //productora
        modelo2.getColumn(4).setPreferredWidth(70); //ubicación
        modelo2.getColumn(5).setPreferredWidth(50);  //tipo
        modelo2.getColumn(6).setPreferredWidth(40);  //anio
        modelo2.getColumn(7).setPreferredWidth(70); //duracion
        modelo2.getColumn(8).setPreferredWidth(150); //pais
        modelo2.getColumn(9).setPreferredWidth(120); //idioma
        modelo2.getColumn(10).setPreferredWidth(40);  //subtitulo
        modelo2.getColumn(11).setPreferredWidth(70);  //clasificacion
        modelo2.getColumn(12).setPreferredWidth(250);  //genero
        modelo2.getColumn(13).setPreferredWidth(1100); //sinopsis
        tablaVideo.setColumnModel(modelo2); //agrega modelo de columnas a la tabla
        tablaVideo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //anchos fijos activan scroll horizontal
        //llena la tabla con los registros existentes
        tablaVideo.setModel(DBAdmin.obtenerRegistrosVideo2((DefaultTableModel)tablaVideo.getModel()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_busquedas = new javax.swing.ButtonGroup();
        btn_cerrar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        tbx_frase1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_criterio1 = new javax.swing.JComboBox();
        btn_buscar1 = new javax.swing.JButton();
        btn_limpiar1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLibro = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVideo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tbx_frase2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbx_criterio2 = new javax.swing.JComboBox();
        btn_buscar2 = new javax.swing.JButton();
        btn_limpiar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAR BIBLIOTECA");
        setResizable(false);

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

        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tbx_frase1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Frase o palabra de búsqueda:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Criterio:");

        cbx_criterio1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Autor", "Materia" }));

        btn_buscar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar1.setText("BUSCAR");
        btn_buscar1.setAlignmentY(0.0F);
        btn_buscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });

        btn_limpiar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32.png"))); // NOI18N
        btn_limpiar1.setText("  LIMPIAR");
        btn_limpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_limpiar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tbx_frase1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbx_criterio1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_frase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_criterio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_limpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tablaLibro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TÍTULO", "AUTOR", "EDITORIAL", "UBICACIÓN", "AÑO", "EDICIÓN", "PAÍS", "IDIOMA", "ISBN", "MATERIA", "PÁGINAS", "TIPO", "ESTADO", "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLibro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaLibro.getTableHeader().setResizingAllowed(false);
        tablaLibro.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaLibro);
        if (tablaLibro.getColumnModel().getColumnCount() > 0) {
            tablaLibro.getColumnModel().getColumn(0).setResizable(false);
            tablaLibro.getColumnModel().getColumn(1).setResizable(false);
            tablaLibro.getColumnModel().getColumn(2).setResizable(false);
            tablaLibro.getColumnModel().getColumn(3).setResizable(false);
            tablaLibro.getColumnModel().getColumn(4).setResizable(false);
            tablaLibro.getColumnModel().getColumn(5).setResizable(false);
            tablaLibro.getColumnModel().getColumn(6).setResizable(false);
            tablaLibro.getColumnModel().getColumn(7).setResizable(false);
            tablaLibro.getColumnModel().getColumn(8).setResizable(false);
            tablaLibro.getColumnModel().getColumn(9).setResizable(false);
            tablaLibro.getColumnModel().getColumn(10).setResizable(false);
            tablaLibro.getColumnModel().getColumn(11).setResizable(false);
            tablaLibro.getColumnModel().getColumn(12).setResizable(false);
            tablaLibro.getColumnModel().getColumn(13).setResizable(false);
            tablaLibro.getColumnModel().getColumn(14).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("  LIBRO  ", jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tablaVideo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaVideo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TÍTULO", "DIRECTOR", "PRODUCTORA", "UBICACIÓN", "TIPO", "AÑO", "DURACIÓN", "PAÍS", "IDIOMA", "SUB", "CLASIFICACIÓN", "GENERO", "SINOPSIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVideo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaVideo.getTableHeader().setResizingAllowed(false);
        tablaVideo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVideo);
        if (tablaVideo.getColumnModel().getColumnCount() > 0) {
            tablaVideo.getColumnModel().getColumn(0).setResizable(false);
            tablaVideo.getColumnModel().getColumn(1).setResizable(false);
            tablaVideo.getColumnModel().getColumn(2).setResizable(false);
            tablaVideo.getColumnModel().getColumn(3).setResizable(false);
            tablaVideo.getColumnModel().getColumn(4).setResizable(false);
            tablaVideo.getColumnModel().getColumn(5).setResizable(false);
            tablaVideo.getColumnModel().getColumn(6).setResizable(false);
            tablaVideo.getColumnModel().getColumn(7).setResizable(false);
            tablaVideo.getColumnModel().getColumn(8).setResizable(false);
            tablaVideo.getColumnModel().getColumn(9).setResizable(false);
            tablaVideo.getColumnModel().getColumn(10).setResizable(false);
            tablaVideo.getColumnModel().getColumn(11).setResizable(false);
            tablaVideo.getColumnModel().getColumn(12).setResizable(false);
            tablaVideo.getColumnModel().getColumn(13).setResizable(false);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tbx_frase2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Frase o palabra de búsqueda:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Criterio:");

        cbx_criterio2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbx_criterio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Director", "Género" }));

        btn_buscar2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32.png"))); // NOI18N
        btn_buscar2.setText("BUSCAR");
        btn_buscar2.setAlignmentY(0.0F);
        btn_buscar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-32-azul.png"))); // NOI18N
        btn_buscar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });

        btn_limpiar2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_limpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32.png"))); // NOI18N
        btn_limpiar2.setText("  LIMPIAR");
        btn_limpiar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_limpiar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Broom-32-azul.png"))); // NOI18N
        btn_limpiar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar2ActionPerformed(evt);
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
                    .addComponent(tbx_frase2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbx_criterio2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_frase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_criterio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_limpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("  VIDEO CINTA (VHS) / DVD  ", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_regresar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* BOTON REGRESAR */
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        new Principal().setVisible(true);
        dispose(); //libera la memoria
    }//GEN-LAST:event_btn_regresarActionPerformed

    /* BOTON CERRAR */
    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
        System.exit(0); //salir del sistema
    }//GEN-LAST:event_btn_cerrarActionPerformed

    /* BOTON BUSCAR LIBRO */
    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        String frase = tbx_frase1.getText();
        if(!frase.isEmpty()){
            tbx_frase1.setText(null);
            limpiarTablaLibros();
            //llena la tabla con los registros existentes
            tablaLibro.setModel(DBAdmin.obtenerRegistrosLibro2((DefaultTableModel)tablaLibro.getModel(),frase,cbx_criterio1.getSelectedIndex()));
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra o frase válida", "Buscar Registro Libro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar1ActionPerformed

    /* BOTON LIMPIAR LIBRO */
    private void btn_limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar1ActionPerformed
        limpiarLibro();
    }//GEN-LAST:event_btn_limpiar1ActionPerformed

    /* BOTON BUSCAR VIDEO */
    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        String frase = tbx_frase2.getText();
        if(!frase.isEmpty()){
            tbx_frase2.setText(null);
            limpiarTablaVideos();
            //llena la tabla con los registros existentes
            tablaVideo.setModel(DBAdmin.obtenerRegistrosVideo2((DefaultTableModel)tablaVideo.getModel(),frase,cbx_criterio2.getSelectedIndex()));
        }else{
            getToolkit().beep(); //hace un beep
            JOptionPane.showMessageDialog(null,"Debe ingresar una palabra o frase válida", "Buscar Registro Video",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    /* BOTON LIMPIAR VIDEO */
    private void btn_limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar2ActionPerformed
        limpiarVideo();
    }//GEN-LAST:event_btn_limpiar2ActionPerformed

    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA LIBROS */
    private void limpiarTablaLibros(){
        DefaultTableModel modelo = (DefaultTableModel)tablaLibro.getModel();
        for (int i = 0; i < tablaLibro.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tablaLibro.setModel(modelo);
    }
    
    private void limpiarLibro(){
        tbx_frase1.setText(null);
        cbx_criterio1.setSelectedIndex(0);
        limpiarTablaLibros();
        //llena la tabla con los registros existentes
        tablaLibro.setModel(DBAdmin.obtenerRegistrosLibro2((DefaultTableModel)tablaLibro.getModel()));
        tablaLibro.clearSelection();
    }
    
    /* METODO PARA LIMPIAR LOS REGISTROS DE LA TABLA VIDEOS */
    private void limpiarTablaVideos(){
        DefaultTableModel modelo = (DefaultTableModel)tablaVideo.getModel();
        for (int i = 0; i < tablaVideo.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
        tablaVideo.setModel(modelo);
    }
    
    private void limpiarVideo(){
        tbx_frase2.setText(null);
        cbx_criterio2.setSelectedIndex(0);
        limpiarTablaVideos();
        //llena la tabla con los registros existentes
        tablaVideo.setModel(DBAdmin.obtenerRegistrosVideo2((DefaultTableModel)tablaVideo.getModel()));
        tablaVideo.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_busquedas;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_limpiar1;
    private javax.swing.JButton btn_limpiar2;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox cbx_criterio1;
    private javax.swing.JComboBox cbx_criterio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaLibro;
    private javax.swing.JTable tablaVideo;
    private javax.swing.JTextField tbx_frase1;
    private javax.swing.JTextField tbx_frase2;
    // End of variables declaration//GEN-END:variables
}
