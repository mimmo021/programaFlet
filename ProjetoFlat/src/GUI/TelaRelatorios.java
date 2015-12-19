/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classesbasicas.CheckIn;
import classesbasicas.Login;
import classesbasicas.Registro;
import classesfachada.Fachada;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peppe
 */
public class TelaRelatorios extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorios
     */
    Login login;
    public TelaRelatorios(Login l) {
        initComponents();
         listarTabelaP();
         this.login =l;
    }
    public TelaRelatorios(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonretornar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonretornar.setText("Retornar");
        jButtonretornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonretornarActionPerformed(evt);
            }
        });

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/barra2.png"))); // NOI18N

        jButton1.setText("Checkout de Hoje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jButtonretornar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonretornar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void listarTabelaP() {
     try{
        Fachada f = new Fachada();
        CheckIn checkIn = new CheckIn();
        ArrayList<CheckIn> listaCheckIno;

        listaCheckIno = (ArrayList<CheckIn>) f.listallCheckIn(checkIn);
        
        
          Date checkout = new Date();
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
            String dataRegT = DATE_FORMAT.format(checkout);
             checkout = new java.sql.Date(DATE_FORMAT.parse(dataRegT).getTime());
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Id","Aptº", "Data Entrada",
            "Data Saída", "Locatario", "Situação"});
        for (int i = 0; i < listaCheckIno.size(); i++) {
            if(listaCheckIno.get(i).getDataCheckout().equals(checkout)){
                    dtm.addRow(new String[]{listaCheckIno.get(i).getId() + "",
                    listaCheckIno.get(i).getApartamento().getNumero() + "",
                    listaCheckIno.get(i).getDataentrada() + "",
                    listaCheckIno.get(i).getDatasaida() + "",
                    listaCheckIno.get(i).getLocatario().getNome() + "",
                    listaCheckIno.get(i).getApartamento().getSituacao()
            
                            });
            }
        }

        jTablePrincipal.setModel(dtm);

        }catch(Exception e){
         
         }
    }
    private void jButtonretornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonretornarActionPerformed
        TelaPainelPrincipal tpp = new TelaPainelPrincipal(login);
        
        tpp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonretornarActionPerformed

    private void jTablePrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrincipalMouseClicked
      
    }//GEN-LAST:event_jTablePrincipalMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listarTabelaP();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
        Fachada f = new Fachada();
        Registro checkIn = new Registro();
        ArrayList<Registro> listaCheckIno;

        listaCheckIno = (ArrayList<Registro>) f.listallRegistro(checkIn);
        
        
          Date checkout = new Date();
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
            String dataRegT = DATE_FORMAT.format(checkout);
             checkout = new java.sql.Date(DATE_FORMAT.parse(dataRegT).getTime());
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Id","Data Registroº", "Usuario",
            "Descricao"});
        for (int i = 0; i < listaCheckIno.size(); i++) {
            
                    dtm.addRow(new String[]{listaCheckIno.get(i).getId() + "",
                    listaCheckIno.get(i).getDataregistro()+ "",
                    listaCheckIno.get(i).getLogin().getUsuario(),
                    listaCheckIno.get(i).getDescricao() 
                            });
            
        }

        jTablePrincipal.setModel(dtm);

        }catch(Exception e){
         
         }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonretornar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrincipal;
    // End of variables declaration//GEN-END:variables
}
