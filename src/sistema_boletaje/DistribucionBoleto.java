
package sistema_boletaje;

import Dao.DistribucionDao;
import Dao.VehiculoDao;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static sistema_boletaje.Principal.Centrar;
import static sistema_boletaje.Principal.Entorno;


public class DistribucionBoleto extends javax.swing.JInternalFrame {
        
        String Responsable="";
        static public String Padron;
        static public String Codigo;
        Double Precio;
        DistribucionDao DD = new DistribucionDao();
        int id;
        
        
        Calendar fecha = new GregorianCalendar();        
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
            String Fecha1= String.valueOf(dia)+"/" +String.valueOf(mes+1)+ "/" +String.valueOf(ano);
            
            VehiculoDao VD = new VehiculoDao();
            
        
    
    public DistribucionBoleto() {
        
        initComponents();
        String [] data = DD.Pegado(VD.ObtenerCodigo(Padron));
        txtId.setText(data[0]);
        txtDatos.setText(data[1]);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtDatos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtb4_1 = new javax.swing.JTextField();
        txtb4_2 = new javax.swing.JTextField();
        txtb4_3 = new javax.swing.JTextField();
        txtb4_4 = new javax.swing.JTextField();
        txtb4_5 = new javax.swing.JTextField();
        txtb35_5 = new javax.swing.JTextField();
        txtb35_4 = new javax.swing.JTextField();
        txtb35_3 = new javax.swing.JTextField();
        txtb35_2 = new javax.swing.JTextField();
        txtb35_1 = new javax.swing.JTextField();
        txtb3_5 = new javax.swing.JTextField();
        txtb3_4 = new javax.swing.JTextField();
        txtb3_3 = new javax.swing.JTextField();
        txtb3_2 = new javax.swing.JTextField();
        txtb3_1 = new javax.swing.JTextField();
        txtb25_5 = new javax.swing.JTextField();
        txtb25_4 = new javax.swing.JTextField();
        txtb25_3 = new javax.swing.JTextField();
        txtb25_2 = new javax.swing.JTextField();
        txtb25_1 = new javax.swing.JTextField();
        txtb2_5 = new javax.swing.JTextField();
        txtb2_4 = new javax.swing.JTextField();
        txtb2_3 = new javax.swing.JTextField();
        txtb2_2 = new javax.swing.JTextField();
        txtb2_1 = new javax.swing.JTextField();
        txtb15_5 = new javax.swing.JTextField();
        txtb15_4 = new javax.swing.JTextField();
        txtb15_3 = new javax.swing.JTextField();
        txtb15_2 = new javax.swing.JTextField();
        txtb15_1 = new javax.swing.JTextField();
        txtb12_5 = new javax.swing.JTextField();
        txtb12_4 = new javax.swing.JTextField();
        txtb12_3 = new javax.swing.JTextField();
        txtb12_2 = new javax.swing.JTextField();
        txtb12_1 = new javax.swing.JTextField();
        txtb1_5 = new javax.swing.JTextField();
        txtb1_4 = new javax.swing.JTextField();
        txtb1_3 = new javax.swing.JTextField();
        txtb1_2 = new javax.swing.JTextField();
        txtb1_1 = new javax.swing.JTextField();
        txtb7_5 = new javax.swing.JTextField();
        txtb7_4 = new javax.swing.JTextField();
        txtb7_3 = new javax.swing.JTextField();
        txtb7_2 = new javax.swing.JTextField();
        txtb7_1 = new javax.swing.JTextField();
        txtb5_5 = new javax.swing.JTextField();
        txtb5_4 = new javax.swing.JTextField();
        txtb5_3 = new javax.swing.JTextField();
        txtb5_2 = new javax.swing.JTextField();
        txtb5_1 = new javax.swing.JTextField();
        cbx4 = new javax.swing.JCheckBox();
        cbx35 = new javax.swing.JCheckBox();
        cbx3 = new javax.swing.JCheckBox();
        cbx25 = new javax.swing.JCheckBox();
        cbx2 = new javax.swing.JCheckBox();
        cbx15 = new javax.swing.JCheckBox();
        cbx5 = new javax.swing.JCheckBox();
        cbx1 = new javax.swing.JCheckBox();
        cbx70 = new javax.swing.JCheckBox();
        cbx50 = new javax.swing.JCheckBox();
        btn250 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn150 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbxall = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("ABASTECIMIENTO DE BOLETOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RESPONSABLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        txtId.setEditable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BUSCAR.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDatos.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtb4_1.setEnabled(false);
        txtb4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, -1));

