/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author amandademir
 */
public class NyregistreraAgent extends javax.swing.JFrame {

    private static InfDB idb;
    
      public NyregistreraAgent(InfDB idb) {
        initComponents(); 
        this.idb = idb;
        fyllComboboxOmrade();
        
    }
    private void fyllComboboxOmrade() {
        
        JComboBoxOmråde.removeAllItems();
        String question = "SELECT Omrades_ID FROM Omrade";
        
        ArrayList<String> omraden ;
    try {
    omraden = idb.fetchColumn(question);
    
    for(String omrade: omraden)
    {
      JComboBoxOmråde.addItem(omrade);
    }
    }catch (InfException ettUndantag) {
            Logger.getLogger(NyregistreraAgent.class.getName()).log(Level.SEVERE, null, ettUndantag);
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

        JRubrik = new javax.swing.JLabel();
        JLAgentID = new javax.swing.JLabel();
        JLNamn = new javax.swing.JLabel();
        JLLosen = new javax.swing.JLabel();
        JLTelnr = new javax.swing.JLabel();
        JLOmråde = new javax.swing.JLabel();
        JLDatum = new javax.swing.JLabel();
        TxtAgentID = new javax.swing.JTextField();
        TxtNamn = new javax.swing.JTextField();
        TxtTelnr = new javax.swing.JTextField();
        JComboBoxOmråde = new javax.swing.JComboBox<>();
        TxtDatum = new javax.swing.JTextField();
        BtnRegistrera = new javax.swing.JButton();
        JLAdmin = new javax.swing.JLabel();
        TxtAdmin = new javax.swing.JTextField();
        Txtlosen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        JRubrik.setText("Registrera Agent");

        JLAgentID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLAgentID.setText("AgentID");

        JLNamn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLNamn.setText("Namn");

        JLLosen.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLLosen.setText("Lösenord");

        JLTelnr.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLTelnr.setText("Tel.nr");

        JLOmråde.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLOmråde.setText("Område");

        JLDatum.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLDatum.setText("Anställningsdatum");

        JComboBoxOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        BtnRegistrera.setText("Registrera");
        BtnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistreraActionPerformed(evt);
            }
        });

        JLAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLAdmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLAgentID)
                            .addComponent(JLNamn))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtAgentID, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(TxtNamn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLTelnr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLOmråde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JLLosen))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JComboBoxOmråde, 0, 153, Short.MAX_VALUE)
                            .addComponent(TxtTelnr)
                            .addComponent(Txtlosen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLDatum)
                            .addComponent(JLAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDatum)
                            .addComponent(TxtAdmin))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAgentID)
                    .addComponent(TxtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNamn)
                    .addComponent(TxtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLosen)
                    .addComponent(Txtlosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTelnr)
                    .addComponent(TxtTelnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLOmråde)
                    .addComponent(JComboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDatum)
                    .addComponent(TxtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAdmin)
                    .addComponent(TxtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(BtnRegistrera)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistreraActionPerformed
     
        if(Validering.kollaDatum(TxtDatum)) 
        if(Validering.kollaLosen(Txtlosen))
        if(Validering.tomRuta(TxtNamn))
        if (Validering.tomRuta(TxtTelnr))
    
try {
            
            String AgentID = idb.getAutoIncrement("Agent","Agent_ID");
            String anstallningsdatum = TxtDatum.getText();
            String losen = String.valueOf(Txtlosen.getText());
            String namn = String.valueOf(TxtNamn.getText());
            String telnr = String.valueOf(TxtTelnr.getText());
            int omrade = Integer.parseInt(JComboBoxOmråde.getSelectedItem().toString());
            String admin = String.valueOf(TxtAdmin.getText());
            
            String q= "INSERT INTO Agent VALUES("+AgentID+",'"+namn+"','"+telnr+"','"+anstallningsdatum+"','"+admin+"','"+losen+"',"+omrade+");";
            
            
            idb.insert(q);
            JOptionPane.showMessageDialog(null, "Ny agent har registrerats!");
            
           
        } catch (InfException ettUndantag) {   
        Logger.getLogger(NyregistreraAgent.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistreraActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrera;
    private javax.swing.JComboBox<String> JComboBoxOmråde;
    private javax.swing.JLabel JLAdmin;
    private javax.swing.JLabel JLAgentID;
    private javax.swing.JLabel JLDatum;
    private javax.swing.JLabel JLLosen;
    private javax.swing.JLabel JLNamn;
    private javax.swing.JLabel JLOmråde;
    private javax.swing.JLabel JLTelnr;
    private javax.swing.JLabel JRubrik;
    private javax.swing.JTextField TxtAdmin;
    private javax.swing.JTextField TxtAgentID;
    private javax.swing.JTextField TxtDatum;
    private javax.swing.JTextField TxtNamn;
    private javax.swing.JTextField TxtTelnr;
    private javax.swing.JTextField Txtlosen;
    // End of variables declaration//GEN-END:variables
}
