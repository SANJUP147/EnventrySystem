/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package enventrysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author dell
 */
public class ProductMaster extends javax.swing.JFrame {

    /**
     * Creates new form ProductMaster
     */
    public ProductMaster() {
        initComponents();
        setSize(600,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnm = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        sprice = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnmActionPerformed(evt);
            }
        });
        getContentPane().add(pnm);
        pnm.setBounds(140, 80, 170, 40);

        pprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppriceActionPerformed(evt);
            }
        });
        getContentPane().add(pprice);
        pprice.setBounds(140, 140, 170, 40);
        getContentPane().add(sprice);
        sprice.setBounds(140, 190, 170, 40);

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(90, 250, 100, 30);

        jButton2.setText("home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 40, 72, 23);

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid);
        pid.setBounds(140, 30, 170, 40);

        jLabel1.setText("p_id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 80, 20);

        jLabel2.setText("ProductName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 100, 30);

        jLabel3.setText("Purchase Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 100, 20);

        jLabel4.setText("Sales price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        EnventryForm.main(new String[2]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnmActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
         try{
           Connection con1=initconnection.getConn();
            PreparedStatement ps=con1.prepareStatement
        ("insert into product (p_id,pname,pprice,sprice)values(?,?,?,?)");
             ps.setInt(1,Integer.parseInt(pid.getText()));
             ps.setString(2,pnm.getText());
            ps.setInt(3,Integer.parseInt(pprice.getText()));
            ps.setInt(0x4,Integer.parseInt(sprice.getText()));
          //  ps.setInt(4,Integer.parseInt(pid.getText()));
          ps.executeUpdate();
           pid.setText("pid ");
            pnm.setText("name");
            pprice.setText("pprice");
            sprice.setText("sprice");
         //   pid.setText("pid ");
            
            
        }catch(Exception t)
        {
            System.out.println(t);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void ppriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppriceActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

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
            java.util.logging.Logger.getLogger(ProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pnm;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField sprice;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
