
package sistema_boletaje;

import Dao.PersonalDao;
import Dao.VehiculoDao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

public class ActualizarVehiculo extends javax.swing.JInternalFrame {
    
    VehiculoDao RV = new VehiculoDao();
    PersonalDao PD = new PersonalDao();
    DefaultTableModel modelo = null;
    boolean bandera;

    public ActualizarVehiculo() {
        initComponents();        
        lblmarca.setText("");        
        lblpadron.setText("");
        lblmodelo.setText("");        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFabricacion = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPadron = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodPropietario = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JButton();
        Disponible = new javax.swing.JLabel();
        lblpadron = new javax.swing.JLabel();
        lblmodelo = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        CbxCombustible = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("ACTUALIZAR VEHICULO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS VEHICULO"));

        jLabel1.setText("CODIGO");

        jLabel2.setText("PLACA");

        jLabel3.setText("PADRON");

        jLabel4.setText("MARCA");

        jLabel5.setText("MODELO");

        jLabel6.setText("AÑO DE FABRICACION");

        txtFabricacion.setEnabled(false);
        txtFabricacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFabricacionKeyTyped(evt);
            }
        });

        txtModelo.setEnabled(false);
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        txtMarca.setEnabled(false);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtPadron.setEnabled(false);
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPadronKeyTyped(evt);
            }
        });

        txtPlaca.setEnabled(false);
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 0, 0));
        txtCodigo.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PROPIETARIO"));

        jLabel7.setText("CODIGO");

        jLabel8.setText("NOMBRE");

        txtCodPropietario.setEditable(false);
        txtCodPropietario.setEnabled(false);

        txtPropietario.setEditable(false);
        txtPropietario.setEnabled(false);

        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR.png"))); // NOI18N
        btnBuscarP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnBuscarP.setEnabled(false);
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarP)
                        .addGap(0, 151, Short.MAX_VALUE))
                    .addComponent(txtPropietario))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarP))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblpadron.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblpadron.setForeground(new java.awt.Color(255, 0, 0));
        lblpadron.setText("jLabel16");

        lblmodelo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblmodelo.setForeground(new java.awt.Color(255, 0, 0));
        lblmodelo.setText("jLabel16");

        lblmarca.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblmarca.setForeground(new java.awt.Color(255, 0, 0));
        lblmarca.setText("jLabel16");

        CbxCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GNV", "DISEL" }));
        CbxCombustible.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPadron)
                                            .addComponent(lblpadron)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                            .addComponent(lblmarca))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblmodelo)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CbxCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(123, 123, 123)
                        .addComponent(Disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblpadron)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmodelo)
                            .addComponent(lblmarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/MODIFICAR2.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CANCELAR2.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GUARDAR2.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR3.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
            RV.ActualizarVehiculo(txtCodigo.getText(),txtPadron.getText(), txtPlaca.getText(),txtCodPropietario.getText(),txtMarca.getText().toUpperCase(),
                    txtModelo.getText().toUpperCase(),txtFabricacion.getText(),CbxCombustible.getSelectedItem().toString());
            limpiarCampos();
            txtCodigo.setEnabled(false);txtPadron.setEnabled(false);txtPlaca.setEnabled(false);txtCodPropietario.setEnabled(false);txtMarca.setEnabled(false);
            txtModelo.setEnabled(false);txtFabricacion.setEnabled(false);
            JOptionPane.showMessageDialog(null,"vehiculo modificado");
            
            btnGrabar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnBuscar.setEnabled(true);
            btnBuscarP.setEnabled(true);
            CbxCombustible.setEnabled(false);
            
        
        
        
        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        
        BusquedaPropietario obMa = new BusquedaPropietario();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        BusquedaPropietario.btnEnviar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();       
        txtCodigo.setEnabled(false);txtPadron.setEnabled(false);txtPlaca.setEnabled(false);txtCodPropietario.setEnabled(false);txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);txtFabricacion.setEnabled(false);        
        
        btnBuscar.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscarP.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    bandera=false;
    btnBuscarP.setEnabled(true);    
    txtCodigo.setEnabled(true);txtPadron.setEnabled(true);txtPlaca.setEnabled(true);txtCodPropietario.setEnabled(true);txtMarca.setEnabled(true);
    txtModelo.setEnabled(true);txtFabricacion.setEnabled(true);
    btnCancelar.setEnabled(true);
    btnModificar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnGrabar.setEnabled(true);
    CbxCombustible.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
    
    if(txtPlaca.getText().length()==3){
        txtPlaca.setText(txtPlaca.getText()+"-");
    }else if(txtPlaca.getText().length()>6){
        evt.consume();
    }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
        txtPlaca.setText("");
    }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        txtPlaca.setText(txtPlaca.getText().toUpperCase());
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            lblpadron.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblpadron.setText("");
        }if(txtPadron.getText().length()>2){
                evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            lblmarca.setText("DIGITE SOLO LETRAS");
        }else{
            lblmarca.setText("");
        }if(txtMarca.getText().length()>25){
                evt.consume();}
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            lblmodelo.setText("DIGITE SOLO LETRAS");
        }else{
            lblmodelo.setText("");
        }if(txtModelo.getText().length()>11){
                evt.consume();}
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtFabricacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFabricacionKeyTyped
       if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            
            evt.consume();
        }else{
            
        }
       if(txtFabricacion.getText().length()>3){
                evt.consume();}
    }//GEN-LAST:event_txtFabricacionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        BusquedaVehiculo obMa = new BusquedaVehiculo();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        BusquedaVehiculo.btnenviar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed
    private String ObtenerCodigo(){
        int Cantidad= RV.ContadorVehiculo()+1;
        String numero ="000";
        String Codigo = "NG-";
        if(Cantidad <10){
            numero="00"+String.valueOf(Cantidad);
        }else if(Cantidad >=10 && Cantidad<=99){
            numero="0"+String.valueOf(Cantidad);
        }else if(Cantidad >=100 && Cantidad<=999){
            numero=String.valueOf(Cantidad);
        }
        Codigo=Codigo+numero;
        
        return Codigo;
    }

    void limpiarCampos(){
        txtCodigo.setText("");
        txtPlaca.setText("");
        txtPadron.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtFabricacion.setText("");
        txtCodPropietario.setText("");
        txtPropietario.setText("");
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CbxCombustible;
    private javax.swing.JLabel Disponible;
    public static javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarP;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnGrabar;
    public static javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblmodelo;
    private javax.swing.JLabel lblpadron;
    public static javax.swing.JTextField txtCodPropietario;
    public static javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtFabricacion;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JTextField txtPadron;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtPropietario;
    // End of variables declaration//GEN-END:variables
}
