/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convertidor;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class view extends javax.swing.JFrame {

    /** Creates new form view */
    public view() {
        initComponents();
        SetCombos();
    }

    
    private void SetCombos(){
        CmbOrigen.addItem("Lempira");
        CmbOrigen.addItem("Dolar");
        CmbOrigen.addItem("Euro");        
        CmbOrigen.addItem("Quetzal");

        CmbDestino.addItem("Lempira");
        CmbDestino.addItem("Dolar");
        CmbDestino.addItem("Euro");        
        CmbDestino.addItem("Quetzal");

    
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CmbOrigen = new javax.swing.JComboBox<>();
        txtMonto = new javax.swing.JTextField();
        CmbDestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnConvertir = new javax.swing.JButton();
        Lbltotal = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jLabel1.setText("Convertidor de Monedas");

        CmbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbOrigenActionPerformed(evt);
            }
        });

        jLabel2.setText("Monto");

        jLabel3.setText("Covertir de");

        jLabel4.setText("A");

        BtnConvertir.setText("Convertir");
        BtnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvertirActionPerformed(evt);
            }
        });

        Lbltotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCambio.setEditable(false);
        txtCambio.setText(" ");

        jLabel7.setText("Total");

        txtDestino.setEditable(false);
        txtDestino.setText(" ");
        txtDestino.setEnabled(false);

        txtOrigen.setEditable(false);
        txtOrigen.setText(" ");
        txtOrigen.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(BtnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(BtnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvertirActionPerformed
        String val =(txtMonto.getText().length()==0)?"0":txtMonto.getText();
        double Monto= Integer.parseInt(val);
        
        int Origen = CmbOrigen.getSelectedIndex();
        String OrigenStr = CmbOrigen.getSelectedItem().toString();
        
        int Destino=CmbDestino.getSelectedIndex();
        String DestinoStr =CmbDestino.getSelectedItem().toString();
        
        Accion(DestinoStr, OrigenStr, Destino, Origen, Monto);
    }//GEN-LAST:event_BtnConvertirActionPerformed

    private void Accion(String DestinoTx,String OrigenTx,int Destino, int Origen,double Monto){
    
     Moneda mn;
        
        switch(Origen){
            case 0:
                mn = new Lempira();
                break;
            case 1:    
                mn= new Dolar();
                break;
            case 2:
                mn= new Euro();
                break;
            case 3:
                mn= new Quetzal();
                break;
            default:
                mn= new Lempira();
         }
        double Convertido = mn.convertir(Monto, DestinoTx);
        
             Moneda mnD;
        
        switch(Destino){
            case 0:
                mnD = new Lempira();
                break;
            case 1:    
                mnD= new Dolar();
                break;
            case 2:
                mnD= new Euro();
                break;
            case 3:
                mnD= new Quetzal();
                break;
            default:
                mnD= new Lempira();
         }
        
            String text= String.valueOf(Convertido) + mnD.getSimbolo();
            Lbltotal.setText(text);
           txtOrigen.setText(mn.Info());
           txtDestino.setText(mnD.Info());
           ArrayList<String> tx= mnD.Cambio(Convertido);
           String billete=tx.get(1)+mnD.getSimbolo();
            tx.remove(1);
           tx.remove(0);
          
           for (String string : tx) {
               billete +=" ,"+string+mnD.getSimbolo();
        }
            txtCambio.setText(billete);
        
    }
    
    private void CmbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbOrigenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConvertir;
    private javax.swing.JComboBox<String> CmbDestino;
    private javax.swing.JComboBox<String> CmbOrigen;
    private javax.swing.JLabel Lbltotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables

}
