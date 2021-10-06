/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_boletaje;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author harold7v7
 */
public class ImprimirLiquidacionDia extends javax.swing.JInternalFrame {

    static public DefaultTableModel tb;
    public ImprimirLiquidacionDia() {
        initComponents();
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);

            String Fecha= String.valueOf(dia)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(ano);
            lblfecha.setText(Fecha);
            
            
            int hora, minutos;
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        
        
        
        String Shora, Sminutos;
        if(hora < 10){
            Shora="0"+hora;
            
        }else{
            Shora= String.valueOf(hora);
        }
        
        
        if(minutos<10){
           Sminutos = "0"+ minutos; 
        }else{
            Sminutos = String.valueOf(minutos);
        }
        
        String horas = Shora + ":" + Sminutos;
        
        lblhora.setText(horas);
            
        
        tImprimirL.setModel(tb);
        //JScrollPane pane = new JScrollPane(tImprimirL);
        //pane.getViewport().setBackground(Color.WHITE);
    }
    
    static public void Imprimir(){
        printRecord(imprimirpanel);
        
        
        
}
    
    
    static public void printRecord(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("ESTEFANIE YA ESTA TU LIQUIDACION 7.7");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(0.6, 0.8);                
                // Now paint panel as graphics2D
                panel.paint(graphics2D);                
                // return if page exists
                return Printable.PAGE_EXISTS;            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
               
            }catch (PrinterException printerException){
                
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imprimirpanel = new javax.swing.JPanel();
        lblfecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblvuelta = new javax.swing.JLabel();
        lblpadron = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tImprimirL = new javax.swing.JTable();
        lblpasajero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblplaca = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.black);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imprimirpanel.setBackground(new java.awt.Color(255, 255, 255));
        imprimirpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfecha.setText("01/01/2021");
        imprimirpanel.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel6.setText("FECHA");
        imprimirpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        lblvuelta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblvuelta.setText("VUELTAS : X");
        imprimirpanel.add(lblvuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 110, -1));

        lblpadron.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblpadron.setText("999");
        imprimirpanel.add(lblpadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblnombre.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        imprimirpanel.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 360, -1));

        jLabel2.setText("PLACA");
        imprimirpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel1.setText("OPERADOR");
        imprimirpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL:");
        imprimirpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotal.setText("9999.9999");
        imprimirpanel.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 110, -1));

        tImprimirL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tImprimirL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRECIO", "CANTIDAD", "TOTAL"
            }
        ));
        tImprimirL.setToolTipText("");
        jScrollPane1.setViewportView(tImprimirL);

        imprimirpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 360));

        lblpasajero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpasajero.setText("9999.9999");
        imprimirpanel.add(lblpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PASAJEROS:");
        imprimirpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel5.setText("PADRON");
        imprimirpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblplaca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblplaca.setText("ATZ-270");
        imprimirpanel.add(lblplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblhora.setText("00:00");
        imprimirpanel.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel7.setText("HORA");
        imprimirpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        getContentPane().add(imprimirpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel imprimirpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lblhora;
    public static javax.swing.JLabel lblnombre;
    public static javax.swing.JLabel lblpadron;
    public static javax.swing.JLabel lblpasajero;
    public static javax.swing.JLabel lblplaca;
    public static javax.swing.JLabel lbltotal;
    public static javax.swing.JLabel lblvuelta;
    private javax.swing.JTable tImprimirL;
    // End of variables declaration//GEN-END:variables
}
