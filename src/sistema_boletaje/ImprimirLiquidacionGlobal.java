
package sistema_boletaje;

import Dao.LiquidacionDao;
import Bean.Liquidacion;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImprimirLiquidacionGlobal extends javax.swing.JInternalFrame {
    DefaultTableModel tb = null;
    LiquidacionDao LD = new LiquidacionDao();
        
   static public String fecha;
    public ImprimirLiquidacionGlobal() {
        initComponents();
        llenar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tLiquidacionD = new javax.swing.JTable();

        tLiquidacionD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PADRON", "NOMBRES", "VUELTAS", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tLiquidacionD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenar(){
        ArrayList<Liquidacion> ListaBoletos;
        ListaBoletos = LD.LiquidacionDiaria(fecha);
        tb=(DefaultTableModel)tLiquidacionD.getModel();
        ListaBoletos.forEach((obj) -> {
            tb.addRow(new Object[] {obj.getPadron(),obj.getNombre(),obj.getVuelta(),obj.getTotal()} );
        });
    }
    public void imprimir(){
        try {
        MessageFormat headerFormat = new MessageFormat("Registro de producción del día: "+fecha);
        
        MessageFormat footerFormat = new MessageFormat("Empresa Salvador S.A.C.");
        tLiquidacionD.print(JTable.PrintMode.NORMAL, headerFormat,footerFormat);


        }catch(PrinterException e){
           Logger.getLogger(ReporteProduccion.class.getName()).log
           (Level.SEVERE, null, e);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tLiquidacionD;
    // End of variables declaration//GEN-END:variables
}
