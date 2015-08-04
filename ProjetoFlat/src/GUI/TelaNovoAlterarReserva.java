/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.Apartamento;
import classesbasicas.Reserva;
import classesbasicas.Situacao;
import classesexception.ReservaException;
import classesfachada.Fachada;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import util.Datas;

/**
 *
 * @author SONY VAIO
 */
public class TelaNovoAlterarReserva extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovoAlterarReserva
     */
    Reserva resSelecionada = new Reserva();
    

    ArrayList<Apartamento> listaApartamento;

  

    public TelaNovoAlterarReserva() {
        initComponents();
        
        carregarComboApt();
        jLabelSituacao.setVisible(false);
        jComboBoxSituacao.setVisible(false);

        //padrão = botão Radio "não" marcado
        jRadioButtonNao.setSelected(true);
        jTextFieldValorCalcao.setText("0.00");
        jTextFieldValorCalcao.setEnabled(false);

        //data de registro
        Date datareg;
        datareg = Datas.obterTimestampAtual();
        String dataRegT = Datas.formatarData(datareg, "dd/MM/yyyy");
        jTextFieldDataRegistro.setText(dataRegT);
        jTextFieldDataRegistro.setEnabled(false);

//configurações dos botoes Salvar e Alterar
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(false);

    }

    public TelaNovoAlterarReserva(Reserva resSelecionado) {
        initComponents();
       
        carregarComboApt();
        jTextFieldDataRegistro.setEnabled(false);

        this.resSelecionada = resSelecionado;

        jTextFieldDataRegistro.setText(Datas.formatarData(resSelecionado.getDataregistro()));
        jTextFieldDataEntrada.setText(Datas.formatarData(resSelecionado.getDataentrada()));
        jTextFieldDataSaida.setText(Datas.formatarData(resSelecionado.getDatasaida()));
        jComboBoxApt.setSelectedItem(resSelecionado.getApartamento().getNumero());
        jTextFieldValor.setText(resSelecionado.getValor().toString());
        if (resSelecionado.getCalcao()) {
            jRadioButtonSim.setSelected(true);
            jTextFieldValorCalcao.setText(resSelecionado.getValorcalcao().toString());

        } else {
            jRadioButtonNao.setSelected(true);
            jTextFieldValorCalcao.setEnabled(false);
            jTextFieldValorCalcao.setText("0.00");
        }
        jComboBoxSituacao.setSelectedItem(resSelecionado.getSituacao().getDescricao());
//configurações dos botoes Salvar e Alterar
        jButtonSalvar.setEnabled(false);
        jButtonAlterar.setEnabled(true);
    }

    private void carregarComboApt() {
        Fachada fachada = new Fachada();
        Apartamento apt = new Apartamento();
        listaApartamento = (ArrayList<Apartamento>) fachada.listallApartamento(apt);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaApartamento.size(); i++) {
            modelo.addElement(listaApartamento.get(i).getNumero());
        }
        jComboBoxApt.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSimNao = new javax.swing.ButtonGroup();
        jLabelBarra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDataEntrada = new javax.swing.JLabel();
        jLabelDataRegistro = new javax.swing.JLabel();
        jLabelSituacao = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelValorCalcao = new javax.swing.JLabel();
        jLabelCalcao = new javax.swing.JLabel();
        jLabelApt = new javax.swing.JLabel();
        jLabelDataSaida = new javax.swing.JLabel();
        jTextFieldDataRegistro = new javax.swing.JTextField();
        jTextFieldDataEntrada = new javax.swing.JTextField();
        jTextFieldDataSaida = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jComboBoxApt = new javax.swing.JComboBox();
        jComboBoxSituacao = new javax.swing.JComboBox();
        jTextFieldValorCalcao = new javax.swing.JTextField();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jToggleButtonRetornar = new javax.swing.JToggleButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Reserva"));

        jLabelDataEntrada.setText("Data Entrada:");

        jLabelDataRegistro.setText("Data Registro");

        jLabelSituacao.setText("Situação:");

        jLabelValor.setText("Valor:");

        jLabelValorCalcao.setText("Valor Calção:");

        jLabelCalcao.setText("Caução:");

        jLabelApt.setText("Aptº:");

        jLabelDataSaida.setText("Data Saída:");

        jComboBoxApt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        buttonGroupSimNao.add(jRadioButtonSim);
        jRadioButtonSim.setText("Sim");
        jRadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimActionPerformed(evt);
            }
        });

        buttonGroupSimNao.add(jRadioButtonNao);
        jRadioButtonNao.setText("Não");
        jRadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoActionPerformed(evt);
            }
        });

        jLabel1.setText("dd/MM/yyyy");

        jLabel2.setText("dd/MM/yyyy");

        jFormattedTextField1.setText("  /  /    ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabelDataRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSituacao)
                    .addComponent(jLabelValor)
                    .addComponent(jLabelValorCalcao)
                    .addComponent(jLabelCalcao)
                    .addComponent(jLabelApt)
                    .addComponent(jLabelDataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonNao))
                            .addComponent(jComboBoxApt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldDataSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldValorCalcao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataRegistro)
                    .addComponent(jTextFieldDataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataEntrada)
                    .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataSaida)
                    .addComponent(jTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApt)
                    .addComponent(jComboBoxApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalcao)
                    .addComponent(jRadioButtonSim)
                    .addComponent(jRadioButtonNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorCalcao)
                    .addComponent(jTextFieldValorCalcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSituacao)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jToggleButtonRetornar.setText("Retornar");
        jToggleButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRetornarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Altera");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonRetornar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButtonRetornar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCamposDepoisDeSalvar() {

        Date datareg;
        datareg = Datas.obterTimestampAtual();
        String dataRegT = Datas.formatarData(datareg, "dd/MM/yyyy");
        jTextFieldDataRegistro.setText(dataRegT);
        jTextFieldDataEntrada.setText(null);
        jTextFieldDataSaida.setText(null);

        this.carregarComboApt();

        jComboBoxApt.setSelectedIndex(0);
        jTextFieldValor.setText(null);
        jRadioButtonNao.setSelected(true);
        jRadioButtonSim.setSelected(false);
        jTextFieldValorCalcao.setText(null);
        jComboBoxSituacao.setSelectedIndex(0);

    }

    public void limparCamposDepoisDeAlterar() {

        Date datareg;
        datareg = Datas.obterTimestampAtual();
        String dataRegT = Datas.formatarData(datareg, "dd/MM/yyyy");
        jTextFieldDataRegistro.setText(dataRegT);

        jTextFieldDataEntrada.setText(null);
        jTextFieldDataSaida.setText(null);

        this.carregarComboApt();

        jComboBoxApt.setSelectedIndex(0);
        jTextFieldValor.setText(null);
        jRadioButtonNao.setSelected(true);
        jRadioButtonSim.setSelected(false);
        jTextFieldValorCalcao.setText(null);
        jComboBoxSituacao.setSelectedIndex(0);

        jButtonAlterar.setEnabled(false);

    }

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            Fachada fachada = new Fachada();
            Reserva r = new Reserva();

            Apartamento ap;
            ap = (listaApartamento.get(jComboBoxApt.getSelectedIndex()));

            r.setApartamento(fachada.findApartamento(ap));

            r.setDataregistro(Datas.criarData(jTextFieldDataRegistro.getText()));
            r.setDataentrada(Datas.criarData(jTextFieldDataEntrada.getText()));
            r.setDatasaida(Datas.criarData(jTextFieldDataSaida.getText()));

            Double valor = Double.parseDouble(jTextFieldValor.getText());
            r.setValor(valor);

            if (jRadioButtonSim.isSelected()) {
                r.setCalcao(true);
                r.setValorcalcao(Double.parseDouble(jTextFieldValorCalcao.getText()));
            }
            if (jRadioButtonNao.isSelected()) {
                r.setCalcao(false);
                jTextFieldValorCalcao.setText("0.00");
                jTextFieldValorCalcao.setEnabled(false);
            }

            if (jComboBoxSituacao.getSelectedItem().toString().equalsIgnoreCase("ATIVO")) {
                r.setSituacao(Situacao.ATIVO);

            } else {
                r.setSituacao(Situacao.INATIVO);
            }

            fachada.saveReserva(r);

            this.limparCamposDepoisDeSalvar();
            
            JOptionPane.showMessageDialog(rootPane, "Reserva Salva com sucesso!");

        } catch (ReservaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jRadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimActionPerformed
        // TODO add your handling code here:
        jTextFieldValorCalcao.setEnabled(true);
        jTextFieldValorCalcao.setText("");
    }//GEN-LAST:event_jRadioButtonSimActionPerformed

    private void jRadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoActionPerformed
        // TODO add your handling code here:

        jTextFieldValorCalcao.setText("0.00");
        jTextFieldValorCalcao.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonNaoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try {

            Fachada f = new Fachada();
            resSelecionada = f.findReserva(resSelecionada);

            Apartamento ap;
            ap = (listaApartamento.get(jComboBoxApt.getSelectedIndex()));

            resSelecionada.setApartamento(f.findApartamento(ap));

            resSelecionada.setDataregistro(Datas.criarData(jTextFieldDataRegistro.getText()));
            resSelecionada.setDataentrada(Datas.criarData(jTextFieldDataEntrada.getText()));
            resSelecionada.setDatasaida(Datas.criarData(jTextFieldDataSaida.getText()));

            resSelecionada.setValor(Double.parseDouble(jTextFieldValor.getText()));

            if (jRadioButtonSim.isSelected()) {
                resSelecionada.setCalcao(true);
                resSelecionada.setValorcalcao(Double.parseDouble(jTextFieldValorCalcao.getText()));
            }

            if (jRadioButtonNao.isSelected()) {
                resSelecionada.setCalcao(false);
            }

            if (jComboBoxSituacao.getSelectedItem().toString().equalsIgnoreCase("ATIVO")) {
                resSelecionada.setSituacao(Situacao.ATIVO);
            } else if (jComboBoxSituacao.getSelectedItem().toString().equalsIgnoreCase("INATIVO")) {
                resSelecionada.setSituacao(Situacao.INATIVO);
            }
            
            f.saveReserva(resSelecionada);
            this.limparCamposDepoisDeAlterar();

            JOptionPane.showMessageDialog(rootPane, "Reserva Alterada com sucesso!");
            
        } catch (ReservaException ex) {
            Logger.getLogger(TelaNovoAlterarApt.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        


    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jToggleButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRetornarActionPerformed
        // TODO add your handling code here:
        TelaGerenciaReserva tgr = new TelaGerenciaReserva();
        tgr.setVisible(true);
        

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
            java.util.logging.Logger.getLogger(TelaNovoAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAlterarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoAlterarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSimNao;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxApt;
    private javax.swing.JComboBox jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApt;
    private javax.swing.JLabel jLabelBarra;
    private javax.swing.JLabel jLabelCalcao;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelDataRegistro;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelValorCalcao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNao;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JTextField jTextFieldDataEntrada;
    private javax.swing.JTextField jTextFieldDataRegistro;
    private javax.swing.JTextField jTextFieldDataSaida;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorCalcao;
    private javax.swing.JToggleButton jToggleButtonRetornar;
    // End of variables declaration//GEN-END:variables
}
