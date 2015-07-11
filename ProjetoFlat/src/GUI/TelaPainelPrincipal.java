/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.CheckIn;
import classesfachada.Fachada;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mimmo
 */
public class TelaPainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrincipal
     */
    public TelaPainelPrincipal() {
        initComponents();
        listarTabelaP();
       
    }
    public void listarTabelaP(){
       
		Fachada f = new Fachada();
		CheckIn checkIn = new CheckIn();
		ArrayList<CheckIn> listaCheckIno;
		      
            listaCheckIno = (ArrayList<CheckIn>) f.listallCheckIn(checkIn);
            
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Aptº", "Data Entrada",
                "Data Saída", "Locatario", "Situação"});
            for (int i = 0; i < listaCheckIno.size(); i++) {
                dtm.addRow(new String[]{listaCheckIno.get(i).getId() + "",
                    listaCheckIno.get(i).getApartamento().getNumero() + "",
                    listaCheckIno.get(i).getDataentrada() + "",
                    listaCheckIno.get(i).getDatasaida() + "",
                    listaCheckIno.get(i).getLocatario().getNome() + "",
                    listaCheckIno.get(i).getApartamento().getSituacao()
                });
            }
            
            jTablePrincipal.setModel(dtm);
        
	
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
        jLabelApt = new javax.swing.JLabel();
        jTextFieldApt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jLabelNQuartos = new javax.swing.JLabel();
        jTextFieldNQuartos = new javax.swing.JTextField();
        jLabelSituacao = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();
        jLabelVM = new javax.swing.JLabel();
        jLabelLocador = new javax.swing.JLabel();
        jTextFieldVM = new javax.swing.JTextField();
        jTextFieldLocador = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButtonCheckIn = new javax.swing.JButton();
        jButtonApt = new javax.swing.JButton();
        jButtonLocador = new javax.swing.JButton();
        jButtonReservas = new javax.swing.JButton();
        jButtonProprietarios = new javax.swing.JButton();
        jButtonCheckout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 300));

        jLabelApt.setText("Aptº:");

        jTextFieldApt.setEditable(false);

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Aptº", "Data Entrada", "Data Saída", "Possui Reservas", "Situação"
            }
        ));
        jTablePrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrincipal);

        jLabelNQuartos.setText("Nº de Quartos:");

        jTextFieldNQuartos.setEditable(false);

        jLabelSituacao.setText("Situação:");

        jTextFieldSituacao.setEditable(false);

        jLabelVM.setText("Valor Mínimo:");

        jLabelLocador.setText("Locador:");

        jTextFieldVM.setEditable(false);

        jTextFieldLocador.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Obs.:"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jButtonCheckIn.setText("Check In");
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonApt.setText("Aptº");
        jButtonApt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAptActionPerformed(evt);
            }
        });

        jButtonLocador.setText("Locador");
        jButtonLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocadorActionPerformed(evt);
            }
        });

        jButtonReservas.setText("Reservas");
        jButtonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservasActionPerformed(evt);
            }
        });

        jButtonProprietarios.setText("Proprietários");
        jButtonProprietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProprietariosActionPerformed(evt);
            }
        });

        jButtonCheckout.setText("Check Out");
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jButtonLocador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProprietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonApt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReservas)
                    .addComponent(jButtonCheckIn)
                    .addComponent(jButtonProprietarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocador)
                    .addComponent(jButtonCheckout)
                    .addComponent(jButtonApt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelApt)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldApt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelVM)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldVM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNQuartos)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSituacao)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLocador)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldLocador, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelApt)
                                    .addComponent(jLabelVM))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNQuartos)
                                    .addComponent(jLabelSituacao))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelLocador))
                            .addComponent(jTextFieldLocador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckInActionPerformed
        // TODO add your handling code here:
        TelaGerenciaCheckIn tCheckIn = new TelaGerenciaCheckIn(this);
        this.setVisible(false);
        tCheckIn.setVisible(true);
    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCheckoutActionPerformed

    private void jButtonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservasActionPerformed
        // TODO add your handling code here:
        TelaGerenciaReserva tRes = new TelaGerenciaReserva(this);
        this.setVisible(false);
        tRes.setVisible(true);
    }//GEN-LAST:event_jButtonReservasActionPerformed

    private void jButtonProprietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProprietariosActionPerformed
        // TODO add your handling code here:
        TelaGerenciaProprietario tPro = new TelaGerenciaProprietario(this);
        this.setVisible(false);
        tPro.setVisible(true);
    }//GEN-LAST:event_jButtonProprietariosActionPerformed

    private void jButtonLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocadorActionPerformed
        // TODO add your handling code here:
        TelaGerenciaLocador tLoc = new TelaGerenciaLocador(this);
        this.setVisible(false);
        tLoc.setVisible(true);
    }//GEN-LAST:event_jButtonLocadorActionPerformed

    private void jButtonAptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAptActionPerformed
        // TODO add your handling code here:
        TelaGerenciaApt tApt = new TelaGerenciaApt(this);
        this.setVisible(false);
        tApt.setVisible(true);
    }//GEN-LAST:event_jButtonAptActionPerformed

    private void jTablePrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrincipalMouseClicked
        // TODO add your handling code here:
        Fachada f = new Fachada();
        CheckIn chekinSelecionado = new CheckIn();
        chekinSelecionado.setId(jTablePrincipal.getSelectedRow()+1);
        f.findCheckIn(chekinSelecionado);
        
        jTextFieldApt.setText(chekinSelecionado.getApartamento().getNumero()+"");
        jTextFieldVM.setText(chekinSelecionado.getApartamento().getValorminimo()+"");
        jTextFieldNQuartos.setText(chekinSelecionado.getApartamento().getQuartos()+"");
        jTextFieldSituacao.setText(chekinSelecionado.getApartamento().getSituacao());
        jTextFieldLocador.setText(chekinSelecionado.getApartamento().getProprietario().getNome());
         
    }//GEN-LAST:event_jTablePrincipalMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApt;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonLocador;
    private javax.swing.JButton jButtonProprietarios;
    private javax.swing.JButton jButtonReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApt;
    private javax.swing.JLabel jLabelLocador;
    private javax.swing.JLabel jLabelNQuartos;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelVM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrincipal;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldApt;
    private javax.swing.JTextField jTextFieldLocador;
    private javax.swing.JTextField jTextFieldNQuartos;
    private javax.swing.JTextField jTextFieldSituacao;
    private javax.swing.JTextField jTextFieldVM;
    // End of variables declaration//GEN-END:variables
}