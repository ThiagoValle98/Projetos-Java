
package Interfaces;

import Conexoes.ProjetosMetodos;
import Conexoes.UsuarioMetodos;
import Dados.Projetos;
import Dados.Usuario;
import javax.swing.table.DefaultTableModel;


public class MenuUsuarios extends javax.swing.JFrame {


    public MenuUsuarios() {
        initComponents();
        mostrarUsuarios();
        limparUsuarios();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuariotxt = new javax.swing.JLabel();
        painelUsuarios = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btCriarUsuario = new javax.swing.JButton();
        btAlterarUsuario = new javax.swing.JButton();
        btDeletarUsuario = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idusuariotxt = new javax.swing.JLabel();
        nomecompletotxt = new javax.swing.JTextField();
        usuariotxt = new javax.swing.JLabel();
        telefonetxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Usuariotxt.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(0, 0, 102));
        Usuariotxt.setText("USUÁRIOS");

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME COMPLETO", "USUÁRIO", "E-MAIL", "TELEFONE"
            }
        ));
        painelUsuarios.setViewportView(tabelaUsuarios);

        btCriarUsuario.setText("Criar");
        btCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarUsuarioActionPerformed(evt);
            }
        });

        btAlterarUsuario.setText("Alterar");
        btAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarUsuarioActionPerformed(evt);
            }
        });

        btDeletarUsuario.setText("Deletar");

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Identificador do usuário (ID):");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nome completo:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Usuário:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        idusuariotxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        idusuariotxt.setForeground(new java.awt.Color(0, 0, 102));

        usuariotxt.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(0, 0, 102));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelUsuarios)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDeletarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(telefonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nomecompletotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idusuariotxt)))
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Usuariotxt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCriarUsuario)
                            .addComponent(btAlterarUsuario)
                            .addComponent(btDeletarUsuario)
                            .addComponent(btAtualizar)
                            .addComponent(btFechar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idusuariotxt))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomecompletotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(usuariotxt))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telefonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarUsuarioActionPerformed
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
        
    }//GEN-LAST:event_btCriarUsuarioActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        this.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparUsuarios();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarUsuarioActionPerformed
        alterarUsuarios();
    }//GEN-LAST:event_btAlterarUsuarioActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvarAlteracao();
        limparUsuarios();
        mostrarUsuarios();
    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuariotxt;
    private javax.swing.JButton btAlterarUsuario;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCriarUsuario;
    private javax.swing.JButton btDeletarUsuario;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel idusuariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomecompletotxt;
    private javax.swing.JScrollPane painelUsuarios;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField telefonetxt;
    private javax.swing.JLabel usuariotxt;
    // End of variables declaration//GEN-END:variables
    public void mostrarUsuarios(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabelaUsuarios.getModel();
           UsuarioMetodos usuario = new UsuarioMetodos();
           modeloTabela.setNumRows(0);
           for(Usuario p: usuario.listarUsuarios()){
               modeloTabela.addRow(new Object[]{
                   p.getId(),
                   p.getNomeCompleto(),
                   p.getUsuario(),
                   p.getEmail(),
                   p.getTelefone()
               });
               
           }
    }
    
    private void alterarUsuarios(){
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();
        idusuariotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 0).toString());
        nomecompletotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 1).toString());
        usuariotxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 2).toString());
        emailtxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 3).toString());
        telefonetxt.setText(tabelaUsuarios.getModel().getValueAt(linhaSelecionada, 4).toString());
    }
    
    private void limparUsuarios(){
        idusuariotxt.setText("");
        nomecompletotxt.setText("");
        telefonetxt.setText("");
        usuariotxt.setText("");
        emailtxt.setText("");
        nomecompletotxt.requestFocus();
    }
    private void salvarAlteracao(){
        
        String nome, usuario, email, telefone;
        int idusuario;
        
        nome = nomecompletotxt.getText();
        usuario = usuariotxt.getText();
        email = emailtxt.getText();
        telefone = telefonetxt.getText();
        idusuario = Integer.parseInt(idusuariotxt.getText());
        
        
        Usuario user = new Usuario();
        user.setId(idusuario);
        user.setNomeCompleto(nome);
        user.setUsuario(usuario);
        user.setTelefone(telefone);
        user.setEmail(email);
        
        UsuarioMetodos metodos = new UsuarioMetodos();
        metodos.alterarUsuarios(user);
    }
}

