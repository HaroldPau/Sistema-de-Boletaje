
package sistema_boletaje;

import Dao.DistribucionDao;
import javax.swing.table.DefaultTableModel;
import Bean.DistribucionBoletos;
import Dao.VehiculoDao;
import Util.ConexionBD;


import java.awt.event.KeyEvent;

import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;


/**
 *
 * @author Harold7v7
 */
public class ControlBoleto extends javax.swing.JInternalFrame {
    static public DefaultTableModel tb;
    static public DistribucionDao DBD = new DistribucionDao();
    VehiculoDao VD = new VehiculoDao();
    
    String Codigo;
    String CodigoImprimir,CodigoPadron;
    
    public ControlBoleto() {
        initComponents();
        lblpadron.setText("");
        lblnom.setText("");
        lblfecha.setText("");
        lblusuario.setText("");
        lblhora.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlboleto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb35 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb25 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb15 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tb50 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tb70 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPadron = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblpadron = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAbastecer = new javax.swing.JButton();
        btnLiquidacion = new javax.swing.JButton();
        btnAnulacion = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setTitle("CONTROL BOLETAJE");

        controlboleto.setBorder(javax.swing.BorderFactory.createTitledBorder("BOLETOS DISPONIBLES"));
        controlboleto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb35.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "3.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb35MousePressed(evt);
            }
        });
        tb35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb35KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb35);

        controlboleto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 82, 365));

        tb4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "4.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb4MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb4);

        controlboleto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 82, 365));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "3.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb3MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tb3);

        controlboleto.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 82, 365));

        tb25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "2.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb25MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tb25);

        controlboleto.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 82, 365));

        tb5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "5.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb5MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tb5);

        controlboleto.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 82, 365));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        tb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb1KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tb1);

        controlboleto.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 82, 365));

        tb15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb15MousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tb15);

        controlboleto.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 82, 365));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "2.00"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb2MousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(tb2);

        controlboleto.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 82, 365));

        tb50.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "0.50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb50MousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(tb50);

        controlboleto.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 82, 365));

        tb70.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "0.70"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb70MousePressed(evt);
            }
        });
        jScrollPane10.setViewportView(tb70);

        controlboleto.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 82, 365));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel1.setText("PADRON");

        txtPadron.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPadron.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadronActionPerformed(evt);
            }
        });
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPadronKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPadronKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblpadron.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblpadron.setForeground(new java.awt.Color(255, 0, 0));
        lblpadron.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpadron)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblpadron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblnom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnom.setForeground(new java.awt.Color(255, 0, 0));
        lblnom.setText("jLabel2");

        lblfecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 0, 0));
        lblfecha.setText("jLabel3");

        lblusuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(0, 0, 255));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusuario.setText("jLabel2");

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 0, 0));
        lblhora.setText("jLabel3");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAbastecer.setText("ABASTECER");
        btnAbastecer.setEnabled(false);
        btnAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerActionPerformed(evt);
            }
        });

        btnLiquidacion.setText("LIQUIDACION");
        btnLiquidacion.setEnabled(false);
        btnLiquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiquidacionActionPerformed(evt);
            }
        });

        btnAnulacion.setText("ANULACION");
        btnAnulacion.setEnabled(false);
        btnAnulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnulacionActionPerformed(evt);
            }
        });

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnom, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240)
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(controlboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblnom)
                        .addGap(18, 18, 18)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusuario)
                            .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        click();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void click(){
        
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        
        lblnom.setText("");
        lblfecha.setText("");
        lblusuario.setText("");
        lblhora.setText("");
        Codigo  = VD.ObtenerCodigo(txtPadron.getText());
        String Padron = txtPadron.getText();
        CodigoPadron= Padron;
        CodigoImprimir = Codigo;
        boolean bandera = VD.BuscarVehiculo(Padron);
        
        int[] fecharvt = new int[3];
                
                fecharvt=VD.FechaRT(Codigo);
        
        System.out.println(""+fecharvt[0]);
        System.out.println(""+fecharvt[1]);
        System.out.println(""+fecharvt[2]);
        
        System.out.println(""+ano);
        System.out.println(""+mes);
        System.out.println(""+dia);
        
        if(bandera){
            
            
            if(fecharvt[0]==ano){
                System.out.println("pase papu");
                int resta = fecharvt[2]-dia;
                System.out.println(resta);
                if( mes== fecharvt[1])
                {
                   if(resta<=3){

                    System.out.println("error abajo papu");

                    NOTIFICACIONRVT obMa = new NOTIFICACIONRVT();
                    Entorno.add(obMa);
                    Centrar(Entorno, obMa);
                    obMa.toFront();
                    obMa.setVisible(true);
                    NOTIFICACIONRVT.lbldia.setText(""+resta);
                    } 
                }else if ( mes > fecharvt[1]){
                    NOTIFICACIONRVT obMa = new NOTIFICACIONRVT();
                    Entorno.add(obMa);
                    Centrar(Entorno, obMa);
                    obMa.toFront();
                    obMa.setVisible(true);
                    NOTIFICACIONRVT.lbldia.setText("0");
                }
                
                
        }
        
            
            
            
            LimpiarTablas();
            LlenarTabla(tb4,"4.00",Codigo);
            LlenarTabla(tb35,"3.50",Codigo);
            LlenarTabla(tb3,"3.00",Codigo);
            LlenarTabla(tb25,"2.50",Codigo);
            LlenarTabla(tb2,"2.00",Codigo);
            LlenarTabla(tb15,"1.50",Codigo);
            LlenarTabla(tb5,"5.00",Codigo);
            LlenarTabla(tb1,"1.00",Codigo);
            LlenarTabla(tb70,"0.70",Codigo);
            LlenarTabla(tb50,"0.50",Codigo);
            btnAbastecer.setEnabled(true);
                btnAnulacion.setEnabled(true);
                btnLiquidacion.setEnabled(true);
                btnImprimir.setEnabled(true);
        }else{
            LimpiarTablas();
            JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO");
            btnAbastecer.setEnabled(false);
                btnAnulacion.setEnabled(false);
                btnLiquidacion.setEnabled(false);
                btnImprimir.setEnabled(false);
        }
    }
    
    private void btnAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerActionPerformed
        DistribucionBoleto.Padron=txtPadron.getText();
        DistribucionBoleto.Codigo=Codigo;
        DistribucionBoleto obMa = new DistribucionBoleto();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        
    }//GEN-LAST:event_btnAbastecerActionPerformed

    private void btnLiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidacionActionPerformed
        Liquidacion.Padron=Codigo;
        Liquidacion obMa = new Liquidacion();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        
    }//GEN-LAST:event_btnLiquidacionActionPerformed

    private void btnAnulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnulacionActionPerformed
                
                Anulacion.Padron=Codigo;
                Anulacion obMa = new Anulacion();
                Entorno.add(obMa);
                Centrar(Entorno, obMa);
                obMa.toFront();
                obMa.setVisible(true);
                
    }//GEN-LAST:event_btnAnulacionActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            click();
        }
        
    }//GEN-LAST:event_txtPadronKeyReleased

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!(evt.getKeyChar()==KeyEvent.VK_ENTER))  {
            lblpadron.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblpadron.setText("");
        }if(txtPadron.getText().length()>3){
                evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed
        
    }//GEN-LAST:event_txtPadronActionPerformed

    private void tb5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb5MousePressed
                                               
        int FilaSelec = tb5.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb5.getValueAt(FilaSelec,0).toString(), "1.20");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb5MousePressed

    private void tb4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb4MousePressed
        int FilaSelec = tb4.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb4.getValueAt(FilaSelec,0).toString(), "4.00");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb4MousePressed

    private void tb35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb35KeyPressed
        
    }//GEN-LAST:event_tb35KeyPressed

    private void tb3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MousePressed
        int FilaSelec = tb3.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb3.getValueAt(FilaSelec,0).toString(), "3.00");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb3MousePressed

    private void tb35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb35MousePressed
        int FilaSelec = tb35.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb35.getValueAt(FilaSelec,0).toString(), "3.50");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb35MousePressed

    private void tb25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb25MousePressed
        int FilaSelec = tb25.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            System.out.println(tb25.getValueAt(FilaSelec,0).toString());
            String [] datos = DBD.Busqueda2(tb25.getValueAt(FilaSelec,0).toString(), "2.50");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
            
            
        }
    }//GEN-LAST:event_tb25MousePressed

    private void tb2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MousePressed
        int FilaSelec = tb2.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb2.getValueAt(FilaSelec,0).toString(), "2.00");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb2MousePressed

    private void tb15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb15MousePressed
        int FilaSelec = tb15.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb15.getValueAt(FilaSelec,0).toString(), "1.50");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb15MousePressed

    private void tb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb1KeyPressed
        
    }//GEN-LAST:event_tb1KeyPressed

    private void tb70MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb70MousePressed
        int FilaSelec = tb70.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb70.getValueAt(FilaSelec,0).toString(), "0.70");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb70MousePressed

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
        int FilaSelec = tb1.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb1.getValueAt(FilaSelec,0).toString(), "1.00");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb1MousePressed

    private void tb50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb50MousePressed
        int FilaSelec = tb50.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String [] datos = DBD.Busqueda2(tb50.getValueAt(FilaSelec,0).toString(), "0.50");
            lblnom.setText(datos[0]);
            lblfecha.setText(datos[1]);
            lblusuario.setText(datos[2]);
            lblhora.setText(datos[3]);
        }
    }//GEN-LAST:event_tb50MousePressed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        
        try {
            Calendar fecha = new GregorianCalendar();      
            int ano = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
            String Fecha= String.valueOf(dia)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(ano);
            
            
            Calendar calendario = new GregorianCalendar();
            Date horaactual = new Date();
            calendario.setTime(horaactual);
            String hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            String minuto=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            
            
            String Horaa = hora+":"+minuto;
            
                
                ConexionBD con = new ConexionBD();
                Connection conn = con.getConexion();
                JasperReport reporte = null;                  
                Map parametro = new HashMap();
                parametro.put("fecha",Fecha );
                parametro.put("padron",CodigoPadron );
                parametro.put("codigo",CodigoImprimir );
                parametro.put("hora",Horaa );
                parametro.put("fechart",VD.ObtenerfechaRT(CodigoImprimir));      
                URL path = this.getClass().getResource("/reportes/C_boletaje_A.jasper");
                reporte = (JasperReport) JRLoader.loadObject(path);                
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);
                JasperPrintManager.printReport(jprint, true);                
                
            } catch (JRException ex) {
                Logger.getLogger(ReportedeProduccion.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
        
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    
    static public void LlenarTabla(javax.swing.JTable tabla, String precio, String padron){
        
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletos(precio, padron);
        tb =(DefaultTableModel)tabla.getModel();
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[] {obj.getInicio()});
        });
    }
    static public void LimpiarTablas(){
        tb = (DefaultTableModel)tb4.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb35.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb3.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb25.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb2.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb15.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb5.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb1.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb70.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
        
        tb = (DefaultTableModel)tb50.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecer;
    private javax.swing.JButton btnAnulacion;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLiquidacion;
    private javax.swing.JPanel controlboleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblpadron;
    private javax.swing.JLabel lblusuario;
    public static javax.swing.JTable tb1;
    public static javax.swing.JTable tb15;
    public static javax.swing.JTable tb2;
    public static javax.swing.JTable tb25;
    public static javax.swing.JTable tb3;
    public static javax.swing.JTable tb35;
    public static javax.swing.JTable tb4;
    public static javax.swing.JTable tb5;
    public static javax.swing.JTable tb50;
    public static javax.swing.JTable tb70;
    private javax.swing.JTextField txtPadron;
    // End of variables declaration//GEN-END:variables
}
