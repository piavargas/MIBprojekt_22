/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Pia Vargas, Amanda Demir
 */
public class AndraKontorschef extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AndraKontorschef
     */
    public AndraKontorschef(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllComboboxAdminAgent();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        JLKontorschef = new javax.swing.JLabel();
        JComboBoxKontorschef = new javax.swing.JComboBox<>();
        BtnAndra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setText("Ändra kontorschef");

        JLKontorschef.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        JLKontorschef.setText("Välj kontorschef/agent att ändra:");

        JComboBoxKontorschef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4" }));

        BtnAndra.setText("Ändra");
        BtnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAndraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        jLabel2.setText("Här kan du ändra kontorschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAndra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JComboBoxKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLKontorschef)
                    .addComponent(JComboBoxKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(BtnAndra)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAndraActionPerformed
    
        String agenten = JComboBoxKontorschef.getSelectedItem().toString();
    
    try { 
        
        String agent = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn = '" + agenten + "'");
        idb.update("UPDATE Kontorschef SET Agent_ID='" + agent + "'");
    
        JOptionPane.showMessageDialog(null, "Kontorschefen har förnyats!");// Denna metoden ger information till användaren
        
    } catch (InfException ettUndantag) {// Ifall try inte skulle fungera, stoppar detta systemet från att krascha
        JOptionPane.showMessageDialog(null, "Kontorschefen gick inte att förnya!");
        Logger.getLogger(AndraKontorschef.class.getName()).log(Level.SEVERE, null, ettUndantag);
    }// TODO add your handling code here:
    }//GEN-LAST:event_BtnAndraActionPerformed

    private void fyllComboboxAdminAgent(){
        JComboBoxKontorschef.removeAllItems(); // Denna metod nollställer alla värden i comboboxen
    String question = "SELECT Namn FROM Agent"; 
    
    ArrayList<String> AdminAgenter ;
    try {
    AdminAgenter = idb.fetchColumn(question); // Denna metod hämtar alla namn som finns i agent tabellen
    
    for(String agent: AdminAgenter)
    {
      JComboBoxKontorschef.addItem(agent); // Denna metod lägger till alla agenter som är admins
    }
    }   catch (InfException ettUndantag) { // Finns ifall systemet skulle krasha
            Logger.getLogger(AndraKontorschef.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }
    }
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
            java.util.logging.Logger.getLogger(AndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AndraKontorschef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAndra;
    private javax.swing.JComboBox<String> JComboBoxKontorschef;
    private javax.swing.JLabel JLKontorschef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
