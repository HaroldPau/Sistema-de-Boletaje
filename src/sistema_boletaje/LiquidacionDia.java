
package sistema_boletaje;

import Bean.Liquidacion;
import Dao.LiquidacionDao;
import Dao.VehiculoDao;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LiquidacionDia extends javax.swing.JInternalFrame {    
    VehiculoDao VD = new VehiculoDao();
    LiquidacionDao OLD = new LiquidacionDao();
    String Codigo;//codigo del padron
    static public String Id;//codigo del operador
    DefaultTableModel tb;
    String Fecha;
    int[] guia = new int[99];
    int[] codigoB = new int[99];
    int[] codigoL = new int[99];
    
    int iterador;
    public LiquidacionDia() {
        initComponents();     
        iterador=0;
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
            String Feecha= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia);
            
        try {
            java.util.Date fechita  =  new SimpleDateFormat("yyyy/MM/dd").parse(Feecha);
            inicio.setDate(fechita);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(ReporteProduccion.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPadron = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHistorial = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("HISTORIAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("PADRON");

        txtPadron.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPadron.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadronActionPerformed(evt);
            }
        });
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
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

        jLabel2.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        tHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRECIO", "INICIO", "RESPONSABLE", "VUELTAS", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tHistorial);

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed
        
    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            LimpiarTablas();
            Codigo  = VD.ObtenerCodigo(txtPadron.getText());
            String Padron = txtPadron.getText();
            Fecha =String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
            boolean bandera = VD.BuscarVehiculo(Padron);
            if(bandera){
                LlenarTabla(Codigo,Fecha);
            }else{
                JOptionPane.showMessageDialog(null,"NO EXITE EL PADRON");
            }
        }

    }//GEN-LAST:event_txtPadronKeyReleased

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!(evt.getKeyChar()==KeyEvent.VK_ENTER))  {
            
            evt.consume();
        }else{
           
        }if(txtPadron.getText().length()>2){
            evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimpiarTablas();
        Codigo  = VD.ObtenerCodigo(txtPadron.getText());
        String Padron = txtPadron.getText();
        boolean bandera = VD.BuscarVehiculo(Padron);        
        Fecha =String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
        
        if(bandera){
           LlenarTabla(Codigo,Fecha);           
        }else{
            JOptionPane.showMessageDialog(null,"NO EXITE EL PADRON");
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void tHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHistorialMouseClicked
    String[] Opt = {"1","2","3"} ;
    int numero=0;
    
        
        if(evt.getClickCount()==2){
          int FilaSelec = tHistorial.getSelectedRow();
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null, "seleccione alguna liquidacion");
        }else{
            try{
                
           
             String vuelta = (String) JOptionPane.showInputDialog(null,"NUMERO DE VUELTA","ElEGIR",1,null,Opt,Opt[0]);
             
                 numero=Integer.parseInt(vuelta);
             
             
             if(numero!=0){
                 OLD.editarvuelta(guia[FilaSelec], numero);
                 LimpiarTablas();
                 LlenarTabla(Codigo,Fecha);
             }
              }
             catch(HeadlessException | NumberFormatException e){
                     System.out.println("errrorr "+e);
             }
             
              }
            
            
            
        }
         
       
        
        
        /*    int FilaSelec =tHistorial.getSelectedRow();        
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE ALGUNA FILA");
        }else{
            
        }      */  
    }//GEN-LAST:event_tHistorialMouseClicked

    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
    
    }//GEN-LAST:event_txtPadronKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    actualizar();
    LimpiarTablas();
    LlenarTabla(Codigo,Fecha);
    }//GEN-LAST:event_jButton2ActionPerformed
    void LlenarTabla(String Codigo,String fecha){
         ArrayList<Liquidacion> ListaBoletos;
        ListaBoletos = OLD.ListaLiquiActualizar( fecha,Codigo);
        tb=(DefaultTableModel)tHistorial.getModel();
        ListaBoletos.forEach((obj) -> {
            
            tb.addRow(new Object[]{obj.getPrecio(),obj.getInicio(),obj.getNombre(),obj.getVuelta(),true});
            guia[iterador]= obj.getGuia();
            codigoB[iterador]=obj.getCodigob();
            codigoL[iterador]=obj.getCodigoL();
            iterador++;
        });
    }
    
     void LimpiarTablas(){
        tb = (DefaultTableModel)tHistorial.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
    }
     
     void actualizar(){
         boolean bandera= true;
         for(int i=tb.getRowCount()-1; i>=0; i=i-1){
             bandera= (boolean)tHistorial.getValueAt(i, 4);
             if(!bandera){
                 System.out.println(""+codigoL[i]);
                 OLD.eliminar(codigoL[i]);
                 OLD.anularliquidacion(tHistorial.getValueAt(i, 1).toString(), codigoB[i]);
             }
         }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tHistorial;
    private javax.swing.JTextField txtPadron;
    // End of variables declaration//GEN-END:variables
}
