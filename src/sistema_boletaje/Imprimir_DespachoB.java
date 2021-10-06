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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Imprimir_DespachoB extends javax.swing.JInternalFrame {

    static public String inicial,conductor,fecha,placa,padron;
    static int palomas_A = 8;
    static int solidadridad_A=15;
    static int Maderas_A =30;
    static int Arica_A =31;
    static int Universitaria_A =25;
    static int Final_A=25;
    
    
    
    public Imprimir_DespachoB() {
        initComponents(); 
        
    }
    
    
    static public void imprimirA(){
        lblconductor.setText(conductor);
        lblfecha.setText(fecha);
        lblplaca.setText(placa);
        lblpadron.setText(padron);
        lblhsalida.setText(inicial);
        
        r1.setText(frecuencia(palomas_A,inicial));        
        r2.setText(frecuencia(solidadridad_A,r1.getText()));
        r3.setText(frecuencia(Maderas_A,r2.getText()));
        r4.setText(frecuencia(Arica_A,r3.getText()));
        r5.setText(frecuencia(Universitaria_A,r4.getText()));
        r6.setText(frecuencia(Final_A,r5.getText()));
        
        
        printRecord(PanelDespacho);
    }
    static public void imprimirB(){
        lblconductor.setText(conductor);
        lblfecha.setText(fecha);
        lblplaca.setText(placa);
        lblpadron.setText(padron);
        lblhsalida.setText(inicial);
        
        String nuevoinicio = frecuencia(10,r6.getText());
        lblhsalida.setText(nuevoinicio);
        
        r1.setText(frecuencia(Final_A,nuevoinicio));        
        r2.setText(frecuencia(Universitaria_A,r1.getText()));
        r3.setText(frecuencia(Arica_A,r2.getText()));
        r4.setText(frecuencia(Maderas_A,r3.getText()));
        r5.setText(frecuencia(solidadridad_A,r4.getText()));
        r6.setText(frecuencia(palomas_A,r5.getText()));
        
        l1.setText("UNIVERSITARIA");
        l2.setText("ARICA");
        l3.setText("MADERAS");
        l4.setText("SOLIDARIDAD");
        l5.setText("PALOMAS");
        l6.setText("FINAL");
        
        
        printRecord(PanelDespacho);
    }
    
    
    
    static public void printRecord(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("IMPRIMIR DESPACHO");
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
    
    static private String frecuencia(int minutos, String hora){
        String hr="";
        try {
            
            Date DateEnviar = new SimpleDateFormat("HH:mm").parse(hora);
            
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(DateEnviar);
            calendar.add(Calendar.MINUTE, minutos);
            
            Date fechaSalida = calendar.getTime();
            
            hr = new SimpleDateFormat("HH:mm").format(fechaSalida);          
            
            
                        
            
        } catch (ParseException ex) {
            Logger.getLogger(Imprimir_DespachoB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hr;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDespacho = new javax.swing.JPanel();
        r6 = new javax.swing.JLabel();
        lblpadron = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblplaca = new javax.swing.JLabel();
        lblhsalida = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        r5 = new javax.swing.JLabel();
        lblconductor = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDespacho.setBackground(new java.awt.Color(255, 255, 255));
        PanelDespacho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        r6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r6.setForeground(new java.awt.Color(51, 51, 51));
        r6.setText("09:30");
        PanelDespacho.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        lblpadron.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblpadron.setForeground(new java.awt.Color(51, 51, 51));
        lblpadron.setText("0015");
        PanelDespacho.add(lblpadron, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        l2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l2.setForeground(new java.awt.Color(51, 51, 51));
        l2.setText("SOLIDARIDAD");
        PanelDespacho.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(51, 51, 51));
        lblfecha.setText("24-08-20");
        PanelDespacho.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lblplaca.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblplaca.setForeground(new java.awt.Color(51, 51, 51));
        lblplaca.setText("ATX-550");
        PanelDespacho.add(lblplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        lblhsalida.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblhsalida.setForeground(new java.awt.Color(51, 51, 51));
        lblhsalida.setText("09:30");
        PanelDespacho.add(lblhsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        r1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r1.setForeground(new java.awt.Color(51, 51, 51));
        r1.setText("09:30");
        PanelDespacho.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        r2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r2.setForeground(new java.awt.Color(51, 51, 51));
        r2.setText("09:30");
        PanelDespacho.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        r3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r3.setForeground(new java.awt.Color(51, 51, 51));
        r3.setText("09:30");
        PanelDespacho.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        r4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r4.setForeground(new java.awt.Color(51, 51, 51));
        r4.setText("09:30");
        PanelDespacho.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        r5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        r5.setForeground(new java.awt.Color(51, 51, 51));
        r5.setText("09:30");
        PanelDespacho.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lblconductor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblconductor.setForeground(new java.awt.Color(51, 51, 51));
        lblconductor.setText("PEPITO LOS PALOTES PALACIOS");
        PanelDespacho.add(lblconductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        l1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l1.setForeground(new java.awt.Color(51, 51, 51));
        l1.setText("OVALO LAS PALOMAS");
        PanelDespacho.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        l3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l3.setForeground(new java.awt.Color(51, 51, 51));
        l3.setText("MADERAS");
        PanelDespacho.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        l4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l4.setForeground(new java.awt.Color(51, 51, 51));
        l4.setText("ARICA");
        PanelDespacho.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        l5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l5.setForeground(new java.awt.Color(51, 51, 51));
        l5.setText("UNIVERSITARIA");
        PanelDespacho.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        l6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        l6.setForeground(new java.awt.Color(51, 51, 51));
        l6.setText("NARANJAL - FINAL");
        PanelDespacho.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        getContentPane().add(PanelDespacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelDespacho;
    private static javax.swing.JLabel l1;
    private static javax.swing.JLabel l2;
    private static javax.swing.JLabel l3;
    private static javax.swing.JLabel l4;
    private static javax.swing.JLabel l5;
    private static javax.swing.JLabel l6;
    public static javax.swing.JLabel lblconductor;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lblhsalida;
    public static javax.swing.JLabel lblpadron;
    public static javax.swing.JLabel lblplaca;
    public static javax.swing.JLabel r1;
    public static javax.swing.JLabel r2;
    public static javax.swing.JLabel r3;
    public static javax.swing.JLabel r4;
    public static javax.swing.JLabel r5;
    public static javax.swing.JLabel r6;
    // End of variables declaration//GEN-END:variables
}
