/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.Apartamento;
import classesbasicas.Proprietario;
import classesexception.ApartamentoException;
import classesfachada.Fachada;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY VAIO
 */
public class TelaNovoAlterarApt extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovoAlterarApt
     */
    Apartamento aptSelecionado = new Apartamento();
    TelaGerenciaApt tga;
    ArrayList<Proprietario> listaProprietario;

    public TelaNovoAlterarApt(Apartamento aptSelecionado, TelaGerenciaApt tga) {
        initComponents();
        this.tga = tga;
        carregarProprietario();
        this.aptSelecionado = aptSelecionado;
        jComboBoxProprietario.setSelectedItem(aptSelecionado.getProprietario().getNome());
        jTextFieldApt.setText(String.valueOf(aptSelecionado.getNumero()));
        jTextFieldCelpe.setText(aptSelecionado.getNumerocelpe());
        jTextFieldNet.setText(aptSelecionado.getNumeronet());
        jComboBoxNQuartos.setSelectedItem(String.valueOf(aptSelecionado.getQuartos()));
        jTextFieldVM.setText(String.valueOf(aptSelecionado.getValorminimo()));
        jComboBoxSituacao.setSelectedItem(aptSelecionado.getSituacao());

        this.jButtonSalvar.setEnabled(false);
    }

    public TelaNovoAlterarApt(TelaGerenciaApt tga) {
        initComponents();
        this.tga = tga;
        carregarProprietario();
        this.jButtonAlterar.setEnabled(false);
    }

    public TelaNovoAlterarApt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void limparCamposDepoisDeSalvar() {
        jComboBoxProprietario.setSelectedIndex(0);
        jComboBoxNQuartos.setSelectedIndex(0);
        jComboBoxSituacao.setSelectedIndex(0);
        jTextFieldApt.setText(null);
        jTextFieldCelpe.setText(null);
        jTextFieldNet.setText(null);
        jTextFieldVM.setText(null);

    }

    public void limparCamposDepoisDeAlterar() {
        jComboBoxProprietario.setSelectedIndex(0);
        jComboBoxNQuartos.setSelectedIndex(0);
        jComboBoxSituacao.setSelectedIndex(0);
        jTextFieldApt.setText(null);
        jTextFieldCelpe.setText(null);
        jTextFieldNet.setText(null);
        jTextFieldVM.setText(null);

        jButtonAlterar.setEnabled(false);

    }

    private void carregarProprietario() {
        Fachada fachada = new Fachada();
        Proprietario proprietario = new Proprietario();
        
        listaProprietario = (ArrayList<Proprietario>) fachada.listallProprietario(proprietario);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaProprietario.size(); i++) {
            modelo.addElement(listaProprietario.get(i).getNome());
        }
        jComboBoxProprietario.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCelpe = new javax.swing.JLabel();
        jLabelNet = new javax.swing.JLabel();
        jLabelSituação = new javax.swing.JLabel();
        jLabelNQuartos = new javax.swing.JLabel();
        jLabelPropietario = new javax.swing.JLabel();
        jTextFieldApt = new javax.swing.JTextField();
        jLabelApt = new javax.swing.JLabel();
        jComboBoxNQuartos = new javax.swing.JComboBox();
        jLabelVM = new javax.swing.JLabel();
        jTextFieldCelpe = new javax.swing.JTextField();
        jTextFieldNet = new javax.swing.JTextField();
        jTextFieldVM = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox();
        jComboBoxProprietario = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jToggleButtonRetornar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Aptº"));

        jLabelCelpe.setText("Número Celpe:");

        jLabelNet.setText("Número NET:");

        jLabelSituação.setText("Situação:");

        jLabelNQuartos.setText("Nº de Quartos:");

        jLabelPropietario.setText("Propietário:");

        jLabelApt.setText("Número Aptº:");

        jComboBoxNQuartos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));

        jLabelVM.setText("Valor Mínimo:");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vago", "Ocupado", "Reservado" }));
        jComboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSituacaoActionPerformed(evt);
            }
        });

        jComboBoxProprietario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSituação)
                    .addComponent(jLabelNQuartos)
                    .addComponent(jLabelApt)
                    .addComponent(jLabelCelpe)
                    .addComponent(jLabelNet)
                    .addComponent(jLabelVM)
                    .addComponent(jLabelPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldApt)
                        .addComponent(jTextFieldCelpe)
                        .addComponent(jTextFieldNet)
                        .addComponent(jComboBoxNQuartos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldVM)
                        .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPropietario)
                    .addComponent(jComboBoxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApt)
                    .addComponent(jTextFieldApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelpe)
                    .addComponent(jTextFieldCelpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNet)
                    .addComponent(jTextFieldNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNQuartos)
                    .addComponent(jComboBoxNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVM)
                    .addComponent(jTextFieldVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSituação)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Altera");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jToggleButtonRetornar.setText("Retornar");
        jToggleButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonRetornar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(jToggleButtonRetornar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            Fachada f = new Fachada();
            Apartamento a = new Apartamento();
            Proprietario p;

            p=  listaProprietario.get(jComboBoxProprietario.getSelectedIndex());

            a.setProprietario(f.findProprietario(p));
            a.setNumero(Integer.parseInt(jTextFieldApt.getText()));
            a.setNumerocelpe(jTextFieldCelpe.getText());
            a.setNumeronet(jTextFieldNet.getText());
            a.setQuartos(Integer.parseInt((String) jComboBoxNQuartos.getSelectedItem()));
            a.setValorminimo(Double.parseDouble(jTextFieldVM.getText()));
            a.setSituacao((String) jComboBoxSituacao.getSelectedItem());

            f.saveApartamento(a);

            this.limparCamposDepoisDeSalvar();
            
            JOptionPane.showMessageDialog(rootPane, "Apartamento Salvo com sucesso!");
        } catch (ApartamentoException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        try {
            Fachada f = new Fachada();
            aptSelecionado = f.findApartamento(aptSelecionado);
            Proprietario p;

            p= listaProprietario.get(jComboBoxProprietario.getSelectedIndex());

            aptSelecionado.setProprietario(f.findProprietario(p));
            aptSelecionado.setNumero(Integer.parseInt(jTextFieldApt.getText()));
            aptSelecionado.setNumerocelpe(jTextFieldCelpe.getText());
            aptSelecionado.setNumeronet(jTextFieldNet.getText());
            aptSelecionado.setQuartos(Integer.parseInt((String) jComboBoxNQuartos.getSelectedItem()));
            aptSelecionado.setValorminimo(Double.parseDouble(jTextFieldVM.getText()));
            aptSelecionado.setSituacao((String) jComboBoxSituacao.getSelectedItem());

            f.saveApartamento(aptSelecionado);
            
            this.limparCamposDepoisDeAlterar();

            JOptionPane.showMessageDialog(rootPane, "Apartamento Alterado com sucesso!");
        } catch (ApartamentoException ex) {
            Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jToggleButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRetornarActionPerformed
        // TODO add your handling code here:
        tga.setVisible(true);
        tga.listarTabelaApt();
        tga.listarTabelaCheckIn();
        tga.listarTabelaReservas();
        tga.limparCampos();
        
        this.dispose();
    }//GEN-LAST:event_jToggleButtonRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoAlterarApt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxNQuartos;
    private javax.swing.JComboBox jComboBoxProprietario;
    private javax.swing.JComboBox jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApt;
    private javax.swing.JLabel jLabelCelpe;
    private javax.swing.JLabel jLabelNQuartos;
    private javax.swing.JLabel jLabelNet;
    private javax.swing.JLabel jLabelPropietario;
    private javax.swing.JLabel jLabelSituação;
    private javax.swing.JLabel jLabelVM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApt;
    private javax.swing.JTextField jTextFieldCelpe;
    private javax.swing.JTextField jTextFieldNet;
    private javax.swing.JTextField jTextFieldVM;
    private javax.swing.JToggleButton jToggleButtonRetornar;
    // End of variables declaration//GEN-END:variables
}
