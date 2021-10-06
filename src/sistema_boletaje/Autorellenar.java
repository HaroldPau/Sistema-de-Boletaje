
package sistema_boletaje;

import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static sistema_boletaje.Liquidacion.tb;
import static sistema_boletaje.Liquidacion.tLiquidacion;


public class Autorellenar extends javax.swing.JInternalFrame {
    int Bcontador=0;
    AudioClip sonido;
    
    public Autorellenar() {
        initComponents();
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/error.wav"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtnumero = new javax.swing.JTextField();

        setTitle("LLENADO RAPIDO");

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ultimo;
        int fila;
        for(int i=tb.getRowCount()-1; i>=0; i=i-1){                
                ultimo=(String)tLiquidacion.getValueAt(i,2);
                
                if(ultimo.equals("")){
                    fila=i;
                    FinalizarBoleto(fila);
                    tLiquidacion.setValueAt(false, fila,3);
                    
                            
                }
                               
            }
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyReleased
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtnumero.getText().length()<=5 &&txtnumero.getText().length()>0 ){
                sonido.play();
                JOptionPane.showMessageDialog(null,"DIGITE LOS 6 DIGITOS");
                
                
                
            }else{
                int contador= 0;
                String[] Datos = {"4.00","3.50","3.00","2.50","2.00","1.50","1.20","1.00","0.70","0.50"};
                String n2=txtnumero.getText();
                String inicio,precio;
                double preciod;

                int fila=0;

                for(int i=tb.getRowCount()-1; i>=0; i=i-1){                
                    inicio=(String)tLiquidacion.getValueAt(i,1);                
                    if(inicio.substring(0, 4).equals(n2.substring(0,4)) ){                    
                        contador= contador+ 1;                    
                        fila=i;
                    }                
                }
                if(contador==1){
                    int numero1 = Integer.parseInt((String)tLiquidacion.getValueAt(fila,1));
                    int numero2 = Integer.parseInt(txtnumero.getText());
                    if(numero1>numero2){
                        sonido.play();
                        JOptionPane.showMessageDialog(null,"BOLETO MAL DIGITADO");
                        
                    }else{
                        if(tLiquidacion.getValueAt(fila, 2).equals("")){
                            Bcontador++;                            
                        }
                        tLiquidacion.setValueAt(n2, fila,2);
                        Liquidacion.lblactivo.setText(""+Bcontador);
                    }
                    
                }else if (contador > 1) {
                    precio= JOptionPane.showInputDialog(null,"Selecciona precio", "PRECIO",JOptionPane.QUESTION_MESSAGE,null,Datos, Datos[0]).toString();


                    for(int i=tb.getRowCount()-1; i>=0; i=i-1){
                        preciod = (double)tLiquidacion.getValueAt(i,0);
                        inicio=(String)tLiquidacion.getValueAt(i,1);                
                        if((inicio.substring(0, 4).equals(n2.substring(0,4))) && preciod == Double.parseDouble(precio)  ){                    
                            contador= contador+ 1;                    
                            fila=i;
                        }                    
                    }
                    int numero1 = Integer.parseInt((String)tLiquidacion.getValueAt(fila,1));
                    int numero2 = Integer.parseInt(txtnumero.getText());
                    if(numero1>numero2){
                        sonido.play();
                        JOptionPane.showMessageDialog(null,"BOLETO MAL DIGITADO");
                        
                    }else{
                        if(tLiquidacion.getValueAt(fila, 2).equals("")){
                            Bcontador++;                            
                        }
                        tLiquidacion.setValueAt(n2, fila,2);
                        Liquidacion.lblactivo.setText(""+Bcontador);
                    }

                }else{
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"BOLETO NO COINCIDE");
                    
                }



                txtnumero.setText("");
            }
            
            
        }
    }//GEN-LAST:event_txtnumeroKeyReleased

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        if(!Character.isDigit(evt.getKeyChar())  &&  !(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
            
            evt.consume();
        }if(txtnumero.getText().length()>5){
                evt.consume();}
    }//GEN-LAST:event_txtnumeroKeyTyped
public void FinalizarBoleto(int FilaSelec){
              
        if(FilaSelec==-1){
            JOptionPane.showMessageDialog(null,"POR FAVOR SELECCIONE ALGUNA FILA");
        }else{
           int FilaSelect=FilaSelec;
           
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
            }tLiquidacion.setValueAt(last, FilaSelect, 2);
           
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
