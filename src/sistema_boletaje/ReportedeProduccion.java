
package sistema_boletaje;

import Dao.VehiculoDao;
import Util.ConexionBD;
import java.awt.event.KeyEvent;

import java.net.URL;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.util.JRLoader;

import net.sf.jasperreports.view.JasperViewer;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

public class ReportedeProduccion extends javax.swing.JInternalFrame {

    VehiculoDao VD = new VehiculoDao();
    public ReportedeProduccion() {
        initComponents();
        lblpadron.setText("");
        
        
        
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
            String Fecha= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia);
            
        try {
            java.util.Date fechita  =  new SimpleDateFormat("yyyy/MM/dd").parse(Fecha);
            inicio.setDate(fechita);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(ReporteProduccion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtPadron = new javax.swing.JTextField();
        inicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblpadron = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JLabel();
        rbtD = new javax.swing.JRadioButton();
        rbtDD = new javax.swing.JRadioButton();
        rbtMesual = new javax.swing.JRadioButton();
        rbtVxo = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("PRODUCCION DIARIA");
        setMaximumSize(new java.awt.Dimension(350, 185));
        setMinimumSize(new java.awt.Dimension(350, 185));
        setPreferredSize(new java.awt.Dimension(377, 215));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PADRON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 10));

        txtPadron.setBackground(new java.awt.Color(0, 255, 204));
        txtPadron.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPadron.setEnabled(false);
        txtPadron.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPadronKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPadronKeyTyped(evt);
            }
        });
        getContentPane().add(txtPadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 64, -1));

        inicio.setBackground(new java.awt.Color(0, 255, 204));
        inicio.setForeground(new java.awt.Color(204, 0, 0));
        inicio.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        jLabel2.setText("FECHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton1.setText("PROCESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 123, 41));

        lblpadron.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblpadron.setForeground(new java.awt.Color(255, 0, 0));
        lblpadron.setText("jLabel3");
        getContentPane().add(lblpadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 99, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 41, 114, 29));

        buttonGroup1.add(rbtD);
        rbtD.setText("DIARIO X PADRON");
        rbtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDActionPerformed(evt);
            }
        });
        jPanel1.add(rbtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonGroup1.add(rbtDD);
        rbtDD.setSelected(true);
        rbtDD.setText("DIARIO");
        rbtDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDDActionPerformed(evt);
            }
        });
        jPanel1.add(rbtDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        buttonGroup1.add(rbtMesual);
        rbtMesual.setText("MENSUAL");
        rbtMesual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMesualActionPerformed(evt);
            }
        });
        jPanel1.add(rbtMesual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        buttonGroup1.add(rbtVxo);
        rbtVxo.setText("VUELTAS X OPERADOR");
        jPanel1.add(rbtVxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rbtD.isSelected()){
                String Padron = txtPadron.getText();
            boolean bandera = VD.BuscarVehiculo(Padron);
            if("".equals(txtPadron.getText())){
                JOptionPane.showMessageDialog(null, "DIGITE UN PADRON");
            }else{
                if(bandera){
                    ReporteProduccion.inicio=String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
                    ReporteProduccion.codigo = VD.ObtenerCodigo(txtPadron.getText());
                    ReporteProduccion.padron= txtPadron.getText();
                    ReporteProduccion obMa = new ReporteProduccion();
                    Entorno.add(obMa);
                    Centrar(Entorno, obMa);
                    obMa.toFront();
                    obMa.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO");
                }
            }
        }else if (rbtDD.isSelected()) {
            
            try {
                String fecha2 = String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
                
                ConexionBD con = new ConexionBD();
                Connection conn = con.getConexion();
                JasperReport reporte = null;
                //String path ="src\\reportes\\report1.jasper";
                Map parametro = new HashMap();
                parametro.put("fecha",fecha2 ); 
                URL path = this.getClass().getResource("/reportes/REPORTEBOLETAJE.jasper");
                reporte = (JasperReport) JRLoader.loadObject(path);
                
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);
                JasperViewer view = new JasperViewer(jprint,false); 
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
                
            } catch (JRException ex) {
                Logger.getLogger(ReportedeProduccion.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }else if (rbtVxo.isSelected()) {
            try {
                String fecha2 = String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
                
                ConexionBD con = new ConexionBD();
                Connection conn = con.getConexion();
                JasperReport reporte = null;
                Map parametro = new HashMap();
                parametro.put("mes",fecha2 );
                parametro.put("anio", fecha2); 
                URL path = this.getClass().getResource("/reportes/VueltasxOperadorMes.jasper");
                reporte = (JasperReport) JRLoader.loadObject(path);                
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);
                JasperViewer view = new JasperViewer(jprint,false); 
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } catch (JRException ex) {
                Logger.getLogger(ReportedeProduccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        else{
            try {
                
                int mes = this.inicio.getCalendar().get(Calendar.MONTH)+1;
                int year = this.inicio.getCalendar().get(Calendar.YEAR);
                
                ConexionBD con = new ConexionBD();
                Connection conn = con.getConexion();
                JasperReport reporte = null;
                //String path ="src\\reportes\\report1.jasper";
                Map parametro = new HashMap();
                parametro.put("mes",mes );
                parametro.put("year", year);
                URL path = this.getClass().getResource("/reportes/REPORTEMENSUALBOLETO.jasper");
                reporte = (JasperReport) JRLoader.loadObject(path);                
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);
                JasperViewer view = new JasperViewer(jprint,false); 
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
                
            } catch (JRException ex) {
                Logger.getLogger(ReportedeProduccion.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            lblpadron.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblpadron.setText("");
        }if(txtPadron.getText().length()>2){
                evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void txtPadronKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String Padron = txtPadron.getText();
        boolean bandera = VD.BuscarVehiculo(Padron);
        if("".equals(txtPadron.getText())){
            JOptionPane.showMessageDialog(null, "DIGITE UN PADRON");
        }else{
            if(bandera){
                ReporteProduccion.inicio=String.valueOf(inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(inicio.getCalendar().get(Calendar.YEAR)));
                ReporteProduccion.codigo = VD.ObtenerCodigo(txtPadron.getText());
                ReporteProduccion.padron= txtPadron.getText();
                ReporteProduccion obMa = new ReporteProduccion();
                Entorno.add(obMa);
                Centrar(Entorno, obMa);
                obMa.toFront();
                obMa.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO");
            }
        }
        
        
        
        }
    }//GEN-LAST:event_txtPadronKeyPressed

    private void rbtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDActionPerformed
        if(rbtD.isSelected()){
            txtPadron.setEnabled(true);
        }else{
            txtPadron.setEnabled(false);
        }
    }//GEN-LAST:event_rbtDActionPerformed

    private void rbtDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDDActionPerformed
        if(!rbtDD.isSelected()){
            txtPadron.setEnabled(true);
        }else{
            txtPadron.setEnabled(false);
        }
    }//GEN-LAST:event_rbtDDActionPerformed

    private void rbtMesualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMesualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtMesualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpadron;
    private javax.swing.JRadioButton rbtD;
    private javax.swing.JRadioButton rbtDD;
    private javax.swing.JRadioButton rbtMesual;
    private javax.swing.JRadioButton rbtVxo;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtPadron;
    // End of variables declaration//GEN-END:variables
}
