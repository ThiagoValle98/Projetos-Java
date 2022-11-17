
package Interfaces;


public class CadastroRequisitos extends javax.swing.JFrame {

 
    public CadastroRequisitos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeRequisito = new javax.swing.JLabel();
        modulotxt = new javax.swing.JLabel();
        funcionalidadestxt = new javax.swing.JLabel();
        autortxt = new javax.swing.JLabel();
        versaotxt = new javax.swing.JLabel();
        prioridadetxt = new javax.swing.JLabel();
        complexidadetxt = new javax.swing.JLabel();
        descricaotxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoRequisito = new javax.swing.JTextArea();
        txtNomeRequisito = new javax.swing.JTextField();
        txtModuloRequisito = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFuncionalidadesRequisito = new javax.swing.JTextArea();
        txtComplexidadeRequisito = new javax.swing.JTextField();
        txtVersaoRequisito = new javax.swing.JTextField();
        escolhaPrioridadeRequisito = new javax.swing.JComboBox<>();
        btCadastrarRequisito = new javax.swing.JButton();
        btCancelarRequisito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR REQUISITO");

        nomeRequisito.setFont(null);
        nomeRequisito.setText("Nome do requisito:");
        nomeRequisito.setToolTipText("");

        modulotxt.setFont(null);
        modulotxt.setText("Módulo:");

        funcionalidadestxt.setFont(null);
        funcionalidadestxt.setText("Funcionalidades:");

        autortxt.setFont(null);
        autortxt.setText("Autor:");

        versaotxt.setFont(null);
        versaotxt.setText("Versão:");

        prioridadetxt.setFont(null);
        prioridadetxt.setText("Prioridade:");

        complexidadetxt.setFont(null);
        complexidadetxt.setText("Complexidade:");

        descricaotxt.setFont(null);
        descricaotxt.setText("Descrição:");

        txtDescricaoRequisito.setColumns(20);
        txtDescricaoRequisito.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoRequisito);

        txtFuncionalidadesRequisito.setColumns(20);
        txtFuncionalidadesRequisito.setRows(5);
        jScrollPane2.setViewportView(txtFuncionalidadesRequisito);

        escolhaPrioridadeRequisito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));

        btCadastrarRequisito.setText("Cadastrar");
        btCadastrarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarRequisitoActionPerformed(evt);
            }
        });

        btCancelarRequisito.setText("Cancelar");
        btCancelarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRequisitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(funcionalidadestxt)
                                .addComponent(prioridadetxt)
                                .addComponent(nomeRequisito)
                                .addComponent(modulotxt)
                                .addComponent(versaotxt)
                                .addComponent(txtNomeRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                .addComponent(txtModuloRequisito))
                            .addGap(216, 216, 216))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(complexidadetxt)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComplexidadeRequisito, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtVersaoRequisito)
                        .addComponent(escolhaPrioridadeRequisito, 0, 130, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrarRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(btCancelarRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autortxt)
                            .addComponent(descricaotxt)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeRequisito)
                    .addComponent(autortxt))
                .addGap(4, 4, 4)
                .addComponent(txtNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modulotxt)
                    .addComponent(descricaotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtModuloRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(funcionalidadestxt)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(complexidadetxt)
                        .addGap(3, 3, 3)
                        .addComponent(txtComplexidadeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prioridadetxt))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escolhaPrioridadeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(versaotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVersaoRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadastrarRequisito)
                        .addGap(4, 4, 4)
                        .addComponent(btCancelarRequisito)
                        .addContainerGap(63, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarRequisitoActionPerformed

    }//GEN-LAST:event_btCadastrarRequisitoActionPerformed

    private void btCancelarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRequisitoActionPerformed
     this.setVisible(false); 
    }//GEN-LAST:event_btCancelarRequisitoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autortxt;
    private javax.swing.JButton btCadastrarRequisito;
    private javax.swing.JButton btCancelarRequisito;
    private javax.swing.JLabel complexidadetxt;
    private javax.swing.JLabel descricaotxt;
    private javax.swing.JComboBox<String> escolhaPrioridadeRequisito;
    private javax.swing.JLabel funcionalidadestxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel modulotxt;
    private javax.swing.JLabel nomeRequisito;
    private javax.swing.JLabel prioridadetxt;
    private javax.swing.JTextField txtComplexidadeRequisito;
    private javax.swing.JTextArea txtDescricaoRequisito;
    private javax.swing.JTextArea txtFuncionalidadesRequisito;
    private javax.swing.JTextField txtModuloRequisito;
    private javax.swing.JTextField txtNomeRequisito;
    private javax.swing.JTextField txtVersaoRequisito;
    private javax.swing.JLabel versaotxt;
    // End of variables declaration//GEN-END:variables
}
