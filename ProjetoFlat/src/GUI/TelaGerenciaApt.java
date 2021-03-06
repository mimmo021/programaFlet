/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.Apartamento;
import classesbasicas.CheckIn;
import classesbasicas.Login;
import classesbasicas.Proprietario;
import classesbasicas.Reserva;
import classesfachada.Fachada;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY VAIO
 */
public class TelaGerenciaApt extends javax.swing.JFrame {

    Login login;
    /**
     * Creates new form CadastroApt
     */
    
    Apartamento aptSelecionado = new Apartamento();

    public TelaGerenciaApt(Login l) {
        initComponents();
        login = l;
        carregarProprietario();
        listarTabelaApt();
        

        this.jButton1Alterar.setEnabled(false);
        this.jButtonRemover.setEnabled(false);

    }
    public TelaGerenciaApt(){
        
    }

   

    private void carregarProprietario() {
        Fachada fachada = new Fachada();
        Proprietario proprietario = new Proprietario();
        ArrayList<Proprietario> listaProprietario;
        listaProprietario = (ArrayList<Proprietario>) fachada.listallProprietario(proprietario);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listaProprietario.size(); i++) {
            modelo.addElement(listaProprietario.get(i).getNome());
        }
        jComboBoxPropietario.setModel(modelo);
    }

    public void listarTabelaApt() {

        Fachada f = new Fachada();
        Apartamento e = new Apartamento();
        ArrayList<Apartamento> listaApartamentos;
        listaApartamentos = (ArrayList<Apartamento>) f.listallApartamento(e);

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Id", "Proprietario", "N°Apt", "N°Quarto",
            "Situacao"});
        for (int i = 0; i < listaApartamentos.size(); i++) {
            dtm.addRow(new String[]{listaApartamentos.get(i).getId()+"",
                listaApartamentos.get(i).getProprietario().getNome(),
                listaApartamentos.get(i).getNumero() + "",
                listaApartamentos.get(i).getQuartos() +"",
                listaApartamentos.get(i).getSituacao()

            });
        }

        jTableApt.setModel(dtm);

    }

    public void listarTabelaReservas(Apartamento apt) {

        Fachada f = new Fachada();
        Reserva e = new Reserva();
        ArrayList<Reserva> listaReservas;
        listaReservas = (ArrayList<Reserva>) f.listallReserva(e);

        DefaultTableModel dtmr = new DefaultTableModel();
        dtmr.setColumnIdentifiers(new String[]{"Id", "Proprietário", "Data de Entrada", "Data de Saída",
            "Locatario"});
        for (int i = 0; i < listaReservas.size(); i++) {
            if(listaReservas.get(i).getApartamento().getId() == apt.getId()){
            dtmr.addRow(new String[]{listaReservas.get(i).getId() + "",
                listaReservas.get(i).getApartamento().getProprietario().getNome() + "",
                listaReservas.get(i).getDataentrada() + "",
                listaReservas.get(i).getDatasaida() + "",
                listaReservas.get(i).getLocatario().getNome()

            });
        }

        jTableReservas.setModel(dtmr);
        }
    }

    public void listarTabelaCheckIn(Apartamento apt) {

        Fachada f = new Fachada();
        CheckIn e = new CheckIn();
        ArrayList<CheckIn> listaCheckIns;
        listaCheckIns = (ArrayList<CheckIn>) f.listallCheckIn(e);

        DefaultTableModel dtmc = new DefaultTableModel();
        dtmc.setColumnIdentifiers(new String[]{"id", "Locatário", "Data de Entrada", "Data de Saída",
            "Situação"});
        for (int i = 0; i < listaCheckIns.size(); i++) {
            if(listaCheckIns.get(i).getApartamento().getId() == apt.getId()){
            dtmc.addRow(new String[]{listaCheckIns.get(i).getId() + "",
                listaCheckIns.get(i).getLocatario().getNome() + "",
                listaCheckIns.get(i).getDataentrada() + "",
                listaCheckIns.get(i).getDatasaida() + "",
                listaCheckIns.get(i).getApartamento().getSituacao() + ""

            });
        }

        jTableChecIn.setModel(dtmc);

    }
    }
    public void limparCampos() {
        jComboBoxPropietario.setSelectedIndex(0);
        jComboBoxNQuartos.setSelectedIndex(0);
        jComboBoxSituacao.setSelectedIndex(0);
        jTextFieldApt.setText(null);
        jTextFieldCelpe.setText(null);
        jTextFieldNet.setText(null);
        jTextFieldVM.setText(null);

        this.jButton1Alterar.setEnabled(false);
        this.jButtonRemover.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jComboBoxPropietario = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jButtonRemover = new javax.swing.JButton();
        jLabelReservas = new javax.swing.JLabel();
        jLabelCheckIn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableChecIn = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableApt = new javax.swing.JTable();
        jButton1Retornar = new javax.swing.JButton();
        jButton1Alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Aptº"));

        jLabelCelpe.setText("Número Celpe:");

        jLabelNet.setText("Número NET:");

        jLabelSituação.setText("Situação:");

        jLabelNQuartos.setText("Nº de Quartos:");

        jLabelPropietario.setText("Propietário:");

        jTextFieldApt.setEditable(false);
        jTextFieldApt.setEnabled(false);

        jLabelApt.setText("Número Aptº:");

        jComboBoxNQuartos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jComboBoxNQuartos.setEnabled(false);

        jLabelVM.setText("Valor Mínimo:");

        jTextFieldCelpe.setEditable(false);
        jTextFieldCelpe.setEnabled(false);

        jTextFieldNet.setEditable(false);
        jTextFieldNet.setEnabled(false);

        jTextFieldVM.setEditable(false);
        jTextFieldVM.setEnabled(false);

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vago", "Ocupado", "Reservado" }));
        jComboBoxSituacao.setEnabled(false);

        jComboBoxPropietario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPropietario.setEnabled(false);

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
                    .addComponent(jComboBoxPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPropietario)
                    .addComponent(jComboBoxPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap())
        );

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jTableReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Locatário", "Data de Entrada", "Data de Saída", "Situação"
            }
        ));
        jScrollPane1.setViewportView(jTableReservas);

        jButtonRemover.setText("Remover");

        jLabelReservas.setText("Reservas:");

        jLabelCheckIn.setText("Check-In:");

        jTableChecIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Locatário", "Data Entrada", "Data Saída", "Situação"
            }
        ));
        jScrollPane2.setViewportView(jTableChecIn);

        jTableApt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Propietario", "Nº do Apt", "Nº de Quartos", "Situação"
            }
        ));
        jTableApt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAptMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableApt);

        jButton1Retornar.setText("Retornar");
        jButton1Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RetornarActionPerformed(evt);
            }
        });

        jButton1Alterar.setText("Alterar");
        jButton1Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jButton1Retornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelReservas)
                            .addComponent(jLabelCheckIn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelReservas)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCheckIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Alterar)
                                .addGap(5, 5, 5)
                                .addComponent(jButtonRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Retornar))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("telaGerenciaApt");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        TelaNovoAlterarApt napt = new TelaNovoAlterarApt(login);
        napt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTableAptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAptMouseClicked
        // TODO add your handling code here:

        Fachada fachada = new Fachada();
        Apartamento a = new Apartamento();

        int linha_selecionada = jTableApt.getSelectedRow();
        a.setId(Integer.parseInt(jTableApt.getValueAt(linha_selecionada, 0).toString()));

        aptSelecionado = (fachada.findApartamento(a));

        jComboBoxPropietario.setSelectedItem(aptSelecionado.getProprietario().getNome());
        jTextFieldApt.setText(aptSelecionado.getNumero() + "");
        jTextFieldCelpe.setText(aptSelecionado.getNumerocelpe());
        jTextFieldNet.setText(aptSelecionado.getNumeronet());
        jComboBoxNQuartos.setSelectedItem(aptSelecionado.getQuartos() + "");
        jTextFieldVM.setText(aptSelecionado.getValorminimo() + "");
        jComboBoxSituacao.setSelectedItem(aptSelecionado.getSituacao());
        listarTabelaCheckIn(aptSelecionado);
        listarTabelaReservas(aptSelecionado);
        this.jButton1Alterar.setEnabled(true);

    }//GEN-LAST:event_jTableAptMouseClicked

    private void jButton1RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RetornarActionPerformed
        // TODO add your handling code here:
        TelaPainelPrincipal tpp = new TelaPainelPrincipal(login);
        tpp.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1RetornarActionPerformed

    private void jButton1AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AlterarActionPerformed
        // TODO add your handling code here:
        TelaNovoAlterarApt napt = new TelaNovoAlterarApt(aptSelecionado,login);
        this.setVisible(false);
        napt.setVisible(true);
    }//GEN-LAST:event_jButton1AlterarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        listarTabelaApt();
      
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(TelaGerenciaApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciaApt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciaApt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Alterar;
    private javax.swing.JButton jButton1Retornar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox jComboBoxNQuartos;
    private javax.swing.JComboBox jComboBoxPropietario;
    private javax.swing.JComboBox jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApt;
    private javax.swing.JLabel jLabelCelpe;
    private javax.swing.JLabel jLabelCheckIn;
    private javax.swing.JLabel jLabelNQuartos;
    private javax.swing.JLabel jLabelNet;
    private javax.swing.JLabel jLabelPropietario;
    private javax.swing.JLabel jLabelReservas;
    private javax.swing.JLabel jLabelSituação;
    private javax.swing.JLabel jLabelVM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableApt;
    private javax.swing.JTable jTableChecIn;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTextField jTextFieldApt;
    private javax.swing.JTextField jTextFieldCelpe;
    private javax.swing.JTextField jTextFieldNet;
    private javax.swing.JTextField jTextFieldVM;
    // End of variables declaration//GEN-END:variables
}
