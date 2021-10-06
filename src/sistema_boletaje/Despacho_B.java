package sistema_boletaje;

import Bean.DistribucionBoletos;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Dao.SalidaBDao;
import Bean.Despacho;
import Dao.VehiculoDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;


public class Despacho_B extends javax.swing.JInternalFrame {

    int padron;
    int iterador;
    SalidaBDao SBD = new SalidaBDao();
    static public String idoperador;
    public DefaultTableModel tb;
    int[] identificador = new int[150];
    
    public Despacho_B() {
        initComponents();
        
        
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
        limpiarTabla();
        llenar(Fecha);
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDatos = new javax.swing.JTextField();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR);
        SpHora = new javax.swing.JSpinner(sm);
        txtPadron = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        inicio = new com.toedter.calendar.JDateChooser();
        cbxFrecuencia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tsalidas = new javax.swing.JTable();
        BtnGrabar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESPACHO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("PADRON");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("HORA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CONDUCTOR");

        txtDatos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtDatos.setEnabled(false);

        JSpinner.DateEditor de = new JSpinner.DateEditor(SpHora, "HH:mm");
        SpHora.setEditor(de);
        SpHora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

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

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        inicio.setBackground(new java.awt.Color(0, 255, 204));
        inicio.setForeground(new java.awt.Color(204, 0, 0));
        inicio.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N

        cbxFrecuencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxFrecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "8", "10", "15", "20" }));
        cbxFrecuencia.setSelectedIndex(2);
        cbxFrecuencia.setSelectedItem(10);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("FRECUENCIA");

        txtplaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtplaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        txtplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtplacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplacaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("PLACA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(cbxFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        Tsalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PADRON", "HORA DE SALIDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tsalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TsalidasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tsalidas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnGrabar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnGrabar.setText("GRABAR");
        BtnGrabar.setEnabled(false);
        BtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(BtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed

    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtPadronKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
           padron= Integer.parseInt(txtPadron.getText());
           VehiculoDao VD = new VehiculoDao();
           boolean bandera = VD.BuscarVehiculo(txtPadron.getText());
           txtplaca.setText(VD.ObtenerPlaca(txtPadron.getText()));
           if(bandera){
               BtnGrabar.setEnabled(true);
               
               try {
                int j= iterador-1;
                String hor = Tsalidas.getValueAt(j,1).toString();
                
                
                Date DateEnviar = new SimpleDateFormat("HH:mm").parse(hor);
                int minuto = Integer.parseInt(cbxFrecuencia.getSelectedItem().toString());

                SumarHora(minuto,DateEnviar);
            } catch (ParseException ex) {

            }  
               
               
               
           }else{
               JOptionPane.showMessageDialog(null,"EL PADRON NO ESTA REGISTRADO");
           }
            
           
           
           
           
           
           
        }

    }//GEN-LAST:event_txtPadronKeyReleased

    private void txtPadronKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPadronKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!(evt.getKeyChar()==KeyEvent.VK_ENTER))  {
            evt.consume();
                  
        }if(txtPadron.getText().length()>3){
            evt.consume();}
    }//GEN-LAST:event_txtPadronKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BusquedaEmpleado obMa = new BusquedaEmpleado();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true); 
        
        BusquedaEmpleado.boletaje=5;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabarActionPerformed
        
        if(idoperador==null){
            JOptionPane.showMessageDialog(null,"SELECCIONE UN OPERADOR","ERROR!!!...",0);
            System.out.println("seleccione operador");
        }else{            
                
            int id = SBD.idDespachoB();
            Date date = new Date();
            SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.MINUTE);

            JSpinner spinner = new JSpinner(sm);
            JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm");
            de.getTextField().setEditable( false );
            spinner.setEditor(de);        

            String hor = de.getFormat().format(SpHora.getValue());


            String fecha2 = String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));




            SBD.RegistrarDespachoB(id,padron, hor, idoperador,fecha2 );
            
            
            
            Imprimir_DespachoB.conductor=txtDatos.getText();
            Imprimir_DespachoB.inicial=hor;
            Imprimir_DespachoB.placa=txtplaca.getText();
            Imprimir_DespachoB.fecha=fecha2;
            Imprimir_DespachoB.padron=String.valueOf(padron);
            
            
            Imprimir_DespachoB obMa = new Imprimir_DespachoB();
            Entorno.add(obMa);
            Centrar(Entorno, obMa);
            obMa.toFront();
            obMa.setVisible(false);
            Imprimir_DespachoB.imprimirA();
            Imprimir_DespachoB.imprimirB();
            
            

            try {
                Date DateEnviar = new SimpleDateFormat("HH:mm").parse(hor);
                int minuto = Integer.parseInt(cbxFrecuencia.getSelectedItem().toString());

                SumarHora(minuto,DateEnviar);
            } catch (ParseException ex) {

            }      
            limpiarTabla();     
            llenar(fecha2);
            idoperador=null;
            txtDatos.setText("");
            BtnGrabar.setEnabled(false);
            txtPadron.setText("");
            txtplaca.setText("");
            
        }
        
    }//GEN-LAST:event_BtnGrabarActionPerformed

    private void TsalidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TsalidasKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_F6){
           int FilaSelec = Tsalidas.getSelectedRow();
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
        }else{
            
            int rspt = JOptionPane.showConfirmDialog(null, "DESEA BORRAR ESTE REGISTRO", "ADVERTENCIA!", JOptionPane.YES_NO_OPTION);
            if (rspt == JOptionPane.YES_OPTION) {
                int n = FilaSelec;
                SBD.EliminarSaldia(identificador[n]);
                
                //System.out.println("codigo "+identificador[(n)]);
                
                //System.out.println(("fila: " +n));
                
                String fecha2 = String.valueOf(this.inicio.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(this.inicio.getCalendar().get(Calendar.YEAR)));
                limpiarTabla();
                llenar(fecha2);
            }
            else {
               
            }
            
            
            
        }
        }
    }//GEN-LAST:event_TsalidasKeyReleased

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

    private void txtplacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaKeyReleased

    private void txtplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaKeyTyped
    private void llenar(String fecha){
        
        iterador= 0;
        ArrayList<Despacho> ListaBoletos;
        
        ListaBoletos = SBD.Lista_DespachoB(fecha);
        tb =(DefaultTableModel)Tsalidas.getModel();
        ListaBoletos.forEach((obj) -> {
            
            tb.addRow(new Object[] {obj.getPadron(),obj.getHora()});
            identificador[iterador]= obj.getId();
            iterador++;
            //System.out.println(identificador[iterador]);
        });
        
    }
    
    private void limpiarTabla(){
        
        tb = (DefaultTableModel)Tsalidas.getModel();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            tb.removeRow(i);
        }
    }
    
     void SumarHora(int minutosASumar, Date FechaBase){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(FechaBase); 
        calendar.add(Calendar.MINUTE, minutosASumar); 
        
        
        Date fechaSalida = calendar.getTime();
        System.out.println(fechaSalida);
        
        SpinnerDateModel sm = new SpinnerDateModel(fechaSalida, null, null, Calendar.MINUTE);
        System.out.println(fechaSalida);
        JSpinner spinner = new JSpinner(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm");
        de.getTextField().setEditable( false );
        spinner.setEditor(de);
        
        SpHora.setValue(fechaSalida);
        
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGrabar;
    public javax.swing.JSpinner SpHora;
    private javax.swing.JTable Tsalidas;
    private javax.swing.JComboBox<String> cbxFrecuencia;
    private com.toedter.calendar.JDateChooser inicio;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtPadron;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
