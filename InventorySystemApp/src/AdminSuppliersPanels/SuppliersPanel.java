/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminSuppliersPanels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author kimoo
 */
public class SuppliersPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuppliersListPanel
     */
    SuppliersListPanel listPanel;
    GridBagLayout layout = new GridBagLayout();
    suppliersEditPanel editPanel;

    public SuppliersPanel() {
        initComponents();
        listPanel = new SuppliersListPanel();
        editPanel = new suppliersEditPanel();
//        DynamicSupplierPanel.setLayout(layout);
//        GridBagConstraints constraint = new GridBagConstraints();
//        constraint.gridx = 0;
//        constraint.gridy = 0;
        DynamicSupplierPanel.add(listPanel);
        DynamicSupplierPanel.add(editPanel);
        editPanel.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        DynamicSupplierPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        editButton.setText("Update/Delete");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        listButton.setText("suppliers List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(editButton)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(listButton)
                .addGap(89, 89, 89)
                .addComponent(editButton)
                .addGap(144, 144, 144))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicSupplierPanel.setLayout(new javax.swing.BoxLayout(DynamicSupplierPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(DynamicSupplierPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        listPanel.setVisible(false);
        editPanel.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // TODO add your handling code here:
        listPanel.setVisible(true);
        editPanel.setVisible(false);
    }//GEN-LAST:event_listButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicSupplierPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listButton;
    // End of variables declaration//GEN-END:variables
}