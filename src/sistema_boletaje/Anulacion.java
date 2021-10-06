
package sistema_boletaje;

import Bean.DistribucionBoletos;
import Dao.DistribucionDao;
import Dao.LiquidacionDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Anulacion extends javax.swing.JInternalFrame {
    DefaultTableModel tb;
    DistribucionDao DBD = new DistribucionDao();
    LiquidacionDao OLD = new LiquidacionDao();
    static public String Padron;
    
    public Anulacion() {
        initComponents();
        
        
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletosLiquidacion(Padron);
        tb=(DefaultTableModel)tAnulacion.getModel();
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getPrecio(),obj.getInicio(),true});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAnulacion = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("ANULACION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ANULACION"));

        tAnulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRECIO", "INICIO", "ACTIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tAnulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAnulacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tAnulacionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tAnulacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jButton1.setText("ANULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tAnulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAnulacionMouseClicked
        
    }//GEN-LAST:event_tAnulacionMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GrabarLiquidacion();
        JOptionPane.showMessageDialog(null, "BOLETOS ANULADOS CORRECTAMENTE");
            ControlBoleto.LimpiarTablas();
            ControlBoleto.LlenarTabla(ControlBoleto.tb4,"4.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb35,"3.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb3,"3.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb25,"2.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb2,"2.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb15,"1.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb5,"1.20",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb1,"1.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb70,"0.70",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb50,"0.50",Padron);            
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tAnulacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAnulacionMousePressed
        
    }//GEN-LAST:event_tAnulacionMousePressed
    private void GrabarLiquidacion(){
        boolean Activo;
        String inicio;
        String StringActivo;
        String StringAnulado;
        double precio;
        int Codigo;
        
        
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            Activo = (boolean)tAnulacion.getValueAt(i,2);
            inicio=(String)tAnulacion.getValueAt(i,1);
            precio=(double)tAnulacion.getValueAt(i,0);
           
                if(Activo){
                    StringActivo="SI";
                    StringAnulado="NO";                    
                    
                }else{
                    StringActivo="NO";
                    StringAnulado="SI";                    
                }
                
                Codigo = DBD.idDetalle(inicio, precio, Padron);
                
                DBD.AnularBoleto(Codigo, StringActivo, StringAnulado);
                
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAnulacion;
    // End of variables declaration//GEN-END:variables
}
