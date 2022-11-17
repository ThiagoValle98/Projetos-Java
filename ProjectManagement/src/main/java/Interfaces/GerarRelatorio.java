
package Interfaces;

import Conexoes.ProjetosMetodos;
import Dados.Projetos;
import javax.swing.table.DefaultTableModel;


public class GerarRelatorio extends javax.swing.JFrame {

    public GerarRelatorio() {
        initComponents();
        mostrarProjetosParaRelatorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecionarprojetotxt = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        selecionardtfinaltxt = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        selecionardtinicialtxt = new javax.swing.JLabel();
        relatoriotxt = new javax.swing.JLabel();
        btGerarRelatorio = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRelatorioProjetos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO");

        selecionarprojetotxt.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        selecionarprojetotxt.setText("Selecione os projetos:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24/11/2021", "23/11/2021", "22/11/2021", "21/11/2021", "20/11/2021" }));

        selecionardtfinaltxt.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        selecionardtfinaltxt.setText("Selecione a data final:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24/11/2021", "23/11/2021", "22/11/2021", "21/11/2021", "20/11/2021" }));

        selecionardtinicialtxt.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        selecionardtinicialtxt.setText("Selecione a data inicial:");

        relatoriotxt.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        relatoriotxt.setForeground(new java.awt.Color(0, 0, 102));
        relatoriotxt.setText("RELATÓRIO");

        btGerarRelatorio.setText("Gerar relatório");

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        tabelaRelatorioProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "ID AUTOR"
            }
        ));
        jScrollPane2.setViewportView(tabelaRelatorioProjetos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionardtinicialtxt)
                    .addComponent(relatoriotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionardtfinaltxt)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarprojetotxt)
                    .addComponent(jScrollPane2)
                    .addComponent(btGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(relatoriotxt)
                .addGap(26, 26, 26)
                .addComponent(selecionardtinicialtxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecionardtfinaltxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionarprojetotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btGerarRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
            this.setVisible(false); 
    }//GEN-LAST:event_btFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel relatoriotxt;
    private javax.swing.JLabel selecionardtfinaltxt;
    private javax.swing.JLabel selecionardtinicialtxt;
    private javax.swing.JLabel selecionarprojetotxt;
    private javax.swing.JTable tabelaRelatorioProjetos;
    // End of variables declaration//GEN-END:variables
    public void mostrarProjetosParaRelatorio(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tabelaRelatorioProjetos.getModel();
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
    }}
