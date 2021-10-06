
package sistema_boletaje;

import Bean.ControlCombustible;
import Dao.CombustibleDao;
import Dao.ControlCombustibleDao;
import Dao.VehiculoDao;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ActualizarRegistroPetroleo extends javax.swing.JInternalFrame implements Runnable{

    DefaultTableModel tb;
    static public boolean banderita = false;
    Thread hilo;
    String feecha;
    public ActualizarRegistroPetroleo() {
        initComponents();
        
        //-------------------------FECHA EN CALENDARIO----------------------------------
        Calendar fecha = new GregorianCalendar();
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
                
        String Fecha= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia-1);
        
        
        try {
            java.util.Date fechita  =  new SimpleDateFormat("yyyy/MM/dd").parse(Fecha);
            jfecha.setDate(fechita);
            
            
        } catch (ParseException ex) {
            System.err.println(ex);
            
        }
        
        
        hilo=new Thread(this);
        hilo.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPadron = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jfecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tControlCombustible = new javax.swing.JTable();

        setClosable(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                formAncestorRemoved(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel2.setText("PADRON");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jfecha.setBackground(new java.awt.Color(0, 255, 204));
        jfecha.setForeground(new java.awt.Color(204, 0, 0));
        jfecha.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfechaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jfechaKeyReleased(evt);
            }
        });

        jLabel1.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addComponent(jfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tControlCombustible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PADRON", "MONTO", "VUELTA", "ACTIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tControlCombustible);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyPressed

    }//GEN-LAST:event_jfechaKeyPressed

    private void jfechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            txtPadron.requestFocus();
        }
    }//GEN-LAST:event_jfechaKeyReleased

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed

    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(!txtPadron.getText().equals(""));
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
          limpiarTabla();
          llenarTabla();  
        }
    }//GEN-LAST:event_txtPadronKeyReleased

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!(evt.getKeyChar()==KeyEvent.VK_ENTER))  {

            evt.consume();
        }else{

        }if(txtPadron.getText().length()>3){
            evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizar();
        ReporteFaltaConbustible.bandera = true;     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorRemoved
        hilo.stop();
    }//GEN-LAST:event_formAncestorRemoved
    private void llenarTabla(){
        ControlCombustibleDao OCC = new ControlCombustibleDao();
        VehiculoDao OVD = new VehiculoDao();
        String Padron = OVD.ObtenerCodigo(txtPadron.getText());
        ArrayList<ControlCombustible> ListaControlC;
        String Fecha =String.valueOf(this.jfecha.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.YEAR)));
        ListaControlC = OCC.ListaControlCombustibleActualizar(Fecha, Padron);
        tb=(DefaultTableModel)tControlCombustible.getModel();
        ListaControlC.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getIdCombustible(),obj.getVehiculo(),obj.getTotalPago(),obj.getVueltas(),true});
        });
    }
    
    private void limpiarTabla(){
        tb = (DefaultTableModel)tControlCombustible.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
    }
    void actualizar(){
         ControlCombustibleDao OCC = new ControlCombustibleDao();
         float precio, vuelta;
         int codigo;
         
         DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');

        DecimalFormat formato1 = new DecimalFormat("#.0000", separadoresPersonalizados);
        
        
         CombustibleDao CombDao = new CombustibleDao();
         float precioCombustible= CombDao.ConsultaPrecio();
         float totalGalon;
         
         boolean bandera;
         for(int i=tb.getRowCount()-1; i>=0; i=i-1){
             bandera=(boolean)tControlCombustible.getValueAt(i,4);
             
             vuelta=(float)tControlCombustible.getValueAt(i,3);
             
             precio=(float)tControlCombustible.getValueAt(i,2);
             codigo=(int)tControlCombustible.getValueAt(i,0);
             if(!bandera){
                 OCC.eliminar(codigo);
             }else{
                 totalGalon= precio/precioCombustible;                          
                 OCC.ActualizarConsumoPetroleo(precio,vuelta,codigo,Float.parseFloat(formato1.format(totalGalon)) );
             }
             
             
             
             
             
         }
         JOptionPane.showMessageDialog(null,"REGISTRO ACTUALIZADO");
         limpiarTabla();
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JTable tControlCombustible;
    public static javax.swing.JTextField txtPadron;
    // End of variables declaration//GEN-END:variables
    @Override
    public void run() {
         int iii = 1;
        
        Thread current=Thread.currentThread();
        while(current==hilo){
            try {
                    Thread.sleep(1000);
             iii++;
            if(banderita){
            limpiarTabla();
            llenarTabla();
            banderita=false;
                       
                
                    }else{
                System.out.println(String.valueOf(iii));
            }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReporteFaltaConbustible.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            
           
        }
        
        
    }

}
