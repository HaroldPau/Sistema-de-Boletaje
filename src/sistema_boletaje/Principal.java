
package sistema_boletaje;

import java.awt.Dimension;

import Clases.ImagenFondo;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Harold7v7
 */
public class Principal extends javax.swing.JFrame {
    
    static public String usuario;
    public Principal() {
        initComponents();
        //Entorno.setBorder(new ImagenFondo());
        this.setExtendedState(MAXIMIZED_BOTH);
        Mpersonal.setVisible(false);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entorno = new javax.swing.JDesktopPane();
        MENU = new javax.swing.JTabbedPane();
        Mpersonal = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        btnempleados = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Mboletaje = new javax.swing.JPanel();
        btncontrol = new javax.swing.JButton();
        btndetalle = new javax.swing.JButton();
        btnproduccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnproduccion1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnproduccion2 = new javax.swing.JButton();
        btnlistavehiculo3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnlistavehiculo6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnlistavehiculo8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Mvehiculo = new javax.swing.JPanel();
        btnlistavehiculo = new javax.swing.JButton();
        btnregistrovehiculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlistavehiculo1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnlistavehiculo2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnregistrovehiculo1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnlistavehiculo4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnlistavehiculo5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnproduccion3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnlistavehiculo7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnDespachoB = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        BtnDespachoB1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTRANSHAR");

        Entorno.setBackground(new java.awt.Color(153, 204, 255));
        Entorno.setAutoscrolls(true);

        javax.swing.GroupLayout EntornoLayout = new javax.swing.GroupLayout(Entorno);
        Entorno.setLayout(EntornoLayout);
        EntornoLayout.setHorizontalGroup(
            EntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EntornoLayout.setVerticalGroup(
            EntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        MENU.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Mpersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NUEVO 50.png"))); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        Mpersonal.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 60));

        btnempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 50.png"))); // NOI18N
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });
        Mpersonal.add(btnempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("REGISTRAR");
        Mpersonal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LISTAR EMPLEADOS");
        Mpersonal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        MENU.addTab("PERSONAL", Mpersonal);

        Mboletaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncontrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CONTROL48.png"))); // NOI18N
        btncontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontrolActionPerformed(evt);
            }
        });
        Mboletaje.add(btncontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 60));

        btndetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCARB48.png"))); // NOI18N
        btndetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetalleActionPerformed(evt);
            }
        });
        Mboletaje.add(btndetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 60));

        btnproduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/REPORT48.png"))); // NOI18N
        btnproduccion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproduccionActionPerformed(evt);
            }
        });
        Mboletaje.add(btnproduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 60, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CONTROL BOLETAJE");
        Mboletaje.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DETALLE BOLETO");
        Mboletaje.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("VEHICULOS TRABAJADOS");
        Mboletaje.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        btnproduccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/REPORT48.png"))); // NOI18N
        btnproduccion1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnproduccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproduccion1ActionPerformed(evt);
            }
        });
        Mboletaje.add(btnproduccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("REPORTE DE P");
        Mboletaje.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        btnproduccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/REPORT48.png"))); // NOI18N
        btnproduccion2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnproduccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproduccion2ActionPerformed(evt);
            }
        });
        Mboletaje.add(btnproduccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 60, 60));

        btnlistavehiculo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ACTUALIZAR48.png"))); // NOI18N
        btnlistavehiculo3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnlistavehiculo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo3ActionPerformed(evt);
            }
        });
        Mboletaje.add(btnlistavehiculo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 60, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("RxS");
        Mboletaje.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        btnlistavehiculo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 48.png"))); // NOI18N
        btnlistavehiculo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo6ActionPerformed(evt);
            }
        });
        Mboletaje.add(btnlistavehiculo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("GESTIONAR L");
        Mboletaje.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("LIQUIDACION");
        Mboletaje.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        btnlistavehiculo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUS.png"))); // NOI18N
        btnlistavehiculo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo8ActionPerformed(evt);
            }
        });
        Mboletaje.add(btnlistavehiculo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 60, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("BOLETO X DIA");
        Mboletaje.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        MENU.addTab("BOLETAJE", Mboletaje);

        Mvehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlistavehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 48.png"))); // NOI18N
        btnlistavehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculoActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnlistavehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, 60));

        btnregistrovehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NUEVO V.png"))); // NOI18N
        btnregistrovehiculo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnregistrovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrovehiculoActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnregistrovehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("REGISTRAR");
        Mvehiculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("OBSERVADOS COMBUSTIBLE");
        Mvehiculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, -1, -1));

        btnlistavehiculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CONTROL48.png"))); // NOI18N
        btnlistavehiculo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnlistavehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo1ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnlistavehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("R.T.");
        Mvehiculo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btnlistavehiculo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ACTUALIZAR48.png"))); // NOI18N
        btnlistavehiculo2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnlistavehiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo2ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnlistavehiculo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGIS. PETROLEO");
        Mvehiculo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        btnregistrovehiculo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NUEVO V.png"))); // NOI18N
        btnregistrovehiculo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnregistrovehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrovehiculo1ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnregistrovehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("AC CONSUMO PETROLEO");
        Mvehiculo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        btnlistavehiculo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ACTUALIZAR48.png"))); // NOI18N
        btnlistavehiculo4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnlistavehiculo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo4ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnlistavehiculo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ACTUALIZAR VEHICULO");
        Mvehiculo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        btnlistavehiculo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 48.png"))); // NOI18N
        btnlistavehiculo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo5ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnlistavehiculo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 60, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("LISTAR VEHICULOS");
        Mvehiculo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btnproduccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/REPORT48.png"))); // NOI18N
        btnproduccion3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnproduccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproduccion3ActionPerformed(evt);
            }
        });
        Mvehiculo.add(btnproduccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 60, 60));

        MENU.addTab("VEHICULO", Mvehiculo);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlistavehiculo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 48.png"))); // NOI18N
        btnlistavehiculo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistavehiculo7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlistavehiculo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PADRON POR MES");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        MENU.addTab("PETROLEO", jPanel1);

        BtnDespachoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LISTAR 48.png"))); // NOI18N
        BtnDespachoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespachoBActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DISTRIBUCION");

        BtnDespachoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/REPORT48.png"))); // NOI18N
        BtnDespachoB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespachoB1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("REPORTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BtnDespachoB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(BtnDespachoB1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(737, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnDespachoB1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(BtnDespachoB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel17))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MENU.addTab("DESPACHO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entorno)
            .addComponent(MENU)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entorno))
        );

        MENU.getAccessibleContext().setAccessibleName("boletaje");
        MENU.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        RegistroEmpleado obMa = new RegistroEmpleado();
        
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true); 
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
        BusquedaEmpleado obMa = new BusquedaEmpleado();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        BusquedaEmpleado.boletaje=1;
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btncontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontrolActionPerformed
        ControlBoleto obMa = new ControlBoleto();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btncontrolActionPerformed

    private void btndetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetalleActionPerformed
        BusquedaBoleto obMa = new BusquedaBoleto();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btndetalleActionPerformed

    private void btnproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproduccionActionPerformed
        BoletoDia obMa = new BoletoDia();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnproduccionActionPerformed

    private void btnregistrovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrovehiculoActionPerformed
        RegistroVehiculo obMa = new RegistroVehiculo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnregistrovehiculoActionPerformed

    private void btnlistavehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculoActionPerformed
        BusquedaVehiculo obMa = new BusquedaVehiculo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculoActionPerformed

    private void btnlistavehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo1ActionPerformed
        RevisionTecnica obMa = new RevisionTecnica();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo1ActionPerformed

    private void btnproduccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproduccion1ActionPerformed
        ReportedeProduccion obMa = new ReportedeProduccion();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnproduccion1ActionPerformed

    private void btnlistavehiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo2ActionPerformed
        ActualizarRegistroPetroleo obMa = new ActualizarRegistroPetroleo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo2ActionPerformed

    private void btnproduccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproduccion2ActionPerformed
        REPORTEXSOCIO obMa = new REPORTEXSOCIO();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnproduccion2ActionPerformed

    private void btnlistavehiculo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo3ActionPerformed
        LiquidacionDia obMa = new LiquidacionDia();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo3ActionPerformed

    private void btnregistrovehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrovehiculo1ActionPerformed
        RegistroConsumoPetroleo obMa = new RegistroConsumoPetroleo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnregistrovehiculo1ActionPerformed

    private void btnlistavehiculo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo4ActionPerformed
        ActualizarVehiculo obMa = new ActualizarVehiculo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo4ActionPerformed

    private void btnlistavehiculo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo5ActionPerformed
        ReporteFaltaConbustible obMa = new ReporteFaltaConbustible();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo5ActionPerformed

    private void btnproduccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproduccion3ActionPerformed
        ReporteMensualC obMa = new ReporteMensualC();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnproduccion3ActionPerformed

    private void btnlistavehiculo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo6ActionPerformed
        ReportePadronesTrabajados obMa = new ReportePadronesTrabajados();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo6ActionPerformed

    private void btnlistavehiculo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo7ActionPerformed
       ReporteCombustibleMes obMa = new ReporteCombustibleMes();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo7ActionPerformed

    private void BtnDespachoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespachoBActionPerformed
        Despacho_B obMa = new Despacho_B();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_BtnDespachoBActionPerformed

    private void BtnDespachoB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespachoB1ActionPerformed
        ReporteDespachoB obMa = new ReporteDespachoB();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_BtnDespachoB1ActionPerformed

    private void btnlistavehiculo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistavehiculo8ActionPerformed
        ImprimirLiquidacion obMa = new ImprimirLiquidacion();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_btnlistavehiculo8ActionPerformed

    
    public static void Centrar(JDesktopPane fondo, JInternalFrame from)
    {
        Dimension tamaño_fondo = fondo.getSize();
        Dimension tamaño_vi = from.getSize();
        from.setLocation((tamaño_fondo.width - tamaño_vi.width)/2,(tamaño_fondo.height- tamaño_fondo.height)/2+20);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                new Principal().setVisible(true);
         /*try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDespachoB;
    private javax.swing.JButton BtnDespachoB1;
    public static javax.swing.JDesktopPane Entorno;
    public static javax.swing.JTabbedPane MENU;
    public static javax.swing.JPanel Mboletaje;
    public static javax.swing.JPanel Mpersonal;
    public static javax.swing.JPanel Mvehiculo;
    private javax.swing.JButton btncontrol;
    private javax.swing.JButton btndetalle;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton btnlistavehiculo;
    private javax.swing.JButton btnlistavehiculo1;
    private javax.swing.JButton btnlistavehiculo2;
    private javax.swing.JButton btnlistavehiculo3;
    private javax.swing.JButton btnlistavehiculo4;
    private javax.swing.JButton btnlistavehiculo5;
    private javax.swing.JButton btnlistavehiculo6;
    private javax.swing.JButton btnlistavehiculo7;
    private javax.swing.JButton btnlistavehiculo8;
    private javax.swing.JButton btnproduccion;
    private javax.swing.JButton btnproduccion1;
    private javax.swing.JButton btnproduccion2;
    private javax.swing.JButton btnproduccion3;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnregistrovehiculo;
    private javax.swing.JButton btnregistrovehiculo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
