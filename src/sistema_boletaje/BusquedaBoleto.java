
package sistema_boletaje;


import Dao.DistribucionDao;
import Dao.PersonalDao;
import Dao.VehiculoDao;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BusquedaBoleto extends javax.swing.JInternalFrame {
    
     PersonalDao PD = new PersonalDao();
     VehiculoDao VD = new VehiculoDao();
     DistribucionDao DBD = new DistribucionDao();
    
    public BusquedaBoleto(){
        
        initComponents();
        lblnumero.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        lblpadron = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblnombre1 = new javax.swing.JLabel();
        lblpadron1 = new javax.swing.JLabel();
        lblfecha2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxprecio = new javax.swing.JComboBox<>();
        txtnumero = new javax.swing.JTextField();
        lblnumero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("CONSULTA DE BOLETO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfoto.setText("FOTO");
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblpadron.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblnombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblnombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblnombre1.setText("OPERADOR");

        lblpadron1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblpadron1.setText("PADRON");

        lblfecha2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblfecha2.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblnombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lblpadron1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblfecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpadron, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpadron, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpadron1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha2))
                .addGap(17, 17, 17))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Precio");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Boleto");

        cbxprecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxprecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5.00", "4.00", "3.50", "3.00", "2.50", "2.00", "1.50", "1.20", "1.00", " " }));

        txtnumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnumeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });

        lblnumero.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblnumero.setForeground(new java.awt.Color(255, 0, 0));
        lblnumero.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxprecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnumero)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
         try {
             String precio = (String)cbxprecio.getSelectedItem();
             String numero = txtnumero.getText();
             
             ResultSet rs = DBD.Busqueda(numero, precio);
             ResultSet rs1 = DBD.Busqueda(numero, precio);
             if(rs1.next()){
                 while(rs.next()){
                 
                 try {                     
                     String Nombre=rs.getString(2);
                     String apellidopa=rs.getString(3);
                     String apellidoma=rs.getString(4);
                     String Dni=rs.getString(5);
                     String Padron=rs.getString(6);
                     String fecha=rs.getString(7);
                     String NombreCompleto = Nombre +" "+apellidopa + " "+apellidoma;
                     
                     
                     
                     lblnombre.setText(NombreCompleto);
                     lblfecha.setText(fecha);
                     lblpadron.setText(VD.ObtenerPadron(Padron));
                     
                     Blob fotos = PD.BuscarFoto(Dni);
                     if(fotos==null){
                         rsscalelabel.RSScaleLabel.setScaleLabel(lblfoto,"/Imagenes/Desconocido.jpg");
                         
                     }else{                         
                         try {
                             byte []recuperar = fotos.getBytes(1,(int)fotos.length());
                             BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));
                             
                             Image imagen;
                             imagen = img.getScaledInstance(229, 219,Image.SCALE_SMOOTH);
                             lblfoto.setIcon(new ImageIcon(imagen));
                             
                         } catch (SQLException ex) {
                             System.out.println(ex);
                         } catch (IOException ex) {
                             Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                     }} catch (SQLException ex) {
                         Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
                     }
             }
             
         
             }else{
                     lblnombre.setText("");
                     lblfecha.setText("");
                     lblpadron.setText("");
                     lblfoto.setIcon(null);
                 JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL BOLETO");
             }
         }
              catch (SQLException ex) {
             Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE) &&!(evt.getKeyChar()==KeyEvent.VK_ENTER)) {
            lblnumero.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblnumero.setText("");
        }if(txtnumero.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtnumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER|| evt.getKeyCode()==KeyEvent.VK_TAB){
            try {
             String precio = (String)cbxprecio.getSelectedItem();
             String numero = txtnumero.getText();
             
             ResultSet rs = DBD.Busqueda(numero, precio);
             ResultSet rs1 = DBD.Busqueda(numero, precio);
             if(rs1.next()){
                 while(rs.next()){
                 
                 try {                     
                     String Nombre=rs.getString(2);
                     String apellidopa=rs.getString(3);
                     String apellidoma=rs.getString(4);
                     String Dni=rs.getString(5);
                     String Padron=rs.getString(6);
                     String fecha=rs.getString(7);
                     String NombreCompleto = Nombre +" "+apellidopa + " "+apellidoma;
                     
                     
                     
                     lblnombre.setText(NombreCompleto);
                     lblfecha.setText(fecha);
                     lblpadron.setText(VD.ObtenerPadron(Padron));
                     
                     Blob fotos = PD.BuscarFoto(Dni);
                     if(fotos==null){
                         rsscalelabel.RSScaleLabel.setScaleLabel(lblfoto,"/Imagenes/Desconocido.jpg");
                         
                     }else{                         
                         try {
                             byte []recuperar = fotos.getBytes(1,(int)fotos.length());
                             BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));
                             
                             Image imagen;
                             imagen = img.getScaledInstance(219, 229,Image.SCALE_SMOOTH);
                             lblfoto.setIcon(new ImageIcon(imagen));
                             
                         } catch (SQLException ex) {
                             System.out.println(ex);
                         } catch (IOException ex) {
                             Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                     }} catch (SQLException ex) {
                         Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
                     }
             }
             
         
             }else{
                     lblnombre.setText("");
                     lblfecha.setText("");
                     lblpadron.setText("");
                     lblfoto.setIcon(null);
                 JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL BOLETO");
             }
         }
              catch (SQLException ex) {
             Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    }//GEN-LAST:event_txtnumeroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxprecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfecha2;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblpadron;
    private javax.swing.JLabel lblpadron1;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
