/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package enventrysystem;

/**
 *
 * @author dell
 */
public class EnventryForm extends javax.swing.JFrame {

    /**
     * Creates new form EnventryForm
     */
    public EnventryForm() {
        initComponents();
        setSize(500,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        inv = new javax.swing.JMenu();
        supplier_m = new javax.swing.JMenuItem();
        product_m = new javax.swing.JMenuItem();
        customer_m = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        purchase_f = new javax.swing.JMenuItem();
        purchase_r = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        salesform = new javax.swing.JMenuItem();
        sales_r = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inv.setText("InvMaster");
        inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invActionPerformed(evt);
            }
        });

        supplier_m.setText("SupplierMaster");
        supplier_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_mActionPerformed(evt);
            }
        });
        inv.add(supplier_m);

        product_m.setText("ProductMaster");
        product_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_mActionPerformed(evt);
            }
        });
        inv.add(product_m);

        customer_m.setText("CustumerMaster");
        customer_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_mActionPerformed(evt);
            }
        });
        inv.add(customer_m);

        jMenuBar1.add(inv);

        jMenu2.setText("Purchase");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        purchase_f.setText("PurchaseForm");
        purchase_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_fActionPerformed(evt);
            }
        });
        jMenu2.add(purchase_f);

        purchase_r.setText("PurchaseReturn");
        purchase_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_rActionPerformed(evt);
            }
        });
        jMenu2.add(purchase_r);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sales");

        salesform.setText("SalesForm");
        salesform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesformActionPerformed(evt);
            }
        });
        jMenu3.add(salesform);

        sales_r.setText("SalesReturn");
        sales_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_rActionPerformed(evt);
            }
        });
        jMenu3.add(sales_r);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invActionPerformed

        
    }//GEN-LAST:event_invActionPerformed

    private void supplier_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_mActionPerformed
        this.setVisible(false);
        SupplerMaster.main(new String[2]);
    }//GEN-LAST:event_supplier_mActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void product_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_mActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProductMaster.main(new String[2]);
    }//GEN-LAST:event_product_mActionPerformed

    private void purchase_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_fActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        PurchaseForm.main(new String[2]);
    }//GEN-LAST:event_purchase_fActionPerformed

    private void salesformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesformActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        SalesForm.main(new String[2]);
    }//GEN-LAST:event_salesformActionPerformed

    private void purchase_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_rActionPerformed
          this.setVisible(false);
        PurchaseReturn.main(new String[2]);
    }//GEN-LAST:event_purchase_rActionPerformed

    private void customer_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_mActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CustomerForm.main(new String[2]);
    }//GEN-LAST:event_customer_mActionPerformed

    private void sales_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_rActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        SalesReturn.main(new String[2]);
    }//GEN-LAST:event_sales_rActionPerformed

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
            java.util.logging.Logger.getLogger(EnventryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnventryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnventryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnventryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnventryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem customer_m;
    private javax.swing.JMenu inv;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem product_m;
    private javax.swing.JMenuItem purchase_f;
    private javax.swing.JMenuItem purchase_r;
    private javax.swing.JMenuItem sales_r;
    private javax.swing.JMenuItem salesform;
    private javax.swing.JMenuItem supplier_m;
    // End of variables declaration//GEN-END:variables
}
