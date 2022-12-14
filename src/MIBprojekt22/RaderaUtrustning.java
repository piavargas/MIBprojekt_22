/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
/**
 *
 * @author amandademir, piava
 */
public class RaderaUtrustning extends javax.swing.JFrame {
 
    private InfDB idb; 
    /**
     * Creates new form RaderaUtrustning
     */
    public RaderaUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllComboboxUtrustningar();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void fyllComboboxUtrustningar(){
        JComboBoxRaderaUtrustning.removeAllItems();
        String question = "SELECT Benamning FROM Utrustning";// Vi hämtar in utrustnings från tabellen genom en SQL fråga
    
        ArrayList<String> Utrustningar = new ArrayList<>(); 
        try {
            Utrustningar= idb.fetchColumn(question);
            
            for(String utrustning: Utrustningar)
            {
                JComboBoxRaderaUtrustning.addItem(utrustning); //Här lägger vi till utrustning 
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLRubrik = new javax.swing.JLabel();
        JLRaderaUtrustning = new javax.swing.JLabel();
        JComboBoxRaderaUtrustning = new javax.swing.JComboBox<>();
        BtnRaderaUtrustning = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLRubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        JLRubrik.setText("Radera utrustning");

        JLRaderaUtrustning.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        JLRaderaUtrustning.setText("Välj utrustning att radera nedan");

        JComboBoxRaderaUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Neuralyzer", "Carbonizer" }));

        BtnRaderaUtrustning.setText("Radera");
        BtnRaderaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRaderaUtrustningActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 2, 10)); // NOI18N
        jLabel1.setText("Här kan du som admin radera utrustning ur systemet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JComboBoxRaderaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(BtnRaderaUtrustning)
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(JLRaderaUtrustning)
                            .addGap(43, 43, 43)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(JLRaderaUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JComboBoxRaderaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(BtnRaderaUtrustning)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRaderaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRaderaUtrustningActionPerformed
        String utrustningsNamn = String.valueOf(JComboBoxRaderaUtrustning.getSelectedItem().toString());//Detta beskriver den valda utrustningen
        
        try {
            String Utrustning = idb.fetchSingle("SELECT Utrustnings_ID FROM Utrustning WHERE Benamning = '"+ utrustningsNamn +"'");
        {
            idb.delete("DELETE FROM Utrustning WHERE Benamning = '" + utrustningsNamn + "'");//Här raderar vi utrustningen vi valt
            JOptionPane.showMessageDialog(null, "Utrustning med Namnet " + utrustningsNamn + " är bortaget!"); 
        }
    } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_BtnRaderaUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RaderaUtrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRaderaUtrustning;
    private javax.swing.JComboBox<String> JComboBoxRaderaUtrustning;
    private javax.swing.JLabel JLRaderaUtrustning;
    private javax.swing.JLabel JLRubrik;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
