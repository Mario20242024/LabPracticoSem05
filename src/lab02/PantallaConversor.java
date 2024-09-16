/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab02;

/**
 *
 * @author casa
 */
public class PantallaConversor extends javax.swing.JFrame {
    
    public PantallaConversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        txtValor = new javax.swing.JTextField();
        btnSolDolar = new javax.swing.JButton();
        btnKgLb = new javax.swing.JButton();
        btnFM = new javax.swing.JButton();
        btnCF = new javax.swing.JButton();
        cbInversa = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtValor.setText("00.00");

        btnSolDolar.setText("De sol a dolar");
        btnSolDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolDolarActionPerformed(evt);
            }
        });

        btnKgLb.setText("De kg. a lb.");
        btnKgLb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKgLbActionPerformed(evt);
            }
        });

        btnFM.setText("De Feet a Metros");
        btnFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMActionPerformed(evt);
            }
        });

        btnCF.setText("De C° a F°");
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });

        cbInversa.setText("Inversa");

        jLabel1.setText("Valor: ");

        lblResultado.setText("Resultado: ");

        txtResultado.setText("00.00");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLimpiar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnCF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSolDolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKgLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblResultado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbInversa)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblResultado)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolDolar)
                    .addComponent(cbInversa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKgLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCF)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolDolarActionPerformed
        // TODO add your handling code here:
        double dolar = 3.78;
        double valor = Double.parseDouble(txtValor.getText());
        txtResultado.setText(String.format("%.2f",valor/dolar));
        if(cbInversa.isSelected()){
            txtResultado.setText(String.format("%.2f",valor*dolar));
        }
    }//GEN-LAST:event_btnSolDolarActionPerformed

    private void btnKgLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKgLbActionPerformed
        // TODO add your handling code here:
        double libra = 2.20462;
        double valor = Double.parseDouble(txtValor.getText());
        txtResultado.setText(String.format("%.2f",valor*libra));
        if(cbInversa.isSelected()){
            double kg = 0.453592;
            txtResultado.setText(String.format("%.2f",valor*kg));
        }
    }//GEN-LAST:event_btnKgLbActionPerformed

    private void btnFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMActionPerformed
        // TODO add your handling code here:
        double metro = 0.3048;
        double valor = Double.parseDouble(txtValor.getText());
        txtResultado.setText(String.format("%.2f",valor*metro));
        if(cbInversa.isSelected()){
            double pies = 3.28084;
            txtResultado.setText(String.format("%.2f",valor*pies));
        }
    }//GEN-LAST:event_btnFMActionPerformed

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(txtValor.getText());
        double conversor = (valor*(9.0/5.0)+32);
        txtResultado.setText(String.valueOf(conversor));
        if(cbInversa.isSelected()){
            double conversorf = ((valor-32)*(5.0/9.0));
            txtResultado.setText(String.format("%.2f",conversorf));
        }
    }//GEN-LAST:event_btnCFActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnFM;
    private javax.swing.JButton btnKgLb;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSolDolar;
    private javax.swing.JCheckBox cbInversa;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
