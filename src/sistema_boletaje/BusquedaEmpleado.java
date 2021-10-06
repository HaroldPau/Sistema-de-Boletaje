
package sistema_boletaje;
import Bean.Personal;
import Dao.PersonalDao;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

public class BusquedaEmpleado extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    private TableRowSorter Filtro;
    static public int boletaje=1;
    
    PersonalDao DP = new PersonalDao();
    public BusquedaEmpleado() {
        initComponents();
        tpersonal.getColumnModel().getColumn(0).setPreferredWidth(100);
        tpersonal.getColumnModel().getColumn(1).setPreferredWidth(100);
        tpersonal.getColumnModel().getColumn(2).setPreferredWidth(100);
        tpersonal.getColumnModel().getColumn(3).setPreferredWidth(100);
        tpersonal.getColumnModel().getColumn(4).setPreferredWidth(80);
        tpersonal.getColumnModel().getColumn(5).setPreferredWidth(80);
        tpersonal.getColumnModel().getColumn(6).setPreferredWidth(50);
        tpersonal.getColumnModel().getColumn(7).setPreferredWidth(250);
        tpersonal.getColumnModel().getColumn(8).setPreferredWidth(150);
        tpersonal.getColumnModel().getColumn(9).setPreferredWidth(80);
        tpersonal.getColumnModel().getColumn(10).setPreferredWidth(80);
        
        ArrayList<Personal> ListadoPersonal; 
            ListadoPersonal= DP.ObtenerPersonal();
            modelo = (DefaultTableModel)tpersonal.getModel();
            ListadoPersonal.forEach((obj) -> {
                modelo.addRow(new Object[] { obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(),obj.getCargo(),
                    obj.getTidentificacion(),obj.getNidentificacion(),obj.getSexo(),obj.getDireccion(),obj.getDistrito(),
                    obj.getTelefono(),obj.getCelular()} );
        }); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpersonal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();

        setClosable(true);
        setTitle("LISTA DE EMPLEADOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tpersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO PA", "APERLLDO MA", "CARGO", "IDENTIFICACION", "NUMERO", "SEXO", "DIRECCION", "DISTRITO", "TELEFONO", "CELULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tpersonal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tpersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpersonalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tpersonalMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tpersonal);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel1.setText("FILTRAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpersonalMousePressed
        int FilaSelec = tpersonal.getSelectedRow();
        if(FilaSelec==-1){
            
        }else{
            String Codigo = tpersonal.getValueAt(FilaSelec,5).toString();
            Blob fotos = DP.BuscarFoto(Codigo);
            if(fotos==null){
                System.out.println("SIN IMAGEN");
                rsscalelabel.RSScaleLabel.setScaleLabel(lblfoto,"/Imagenes/Desconocido.jpg");                       
            
            }else{            
            
            try {
                byte []recuperar = fotos.getBytes(1,(int)fotos.length());
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));

                Image imagen;
                imagen = img.getScaledInstance(lblfoto.getWidth(),lblfoto.getHeight(),Image.SCALE_SMOOTH);
                lblfoto.setIcon(new ImageIcon(imagen));

            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
           
           
        }
    }//GEN-LAST:event_tpersonalMousePressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        modelo = (DefaultTableModel)tpersonal.getModel();
        for(int i=modelo.getRowCount()-1; i>=0; i=i-1){
            modelo.removeRow(i);}
        
        
            ArrayList<Personal> ListadoPersonal; 
            ListadoPersonal= DP.FiltrarPersonal(txtBuscar.getText());
            modelo = (DefaultTableModel)tpersonal.getModel();
            ListadoPersonal.forEach((obj) -> {
                modelo.addRow(new Object[] { obj.getNombre(),obj.getApellidopa(),obj.getApellidoma(),obj.getCargo(),
                    obj.getTidentificacion(),obj.getNidentificacion(),obj.getSexo(),obj.getDireccion(),obj.getDistrito(),
                    obj.getTelefono(),obj.getCelular()} );
        });
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        txtBuscar.setText(txtBuscar.getText().toUpperCase());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tpersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpersonalMouseClicked
      if(evt.getClickCount()==2){
          int FilaSelec = tpersonal.getSelectedRow();
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null, "seleccione algun empleado");
        }else{
              switch (boletaje) {
                  case 1:
                      VistaUsuario.Codigo=DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString());
                      VistaUsuario obMa = new VistaUsuario();
                      Entorno.add(obMa);
                      Centrar(Entorno, obMa);
                      obMa.toFront();
                      obMa.setVisible(true);
                      this.dispose();
                      break;
                  case 2:
                      Liquidacion.txtDatos.setText(tpersonal.getValueAt(FilaSelec,0).toString()+" "+tpersonal.getValueAt(FilaSelec,1).toString()+" "+tpersonal.getValueAt(FilaSelec,2).toString());
                      Liquidacion.txtId.setText(DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString()));
                      this.dispose();
                      break;
                  case 0:
                      DistribucionBoleto.txtDatos.setText(tpersonal.getValueAt(FilaSelec,0).toString()+" "+tpersonal.getValueAt(FilaSelec,1).toString()+" "+tpersonal.getValueAt(FilaSelec,2).toString());
                      DistribucionBoleto.txtId.setText(DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString()));
                      this.dispose();
                      break;
                      
                  case 3:
                      BoletoDia.txtNombre.setText(tpersonal.getValueAt(FilaSelec,0).toString()+" "+tpersonal.getValueAt(FilaSelec,1).toString()+" "+tpersonal.getValueAt(FilaSelec,2).toString());
                      BoletoDia.Id=(DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString()));
                      this.dispose();
                      break;
                      
                  case 4:
                      ReportePadronesTrabajados.txtDatos.setText(tpersonal.getValueAt(FilaSelec,0).toString()+" "+tpersonal.getValueAt(FilaSelec,1).toString()+" "+tpersonal.getValueAt(FilaSelec,2).toString());
                      ReportePadronesTrabajados.codigo =DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString());
                      this.dispose();
                      break;
                      
                  case 5:
                      Despacho_B.txtDatos.setText(tpersonal.getValueAt(FilaSelec,0).toString()+" "+tpersonal.getValueAt(FilaSelec,1).toString()+" "+tpersonal.getValueAt(FilaSelec,2).toString());
                      Despacho_B.idoperador =DP.ObtenerCodigo(tpersonal.getValueAt(FilaSelec,5).toString());
                      this.dispose();
                      break;
                }
            
            
            
        }
         
       }
    }//GEN-LAST:event_tpersonalMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTable tpersonal;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
