/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author piava
 */
public class NyregistreraAlienn extends javax.swing.JFrame {

    private InfDB idb;
    private HjalpAttHamta konv;
    /**
     * Creates new form NyregistreraAlienn
     */
    public NyregistreraAlienn(InfDB idb) {
        initComponents();
        this.idb = idb;
        konv = new HjalpAttHamta(idb);

    }

    private NyregistreraAlienn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LBAnt = new javax.swing.JLabel();
        TxtNamn = new javax.swing.JTextField();
        TxtLosen = new javax.swing.JTextField();
        TxtTelnmr = new javax.swing.JTextField();
        TxtAngeAnt = new javax.swing.JTextField();
        CBras = new javax.swing.JComboBox<>();
        CBomrade = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        BTNregistrera = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CBansvarigAgent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setText("Registrera ny alien");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Namn:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Lösenord:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telnmr:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Område:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Ras:");

<<<<<<< HEAD
        CBras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Squid", "Boglodite", "Worm" }));
=======
        LBAnt.setText("Antal armar/boogies:");

        CBras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Squid", "Boglodite", "Worm" }));
>>>>>>> a8ffdde24e8f3c7dd4930b0d9ea4f565fecbb749
        CBras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBrasActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        CBomrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Svealand", "Norrland", "Götaland" }));
=======
        CBomrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Svealand", "Götaland", "Norrland" }));
>>>>>>> a8ffdde24e8f3c7dd4930b0d9ea4f565fecbb749

        jLabel8.setFont(new java.awt.Font("Cambria", 2, 10)); // NOI18N
        jLabel8.setText("Här kan du registera en ny alien. Var vänlig och fyll i alla rutor.");

        BTNregistrera.setText("Registrera");
        BTNregistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregistreraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ansvarig agent");

<<<<<<< HEAD
        CBansvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Agent O", "Agent K", "Agent J", "Agent Z" }));
=======
        CBansvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Agent K", "Agent J", "Agent O", "Agent N" }));
>>>>>>> a8ffdde24e8f3c7dd4930b0d9ea4f565fecbb749

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(BTNregistrera))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
<<<<<<< HEAD
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBomrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtLosen)
                                    .addComponent(TxtNamn)
                                    .addComponent(TxtTelnmr)
                                    .addComponent(CBomrade, 0, 1, Short.MAX_VALUE)
>>>>>>> a8ffdde24e8f3c7dd4930b0d9ea4f565fecbb749
                                    .addComponent(CBras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBansvarigAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtLosen)
                                    .addComponent(TxtTelnmr)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBAnt)
                                .addGap(18, 18, 18)
                                .addComponent(TxtAngeAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtTelnmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBomrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBansvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAngeAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBAnt))
                .addGap(23, 23, 23)
                .addComponent(BTNregistrera)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNregistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregistreraActionPerformed
        // TODO add your handling code here:
        if (Validering.tomRuta(TxtNamn) && Validering.tomRuta(TxtLosen) && Validering.tomRuta(TxtTelnmr)) {

        try {
            String ansvarigAgent = CBansvarigAgent.getSelectedItem().toString();
            String dagensDatum = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String alienNamn = TxtNamn.getText();
            String alienLösenord = TxtLosen.getText();
            String område = CBomrade.getSelectedItem().toString();
            String alienTelefon = TxtTelnmr.getText();
            String rasVal = CBras.getSelectedItem().toString();
            String Rasobjekt = TxtAngeAnt.getText();
            String hämtaID = idb.getAutoIncrement("Alien", "Alien_ID");
            int nyttID = Integer.parseInt(hämtaID);

            // Konvertering till INT 
            int rasobjektINT = Integer.parseInt(Rasobjekt);
//Här adderas alien till database
            String AnsvarigAgentID = konv.getAgentId(ansvarigAgent);
            String OmrådesID = ("Select Omrades_ID from omrade where benamning = '" + område + "'");
            String hämtatAgent_ID = idb.fetchSingle(AnsvarigAgentID);
            String hämtatOmrådes_ID = idb.fetchSingle(OmrådesID);
            String nyAlien = ("insert into Alien values (" + nyttID + ",'" + dagensDatum + "','" + alienLösenord + "','" + alienNamn + "','" + alienTelefon + "'," + hämtatOmrådes_ID + "," + hämtatAgent_ID + ")");
            idb.insert(nyAlien);
            // Beroende på vilken ras som är satt i comboBoxen, så kommer alien kopplas till en ras-tabell!
            if (rasVal.equals("Worm")) {
                idb.insert("INSERT INTO Worm values (" + nyttID + ")");
                JOptionPane.showMessageDialog(null, "Registrering lyckades!");

            }

            if (rasVal.equals("Squid")) {
                idb.insert("INSERT INTO SQUID values (" + nyttID + "," + rasobjektINT + ")");
                JOptionPane.showMessageDialog(null, "Registrering lyckades!");

            }
            if (rasVal.equals("Boglodite")) {
                idb.insert("INSERT INTO BOGLODITE values (" + nyttID + "," + rasobjektINT + ")");

            }
            JOptionPane.showMessageDialog(null, "Registrering lyckades!");

        } catch (InfException ettUndantag) {

            JOptionPane.showMessageDialog(null, "Vänligen ange korrekta värden.");
        }
        }
    }//GEN-LAST:event_BTNregistreraActionPerformed

    private void CBrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBrasActionPerformed
        // TODO add your handling code here:
        String rasVal = CBras.getSelectedItem().toString();
        if (rasVal.equals("Squid")) {
            TxtAngeAnt.setEnabled(true);

            LBAnt.setText("Antal armar:");
        }

        if (rasVal.equals("Worm")) {
            LBAnt.setText(" ");
            TxtAngeAnt.setEnabled(false);
        }

        if (rasVal.equals("Boglodite")) {
            LBAnt.setText("Antal boogies:");
            TxtAngeAnt.setEnabled(true);

        }
    }//GEN-LAST:event_CBrasActionPerformed

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
            java.util.logging.Logger.getLogger(NyregistreraAlienn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlienn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlienn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlienn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyregistreraAlienn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNregistrera;
    private javax.swing.JComboBox<String> CBansvarigAgent;
    private javax.swing.JComboBox<String> CBomrade;
    private javax.swing.JComboBox<String> CBras;
    private javax.swing.JLabel LBAnt;
    private javax.swing.JTextField TxtAngeAnt;
    private javax.swing.JTextField TxtLosen;
    private javax.swing.JTextField TxtNamn;
    private javax.swing.JTextField TxtTelnmr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
