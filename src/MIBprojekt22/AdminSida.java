/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author piava
 */
public class AdminSida extends javax.swing.JFrame {

    private static InfDB idb;
    
    public AdminSida(InfDB idb) {
        initComponents();
        this.idb = idb;
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

        label1 = new java.awt.Label();
        BTNnyregAgent = new java.awt.Button();
        BTNgeAdminstatus = new java.awt.Button();
        BTNsökAgentInfo = new java.awt.Button();
        BTNandraAgentinfo = new java.awt.Button();
        BTNandraKontorschef = new java.awt.Button();
        BTNandraOmradeschef = new java.awt.Button();
        BTNtabortUtrustning = new java.awt.Button();
        BTNtabortAgent = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        label1.setText("Meny");

        BTNnyregAgent.setBackground(new java.awt.Color(255, 255, 255));
        BTNnyregAgent.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNnyregAgent.setLabel("Nyregistrera agent");
        BTNnyregAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnyregAgentActionPerformed(evt);
            }
        });

        BTNgeAdminstatus.setBackground(new java.awt.Color(255, 255, 255));
        BTNgeAdminstatus.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNgeAdminstatus.setLabel("Ge administratörsstatus");
        BTNgeAdminstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNgeAdminstatusActionPerformed(evt);
            }
        });

        BTNsökAgentInfo.setBackground(new java.awt.Color(255, 255, 255));
        BTNsökAgentInfo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNsökAgentInfo.setLabel("Sök agentinfo");
        BTNsökAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsökAgentInfoActionPerformed(evt);
            }
        });

        BTNandraAgentinfo.setBackground(new java.awt.Color(255, 255, 255));
        BTNandraAgentinfo.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNandraAgentinfo.setLabel("Ändra agentinfo");
        BTNandraAgentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNandraAgentinfoActionPerformed(evt);
            }
        });

        BTNandraKontorschef.setBackground(new java.awt.Color(255, 255, 255));
        BTNandraKontorschef.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNandraKontorschef.setLabel("Ändra kontorschef");
        BTNandraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNandraKontorschefActionPerformed(evt);
            }
        });

        BTNandraOmradeschef.setBackground(new java.awt.Color(255, 255, 255));
        BTNandraOmradeschef.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNandraOmradeschef.setLabel("Ändra omradeschef");
        BTNandraOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNandraOmradeschefActionPerformed(evt);
            }
        });

        BTNtabortUtrustning.setBackground(new java.awt.Color(255, 255, 255));
        BTNtabortUtrustning.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNtabortUtrustning.setLabel("Ta bort utrustning");
        BTNtabortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNtabortUtrustningActionPerformed(evt);
            }
        });

        BTNtabortAgent.setBackground(new java.awt.Color(255, 255, 255));
        BTNtabortAgent.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNtabortAgent.setLabel("Ta bort agent");
        BTNtabortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNtabortAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNnyregAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNgeAdminstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNsökAgentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNandraAgentinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNandraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNandraOmradeschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNtabortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNtabortAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNandraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNnyregAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNandraOmradeschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNgeAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNtabortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNsökAgentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNtabortAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNandraAgentinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNnyregAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnyregAgentActionPerformed
        // TODO add your handling code here:
        new NyregistreraAgent(idb).setVisible(true);
    }//GEN-LAST:event_BTNnyregAgentActionPerformed

    private void BTNandraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandraKontorschefActionPerformed
        // TODO add your handling code here:
        new AndraKontorschef(idb).setVisible(true);
    }//GEN-LAST:event_BTNandraKontorschefActionPerformed

    private void BTNgeAdminstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNgeAdminstatusActionPerformed
        // TODO add your handling code here:
        new GorAdministrator(idb).setVisible(true);
    }//GEN-LAST:event_BTNgeAdminstatusActionPerformed

    private void BTNandraOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandraOmradeschefActionPerformed
        // TODO add your handling code here:
        new AndraOmrodeschef(idb).setVisible(true);
    }//GEN-LAST:event_BTNandraOmradeschefActionPerformed

    private void BTNsökAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsökAgentInfoActionPerformed
        // TODO add your handling code here:
        new VisaAgentInformation(idb).setVisible(true);
        
    }//GEN-LAST:event_BTNsökAgentInfoActionPerformed

    private void BTNtabortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNtabortUtrustningActionPerformed
        // TODO add your handling code here:
        new RaderaUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_BTNtabortUtrustningActionPerformed

    private void BTNandraAgentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandraAgentinfoActionPerformed
        // TODO add your handling code here:
        new AndraAgentInformation(idb).setVisible(true);
    }//GEN-LAST:event_BTNandraAgentinfoActionPerformed

    private void BTNtabortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNtabortAgentActionPerformed
        // TODO add your handling code here:
        new RaderaAgent(idb).setVisible(true);
    }//GEN-LAST:event_BTNtabortAgentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BTNandraAgentinfo;
    private java.awt.Button BTNandraKontorschef;
    private java.awt.Button BTNandraOmradeschef;
    private java.awt.Button BTNgeAdminstatus;
    private java.awt.Button BTNnyregAgent;
    private java.awt.Button BTNsökAgentInfo;
    private java.awt.Button BTNtabortAgent;
    private java.awt.Button BTNtabortUtrustning;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
