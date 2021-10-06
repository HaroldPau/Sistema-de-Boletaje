/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_boletaje;

import Util.ConexionBD;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ReporteDespachoB extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReporteDespachoB
     */
    public ReporteDespachoB() {
        initComponents();
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
            String Fecha= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia);
            
        try {
            java.util.Date fechita  =  new SimpleDateFormat("yyyy/MM/dd").parse(Fecha);
            jfecha.setDate(fechita);
        } catch (ParseException ex) {
            Logger.getLogger(ReporteDespachoB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("REPORTE DE DESPACHO");

        jfecha.setBackground(new java.awt.Color(0, 255, 204));
        jfecha.setForeground(new java.awt.Color(204, 0, 0));
        jfecha.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("DETALLADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("GLOBAL");
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String fecha1 = String.valueOf(this.jfecha.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.YEAR)));            ConexionBD con = new ConexionBD();
            Connection conn = con.getConexion();
            JasperReport reporte = null;
            Map parametro = new HashMap();
            parametro.put("FECHA",fecha1 );

            URL path = this.getClass().getResource("/reportes/DESPACHOB_DET.jasper");

            reporte = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);

            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String fecha1 = String.valueOf(this.jfecha.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.jfecha.getCalendar().get(Calendar.YEAR)));

            ConexionBD con = new ConexionBD();
            Connection conn = con.getConexion();
            JasperReport reporte = null;
            //String path ="src\\reportes\\report1.jasper";
            Map parametro = new HashMap();
            parametro.put("FECHA",fecha1 );
            URL path = this.getClass().getResource("/reportes/DESPACHOB_GLO.jasper");
            reporte = (JasperReport) JRLoader.loadObject(path);

            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro,conn);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            

        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jfecha;
    // End of variables declaration//GEN-END:variables
}
