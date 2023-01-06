package visao;

import javax.swing.JFrame;

/**
 * janela desktop do projeto
 * @author Carlos Henrique, Luís Gabriel, Sergio Avila
 * @version 0.01 Beta
 */
public class Principal extends javax.swing.JFrame {
        
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // janela abre maximizada
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmCadastrar = new javax.swing.JMenu();
        jmiiCadastrarAlunos = new javax.swing.JMenuItem();
        jmiFormHerancaTeste = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto UESPI - Cadastro de Alunos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmCadastrar.setText("Cadastrar");

        jmiiCadastrarAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiiCadastrarAlunos.setText("Alunos");
        jmiiCadastrarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiiCadastrarAlunosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiiCadastrarAlunos);

        jmArquivo.add(jmCadastrar);

        jmiFormHerancaTeste.setText("Form Heranca Teste");
        jmiFormHerancaTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormHerancaTesteActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiFormHerancaTeste);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");

        jMenuItem1.setText("Metodos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmSobre.add(jMenuItem1);

        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * este método é chamado quando o menu Alunos é clicado
     * instancia um objeto FormPadrão. tela é um novo objeto do tipo FormPadrao
     * tela é adicionada ao jDesktop
     * tela é setada como visível
     * @param evt 
     */
    private void jmiiCadastrarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiiCadastrarAlunosActionPerformed
        FormPadrao tela = new FormPadrao(); 
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiiCadastrarAlunosActionPerformed

    private void jmiFormHerancaTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormHerancaTesteActionPerformed
        
    }//GEN-LAST:event_jmiFormHerancaTesteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Info tl = new Info();
        tl.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiFormHerancaTeste;
    private javax.swing.JMenuItem jmiiCadastrarAlunos;
    // End of variables declaration//GEN-END:variables
}
