
package Interfaces;

import Conexoes.ProjetosMetodos;
import Dados.Projetos;


public class CadastroProjetos extends javax.swing.JFrame {

    
    public CadastroProjetos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeprojetotxt = new javax.swing.JLabel();
        txtUsuarioProprietario = new javax.swing.JTextField();
        usuarioproprietariotxt = new javax.swing.JLabel();
        descricaotxt = new javax.swing.JLabel();
        abaDesc = new javax.swing.JScrollPane();
        txtDescProjeto = new javax.swing.JTextArea();
        btSalvarProjetos = new javax.swing.JButton();
        btCancelarProjeto = new javax.swing.JButton();
        txtNomeProjeto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR PROJETO");

        nomeprojetotxt.setText("Nome do projeto:");

        usuarioproprietariotxt.setText("Usuário proprietário (ID):");

        descricaotxt.setText("Descrição:");

        txtDescProjeto.setColumns(20);
        txtDescProjeto.setRows(5);
        abaDesc.setViewportView(txtDescProjeto);

        btSalvarProjetos.setText("Salvar");
        btSalvarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProjetosActionPerformed(evt);
            }
        });

        btCancelarProjeto.setText("Cancelar");
        btCancelarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaotxt)
                    .addComponent(txtUsuarioProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeprojetotxt)
                    .addComponent(btCancelarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(usuarioproprietariotxt)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeprojetotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtUsuarioProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvarProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarProjeto)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(usuarioproprietariotxt)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarProjetoActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_btCancelarProjetoActionPerformed

    private void btSalvarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProjetosActionPerformed
          salvarProjetos();
          this.setVisible(false);
    }//GEN-LAST:event_btSalvarProjetosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane abaDesc;
    private javax.swing.JButton btCancelarProjeto;
    private javax.swing.JButton btSalvarProjetos;
    private javax.swing.JLabel descricaotxt;
    private javax.swing.JLabel nomeprojetotxt;
    private javax.swing.JTextArea txtDescProjeto;
    private javax.swing.JTextField txtNomeProjeto;
    private javax.swing.JTextField txtUsuarioProprietario;
    private javax.swing.JLabel usuarioproprietariotxt;
    // End of variables declaration//GEN-END:variables
    public void salvarProjetos(){
        String nome,descricao, autor;
        autor = txtUsuarioProprietario.getText();
        int idautor = Integer.parseInt(autor);
        nome = txtNomeProjeto.getText();
        descricao = txtDescProjeto.getText();
        
        Projetos projetos = new Projetos();
        projetos.setNomeProjeto(nome);
        projetos.setIDAutorProjeto(idautor);
        projetos.setDescricaoProjeto(descricao);
        ProjetosMetodos metodoProjetos  = new ProjetosMetodos();
        metodoProjetos.cadastrarProjetos(projetos);
        
    }
    
}
