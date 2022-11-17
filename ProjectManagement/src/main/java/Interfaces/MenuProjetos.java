
package Interfaces;

import Conexoes.ProjetosMetodos;
import Dados.Projetos;
import javax.swing.table.DefaultTableModel;

public class MenuProjetos extends javax.swing.JFrame {

    public MenuProjetos() {
        initComponents();
        mostrarProjetos();
        limparProjetos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrarProjeto = new javax.swing.JButton();
        btAlterarProjetos = new javax.swing.JButton();
        btDeletarProjeto = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        txtProjetos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProjetos = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idprojetotxt = new javax.swing.JLabel();
        idautortxt = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btSalvarAlteracao = new javax.swing.JButton();
        nomeprojetotxt = new javax.swing.JTextField();
        aaa = new javax.swing.JScrollPane();
        descricaotxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROJETOS");

        btCadastrarProjeto.setText("Cadastrar");
        btCadastrarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProjetoActionPerformed(evt);
            }
        });

        btAlterarProjetos.setText("Alterar");
        btAlterarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarProjetosActionPerformed(evt);
            }
        });

        btDeletarProjeto.setText("Deletar");

        btVoltar.setText("Fechar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        txtProjetos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        txtProjetos.setForeground(new java.awt.Color(0, 0, 102));
        txtProjetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProjetos.setText("PROJETOS");
        txtProjetos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtProjetos.setName(""); // NOI18N
        txtProjetos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        tabelaProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "ID AUTOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaProjetos);

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Identificador (ID):");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome do projeto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Identificador do autor (ID):");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descrição:");

        idprojetotxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        idprojetotxt.setForeground(new java.awt.Color(0, 0, 102));

        idautortxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        idautortxt.setForeground(new java.awt.Color(0, 0, 102));
        idautortxt.setToolTipText("");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btSalvarAlteracao.setText("Salvar");
        btSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlteracaoActionPerformed(evt);
            }
        });

        descricaotxt.setColumns(20);
        descricaotxt.setRows(5);
        aaa.setViewportView(descricaotxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeprojetotxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idprojetotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idautortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(aaa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(244, 244, 244)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btSalvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtProjetos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btCadastrarProjeto)
                                    .addComponent(btAlterarProjetos)
                                    .addComponent(btDeletarProjeto)
                                    .addComponent(btVoltar)
                                    .addComponent(btAtualizar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(idprojetotxt)
                                    .addComponent(jLabel3)
                                    .addComponent(idautortxt))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nomeprojetotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btSalvarAlteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addGap(16, 16, 16)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProjetoActionPerformed
        CadastroProjetos cadastro = new CadastroProjetos();
        cadastro.setVisible(true);

    }//GEN-LAST:event_btCadastrarProjetoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        this.dispose();
        this.setVisible(true);
        mostrarProjetos();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAlterarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarProjetosActionPerformed

        CarregarProjetos();
        
        
    }//GEN-LAST:event_btAlterarProjetosActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparProjetos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlteracaoActionPerformed
        alterarProjeto();
        limparProjetos();
        mostrarProjetos();
        
    }//GEN-LAST:event_btSalvarAlteracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane aaa;
    private javax.swing.JButton btAlterarProjetos;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrarProjeto;
    private javax.swing.JButton btDeletarProjeto;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvarAlteracao;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextArea descricaotxt;
    private javax.swing.JLabel idautortxt;
    private javax.swing.JLabel idprojetotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeprojetotxt;
    private javax.swing.JTable tabelaProjetos;
    private javax.swing.JLabel txtProjetos;
    // End of variables declaration//GEN-END:variables


    public void mostrarProjetos(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabelaProjetos.getModel();
           ProjetosMetodos projetosmetodos = new ProjetosMetodos();
           modeloTabela.setNumRows(0);
           for(Projetos p: projetosmetodos.PesquisarProjetos()){
               modeloTabela.addRow(new Object[]{
               p.getIDProjeto(),
                   p.getNomeProjeto(),
                   p.getDescricaoProjeto(),
                       p.getIDAutorProjeto()
               });
               
           }
    }
    
    private void CarregarProjetos(){
        int linhaSelecionada = tabelaProjetos.getSelectedRow();
        idprojetotxt.setText(tabelaProjetos.getModel().getValueAt(linhaSelecionada, 0).toString());
        nomeprojetotxt.setText(tabelaProjetos.getModel().getValueAt(linhaSelecionada, 1).toString());
        descricaotxt.setText(tabelaProjetos.getModel().getValueAt(linhaSelecionada, 2).toString());
        idautortxt.setText(tabelaProjetos.getModel().getValueAt(linhaSelecionada, 3).toString());
    }
    
    private void limparProjetos(){
        idprojetotxt.setText("");
        nomeprojetotxt.setText("");
        descricaotxt.setText("");
        idautortxt.setText("");
        nomeprojetotxt.requestFocus();
    }
    
    private void alterarProjeto(){
        
        String nome, descricao;
        int idprojeto, idautor;
        
        nome = nomeprojetotxt.getText();
        descricao = descricaotxt.getText();
        idprojeto = Integer.parseInt(idprojetotxt.getText());
        idautor = Integer.parseInt(idautortxt.getText());
        
        Projetos projetos = new Projetos();
        projetos.setIDProjeto(idprojeto);
        projetos.setIDAutorProjeto(idautor);
        projetos.setNomeProjeto(nome);
        projetos.setDescricaoProjeto(descricao);
        
        ProjetosMetodos metodos = new ProjetosMetodos();
        
        metodos.alterarProjetos(projetos);
    }
}