        txtb4_2.setEnabled(false);
        txtb4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, -1));

        txtb4_3.setEnabled(false);
        txtb4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, -1));

        txtb4_4.setEnabled(false);
        txtb4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 70, -1));

        txtb4_5.setEnabled(false);
        txtb4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb4_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 70, -1));

        txtb35_5.setEnabled(false);
        txtb35_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, -1));

        txtb35_4.setEnabled(false);
        txtb35_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 70, -1));

        txtb35_3.setEnabled(false);
        txtb35_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, -1));

        txtb35_2.setEnabled(false);
        txtb35_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, -1));

        txtb35_1.setEnabled(false);
        txtb35_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb35_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb35_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, -1));

        txtb3_5.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_5.setEnabled(false);
        txtb3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 70, -1));

        txtb3_4.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_4.setEnabled(false);
        txtb3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 70, -1));

        txtb3_3.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_3.setEnabled(false);
        txtb3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 70, -1));

        txtb3_2.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_2.setEnabled(false);
        txtb3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 70, -1));

        txtb3_1.setBackground(new java.awt.Color(255, 204, 51));
        txtb3_1.setEnabled(false);
        txtb3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb3_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, -1));

        txtb25_5.setEnabled(false);
        txtb25_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 70, -1));

        txtb25_4.setEnabled(false);
        txtb25_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 70, -1));

        txtb25_3.setEnabled(false);
        txtb25_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 70, -1));

        txtb25_2.setEnabled(false);
        txtb25_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 70, -1));

        txtb25_1.setEnabled(false);
        txtb25_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb25_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb25_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 70, -1));

        txtb2_5.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_5.setEnabled(false);
        txtb2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 70, -1));

        txtb2_4.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_4.setEnabled(false);
        txtb2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 70, -1));

        txtb2_3.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_3.setEnabled(false);
        txtb2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 70, -1));

        txtb2_2.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_2.setEnabled(false);
        txtb2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 70, -1));

        txtb2_1.setForeground(new java.awt.Color(255, 255, 255));
        txtb2_1.setEnabled(false);
        txtb2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb2_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 70, -1));

        txtb15_5.setEnabled(false);
        txtb15_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 70, -1));

        txtb15_4.setEnabled(false);
        txtb15_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 70, -1));

        txtb15_3.setEnabled(false);
        txtb15_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 70, -1));

        txtb15_2.setEnabled(false);
        txtb15_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 70, -1));

        txtb15_1.setEnabled(false);
        txtb15_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb15_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb15_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 70, -1));

        txtb12_5.setEnabled(false);
        txtb12_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, -1));

        txtb12_4.setEnabled(false);
        txtb12_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, -1));

        txtb12_3.setEnabled(false);
        txtb12_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        txtb12_2.setEnabled(false);
        txtb12_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, -1));

        txtb12_1.setEnabled(false);
        txtb12_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb12_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb12_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, -1));

        txtb1_5.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_5.setEnabled(false);
        txtb1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 239, 70, -1));

        txtb1_4.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_4.setEnabled(false);
        txtb1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 204, 70, -1));

        txtb1_3.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_3.setEnabled(false);
        txtb1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtb1_3KeyReleased(evt);
            }
        });
        jPanel2.add(txtb1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 169, 70, -1));

        txtb1_2.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_2.setEnabled(false);
        txtb1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 134, 70, -1));

        txtb1_1.setBackground(new java.awt.Color(240, 240, 240));
        txtb1_1.setEnabled(false);
        txtb1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb1_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 99, 70, -1));

        txtb7_5.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_5.setEnabled(false);
        txtb7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 239, 70, -1));

        txtb7_4.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_4.setEnabled(false);
        txtb7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 204, 70, -1));

        txtb7_3.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_3.setEnabled(false);
        txtb7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 169, 70, -1));

        txtb7_2.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_2.setEnabled(false);
        txtb7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 134, 70, -1));

        txtb7_1.setBackground(new java.awt.Color(255, 255, 153));
        txtb7_1.setEnabled(false);
        txtb7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb7_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb7_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 99, 70, -1));

        txtb5_5.setEnabled(false);
        txtb5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_5KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 239, 70, -1));

        txtb5_4.setEnabled(false);
        txtb5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_4KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 204, 70, -1));

        txtb5_3.setEnabled(false);
        txtb5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_3KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 169, 70, -1));

        txtb5_2.setEnabled(false);
        txtb5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_2KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 134, 70, -1));

        txtb5_1.setEnabled(false);
        txtb5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtb5_1KeyTyped(evt);
            }
        });
        jPanel2.add(txtb5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 99, 70, -1));

        cbx4.setText("4.00");
        cbx4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbx4StateChanged(evt);
            }
        });
        cbx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx4ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        cbx35.setText("3.50");
        cbx35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx35ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        cbx3.setText("3.00");
        cbx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx3ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        cbx25.setText("2.50");
        cbx25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx25ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        cbx2.setText("2.00");
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        cbx15.setText("1.50");
        cbx15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx15ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        cbx5.setText("5.00");
        cbx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx5ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        cbx1.setText("1.00");
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        cbx70.setText("0.70");
        cbx70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx70ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx70, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        cbx50.setText("0.50");
        cbx50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx50ActionPerformed(evt);
            }
        });
        jPanel2.add(cbx50, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        btn250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn250.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn250ActionPerformed(evt);
            }
        });
        jPanel2.add(btn250, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 30, 18));

        btn200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });
        jPanel2.add(btn200, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 30, 18));

        btn150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn150ActionPerformed(evt);
            }
        });
        jPanel2.add(btn150, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 30, 18));

        btn100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        jPanel2.add(btn100, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 30, 18));

        btn70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });
        jPanel2.add(btn70, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 30, 18));

        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FlechaAbajo.png"))); // NOI18N
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        jPanel2.add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 30, 18));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ABASTECER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbxall.setText("Todas");
        cbxall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbxall)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn250ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn250ActionPerformed
        if(!"".equals(txtb25_4.getText())){
            txtb25_5.setText(aumentar(txtb25_4.getText()));
        }if(!"".equals(txtb25_3.getText())){
            txtb25_4.setText(aumentar(txtb25_3.getText()));
        }if(!"".equals(txtb25_2.getText())){
            txtb25_3.setText(aumentar(txtb25_2.getText()));
        }if(!"".equals(txtb25_1.getText())){
            txtb25_2.setText(aumentar(txtb25_1.getText()));
        }
    }//GEN-LAST:event_btn250ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        if(!"".equals(txtb2_4.getText())){
            txtb2_5.setText(aumentar(txtb2_4.getText()));
        }if(!"".equals(txtb2_3.getText())){
            txtb2_4.setText(aumentar(txtb2_3.getText()));
        }if(!"".equals(txtb2_2.getText())){
            txtb2_3.setText(aumentar(txtb2_2.getText()));
        }if(!"".equals(txtb2_1.getText())){
            txtb2_2.setText(aumentar(txtb2_1.getText()));
        }
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn150ActionPerformed
        if(!"".equals(txtb15_4.getText())){
            txtb15_5.setText(aumentar(txtb15_4.getText()));
        }if(!"".equals(txtb15_3.getText())){
            txtb15_4.setText(aumentar(txtb15_3.getText()));
        }if(!"".equals(txtb15_2.getText())){
            txtb15_3.setText(aumentar(txtb15_2.getText()));
        }if(!"".equals(txtb15_1.getText())){
            txtb15_2.setText(aumentar(txtb15_1.getText()));
        }
    }//GEN-LAST:event_btn150ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        if(!"".equals(txtb1_4.getText())){
            txtb1_5.setText(aumentar(txtb1_4.getText()));
        }if(!"".equals(txtb1_3.getText())){
            txtb1_4.setText(aumentar(txtb1_3.getText()));
        }if(!"".equals(txtb1_2.getText())){
            txtb1_3.setText(aumentar(txtb1_2.getText()));
        }if(!"".equals(txtb1_1.getText())){
            txtb1_2.setText(aumentar(txtb1_1.getText()));
        }
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        if(!"".equals(txtb7_4.getText())){
            txtb7_5.setText(aumentar(txtb7_4.getText()));
        }if(!"".equals(txtb7_3.getText())){
            txtb7_4.setText(aumentar(txtb7_3.getText()));
        }if(!"".equals(txtb7_2.getText())){
            txtb7_3.setText(aumentar(txtb7_2.getText()));
        }if(!"".equals(txtb7_1.getText())){
            txtb7_2.setText(aumentar(txtb7_1.getText()));
        }
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        if(!"".equals(txtb5_4.getText())){
            txtb5_5.setText(aumentar(txtb5_4.getText()));
        }if(!"".equals(txtb5_3.getText())){
            txtb5_4.setText(aumentar(txtb5_3.getText()));
        }if(!"".equals(txtb5_2.getText())){
            txtb5_3.setText(aumentar(txtb5_2.getText()));
        }if(!"".equals(txtb5_1.getText())){
            
            txtb5_2.setText(aumentar(txtb5_1.getText()));
            
        }
    }//GEN-LAST:event_btn50ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
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
        
        if("".equals(txtId.getText())){
            JOptionPane.showMessageDialog(null, "ELIJA RESPONSABLE DE LOS BOLETOS");
        }else{
            Responsable= txtId.getText(); 
            id=DD.Iddistribucion();
            DD.RegistrarDistibucion(id,Responsable,Fecha1,Principal.usuario, VD.ObtenerCodigo(Padron),horas);
            
            if(cbx4.isSelected()){
                Precio=4.00;
                agregar(txtb4_1);
                agregar(txtb4_2);
                agregar(txtb4_3);
                agregar(txtb4_4);
                agregar(txtb4_5);
            }if(cbx35.isSelected()){
                Precio=3.50;
                agregar(txtb35_1);
                agregar(txtb35_2);
                agregar(txtb35_3);
                agregar(txtb35_4);
                agregar(txtb35_5);
            }if(cbx3.isSelected()){
                Precio=3.00;
                agregar(txtb3_1);
                agregar(txtb3_2);
                agregar(txtb3_3);
                agregar(txtb3_4);
                agregar(txtb3_5);
            }if(cbx25.isSelected()){
                Precio=2.50;
                agregar(txtb25_1);
                agregar(txtb25_2);
                agregar(txtb25_3);
                agregar(txtb25_4);
                agregar(txtb25_5);

            }if(cbx2.isSelected()){
                Precio=2.00;
                agregar(txtb2_1);
                agregar(txtb2_2);
                agregar(txtb2_3);
                agregar(txtb2_4);
                agregar(txtb2_5);
            }if(cbx15.isSelected()){
                Precio=1.50;
                agregar(txtb15_1);
                agregar(txtb15_2);
                agregar(txtb15_3);
                agregar(txtb15_4);
                agregar(txtb15_5);
            }if(cbx5.isSelected()){
                Precio=5.00;
                agregar(txtb12_1);
                agregar(txtb12_2);
                agregar(txtb12_3);
                agregar(txtb12_4);
                agregar(txtb12_5);
            }if(cbx1.isSelected()){
                Precio=1.00;
                agregar(txtb1_1);
                agregar(txtb1_2);
                agregar(txtb1_3);
                agregar(txtb1_4);
                agregar(txtb1_5);
            }if(cbx70.isSelected()){
                Precio=0.70;
                agregar(txtb7_1);
                agregar(txtb7_2);
                agregar(txtb7_3);
                agregar(txtb7_4);
                agregar(txtb7_5);
            }if(cbx50.isSelected()){
                Precio=0.50;
                agregar(txtb5_1);
                agregar(txtb5_2);
                agregar(txtb5_3);
                agregar(txtb5_4);
                agregar(txtb5_5);
            }
            System.out.println(Fecha1);
            JOptionPane.showMessageDialog(null,Fecha1);
            JOptionPane.showMessageDialog(null, "Boletos Abastecidos correctamente");
            ControlBoleto.LimpiarTablas();
            ControlBoleto.LlenarTabla(ControlBoleto.tb4,"4.00",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb35,"3.50",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb3,"3.00",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb25,"2.50",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb2,"2.00",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb15,"1.50",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb5,"5.00",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb1,"1.00",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb70,"0.70",Codigo);
            ControlBoleto.LlenarTabla(ControlBoleto.tb50,"0.50",Codigo);
            
            this.dispose();
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BusquedaEmpleado obMa = new BusquedaEmpleado();
        Entorno.add(obMa);
        Centrar(Entorno, obMa);
        obMa.toFront();
        obMa.setVisible(true); 
        
        BusquedaEmpleado.boletaje=0;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx4ActionPerformed
        
        if(cbx4.isSelected()){
            txtb4_1.setEnabled(true);
            txtb4_2.setEnabled(true);
            txtb4_3.setEnabled(true);
            txtb4_4.setEnabled(true);
            txtb4_5.setEnabled(true);
        }else{
            txtb4_1.setEnabled(false);
            txtb4_2.setEnabled(false);
            txtb4_3.setEnabled(false);
            txtb4_4.setEnabled(false);
            txtb4_5.setEnabled(false);
        }
        
        
        
    }//GEN-LAST:event_cbx4ActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        if(cbx1.isSelected()){
            txtb1_1.setEnabled(true);
            txtb1_2.setEnabled(true);
            txtb1_3.setEnabled(true);
            txtb1_4.setEnabled(true);
            txtb1_5.setEnabled(true);
            
            
            
            txtb1_1.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_2.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_3.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_4.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_5.setBackground(new java.awt.Color(151, 253, 164));
            
            
            txtb1_1.requestFocus();
            
        }else{
            txtb1_1.setEnabled(false);
            txtb1_2.setEnabled(false);
            txtb1_3.setEnabled(false);
            txtb1_4.setEnabled(false);
            txtb1_5.setEnabled(false);            
            
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx3ActionPerformed
        if(cbx3.isSelected()){
            txtb3_1.setEnabled(true);
            txtb3_2.setEnabled(true);
            txtb3_3.setEnabled(true);
            txtb3_4.setEnabled(true);
            txtb3_5.setEnabled(true);
        }else{
            txtb3_1.setEnabled(false);
            txtb3_2.setEnabled(false);
            txtb3_3.setEnabled(false);
            txtb3_4.setEnabled(false);
            txtb3_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx3ActionPerformed

    private void cbx25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx25ActionPerformed
        if(cbx25.isSelected()){
            txtb25_1.setEnabled(true);
            txtb25_2.setEnabled(true);
            txtb25_3.setEnabled(true);
            txtb25_4.setEnabled(true);
            txtb25_5.setEnabled(true);
            
            
            
            txtb25_1.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_2.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_3.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_4.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_5.setBackground(new java.awt.Color(193, 139, 123));
        }else{
            txtb25_1.setEnabled(false);
            txtb25_2.setEnabled(false);
            txtb25_3.setEnabled(false);
            txtb25_4.setEnabled(false);
            txtb25_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx25ActionPerformed

    private void cbx35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx35ActionPerformed
        if(cbx35.isSelected()){
            txtb35_1.setEnabled(true);
            txtb35_2.setEnabled(true);
            txtb35_3.setEnabled(true);
            txtb35_4.setEnabled(true);
            txtb35_5.setEnabled(true);
        }else{
            txtb35_1.setEnabled(false);
            txtb35_2.setEnabled(false);
            txtb35_3.setEnabled(false);
            txtb35_4.setEnabled(false);
            txtb35_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx35ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        if(cbx2.isSelected()){
            txtb2_1.setEnabled(true);
            txtb2_2.setEnabled(true);
            txtb2_3.setEnabled(true);
            txtb2_4.setEnabled(true);
            txtb2_5.setEnabled(true);
            
            
            
            txtb2_1.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_2.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_3.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_4.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_5.setBackground(new java.awt.Color(132, 132, 135));
            
            
        }else{
            txtb2_1.setEnabled(false);
            txtb2_2.setEnabled(false);
            txtb2_3.setEnabled(false);
            txtb2_4.setEnabled(false);
            txtb2_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx15ActionPerformed
        if(cbx15.isSelected()){
            txtb15_1.setEnabled(true);
            txtb15_2.setEnabled(true);
            txtb15_3.setEnabled(true);
            txtb15_4.setEnabled(true);
            txtb15_5.setEnabled(true);
            
            
            
            
            txtb15_1.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_2.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_3.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_4.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_5.setBackground(new java.awt.Color(127, 144, 249));
            
            
            
        }else{
            txtb15_1.setEnabled(false);
            txtb15_2.setEnabled(false);
            txtb15_3.setEnabled(false);
            txtb15_4.setEnabled(false);
            txtb15_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx15ActionPerformed

    private void cbx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx5ActionPerformed
        if(cbx5.isSelected()){
            txtb12_1.setEnabled(true);
            txtb12_2.setEnabled(true);
            txtb12_3.setEnabled(true);
            txtb12_4.setEnabled(true);
            txtb12_5.setEnabled(true);
        }else{
            txtb12_1.setEnabled(false);
            txtb12_2.setEnabled(false);
            txtb12_3.setEnabled(false);
            txtb12_4.setEnabled(false);
            txtb12_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx5ActionPerformed

    private void cbx70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx70ActionPerformed
        if(cbx70.isSelected()){
            txtb7_1.setEnabled(true);
            txtb7_2.setEnabled(true);
            txtb7_3.setEnabled(true);
            txtb7_4.setEnabled(true);
            txtb7_5.setEnabled(true);
        }else{
            txtb7_1.setEnabled(false);
            txtb7_2.setEnabled(false);
            txtb7_3.setEnabled(false);
            txtb7_4.setEnabled(false);
            txtb7_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx70ActionPerformed

    private void cbx50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx50ActionPerformed
        if(cbx50.isSelected()){
            txtb5_1.setEnabled(true);
            txtb5_2.setEnabled(true);
            txtb5_3.setEnabled(true);
            txtb5_4.setEnabled(true);
            txtb5_5.setEnabled(true);
            
            txtb5_1.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_2.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_3.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_4.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_5.setBackground(new java.awt.Color(255, 153, 153));
            
            
        }else{
            txtb5_1.setEnabled(false);
            txtb5_2.setEnabled(false);
            txtb5_3.setEnabled(false);
            txtb5_4.setEnabled(false);
            txtb5_5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx50ActionPerformed

    private void txtb4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb4_1.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb4_1KeyTyped

    private void txtb4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb4_2.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb4_2KeyTyped

    private void txtb4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb4_3.getText().length()>5){
            evt.consume();}       
    }//GEN-LAST:event_txtb4_3KeyTyped

    private void txtb4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb4_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb4_4KeyTyped

    private void txtb4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb4_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb4_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb4_5KeyTyped

    private void txtb35_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb35_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_1KeyTyped

    private void txtb35_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb35_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_2KeyTyped

    private void txtb35_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb35_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_3KeyTyped

    private void txtb35_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb35_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_4KeyTyped

    private void txtb35_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb35_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb35_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb35_5KeyTyped

    private void txtb3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb3_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_1KeyTyped

    private void txtb3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb3_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_2KeyTyped

    private void txtb3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb3_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_3KeyTyped

    private void txtb3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb3_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_4KeyTyped

    private void txtb3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb3_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb3_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb3_5KeyTyped

    private void txtb25_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb25_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_1KeyTyped

    private void txtb25_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb25_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_2KeyTyped

    private void txtb25_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb25_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_3KeyTyped

    private void txtb25_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb25_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb25_4KeyTyped

    private void txtb25_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb25_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb25_5.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb25_5KeyTyped

    private void txtb2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb2_1.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb2_1KeyTyped

    private void txtb2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb2_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_2KeyTyped

    private void txtb2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb2_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_3KeyTyped

    private void txtb2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb2_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2_4KeyTyped

    private void txtb2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb2_5.getText().length()>5){
            evt.consume();}
    }//GEN-LAST:event_txtb2_5KeyTyped

    private void txtb15_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb15_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_1KeyTyped

    private void txtb15_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb15_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_2KeyTyped

    private void txtb15_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb15_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_3KeyTyped

    private void txtb15_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb15_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_4KeyTyped

    private void txtb15_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb15_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb15_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb15_5KeyTyped

    private void txtb12_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb12_1.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_1KeyTyped

    private void txtb12_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb12_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_2KeyTyped

    private void txtb12_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb12_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_3KeyTyped

    private void txtb12_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb12_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_4KeyTyped

    private void txtb12_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb12_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb12_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb12_5KeyTyped

    private void txtb1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb1_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_1KeyTyped

    private void txtb1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb1_2.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_2KeyTyped

    private void txtb1_3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_3KeyReleased
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb1_3.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_3KeyReleased

    private void txtb1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb1_4.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_4KeyTyped

    private void txtb1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb1_5.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1_5KeyTyped

    private void txtb7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb7_1.getText().length()>5){
            evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_1KeyTyped

    private void txtb7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb7_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_2KeyTyped

    private void txtb7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb7_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_3KeyTyped

    private void txtb7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb7_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_4KeyTyped

    private void txtb7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb7_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb7_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb7_5KeyTyped

    private void txtb5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb5_1.getText().length()>5){
            evt.consume();} 
    }//GEN-LAST:event_txtb5_1KeyTyped

    private void txtb5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_2KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb5_2.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_2KeyTyped

    private void txtb5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_3KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb5_3.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_3KeyTyped

    private void txtb5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb5_4.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_4KeyTyped

    private void txtb5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb5_5KeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar()==KeyEvent.VK_SPACE) &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            
        }else{
            
        }if(txtb5_5.getText().length()>5){
            evt.consume();}         // TODO add your handling code here:
    }//GEN-LAST:event_txtb5_5KeyTyped

    private void cbxallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxallActionPerformed
            if(cbxall.isSelected()){
                ActivarCasilla(true);
                txtb4_1.setEnabled(true);
                txtb4_2.setEnabled(true);
                txtb4_3.setEnabled(true);
                txtb4_4.setEnabled(true);
                txtb4_5.setEnabled(true);
                txtb1_1.setEnabled(true);
                txtb1_2.setEnabled(true);
                txtb1_3.setEnabled(true);
                txtb1_4.setEnabled(true);
                txtb1_5.setEnabled(true);
                txtb3_1.setEnabled(true);
                txtb3_2.setEnabled(true);
                txtb3_3.setEnabled(true);
                txtb3_4.setEnabled(true);
                txtb3_5.setEnabled(true);
                txtb25_1.setEnabled(true);
                txtb25_2.setEnabled(true);
                txtb25_3.setEnabled(true);
                txtb25_4.setEnabled(true);
                txtb25_5.setEnabled(true);
                txtb35_1.setEnabled(true);
                txtb35_2.setEnabled(true);
                txtb35_3.setEnabled(true);
                txtb35_4.setEnabled(true);
                txtb35_5.setEnabled(true);
                txtb2_1.setEnabled(true);
                txtb2_2.setEnabled(true);
                txtb2_3.setEnabled(true);
                txtb2_4.setEnabled(true);
                txtb2_5.setEnabled(true);
                txtb15_1.setEnabled(true);
                txtb15_2.setEnabled(true);
                txtb15_3.setEnabled(true);
                txtb15_4.setEnabled(true);
                txtb15_5.setEnabled(true);
                txtb12_1.setEnabled(true);
                txtb12_2.setEnabled(true);
                txtb12_3.setEnabled(true);
                txtb12_4.setEnabled(true);
                txtb12_5.setEnabled(true);
                txtb7_1.setEnabled(true);
                txtb7_2.setEnabled(true);
                txtb7_3.setEnabled(true);
                txtb7_4.setEnabled(true);
                txtb7_5.setEnabled(true);
                txtb5_1.setEnabled(true);
                txtb5_2.setEnabled(true);
                txtb5_3.setEnabled(true);
                txtb5_4.setEnabled(true);
                txtb5_5.setEnabled(true);
                
                
                txtb5_1.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_2.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_3.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_4.setBackground(new java.awt.Color(255, 153, 153));
            txtb5_5.setBackground(new java.awt.Color(255, 153, 153));
            
            txtb1_1.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_2.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_3.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_4.setBackground(new java.awt.Color(151, 253, 164));
            txtb1_5.setBackground(new java.awt.Color(151, 253, 164));
            
            txtb15_1.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_2.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_3.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_4.setBackground(new java.awt.Color(127, 144, 249));
            txtb15_5.setBackground(new java.awt.Color(127, 144, 249));
            
            txtb2_1.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_2.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_3.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_4.setBackground(new java.awt.Color(132, 132, 135));
            txtb2_5.setBackground(new java.awt.Color(132, 132, 135));
            
            txtb25_1.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_2.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_3.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_4.setBackground(new java.awt.Color(193, 139, 123));
            txtb25_5.setBackground(new java.awt.Color(193, 139, 123));
                
                
                
                
                
            }else{
                ActivarCasilla(false);

                txtb4_1.setEnabled(false);
                txtb4_2.setEnabled(false);
                txtb4_3.setEnabled(false);
                txtb4_4.setEnabled(false);
                txtb4_5.setEnabled(false);
                txtb1_1.setEnabled(false);
                txtb1_2.setEnabled(false);
                txtb1_3.setEnabled(false);
                txtb1_4.setEnabled(false);
                txtb1_5.setEnabled(false);
                txtb3_1.setEnabled(false);
                txtb3_2.setEnabled(false);
                txtb3_3.setEnabled(false);
                txtb3_4.setEnabled(false);
                txtb3_5.setEnabled(false);
                txtb25_1.setEnabled(false);
                txtb25_2.setEnabled(false);
                txtb25_3.setEnabled(false);
                txtb25_4.setEnabled(false);
                txtb25_5.setEnabled(false);
                txtb35_1.setEnabled(false);
                txtb35_2.setEnabled(false);
                txtb35_3.setEnabled(false);
                txtb35_4.setEnabled(false);
                txtb35_5.setEnabled(false);
                txtb2_1.setEnabled(false);
                txtb2_2.setEnabled(false);
                txtb2_3.setEnabled(false);
                txtb2_4.setEnabled(false);
                txtb2_5.setEnabled(false);
                txtb15_1.setEnabled(false);
                txtb15_2.setEnabled(false);
                txtb15_3.setEnabled(false);
                txtb15_4.setEnabled(false);
                txtb15_5.setEnabled(false);
                txtb12_1.setEnabled(false);
                txtb12_2.setEnabled(false);
                txtb12_3.setEnabled(false);
                txtb12_4.setEnabled(false);
                txtb12_5.setEnabled(false);
                txtb7_1.setEnabled(false);
                txtb7_2.setEnabled(false);
                txtb7_3.setEnabled(false);
                txtb7_4.setEnabled(false);
                txtb7_5.setEnabled(false);
                txtb5_1.setEnabled(false);
                txtb5_2.setEnabled(false);
                txtb5_3.setEnabled(false);
                txtb5_4.setEnabled(false);
                txtb5_5.setEnabled(false);


            
                
            }
    }//GEN-LAST:event_cbxallActionPerformed

    private void cbx4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbx4StateChanged
        
    }//GEN-LAST:event_cbx4StateChanged
    
    public String aumentar(String num){
             
        int numero = Integer.parseInt(num);
        String numeroS = "";
        String last="";
        if(numero>0){            
            numero+=100;
            last=String.valueOf(numero);
            for(int i  = last.length();i<6;i++){
                last= "0"+last;
            }                   
            
            
        }else{
            return "";
        }
        
        
        return last;
    }
    
    void agregar(javax.swing.JTextField B1){
        
        
        if(!"".equals(B1.getText())){
            int numero = Integer.parseInt(B1.getText());
            String last="";
            if(numero>99999){
                int d3,d4,d5,d6;
                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                d6 = numero % 1000000 / 100000;
                numero =(d6*100000)+(d5*10000)+(d4*1000)+((d3+1)*100);
                
            }else if(numero>9999 && numero<=99999) {
                int d3,d4,d5;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;
                numero =(d5*10000)+(d4*1000)+((d3+1)*100);
                
                
            }else if(numero>999 && numero<=9999){
                int d3,d4;                
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;		
                numero =(d4*1000)+((d3+1)*100);
                             
            }else{
                if(numero>=1&&numero<=99){
                    
                }else{                   
                    int d3;               
                    d3 = numero % 1000 / 100;			
                    numero =((d3+1)*100);
                    
                }
            }
            
            last=String.valueOf(numero);
            
            while(last.length()<6){
                last= "0"+last;
            }
            
            DD.RegistrarDetalleD(id, B1.getText(),last, Precio);
           // DBD.Distribucion(Responsable, VD.ObtenerCodigo(Padron),Precio,Fecha);
           
           
           
            }
    }
    private void ActivarCasilla(boolean c){
        cbx4.setSelected(c);
        cbx35.setSelected(c);
        cbx3.setSelected(c);
        cbx25.setSelected(c);
        cbx2.setSelected(c);
        cbx5.setSelected(c);
        cbx15.setSelected(c);
        cbx1.setSelected(c);
        cbx70.setSelected(c);
        cbx50.setSelected(c);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn150;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn250;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn70;
    private javax.swing.JCheckBox cbx1;
    private javax.swing.JCheckBox cbx15;
    private javax.swing.JCheckBox cbx2;
    private javax.swing.JCheckBox cbx25;
    private javax.swing.JCheckBox cbx3;
    private javax.swing.JCheckBox cbx35;
    private javax.swing.JCheckBox cbx4;
    private javax.swing.JCheckBox cbx5;
    private javax.swing.JCheckBox cbx50;
    private javax.swing.JCheckBox cbx70;
    private javax.swing.JCheckBox cbxall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txtDatos;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtb12_1;
    private javax.swing.JTextField txtb12_2;
    private javax.swing.JTextField txtb12_3;
    private javax.swing.JTextField txtb12_4;
    private javax.swing.JTextField txtb12_5;
    private javax.swing.JTextField txtb15_1;
    private javax.swing.JTextField txtb15_2;
    private javax.swing.JTextField txtb15_3;
    private javax.swing.JTextField txtb15_4;
    private javax.swing.JTextField txtb15_5;
    private javax.swing.JTextField txtb1_1;
    private javax.swing.JTextField txtb1_2;
    private javax.swing.JTextField txtb1_3;
    private javax.swing.JTextField txtb1_4;
    private javax.swing.JTextField txtb1_5;
    private javax.swing.JTextField txtb25_1;
    private javax.swing.JTextField txtb25_2;
    private javax.swing.JTextField txtb25_3;
    private javax.swing.JTextField txtb25_4;
    private javax.swing.JTextField txtb25_5;
    private javax.swing.JTextField txtb2_1;
    private javax.swing.JTextField txtb2_2;
    private javax.swing.JTextField txtb2_3;
    private javax.swing.JTextField txtb2_4;
    private javax.swing.JTextField txtb2_5;
    private javax.swing.JTextField txtb35_1;
    private javax.swing.JTextField txtb35_2;
    private javax.swing.JTextField txtb35_3;
    private javax.swing.JTextField txtb35_4;
    private javax.swing.JTextField txtb35_5;
    private javax.swing.JTextField txtb3_1;
    private javax.swing.JTextField txtb3_2;
    private javax.swing.JTextField txtb3_3;
    private javax.swing.JTextField txtb3_4;
    private javax.swing.JTextField txtb3_5;
    private javax.swing.JTextField txtb4_1;
    private javax.swing.JTextField txtb4_2;
    private javax.swing.JTextField txtb4_3;
    private javax.swing.JTextField txtb4_4;
    private javax.swing.JTextField txtb4_5;
    private javax.swing.JTextField txtb5_1;
    private javax.swing.JTextField txtb5_2;
    private javax.swing.JTextField txtb5_3;
    private javax.swing.JTextField txtb5_4;
    private javax.swing.JTextField txtb5_5;
    private javax.swing.JTextField txtb7_1;
    private javax.swing.JTextField txtb7_2;
    private javax.swing.JTextField txtb7_3;
    private javax.swing.JTextField txtb7_4;
    private javax.swing.JTextField txtb7_5;
    // End of variables declaration//GEN-END:variables
}
