/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.Apartamento;
import classesbasicas.Reserva;
import classesfachada.Fachada;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY VAIO
 */
public class TelaGerenciaReserva extends javax.swing.JFrame {

    /**
     * Creates new form CadastroReserva
     */
    TelaPainelPrincipal tpp;
    public TelaGerenciaReserva(TelaPainelPrincipal tpp) {
        initComponents();
        this.tpp = tpp;
        carregarComboApt();
        listarTabelaReserva();
        jButtonAlterar.setEnabled(false);
    }

    TelaGerenciaReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void carregarComboApt() {
        Fachada fachada = new Fachada();
        Apartamento apt = new Apartamento();
        ArrayList<Apartamento> listaApartamento;
        listaApartamento = (ArrayList<Apartamento>) fachada.listallApartamento(apt);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaApartamento.size(); i++) {
            modelo.addElement(listaApartamento.get(i).getNumero());
        }
        jComboBoxApt.setModel(modelo);
    }

    public void listarTabelaReserva() {

        Fachada f = new Fachada();
        Reserva e = new Reserva();
        ArrayList<Reserva> listaReservas;
        listaReservas = (ArrayList<Reserva>) f.listallReserva(e);

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Data Entrada",
            "Data Saída", "Apartamento", "Situação"});
        for (int i = 0; i < listaReservas.size(); i++) {
            dtm.addRow(new String[]{listaReservas.get(i).getId() + "",
                listaReservas.get(i).getDataentrada() + "",
                listaReservas.get(i).getDatasaida() + "",
                listaReservas.get(i).getApartamento().getNumero() + "",
                listaReservas.get(i).getApartamento().getSituacao()
            });
        }
        jTableReserva.setModel(dtm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSimNaoTelaRes = new javax.swing.ButtonGroup();
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
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonRetornar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReserva = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Reserva"));

        jLabelDataEntrada.setText("Data Entrada:");

        jLabelDataRegistro.setText("Data Registro");

        jLabelSituacao.setText("Situação:");

        jLabelValor.setText("Valor:");

        jLabelValorCalcao.setText("Valor Calção:");

        jLabelCalcao.setText("Calção:");

        jLabelApt.setText("Aptº:");

        jLabelDataSaida.setText("Data Saída:");

        jTextFieldDataRegistro.setEditable(false);

        jTextFieldDataEntrada.setEditable(false);

        jTextFieldDataSaida.setEditable(false);

        jTextFieldValor.setEditable(false);

        jComboBoxApt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxApt.setEnabled(false);

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));
        jComboBoxSituacao.setEnabled(false);

        jTextFieldValorCalcao.setEditable(false);

        buttonGroupSimNaoTelaRes.add(jRadioButtonSim);
        jRadioButtonSim.setText("Sim");
        jRadioButtonSim.setEnabled(false);

        buttonGroupSimNaoTelaRes.add(jRadioButtonNao);
        jRadioButtonNao.setText("Não");
        jRadioButtonNao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelDataRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataSaida)
                            .addComponent(jLabelApt)
                            .addComponent(jLabelValor)
                            .addComponent(jLabelSituacao)
                            .addComponent(jLabelCalcao)
                            .addComponent(jLabelValorCalcao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelDataEntrada)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldDataRegistro)
                        .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxApt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonSim)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonNao))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldValorCalcao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
                    .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataSaida)
                    .addComponent(jTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextFieldValorCalcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSituacao)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonRetornar.setText("Retornar");
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });

        jTableReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data Entrada", "Data Saída", "Apt", "Situação"
            }
        ));
        jTableReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRetornar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        TelaNovoAlterarReserva nRes = new TelaNovoAlterarReserva();
        this.setVisible(false);
        nRes.setVisible(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed
    
    
    Reserva resSelecionado = new Reserva();
    private void jTableReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservaMouseClicked
        // TODO add your handling code here:

        Fachada fachada = new Fachada();
        Reserva r = new Reserva();

        int linha_selecionada = jTableReserva.getSelectedRow();
        r.setId(Integer.parseInt(jTableReserva.getValueAt(linha_selecionada, 0).toString()));

        resSelecionado = (fachada.findReserva(r));

        jTextFieldDataRegistro.setText(resSelecionado.getDataregistro() + "");
        jTextFieldDataEntrada.setText(resSelecionado.getDataentrada() + "");
        jTextFieldDataSaida.setText(resSelecionado.getDatasaida() + "");
        jComboBoxApt.setSelectedItem(resSelecionado.getApartamento().getNumero());
        jTextFieldValor.setText(resSelecionado.getValor() + "");
        if (resSelecionado.getCalcao()) {
            jRadioButtonSim.setEnabled(true);
            jTextFieldValorCalcao.setText(resSelecionado.getValorcalcao() + "");

        } else {
            jRadioButtonSim.setEnabled(false);
        }
        jComboBoxSituacao.setSelectedItem(resSelecionado.getSituacao());
        jButtonAlterar.setEnabled(true);

    }//GEN-LAST:event_jTableReservaMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        TelaNovoAlterarReserva nRes = new TelaNovoAlterarReserva(resSelecionado);
        this.setVisible(false);
        nRes.setVisible(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        tpp.setVisible(true);
        tpp.listarTabelaP();
    }//GEN-LAST:event_jButtonRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciaReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSimNaoTelaRes;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JComboBox jComboBoxApt;
    private javax.swing.JComboBox jComboBoxSituacao;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReserva;
    private javax.swing.JTextField jTextFieldDataEntrada;
    private javax.swing.JTextField jTextFieldDataRegistro;
    private javax.swing.JTextField jTextFieldDataSaida;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorCalcao;
    // End of variables declaration//GEN-END:variables
}