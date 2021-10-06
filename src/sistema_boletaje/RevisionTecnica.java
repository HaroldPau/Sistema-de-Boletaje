/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_boletaje;

import Dao.VehiculoDao;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ad
 */
public class RevisionTecnica extends javax.swing.JInternalFrame {

    VehiculoDao VD = new VehiculoDao();
    String Codigo;
    public RevisionTecnica() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPadron = new javax.swing.JTextField();
        txtfecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblfecha2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("REVISION TECNICA");
        setMaximumSize(new java.awt.Dimension(250, 190));
        setMinimumSize(new java.awt.Dimension(250, 190));
        setPreferredSize(new java.awt.Dimension(250, 190));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PADRON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

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
        getContentPane().add(txtPadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, 80, -1));

        txtfecha1.setEnabled(false);
        txtfecha1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfecha1FocusLost(evt);
            }
        });
        txtfecha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfecha1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfecha1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfecha1KeyTyped(evt);
            }
        });
        getContentPane().add(txtfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 64, 134, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FECHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, -1, -1));

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 111, -1, 34));

        lblfecha2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblfecha2.setForeground(new java.awt.Color(255, 0, 0));
        lblfecha2.setText("jLabel16");
        getContentPane().add(lblfecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed

    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            
            Codigo  = VD.ObtenerCodigo(txtPadron.getText());
            String Padron = txtPadron.getText();
            
            boolean bandera = VD.BuscarVehiculo(Padron);
            
            if(bandera){
                txtfecha1.setEnabled(true);
                txtfecha1.setText(VD.ObtenerfechaRT(Codigo));
            }else{
                JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO");
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

    private void txtfecha1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfecha1FocusLost
        if(txtfecha1.getText().length()<10){

            lblfecha2.setText(" FORMATO FECHA(dd/MM/yyyy)");

        }
        if("".equals(lblfecha2.getText())){
            if(!Caducidad()){
                lblfecha2.setText("R.T. CADUCA");
            }
        }
        
        

    }//GEN-LAST:event_txtfecha1FocusLost
private boolean Caducidad (){
        boolean Estado= true;
        int dia = Integer.parseInt(txtfecha1.getText().substring(0,2));
        int mes = Integer.parseInt(txtfecha1.getText().substring(3,5));
        int anio = Integer.parseInt(txtfecha1.getText().substring(6,10));        
        
        
        Calendar fecha = new GregorianCalendar();        
        int anioS = fecha.get(Calendar.YEAR);
        int mesS = fecha.get(Calendar.MONTH)+1;
        int diaS = fecha.get(Calendar.DAY_OF_MONTH);
        
        if(anio==anioS){
           if(mes==mesS ){
               if(dia<diaS){
                   Estado=false;
               }
           }else if(mes<mesS){
               Estado=false;
           } 
        }else if(anio<anioS){
            Estado= false;
        }
        return Estado;
    }
    private void txtfecha1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfecha1KeyPressed
        String Cadena="";
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            if(txtfecha1.getText().length()==6){
                for (int x=0; x <= txtfecha1.getText().length()-2; x++) {
                    Cadena += txtfecha1.getText().charAt(x);

                }
                txtfecha1.setText(Cadena);
            }
            if(txtfecha1.getText().length()==3){
                for (int x=0; x <= txtfecha1.getText().length()-2; x++) {
                    Cadena += txtfecha1.getText().charAt(x);

                }
                txtfecha1.setText(Cadena);
            }

        }
    }//GEN-LAST:event_txtfecha1KeyPressed

    private void txtfecha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfecha1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha1KeyReleased

    private void txtfecha1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfecha1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            evt.consume();

        }else{

            if(txtfecha1.getText().length()==2){
                if(Integer.parseInt(txtfecha1.getText().substring(0,2))>31){
                    lblfecha2.setText("DIA NO VALIDO");

                }
                txtfecha1.setText(txtfecha1.getText()+"/");

            }else if(txtfecha1.getText().length()==5){
                txtfecha1.setText(txtfecha1.getText()+"/");
                if(Integer.parseInt(txtfecha1.getText().substring(3,5))>12){
                    lblfecha2.setText("MES NO VALIDO");

                }
            }

            else if(txtfecha1.getText().length()>9){
                evt.consume();
            }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){

                lblfecha2.setText("");

            }
        }
    }//GEN-LAST:event_txtfecha1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        VD.ActualizarCaducidad(txtfecha1.getText(),Codigo );
        JOptionPane.showMessageDialog(null, "FECHA ACTUALIZADA");
        txtPadron.setText("");
        txtfecha1.setText("");
        txtPadron.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblfecha2;
    private javax.swing.JTextField txtPadron;
    private javax.swing.JTextField txtfecha1;
    // End of variables declaration//GEN-END:variables
}
