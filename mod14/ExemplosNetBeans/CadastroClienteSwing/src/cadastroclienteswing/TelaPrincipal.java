/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclienteswing;

import javaapplication1.dao.ClienteMapDAO;
import javaapplication1.dao.IClienteDAO;
import javaapplication1.domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Steve Vaz
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        menuItemSair.setText("Opções");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        menuItemSair.add(jMenuItemSair);

        jMenuBar1.add(menuItemSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblCPF)
                        .addGap(18, 18, 18)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        
        if (!isCamposValidos(nome, cpf)) {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Cliente cliente = new Cliente(nome,cpf, cpf, null, cpf, null, null);
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        
        if (isCadastrado) {
            modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
        
        Cliente cliente  = this.clienteDAO.consultar(cpf);
        
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf().toString());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int linhaSelecionada = tabelaClientes.getSelectedRow();
       
       if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir este cliente?", "CUIDADO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
            if(result == JOptionPane.YES_OPTION){

                Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado.", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
       
       
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
       
        tabelaClientes.setModel(modelo);
    }
    
     private void limparCampos() {
        txtNome.setText("");
        txtCPF.setText("");
    }
}
