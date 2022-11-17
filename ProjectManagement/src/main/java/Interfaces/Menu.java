
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;



public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtBemVindo = new javax.swing.JLabel();
        btAcessarProjetos = new javax.swing.JButton();
        btAcessarRelatorio = new javax.swing.JButton();
        btAcessarUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        horaAtual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDeslog = new javax.swing.JMenu();
        deslogMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBemVindo.setText("Bem-Vindo!");

        btAcessarProjetos.setText("ACESSAR");
        btAcessarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarProjetosActionPerformed(evt);
            }
        });

        btAcessarRelatorio.setText("ACESSAR");
        btAcessarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarRelatorioActionPerformed(evt);
            }
        });

        btAcessarUsuarios.setText("ACESSAR");
        btAcessarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarUsuariosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("PROJETOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("USUÁRIOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("RELATÓRIO");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Data e hora atual:");

        txtData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 102));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("Data");
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        horaAtual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        horaAtual.setForeground(new java.awt.Color(0, 0, 102));
        horaAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaAtual.setText("Hora");
        horaAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        menuDeslog.setText("Deslogar");
        menuDeslog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeslogActionPerformed(evt);
            }
        });

        deslogMenu.setText("Deslogar agora");
        deslogMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogMenuActionPerformed(evt);
            }
        });
        menuDeslog.add(deslogMenu);

        jMenuBar1.add(menuDeslog);

        jMenu2.setText("Opções");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btAcessarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btAcessarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAcessarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtBemVindo)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcessarProjetos)
                    .addComponent(btAcessarUsuarios)
                    .addComponent(btAcessarRelatorio))
                .addGap(117, 117, 117))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtBemVindo)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtData)
                .addGap(18, 18, 18)
                .addComponent(horaAtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAcessarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarProjetosActionPerformed
        MenuProjetos menuprojetos = new MenuProjetos();
        menuprojetos.setVisible(true);
        
    }//GEN-LAST:event_btAcessarProjetosActionPerformed

    private void btAcessarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarRelatorioActionPerformed
        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        gerarRelatorio.setVisible(true);
        
    }//GEN-LAST:event_btAcessarRelatorioActionPerformed

    private void btAcessarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarUsuariosActionPerformed
        MenuUsuarios menu = new MenuUsuarios();
        menu.setVisible(true);
    }//GEN-LAST:event_btAcessarUsuariosActionPerformed

    private void menuDeslogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeslogActionPerformed

    }//GEN-LAST:event_menuDeslogActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(formato.format(dataAtual));
        
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void deslogMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogMenuActionPerformed
        Deslogar deslog = new Deslogar();
        deslog.setVisible(true);
    }//GEN-LAST:event_deslogMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarProjetos;
    private javax.swing.JButton btAcessarRelatorio;
    private javax.swing.JButton btAcessarUsuarios;
    private javax.swing.JMenuItem deslogMenu;
    private javax.swing.JLabel horaAtual;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuDeslog;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtData;
    // End of variables declaration//GEN-END:variables
  
    
    public class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            horaAtual.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
        
}
