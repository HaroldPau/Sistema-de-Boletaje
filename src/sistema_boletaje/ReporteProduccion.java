/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_boletaje;

import Bean.Liquidacion;
import Dao.LiquidacionDao;
import Dao.VehiculoDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

/**
 *
 * @author Harold7v7
 */
public class ReporteProduccion extends javax.swing.JInternalFrame {
    static public String inicio, ultimo,codigo,padron;
    DefaultTableModel modelo = null;
    LiquidacionDao LD = new LiquidacionDao();
    int i =0;
    String[] nombre = new String[4];
    String[] codigos = new String[4];
    int vuelta=0;
    int vueltatotal=0;
    ArrayList<Liquidacion> ListadoPersonal; 
    
    //setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    
    public ReporteProduccion() {
        initComponents();
        
        nombre[0] ="todos";
        
        
            ListadoPersonal= LD.ObtenerLiquidacion(inicio, codigo);
            cbxnombre.addItem("TODOS");
            modelo = (DefaultTableModel)treporte.getModel();
            limpiartabla();
            
            for(Liquidacion obj:ListadoPersonal){                
            modelo.addRow(new Object[] {obj.getPrecio(),obj.getCantidad(),obj.getTotal()} );
            
            if(!nombre[i].equals(obj.getNombre())){
                i++;
                nombre[i]=obj.getNombre();
                cbxnombre.addItem(obj.getNombre());
                codigos[i]=obj.getCodigoe();
                vuelta+=obj.getVuelta();
                vueltatotal+=obj.getVuelta();
            }            
            }            
            int cantidad = treporte.getRowCount()-1;
            double total=0;
            int pasajeros =0;
            
            for(int i=0; i<=cantidad;i++){
                total=total+(double)treporte.getValueAt(i,2);
                pasajeros=pasajeros+(int)treporte.getValueAt(i,1);
            }
            lblvueltas.setText("VUELTAS "+vueltatotal);
            
            
            txtTotal.setText("S/. "+String.valueOf(total));
            lblPasajero.setText(String.valueOf(pasajeros));
            
            
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IMPRIMIR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treporte = new javax.swing.JTable();
        cbxnombre = new javax.swing.JComboBox<>();
        lblvueltas = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPasajero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.gray);
        setTitle("PRODUCCION TOTAL");
        setMaximumSize(new java.awt.Dimension(442, 539));
        setMinimumSize(new java.awt.Dimension(442, 539));
        setPreferredSize(new java.awt.Dimension(442, 539));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IMPRIMIR.setBorder(javax.swing.BorderFactory.createTitledBorder("Produccion total"));
        IMPRIMIR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("RECAUDADO:");
        IMPRIMIR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        treporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRECIO BOLETO", "CANTIDAD VENDIDA", "TOTAL VENDIDO"
            }
        ));
        jScrollPane1.setViewportView(treporte);

        IMPRIMIR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 340));

        cbxnombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxnombreItemStateChanged(evt);
            }
        });
        cbxnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxnombreActionPerformed(evt);
            }
        });
        IMPRIMIR.add(cbxnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, -1));

        lblvueltas.setText("VUELTAS: X");
        IMPRIMIR.add(lblvueltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTotal.setText("XXXXXXXXXX");
        IMPRIMIR.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("PAJASEROS:");
        IMPRIMIR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        lblPasajero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPasajero.setText("XXXXXXX");
        IMPRIMIR.add(lblPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 70, -1));

        getContentPane().add(IMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 450));

        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo=(DefaultTableModel)treporte.getModel();
        ImprimirLiquidacionDia.tb = modelo;
       
        
        
        ImprimirLiquidacionDia obMa = new ImprimirLiquidacionDia();
        
        
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        
         if(cbxnombre.getSelectedItem()!="TODOS"){
            ImprimirLiquidacionDia.lblnombre.setText(cbxnombre.getSelectedItem().toString());
        }else{
            if(cbxnombre.getItemCount()>2){
                ImprimirLiquidacionDia.lblnombre.setVisible(false);
            }else{
                
                ImprimirLiquidacionDia.lblnombre.setText(cbxnombre.getItemAt(1));
                
            }
        }
        ImprimirLiquidacionDia.lblvuelta.setText(lblvueltas.getText());
        ImprimirLiquidacionDia.lbltotal.setText(txtTotal.getText());
        ImprimirLiquidacionDia.lblpadron.setText(padron);
        ImprimirLiquidacionDia.lblpasajero.setText(lblPasajero.getText());
        
        VehiculoDao VD = new VehiculoDao();
        ImprimirLiquidacionDia.lblplaca.setText(VD.ObtenerPlaca(padron));
        
        obMa.setVisible(false);
        ImprimirLiquidacionDia.Imprimir();
        obMa.dispose();
        
        /*try {
        MessageFormat headerFormat = new MessageFormat("Registro de producción Padron: "+padron);
        MessageFormat footerForma = new MessageFormat("TOTAL:  "+txtTotal.getText());
        MessageFormat footerFormat = new MessageFormat("Empresa Salvador S.A.C.");
        treporte.print(JTable.PrintMode.NORMAL, headerFormat,footerForma);


        }catch(PrinterException e){
           Logger.getLogger(ReporteProduccion.class.getName()).log
           (Level.SEVERE, null, e);

        }*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxnombreActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_cbxnombreActionPerformed

    private void cbxnombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxnombreItemStateChanged
        if(cbxnombre.getComponentCount()<=3){
            limpiartabla();
                       
            llenadototal();
            llenado1();
            llenado2();
            llenado3();
        }
        
    }//GEN-LAST:event_cbxnombreItemStateChanged

    void llenadototal(){
        
        if(cbxnombre.getSelectedIndex()==0){
           ListadoPersonal= LD.ObtenerLiquidacion(inicio, codigo);            
            modelo = (DefaultTableModel)treporte.getModel();
            
            
            for(Liquidacion obj:ListadoPersonal){                
            modelo.addRow(new Object[] {obj.getPrecio(),obj.getCantidad(),obj.getTotal()} );
            
                        
            }            
            int cantidad = treporte.getRowCount()-1;
            double total=0;
            int pasajeros = 0;
            
            for(int i=0; i<=cantidad;i++){
                total=total+(double)treporte.getValueAt(i,2);
                pasajeros=pasajeros+(int)treporte.getValueAt(i,1);
            }
            lblvueltas.setText("VUELTAS "+vueltatotal);
            
            lblPasajero.setText(String.valueOf(pasajeros));
            txtTotal.setText("S/. "+String.valueOf(total));
        }
    }
    void llenado1(){
        if(cbxnombre.getSelectedIndex()==1){
          ListadoPersonal= LD.ObtenerLiquidacionFiltro(inicio, codigo,codigos[1]);
          i=0;
          vuelta=0;
            for(Liquidacion obj:ListadoPersonal){                
            modelo.addRow(new Object[] {obj.getPrecio(),obj.getCantidad(),obj.getTotal()} );
            
            if(!nombre[i].equals(obj.getNombre())){
                i++;
                vuelta=obj.getVuelta();
            }            
            }            
            int cantidad = treporte.getRowCount()-1;
            double total=0;
            int pasajeros = 0;
            
            for(int i=0; i<=cantidad;i++){
                total=total+(double)treporte.getValueAt(i,2);
                pasajeros=pasajeros+(int)treporte.getValueAt(i,1);
            }
            lblvueltas.setText("VUELTAS "+vuelta);
            
            lblPasajero.setText(String.valueOf(pasajeros));
            txtTotal.setText("S/. "+String.valueOf(total));
          
        }
    }
    void llenado2(){
        if(cbxnombre.getSelectedIndex()==2){
            ListadoPersonal= LD.ObtenerLiquidacionFiltro(inicio, codigo,codigos[2]);
          i=0;
          vuelta=0;
            for(Liquidacion obj:ListadoPersonal){                
            modelo.addRow(new Object[] {obj.getPrecio(),obj.getCantidad(),obj.getTotal()} );
            
            if(!nombre[i].equals(obj.getNombre())){                
                i++;
                vuelta=obj.getVuelta();
            }            
            }            
            int cantidad = treporte.getRowCount()-1;
            double total=0;
            int pasajeros = 0;
            
            for(int i=0; i<=cantidad;i++){
                total=total+(double)treporte.getValueAt(i,2);
                pasajeros=pasajeros+(int)treporte.getValueAt(i,1);
            }
            lblvueltas.setText("VUELTAS "+vuelta);
            
            lblPasajero.setText(String.valueOf(pasajeros));
            txtTotal.setText("S/. "+String.valueOf(total));
        }
    }
    void llenado3(){
        
        if(cbxnombre.getSelectedIndex()==3){
            ListadoPersonal= LD.ObtenerLiquidacionFiltro(inicio, codigo,codigos[3]);
          i=0;
          vuelta=0;
            for(Liquidacion obj:ListadoPersonal){                
            modelo.addRow(new Object[] {obj.getPrecio(),obj.getCantidad(),obj.getTotal()} );
            
            if(!nombre[i].equals(obj.getNombre())){
                i++;                
                vuelta=obj.getVuelta();
            }            
            }            
            int cantidad = treporte.getRowCount()-1;
            double total=0;
            int pasajeros = 0;
            
            for(int i=0; i<=cantidad;i++){
                total=total+(double)treporte.getValueAt(i,2);
                pasajeros=pasajeros+(int)treporte.getValueAt(i,1);
            }
            lblvueltas.setText("VUELTAS "+vuelta);
            
            
            txtTotal.setText("S/. "+String.valueOf(total));
            lblPasajero.setText(String.valueOf(pasajeros));
        
            }
    }
    
     private void limpiartabla(){
        modelo = (DefaultTableModel)treporte.getModel();
        for(int i=modelo.getRowCount()-1; i>=0; i=i-1){
            modelo.removeRow(i);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IMPRIMIR;
    private javax.swing.JComboBox<String> cbxnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPasajero;
    private javax.swing.JLabel lblvueltas;
    private javax.swing.JTable treporte;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables




}
