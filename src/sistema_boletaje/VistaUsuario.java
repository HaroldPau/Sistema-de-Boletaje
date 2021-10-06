
package sistema_boletaje;

import Dao.PersonalDao;
import java.awt.Image;
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
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

public class VistaUsuario extends javax.swing.JInternalFrame {
    static public String Codigo;
    PersonalDao PD = new PersonalDao();
    ResultSet rst= PD.DetallePersonal(Codigo);
    
    public VistaUsuario() {
        
        initComponents();
        
        try {
            lblnombre.setText(rst.getString(2));
            lblapellidopa.setText(rst.getString(3));
            lblapellidoma.setText(rst.getString(4));
            lblfecha.setText(rst.getString(8));
            lbltidentificacion.setText(rst.getString(5));
            lblnidentificacion.setText(rst.getString(6));
            lbldistrito.setText(rst.getString(10));
            lbldireccion.setText(rst.getString(9));
            lbltelefono.setText(rst.getString(11));
            lblcelular.setText(rst.getString(12));
            lblcargo.setText(rst.getString(15));
            lblcodigo.setText(Codigo);
        } catch (SQLException ex) {
            Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
            Blob fotos;
        try {
            fotos = PD.BuscarFoto(rst.getString(6));
        
            if(fotos==null){
                System.out.println("SIN IMAGEN");
                
                ImageIcon sonic = new ImageIcon(getClass().getResource("/Imagenes/Desconocido.jpg"));
                 ImageIcon icono = new ImageIcon(sonic.getImage().getScaledInstance(280,290,Image.SCALE_DEFAULT));
                 lblfoto.setIcon(icono);
            
            }else{            
            
            try {
                byte []recuperar = fotos.getBytes(1,(int)fotos.length());
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));

                Image imagen;
                imagen = img.getScaledInstance(280,290,Image.SCALE_SMOOTH);
                lblfoto.setIcon(new ImageIcon(imagen));

            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        lbldistrito = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellidopa = new javax.swing.JLabel();
        lblapellidoma = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lbltidentificacion = new javax.swing.JLabel();
        lblnidentificacion = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("INFORMACION");
        setMinimumSize(new java.awt.Dimension(490, 700));
        setPreferredSize(new java.awt.Dimension(490, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOMBRES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel2.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel3.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel4.setText("FECHA DE NACIMIENTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel5.setText("TIPO DE IDENTIFICACION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel8.setText("NUMERO DE IDENTIFICACION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel6.setText("DISTRITO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel7.setText("DIRECCION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel9.setText("TELEFONO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel10.setText("CELULAR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        lblfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblfoto.setMaximumSize(new java.awt.Dimension(280, 290));
        lblfoto.setMinimumSize(new java.awt.Dimension(280, 290));
        lblfoto.setPreferredSize(new java.awt.Dimension(280, 290));
        getContentPane().add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, 230));

        lbldistrito.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbldistrito.setText("DISTRITO");
        getContentPane().add(lbldistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        lbldireccion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbldireccion.setText("DIRECCION");
        getContentPane().add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        lbltelefono.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbltelefono.setText("TELEFONO");
        getContentPane().add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        lblcelular.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblcelular.setText("CELULAR");
        getContentPane().add(lblcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        lblnombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblnombre.setText("NOMBRES");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        lblapellidopa.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblapellidopa.setText("APELLIDO PATERNO");
        getContentPane().add(lblapellidopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        lblapellidoma.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblapellidoma.setText("APELLIDO MATERNO");
        getContentPane().add(lblapellidoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblfecha.setText("FECHA DE NACIMIENTO");
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        lbltidentificacion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbltidentificacion.setText("TIPO DE IDENTIFICACION");
        getContentPane().add(lbltidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        lblnidentificacion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblnidentificacion.setText("NUMERO DE IDENTIFICACION");
        getContentPane().add(lblnidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        lblcargo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcargo.setForeground(new java.awt.Color(255, 0, 0));
        lblcargo.setText("jLabel12");
        getContentPane().add(lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, -1, -1));

        lblcodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcodigo.setText("jLabel13");
        getContentPane().add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton2.setText("ACEPTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ActualizarEmpleado.rst = rst;
        ActualizarEmpleado obMa = new ActualizarEmpleado();
        
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                    BusquedaEmpleado obMa = new BusquedaEmpleado();
                                    Entorno.add(obMa);
                                    Centrar(Entorno, obMa);
                                    obMa.toFront();
                                    obMa.setVisible(true);
                                    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblapellidoma;
    private javax.swing.JLabel lblapellidopa;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldistrito;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblnidentificacion;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltidentificacion;
    // End of variables declaration//GEN-END:variables
}
