
package sistema_boletaje;

import Bean.Vehiculo;
import Dao.PersonalDao;
import Dao.VehiculoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class BusquedaVehiculo extends javax.swing.JInternalFrame {

    VehiculoDao RV = new VehiculoDao();
    PersonalDao PD = new PersonalDao();
    DefaultTableModel modelo = null;
    private TableRowSorter Filtro;
    public BusquedaVehiculo() {
        initComponents();
        llenarTabla();
    }

    void llenarTabla(){
        ArrayList<Vehiculo> ListadoPersonal; 
        ListadoPersonal= RV.ObtenerVehiculo();
        modelo = (DefaultTableModel)tVehiculo.getModel();
        ListadoPersonal.forEach((obj) -> {
            modelo.addRow(new Object[] { obj.getCodigo(),obj.getPlaca(),obj.getPadron(),obj.getMarca(),obj.getModelo(),obj.getFabricacion(),obj.getPropietario(),obj.getNombreC(),obj.getCombustible()} );
        }); 
    }
    void LimpiarTablas(){
        modelo = (DefaultTableModel)tVehiculo.getModel();
        for(int i=modelo.getRowCount()-1; i>=0; i=i-1){
            modelo.removeRow(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbtPlaca = new javax.swing.JRadioButton();
        rbtPadron = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tVehiculo = new javax.swing.JTable();
        btnenviar = new javax.swing.JButton();

        setClosable(true);
        setTitle("BUSQUEDA VEHICULO");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        buttonGroup1.add(rbtPlaca);
        rbtPlaca.setSelected(true);
        rbtPlaca.setText("PLACA");

        buttonGroup1.add(rbtPadron);
        rbtPadron.setText("PADRON");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtPlaca)
                .addGap(10, 10, 10)
                .addComponent(rbtPadron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPlaca)
                    .addComponent(rbtPadron)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PLACA", "PADRON", "MARCA", "MODELO", "FABRICACION", "COD PROPIETARIO", "NOMBRE ", "COMBUSTIBLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tVehiculoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tVehiculoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tVehiculo);

        btnenviar.setText("ENVIAR");
        btnenviar.setEnabled(false);
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tVehiculoMousePressed
        
    }//GEN-LAST:event_tVehiculoMousePressed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        ActualizarVehiculo.btnModificar.setEnabled(true);
        ActualizarVehiculo.btnCancelar.setEnabled(true);
        
        if(tVehiculo.isEnabled()){
            int SelectFila = tVehiculo.getSelectedRow();
            if(SelectFila>=0 ){
                ActualizarVehiculo.txtCodigo.setText(tVehiculo.getValueAt(SelectFila, 0).toString());
                ActualizarVehiculo.txtPlaca.setText(tVehiculo.getValueAt(SelectFila, 1).toString());
                ActualizarVehiculo.txtPadron.setText(tVehiculo.getValueAt(SelectFila, 2).toString());
                ActualizarVehiculo.txtMarca.setText(tVehiculo.getValueAt(SelectFila, 3).toString());
                ActualizarVehiculo.txtModelo.setText(tVehiculo.getValueAt(SelectFila, 4).toString());
                ActualizarVehiculo.txtFabricacion.setText(tVehiculo.getValueAt(SelectFila, 5).toString());
                ActualizarVehiculo.txtCodPropietario.setText(tVehiculo.getValueAt(SelectFila, 6).toString());
                ActualizarVehiculo.txtPropietario.setText(PD.ObtenerNombre(ActualizarVehiculo.txtCodPropietario.getText()));
                ActualizarVehiculo.CbxCombustible.setSelectedItem(tVehiculo.getValueAt(SelectFila, 8).toString());
                
                   
                    
                   
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"seleccione alguna Fila");
            }
        }

    }//GEN-LAST:event_btnenviarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        txtBuscar.setText(txtBuscar.getText().toUpperCase());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tVehiculoMouseClicked
       if(evt.getClickCount()==2){
           ActualizarVehiculo.btnModificar.setEnabled(true);
        ActualizarVehiculo.btnCancelar.setEnabled(true);
        
        if(tVehiculo.isEnabled()){
            int SelectFila = tVehiculo.getSelectedRow();
            if(SelectFila>=0 ){
                ActualizarVehiculo.txtCodigo.setText(tVehiculo.getValueAt(SelectFila, 0).toString());
                ActualizarVehiculo.txtPlaca.setText(tVehiculo.getValueAt(SelectFila, 1).toString());
                ActualizarVehiculo.txtPadron.setText(tVehiculo.getValueAt(SelectFila, 2).toString());
                ActualizarVehiculo.txtMarca.setText(tVehiculo.getValueAt(SelectFila, 3).toString());
                ActualizarVehiculo.txtModelo.setText(tVehiculo.getValueAt(SelectFila, 4).toString());
                ActualizarVehiculo.txtFabricacion.setText(tVehiculo.getValueAt(SelectFila, 5).toString());
                ActualizarVehiculo.txtCodPropietario.setText(tVehiculo.getValueAt(SelectFila, 6).toString());
                ActualizarVehiculo.txtPropietario.setText(PD.ObtenerNombre(ActualizarVehiculo.txtCodPropietario.getText()));
                ActualizarVehiculo.CbxCombustible.setSelectedItem(tVehiculo.getValueAt(SelectFila, 8).toString());
                
                   
                    
                   
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"seleccione alguna Fila");
            }
        }
       }
    }//GEN-LAST:event_tVehiculoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnenviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtPadron;
    private javax.swing.JRadioButton rbtPlaca;
    public static javax.swing.JTable tVehiculo;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
