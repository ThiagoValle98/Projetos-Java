
package Interfaces;

public class Deslogar extends javax.swing.JFrame {

    /**
     * Creates new form Deslogar
     */
    public Deslogar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDeslogar = new javax.swing.JLabel();
        btDeslogar = new javax.swing.JButton();
        btNaoDeslogar = new javax.swing.JButton();
        txtDadosSalvos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DESLOGAR");

        txtDeslogar.setText("Deseja deslogar?");

        btDeslogar.setText("SIM");
        btDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeslogarActionPerformed(evt);
            }
        });

        btNaoDeslogar.setText("NÃO");

        txtDadosSalvos.setText("Seus dados serão salvos automáticamente.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNaoDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeslogar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(txtDadosSalvos)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtDeslogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDadosSalvos)
                .addGap(18, 18, 18)
                .addComponent(btDeslogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNaoDeslogar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeslogarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btDeslogarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeslogar;
    private javax.swing.JButton btNaoDeslogar;
    private javax.swing.JLabel txtDadosSalvos;
    private javax.swing.JLabel txtDeslogar;
    // End of variables declaration//GEN-END:variables
}
