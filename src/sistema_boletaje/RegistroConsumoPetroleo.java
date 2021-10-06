/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_boletaje;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Dao.CombustibleDao;
import Dao.ControlCombustibleDao;
import Dao.VehiculoDao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;


public class RegistroConsumoPetroleo extends javax.swing.JInternalFrame {

    float galon,precio;
    
    
    public RegistroConsumoPetroleo() {
        initComponents();
        
        cbxvuelta.setSelectedIndex(3);
        
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
        
        //-------------------------PRECIO COMBUSTIBLE--------------------------------
        CombustibleDao CombDao = new CombustibleDao();
        precio= CombDao.ConsultaPrecio();
        
        //---------------------------------------------------------------------------
        txtPadron.requestFocus();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        txtPadron = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxvuelta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("FECHA");

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

        jLabel3.setText("VUELTA");

        cbxvuelta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.5", "1", "1.5", "2", "2.5", "3" }));
        cbxvuelta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxvueltaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbxvueltaKeyTyped(evt);
            }
        });

        jLabel4.setText("TOTAL");

        txtmonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmontoKeyTyped(evt);
            }
        });

        jButton1.setText("GRABAR");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(cbxvuelta, 0, 94, Short.MAX_VALUE))
                    .addComponent(jfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbxvuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed

    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
                ActualizarRegistroPetroleo.txtPadron.setText(txtPadron.getText());
                String Fechaa= String.valueOf(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(jfecha.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(jfecha.getCalendar().get(Calendar.YEAR)));
                
                
                
                 try {
                     
            java.util.Date fechitaa  =  new SimpleDateFormat("dd/MM/yy").parse(Fechaa);            
            ActualizarRegistroPetroleo.jfecha.setDate(fechitaa);
            ActualizarRegistroPetroleo.banderita=true;
            
        } catch (ParseException ex) {
            System.err.println(ex);
            
        }
                
                
                
                cbxvuelta.requestFocus();
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
           Guardar();
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxvueltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxvueltaKeyTyped
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            txtmonto.requestFocus();
        }
    }//GEN-LAST:event_cbxvueltaKeyTyped

    private void cbxvueltaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxvueltaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            txtmonto.requestFocus();
        }
    }//GEN-LAST:event_cbxvueltaKeyPressed

    private void txtmontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoKeyReleased
        if(!txtmonto.getText().equals("")){
            if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
                Guardar();
            }
        }
       
        
    }//GEN-LAST:event_txtmontoKeyReleased

    private void jfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyPressed
        
    }//GEN-LAST:event_jfechaKeyPressed

    private void txtmontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_PERIOD) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!(evt.getKeyChar()==KeyEvent.VK_ENTER))  {
            
            evt.consume();
        }else{
            
        }
    }//GEN-LAST:event_txtmontoKeyTyped

    private void jfechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            txtPadron.requestFocus();
        }
    }//GEN-LAST:event_jfechaKeyReleased
    private void Guardar(){
        
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');

        DecimalFormat formato1 = new DecimalFormat("#.0000", separadoresPersonalizados);
        
        float total = Float.parseFloat(txtmonto.getText());
        galon= total/precio;
        
        String Fecha= String.valueOf(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(jfecha.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(jfecha.getCalendar().get(Calendar.YEAR)));
        ControlCombustibleDao CCDao = new ControlCombustibleDao();
        VehiculoDao VDao = new VehiculoDao();
        
       if(VDao.ObtenerCodigo(txtPadron.getText()) != null){
           CCDao.RegistrarConsumo(CCDao.idConsumoPetroleo(), Float.parseFloat(cbxvuelta.getSelectedItem().toString()),VDao.ObtenerCodigo(txtPadron.getText()), Fecha, total,Float.parseFloat(formato1.format(galon)), Principal.usuario);
        txtPadron.setText("");
        txtmonto.setText("");
        jfecha.requestFocus();
        JOptionPane.showMessageDialog(null,"CONSUMO REGISTRADO");
        ActualizarRegistroPetroleo.banderita=true;
       }else{
           JOptionPane.showMessageDialog(null,"PADRON INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
           txtPadron.requestFocus();
        
        
       }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxvuelta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JTextField txtPadron;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables
}
