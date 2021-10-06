
package sistema_boletaje;

import java.util.Calendar;
import javax.swing.JFileChooser;
import Dao.PersonalDao;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;

public class ActualizarEmpleado extends javax.swing.JInternalFrame {

    String ruta="";
    String vencimientolicencia=null;
    String tipolicencia=null;
    String nlicencia=null;
    Blob fotico = null;
    boolean flag = false;
    private FileInputStream fis;
    private int longitudBytes;     
    PersonalDao PD = new PersonalDao();
    
    static public ResultSet rst;
    public ActualizarEmpleado() {
        initComponents();
        
        lblNombre.setText("");
        lblpaterno.setText("");
        lblmaterno.setText("");
        lblnumero.setText("");
        lbltelefono.setText("");
        lblcelular.setText("");     
        lblfecha.setText("ejemplo: 15/12/1999");
        lblfecha1.setText("");
        lblfecha2.setText("");
        try {
            CODIGO.setText(rst.getString(1));
            txtnombre.setText(rst.getString(2));
            txtapellidopa.setText(rst.getString(3));
            txtapellidoma.setText(rst.getString(4));
            txtfecha.setText(rst.getString(8));
            String tipo = rst.getString(5);
            cbxIdentificacion.setSelectedItem(tipo);
            txtnidentificacion.setText(rst.getString(6));
            cbxdistrito.setSelectedItem(rst.getString(10));
            txtdireccion.setText(rst.getString(9));
            txttelefono.setText(rst.getString(11));
            txtcelular.setText(rst.getString(12));
            
            if("SI".equals(rst.getString(14))){
                cpropietario.setSelected(true);
            }
            cbxcargo.setSelectedItem(rst.getString(15));
            if(cbxcargo.getSelectedIndex()==1){
                cbxcategoria.setSelectedItem(rst.getString(16));
                txtnumerolicencia.setText(rst.getString(17));
                txtfecha1.setText(rst.getString(18));
            }
            
            
            
            String Codigo = rst.getString(6);
            Blob fotos = PD.BuscarFoto(Codigo);
            if(fotos==null){
                System.out.println("SIN IMAGEN");
                                    
            
            }else{            
            
            try {
                byte []recuperar = fotos.getBytes(1,(int)fotos.length());
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(recuperar));

                Image imagen;
                imagen = img.getScaledInstance(325,260,Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(imagen));
                lblFoto.setText("");

            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                Logger.getLogger(BusquedaBoleto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        grpGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellidopa = new javax.swing.JTextField();
        txtapellidoma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxIdentificacion = new javax.swing.JComboBox<>();
        txtnidentificacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxdistrito = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtm = new javax.swing.JRadioButton();
        rbtf = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblpaterno = new javax.swing.JLabel();
        lblmaterno = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        lblfecha1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cpropietario = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        cbxcargo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxcategoria = new javax.swing.JComboBox<>();
        txtnumerolicencia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtfecha1 = new javax.swing.JTextField();
        lblfecha2 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btmRegistrar = new javax.swing.JButton();
        CODIGO = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setTitle("MODIFICAR");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel1.setText("NOMBRES");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel2.setText("APELLIDO PATERNO");

        txtapellidopa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidopaKeyTyped(evt);
            }
        });

        txtapellidoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidomaKeyTyped(evt);
            }
        });

        jLabel3.setText("APELLIDO MATERNO");

        jLabel4.setText("FECHA DE NACIMIENTO");

        jLabel5.setText("TIPO DE IDENTIFICACION");

        cbxIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "DNI", "PTP" }));
        cbxIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdentificacionActionPerformed(evt);
            }
        });

        txtnidentificacion.setEnabled(false);
        txtnidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnidentificacionKeyTyped(evt);
            }
        });

        jLabel6.setText("DISTRITO");

        cbxdistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ANCÓN", "ATE", "BARRANCO", "BREÑA", "CARABAYLLO", "CHACLACAYO", "CHORRILLOS", "CIENEGUILLA", "COMAS", "EL AGUSTINO", "INDEPENDENCIA", "JESÚS MARÍA", "LA MOLINA", "LA VICTORIA", "LIMA", "LINCE", "LOS OLIVOS", "LURIGANCHO-CHOSICA", "LURÍN", "MAGDALENA DEL MAR", "MIRAFLORES", "PACHACÁMAC", "PUCUSANA", "PUEBLO LIBRE", "PUENTE PIEDRA", "PUNTA HERMOSA", "PUNTA NEGRA", "RÍMAC", "SAN BARTOLO", "SAN BORJA", "SAN ISIDRO", "SAN JUAN DE LURIGANCHO", "SAN JUAN DE MIRAFLORES", "SAN LUIS", "SAN MARTIN DE PORRES", "SAN MIGUEL", "SANTA ANITA", "SANTA MARÍA DEL MAR", "SANTA ROSA", "SANTIAGO DE SURCO", "SURQUILLO", "VILLA EL SALVADOR", "VILLA MARIA DEL TRIUNFO" }));

        jLabel7.setText("DIRECCION");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));

        grpGenero.add(rbtm);
        rbtm.setSelected(true);
        rbtm.setText("M");

        grpGenero.add(rbtf);
        rbtf.setText("F");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtm)
                .addGap(18, 18, 18)
                .addComponent(rbtf)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtm)
                    .addComponent(rbtf))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel8.setText("NUMERO DE IDENTIFICACION");

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTACTO"));

        jLabel9.setText("TELEFONO");

        jLabel10.setText("CELULAR");

        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        lbltelefono.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(255, 0, 0));
        lbltelefono.setText("jLabel16");

        lblcelular.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblcelular.setForeground(new java.awt.Color(255, 0, 0));
        lblcelular.setText("jLabel16");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10))
                    .addComponent(lbltelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcelular)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono)
                    .addComponent(lblcelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblNombre.setText("jLabel16");

        lblpaterno.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblpaterno.setForeground(new java.awt.Color(255, 0, 0));
        lblpaterno.setText("jLabel16");

        lblmaterno.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblmaterno.setForeground(new java.awt.Color(255, 0, 0));
        lblmaterno.setText("jLabel16");

        lblnumero.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblnumero.setForeground(new java.awt.Color(255, 0, 0));
        lblnumero.setText("jLabel16");

        txtfecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfechaFocusLost(evt);
            }
        });
        txtfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfechaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaKeyTyped(evt);
            }
        });

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 0, 0));
        lblfecha.setText("jLabel16");

        lblfecha1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblfecha1.setForeground(new java.awt.Color(255, 0, 0));
        lblfecha1.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxdistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtapellidoma)
                                    .addComponent(txtapellidopa)
                                    .addComponent(lblpaterno)
                                    .addComponent(lblmaterno))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(txtnombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumero)
                                    .addComponent(txtnidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxIdentificacion, 0, 143, Short.MAX_VALUE)
                                    .addComponent(lblfecha)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblfecha1)))
                        .addGap(11, 11, 11))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellidopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblfecha)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnumero))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxdistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("CARGO"));

        jLabel11.setText("PROPIETARIO");

        jLabel12.setText("CARGO");

        cbxcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "CONDUCTOR", "COBRADOR" }));
        cbxcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcargoActionPerformed(evt);
            }
        });

        jLabel13.setText("CATEOGORIA LICENCIA");

        jLabel14.setText("NUMERO DE LICENCIA");

        jLabel15.setText("CADUCIDAD DE LICENCIA");

        cbxcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "A-IIIa", "A-IIIb", "A-IIIc" }));
        cbxcategoria.setEnabled(false);
        cbxcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcategoriaActionPerformed(evt);
            }
        });

        txtnumerolicencia.setEnabled(false);
        txtnumerolicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerolicenciaKeyTyped(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Si es propietario marque la casilla");

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

        lblfecha2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblfecha2.setForeground(new java.awt.Color(255, 0, 0));
        lblfecha2.setText("jLabel16");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxcargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpropietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblfecha2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnumerolicencia)
                            .addComponent(txtfecha1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpropietario)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbxcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtnumerolicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfecha2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("FOTO");
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR3.png"))); // NOI18N
        jButton1.setText("CARGAR FOTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btmRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EMPLEADOS.png"))); // NOI18N
        btmRegistrar.setText("GRABAR");
        btmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRegistrarActionPerformed(evt);
            }
        });

        CODIGO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CODIGO.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser Fc = new JFileChooser();
        Fc.setDialogTitle("BUSCAR IMAGEN");  
        Fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos tipo Imagen","JPEG","JPG","PNG");
        Fc.setFileFilter(filtro);
        if(Fc.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            lblFoto.setText("");
            rsscalelabel.RSScaleLabel.setScaleLabel(lblFoto, Fc.getSelectedFile().toString());
            ruta =Fc.getSelectedFile().toString();
            flag=true;
            try{
                fis = new FileInputStream(Fc.getSelectedFile());
                this.longitudBytes=(int)Fc.getSelectedFile().length();
            }catch(FileNotFoundException ex){                
            }      
        }else{
            lblFoto.setIcon(null);
            lblFoto.setText("FOTO");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRegistrarActionPerformed
        if("ejemplo: 15/12/1999".equals(lblfecha.getText())||"".equals(lblfecha.getText())&&"".equals(lblfecha1.getText())&&"".equals(lblfecha2.getText())){
            if(!txtnidentificacion.getText().equals("")){
                if(!"".equals(txtnumerolicencia.getText())||cbxcargo.getSelectedIndex()!=1){
                    if(!"".equals(txtfecha1.getText())||cbxcargo.getSelectedIndex()!=1){
                        if(cbxcargo.getSelectedIndex()!=0||cpropietario.isSelected()){
                            
                                if(ComprobarEdad()){
                                    String nombre =txtnombre.getText();
                                    String apellidopa=txtapellidopa.getText();
                                    String apellidoma=txtapellidoma.getText();
                                    String tidentificacion=cbxIdentificacion.getSelectedItem().toString();
                                    String nidentificacion=txtnidentificacion.getText();
                                    String sexo;
                                    if(rbtm.isSelected()){
                                        sexo="M";
                                    }else{
                                        sexo="F";
                                    }

                                    String fechanaci=txtfecha.getText();
                                    String direccion = txtdireccion.getText();
                                    String distrito = cbxdistrito.getSelectedItem().toString();
                                    String telefono = txttelefono.getText();
                                    String celular= txtcelular.getText();
                                    String activo = "SI";
                                    String propietario = "NO";
                                    if(cpropietario.isSelected()){
                                        propietario = "SI";
                                    }
                                    if(cbxcargo.getSelectedIndex()==1){
                                        tipolicencia=cbxcategoria.getSelectedItem().toString();
                                        nlicencia=txtnumerolicencia.getText();
                                        vencimientolicencia=txtfecha1.getText();
                                    }

                                    String cargo = cbxcargo.getSelectedItem().toString().toUpperCase();
                                    if(cbxcargo.getSelectedIndex()==0){
                                        cargo="PROPIETARIO";
                                    }
                                    PD.ActualizarPersonal(CODIGO.getText(),nombre.toUpperCase(), apellidopa.toUpperCase(), apellidoma.toUpperCase(), tidentificacion, nidentificacion, sexo, fechanaci, direccion, distrito, telefono, celular, activo, propietario, cargo, tipolicencia, nlicencia, vencimientolicencia);
                                    if(flag){
                                        PD.ActualizarFoto(this.fis, this.longitudBytes,CODIGO.getText());
                                    }
                                    JOptionPane.showMessageDialog(null,"EMPLEADO ACTUALIZADO");
                                    
                                    BusquedaEmpleado obMa = new BusquedaEmpleado();
                                    Entorno.add(obMa);
                                    Centrar(Entorno, obMa);
                                    obMa.toFront();
                                    obMa.setVisible(true);
                                    this.dispose();
                                }else{
                                    txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                                    JOptionPane.showMessageDialog(null, "No se puede Registrar, la persona registrada tiene que ser mayor de edad");
                                }
                                
                            
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "EL REGSTRADO SOLO SI ES PROPIETARIO PODRA DEJAR LA CASILLA CARGO SIN SELECCIONAR");
                            cpropietario.requestFocus();
                            cpropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "INGRESE FECHA DE CADUCIDAD");
                    }
                                        
                }else{JOptionPane.showMessageDialog(null,"INGRESE NUMERO DE LICENCIA");}
                                
            }else{
                JOptionPane.showMessageDialog(null,"INGRESE NUMERO DE IDENTIFICACION","ERROR 406",0);
                txtnidentificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                txtnidentificacion.requestFocus();
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"SOLUCIONE LOS ERRORES ANTES REGISTRAR","ERROR 407",0);
        }
        
        
        
        
    }//GEN-LAST:event_btmRegistrarActionPerformed

    private void cbxcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcargoActionPerformed
        if(cbxcargo.getSelectedIndex()==1){
            cbxcategoria.setEnabled(true);
            
            
        }else{
            cbxcategoria.setEnabled(false);
            txtfecha1.setEnabled(false);
            txtnumerolicencia.setEnabled(false);
            cbxcategoria.setSelectedIndex(0);
            txtfecha1.setText("");
            txtnumerolicencia.setText("");
        }
    }//GEN-LAST:event_cbxcargoActionPerformed

    private void txtnumerolicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerolicenciaKeyTyped
        if(txtnumerolicencia.getText().length()>8){
                evt.consume();}
    }//GEN-LAST:event_txtnumerolicenciaKeyTyped

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

    private void txtfecha1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfecha1FocusLost
        if(txtfecha1.getText().length()<10){
            
                lblfecha2.setText(" FORMATO FECHA(dd/MM/yyyy)");
            
                
        }
        if("".equals(lblfecha2.getText())){
            if(!Caducidad()){
                lblfecha2.setText("LICENCIA CADUCA");
        }
        }
        
    }//GEN-LAST:event_txtfecha1FocusLost

    private void txtfechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyTyped

        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            evt.consume();

        }else{            

            if(txtfecha.getText().length()==2){                
                txtfecha.setText(txtfecha.getText()+"/");

            }else if(txtfecha.getText().length()==5){
                txtfecha.setText(txtfecha.getText()+"/");                
            }

            else if(txtfecha.getText().length()>9){               
                evt.consume();
            }else if(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){                
                lblfecha.setText("");
                lblfecha1.setText("");
            }else{
                
            }
        }

    }//GEN-LAST:event_txtfechaKeyTyped

    private void txtfechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyReleased
         if(txtfecha.getText().length()>=2){
             if(Integer.parseInt(txtfecha.getText().substring(0,2))>31){
                    lblfecha.setText("DIA NO VALIDO");

                }
         }if(txtfecha.getText().length()>=6){
             if(Integer.parseInt(txtfecha.getText().substring(3,5))>12){
                    lblfecha.setText("MES NO VALIDO");

                }
         }if(txtfecha.getText().length()==10){
              if(Integer.parseInt(txtfecha.getText().substring(6,10))<1950 || Integer.parseInt(txtfecha.getText().substring(6,10))>2020){
                    lblfecha.setText("AÑO NO VALIDO");
                }
         }
    }//GEN-LAST:event_txtfechaKeyReleased

    private void txtfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyPressed
        String Cadena="";
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            if(txtfecha.getText().length()==6){
                for (int x=0; x <= txtfecha.getText().length()-2; x++) {                
                  Cadena += txtfecha.getText().charAt(x);
                  
                }
                txtfecha.setText(Cadena);
            }
            if(txtfecha.getText().length()==3){
                for (int x=0; x <= txtfecha.getText().length()-2; x++) {                
                  Cadena += txtfecha.getText().charAt(x);
                  
                }
                txtfecha.setText(Cadena);
            }
            
        }
    }//GEN-LAST:event_txtfechaKeyPressed

    private void txtfechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfechaFocusLost

        if(txtfecha.getText().length()<10){
            lblfecha.setText("FECHA NO VALIDA");
            lblfecha1.setText(" USE (dd/MM/yyyy)");
        }
        else if(Integer.parseInt(txtfecha.getText().substring(6,10))<1950 || Integer.parseInt(txtfecha.getText().substring(6,10))>2020){
            lblfecha.setText("AÑO NO VALIDO");
        }

    }//GEN-LAST:event_txtfechaFocusLost

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            lbltelefono.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lbltelefono.setText("");
        }if(txttelefono.getText().length()>6){
            evt.consume();}
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            lblcelular.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblcelular.setText("");
        }if(txtcelular.getText().length()>8){
            evt.consume();}
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        if(txtdireccion.getText().length()>80){
            evt.consume();}
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtnidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnidentificacionKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            lblnumero.setText("DIGITE SOLO NUMEROS");
            evt.consume();
        }else{
            lblnumero.setText("");
        }
        if(cbxIdentificacion.getSelectedIndex()==1){
            if(txtnidentificacion.getText().length()>7){
                evt.consume();}
        }else if(cbxIdentificacion.getSelectedIndex()==2){
            if(txtnidentificacion.getText().length()>9){
                evt.consume();}
        }

    }//GEN-LAST:event_txtnidentificacionKeyTyped

    private void txtapellidomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidomaKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            lblmaterno.setText("DIGITE SOLO LETRAS");
        }else{
            lblmaterno.setText("");
        }
        if(txtapellidoma.getText().length()>19){
            evt.consume();}
    }//GEN-LAST:event_txtapellidomaKeyTyped

    private void txtapellidopaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidopaKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            lblpaterno.setText("DIGITE SOLO LETRAS");
        }else{
            lblpaterno.setText("");
        }if(txtapellidopa.getText().length()>19){
            evt.consume();}
    }//GEN-LAST:event_txtapellidopaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            lblNombre.setText("DIGITE SOLO LETRAS");
        }else{
            lblNombre.setText("");
        }if(txtnombre.getText().length()>35){
            evt.consume();}
    }//GEN-LAST:event_txtnombreKeyTyped

    private void cbxIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdentificacionActionPerformed
        if(cbxIdentificacion.getSelectedIndex()==0){
            txtnidentificacion.setEnabled(false);
        }else{
            txtnidentificacion.setEnabled(true);
            txtnidentificacion.requestFocus();
        }
    }//GEN-LAST:event_cbxIdentificacionActionPerformed

    private void cbxcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcategoriaActionPerformed
        if(cbxcategoria.getSelectedIndex()==0){
            txtfecha1.setEnabled(false);
            txtnumerolicencia.setEnabled(false);
        }else{
            txtfecha1.setEnabled(true);
            txtnumerolicencia.setEnabled(true);
        }
    }//GEN-LAST:event_cbxcategoriaActionPerformed
    private String ObtenerCodigo(){
        int Cantidad= PD.contarEmpleado()+1;
        String numero ="0000";
        String Codigo = "DP-";
        if(Cantidad <10){
            numero="000"+String.valueOf(Cantidad);
        }else if(Cantidad >=10 && Cantidad<=99){
            numero="00"+String.valueOf(Cantidad);
        }else if(Cantidad >=100 && Cantidad<=999){
            numero="0"+String.valueOf(Cantidad+1);
        }else if(Cantidad >=1000 && Cantidad<=9999){
            numero=String.valueOf(Cantidad);
        }
        Codigo=Codigo+numero;
        
        return Codigo;
    }
    private boolean ComprobarEdad (){
        boolean MayorDeEdad= true;
        int dia = Integer.parseInt(txtfecha.getText().substring(0,2));
        int mes = Integer.parseInt(txtfecha.getText().substring(3,5));
        int anio = Integer.parseInt(txtfecha.getText().substring(6,10));        
        
        
        Calendar fecha = new GregorianCalendar();        
        int anioS = fecha.get(Calendar.YEAR);
        int mesS = fecha.get(Calendar.MONTH)+1;
        int diaS = fecha.get(Calendar.DAY_OF_MONTH);
        
        if(anioS-anio<18){
            MayorDeEdad= false;
        }else if(anioS-anio==18 && mes==mesS && dia>diaS){
            MayorDeEdad= false;
        }else if(anioS-anio==18 && mes>mesS) {
           MayorDeEdad= false;
        }
        return MayorDeEdad;
    }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CODIGO;
    private javax.swing.JButton btmRegistrar;
    private javax.swing.JComboBox<String> cbxIdentificacion;
    private javax.swing.JComboBox<String> cbxcargo;
    private javax.swing.JComboBox<String> cbxcategoria;
    private javax.swing.JComboBox<String> cbxdistrito;
    private javax.swing.JCheckBox cpropietario;
    private javax.swing.ButtonGroup grpGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfecha1;
    private javax.swing.JLabel lblfecha2;
    private javax.swing.JLabel lblmaterno;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblpaterno;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JRadioButton rbtf;
    private javax.swing.JRadioButton rbtm;
    private javax.swing.JTextField txtapellidoma;
    private javax.swing.JTextField txtapellidopa;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfecha1;
    private javax.swing.JTextField txtnidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerolicencia;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
