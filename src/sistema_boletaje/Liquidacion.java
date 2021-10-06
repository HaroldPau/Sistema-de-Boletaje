
package sistema_boletaje;

import Bean.DistribucionBoletos;
import Dao.ControlCombustibleDao;
import Dao.DistribucionDao;
import Dao.LiquidacionDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;


public class Liquidacion extends javax.swing.JInternalFrame {
    static public DefaultTableModel tb;
    DistribucionDao DBD = new DistribucionDao();
    LiquidacionDao OLD = new LiquidacionDao();
    int i ;
    static public String Padron;
    int codigo[] = new int[99];
    double total1=0;
    
    
    public Liquidacion() {
        initComponents();
        i=0;
        String [] data = DBD.Pegado(Padron);
        txtId.setText(data[0]);
        txtDatos.setText(data[1]);
        cbxvuelta.setSelectedIndex(1);
        
            Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            
            int hora;
            Calendar calendario = new GregorianCalendar();
            hora =calendario.get(Calendar.HOUR_OF_DAY);
            if (13 >hora  ){
                  dia=dia-1;      
            }else{
                tLiquidacion.setForeground(new java.awt.Color(255, 0, 0));
                 if (Principal.usuario.equals("ESTEFANIE")){
                tLiquidacion.setForeground(new java.awt.Color(244, 0, 161));
                }
                
            }
           
        
            String Fecha= String.valueOf(ano)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(dia);            
        try {
            java.util.Date fechita  =  new SimpleDateFormat("yyyy/MM/dd").parse(Fecha);
            inicioo.setDate(fechita);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(ReporteProduccion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        ArrayList<DistribucionBoletos> ListaBoletos;
        ListaBoletos = DBD.ObtenerBoletosLiquidacion(Padron);
        tb=(DefaultTableModel)tLiquidacion.getModel();
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[]{obj.getPrecio(),obj.getInicio(),"",true});
            codigo[i]=obj.getCodigo();
            i++;
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tLiquidacion = new javax.swing.JTable();
        inicioo = new com.toedter.calendar.JDateChooser();
        lblfecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblactivo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxvuelta = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtDatos = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("LIQUIDACION DE BOLETOS");
        setPreferredSize(new java.awt.Dimension(470, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LIQUIDACION"));

        tLiquidacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRECIO", "INICIO", "FINAL", "ACTIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tLiquidacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tLiquidacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tLiquidacionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tLiquidacionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tLiquidacion);

        lblfecha.setText("FECHA");

        jLabel2.setText("DISPONIBLE");

        lblactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblactivo.setForeground(new java.awt.Color(255, 0, 0));
        lblactivo.setText("0");

        jLabel3.setText("VUELTA");

        cbxvuelta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inicioo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxvuelta, 0, 78, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inicioo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblactivo)
                        .addComponent(jLabel3)
                        .addComponent(cbxvuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 440, 400));

        jButton1.setText("LIQUIDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 140, 35));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RESPONSABLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        txtId.setEditable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDatos.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, -1));

        jButton3.setText("AUTORELLENADO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 130, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed



        total1=0;
        Consultar();
        int rspt = JOptionPane.showConfirmDialog(null, "LA LIQUIDACION TOTAL ES: S/"+total1, "LIQUIDACION", JOptionPane.YES_NO_OPTION);
        
        if (rspt == JOptionPane.YES_OPTION) {
            ControlCombustibleDao OCC = new ControlCombustibleDao();
        String Fecha= String.valueOf(inicioo.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.YEAR)));
        
        
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"SELECCIONE OPERADOR");
        }else{
            GrabarLiquidacion();
            OCC.RegistrarConsumo(OCC.idConsumoPetroleo(),Float.parseFloat(cbxvuelta.getSelectedItem().toString()),Padron,Fecha,0,0,Principal.usuario);
            JOptionPane.showMessageDialog(null, "liquidacion exitosa");
            ControlBoleto.LimpiarTablas();
            ControlBoleto.LlenarTabla(ControlBoleto.tb4,"4.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb35,"3.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb3,"3.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb25,"2.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb2,"2.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb15,"1.50",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb5,"5.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb1,"1.00",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb70,"0.70",Padron);
            ControlBoleto.LlenarTabla(ControlBoleto.tb50,"0.50",Padron);            
            this.dispose();
            
        }
            
        }



        
        
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tLiquidacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tLiquidacionMousePressed
        
    }//GEN-LAST:event_tLiquidacionMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BusquedaEmpleado obMa = new BusquedaEmpleado();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        
        BusquedaEmpleado.boletaje=2;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tLiquidacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tLiquidacionMouseClicked
        
    }//GEN-LAST:event_tLiquidacionMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Autorellenar obMa = new Autorellenar();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tLiquidacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tLiquidacionMouseReleased
        if(tLiquidacion.getSelectedColumn()==3){
            FinalizarBoleto();
        }
    }//GEN-LAST:event_tLiquidacionMouseReleased
    public void FinalizarBoleto(){
        int FilaSelec =tLiquidacion.getSelectedRow();        
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE ALGUNA FILA");
        }else{
           int FilaSelect=tLiquidacion.getSelectedRow();
           if(!(boolean)tLiquidacion.getValueAt(FilaSelect,3)){
               String NumeroI=(String)tLiquidacion.getValueAt(FilaSelect, 1);
               int numero = Integer.parseInt(NumeroI);
               String last="";
            if(numero>99999){
                int d3,d4,d5,d6;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                d6 = numero % 1000000 / 100000;
                numero =(d6*100000)+(d5*10000)+(d4*1000)+((d3+1)*100);
                last= String.valueOf(numero);
            }else if(numero>9999 && numero<=99999) {
                int d3,d4,d5;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                numero =(d5*10000)+(d4*1000)+((d3+1)*100);
                if(numero==100000){
                    last=String.valueOf(numero);
                }else{
                    last ="0"+String.valueOf(numero);
                }
                
            }else if(numero>999 && numero<=9999){
                int d3,d4;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;		
                numero =(d4*1000)+((d3+1)*100);
                
                if(numero==10000){
                    last= "0"+String.valueOf(numero);
                }else{
                    last= "00"+String.valueOf(numero);
                }
            }else{
                if(numero>=1&&numero<=99){
                    last="000100";
                }else{                   
                    int d3;               
                    d3 = numero % 1000 / 100;			
                    numero =((d3+1)*100);
                    if(numero==1000){
                        last= "00"+String.valueOf(numero);
                    }else{
                        last= "000"+String.valueOf(numero);
                    }
                    
                }
            }tLiquidacion.setValueAt(last, FilaSelect, 2);
           }else{
               tLiquidacion.setValueAt("", FilaSelect, 2);
           }
        }
    }
    private void GrabarLiquidacion(){
        boolean Activo;
        String Ninicio,inicio;
        String StringActivo;
        double precio;
        int cantidad;
        
       
        
        String Fecha= String.valueOf(inicioo.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.YEAR)));
        int guia =OLD.guia();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            Activo=(boolean)tLiquidacion.getValueAt(i,3);
            Ninicio=(String)tLiquidacion.getValueAt(i,2);
            inicio=(String)tLiquidacion.getValueAt(i,1);
            precio=(double)tLiquidacion.getValueAt(i,0);
            
            
            if(!"".equals(Ninicio)){                
                cantidad=Integer.parseInt(Ninicio)-Integer.parseInt(inicio);
                if(Activo){
                    StringActivo="SI";
                }else{
                    StringActivo="NO";
                    cantidad+=1;
                }
                DBD.ActualizarDistribucion(Ninicio,inicio, Padron, precio, StringActivo);
                if(cantidad!=0){
                    OLD.Liquidar(OLD.idLiquidacion(),Padron, precio, cantidad, Fecha,txtId.getText(),Principal.usuario,cbxvuelta.getSelectedIndex()+1,inicio,codigo[i],guia);
                }
                
                
                
                               
            }
        }
    }
    
    private void Consultar(){
        boolean Activo;
        String Ninicio,inicio;
        String StringActivo;
        double precio;
        int cantidad;
        
       
        
        String Fecha= String.valueOf(inicioo.getCalendar().get(Calendar.DAY_OF_MONTH)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.MONTH)+1)+"/"+String.valueOf(inicioo.getCalendar().get(Calendar.YEAR)));
        int guia =OLD.guia();
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){
            Activo=(boolean)tLiquidacion.getValueAt(i,3);
            Ninicio=(String)tLiquidacion.getValueAt(i,2);
            inicio=(String)tLiquidacion.getValueAt(i,1);
            precio=(double)tLiquidacion.getValueAt(i,0);
            
            
            if(!"".equals(Ninicio)){                
                cantidad=Integer.parseInt(Ninicio)-Integer.parseInt(inicio);
                if(Activo){
                    StringActivo="SI";
                }else{
                    StringActivo="NO";
                    cantidad+=1;
                }
                //DBD.ActualizarDistribucion(Ninicio,inicio, Padron, precio, StringActivo);
                if(cantidad!=0){
                    //OLD.Liquidar(OLD.idLiquidacion(),Padron, precio, cantidad, Fecha,txtId.getText(),Principal.usuario,cbxvuelta.getSelectedIndex()+1,inicio,codigo[i],guia);
                }
                
                total1 = total1+(precio*cantidad);
                
                               
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxvuelta;
    private com.toedter.calendar.JDateChooser inicioo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblactivo;
    private javax.swing.JLabel lblfecha;
    public static javax.swing.JTable tLiquidacion;
    public static javax.swing.JTextField txtDatos;
    public static javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables



}
