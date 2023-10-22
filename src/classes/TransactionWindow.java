/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package classes;

/**
 *
 * @author lucky13
 */
public class TransactionWindow extends javax.swing.JPanel {

    /**
     * Creates new form SecondWindow
     */
    public TransactionWindow(MainApp mn) {
        initComponents();
        this.app = mn;
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
        dev = new javax.swing.JButton();
        fastCash = new javax.swing.JButton();
        checkBal = new javax.swing.JButton();
        changePin = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();

        setBackground(new java.awt.Color(50, 172, 111));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/transac.gif"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setIconTextGap(0);
        add(jLabel1);
        jLabel1.setBounds(10, 110, 680, 80);

        dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Developer/Default.gif"))); // NOI18N
        dev.setBorder(null);
        dev.setBorderPainted(false);
        dev.setContentAreaFilled(false);
        dev.setDoubleBuffered(true);
        dev.setFocusPainted(false);
        dev.setFocusable(false);
        dev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dev.setIconTextGap(0);
        dev.setPreferredSize(new java.awt.Dimension(128, 64));
        dev.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Developer/Selected.png"))); // NOI18N
        dev.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Developer/RollOver.gif"))); // NOI18N
        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devActionPerformed(evt);
            }
        });
        add(dev);
        dev.setBounds(380, 510, 290, 100);

        fastCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/FastCash/Default.gif"))); // NOI18N
        fastCash.setBorder(null);
        fastCash.setBorderPainted(false);
        fastCash.setContentAreaFilled(false);
        fastCash.setDoubleBuffered(true);
        fastCash.setFocusPainted(false);
        fastCash.setFocusable(false);
        fastCash.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fastCash.setIconTextGap(0);
        fastCash.setPreferredSize(new java.awt.Dimension(128, 64));
        fastCash.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/FastCash/Selected.png"))); // NOI18N
        fastCash.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/FastCash/RollOver.gif"))); // NOI18N
        fastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastCashActionPerformed(evt);
            }
        });
        add(fastCash);
        fastCash.setBounds(380, 270, 290, 100);

        checkBal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Check Bal/Default.gif"))); // NOI18N
        checkBal.setBorder(null);
        checkBal.setBorderPainted(false);
        checkBal.setContentAreaFilled(false);
        checkBal.setDoubleBuffered(true);
        checkBal.setFocusPainted(false);
        checkBal.setFocusable(false);
        checkBal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkBal.setIconTextGap(0);
        checkBal.setPreferredSize(new java.awt.Dimension(128, 64));
        checkBal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Check Bal/Selected.png"))); // NOI18N
        checkBal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Check Bal/RollOver.gif"))); // NOI18N
        checkBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalActionPerformed(evt);
            }
        });
        add(checkBal);
        checkBal.setBounds(30, 270, 290, 100);

        changePin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PIN/Default.gif"))); // NOI18N
        changePin.setBorder(null);
        changePin.setBorderPainted(false);
        changePin.setContentAreaFilled(false);
        changePin.setDoubleBuffered(true);
        changePin.setFocusPainted(false);
        changePin.setFocusable(false);
        changePin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePin.setIconTextGap(0);
        changePin.setPreferredSize(new java.awt.Dimension(128, 64));
        changePin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PIN/Selected.png"))); // NOI18N
        changePin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PIN/RollOver.gif"))); // NOI18N
        changePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePinActionPerformed(evt);
            }
        });
        add(changePin);
        changePin.setBounds(30, 510, 290, 100);

        deposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Deposit/Default.gif"))); // NOI18N
        deposit.setBorder(null);
        deposit.setBorderPainted(false);
        deposit.setContentAreaFilled(false);
        deposit.setDoubleBuffered(true);
        deposit.setFocusPainted(false);
        deposit.setFocusable(false);
        deposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deposit.setIconTextGap(0);
        deposit.setPreferredSize(new java.awt.Dimension(128, 64));
        deposit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Deposit/Selected.png"))); // NOI18N
        deposit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Deposit/RollOver.gif"))); // NOI18N
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        add(deposit);
        deposit.setBounds(30, 390, 290, 100);

        withdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Withdraw/Default.gif"))); // NOI18N
        withdraw.setBorder(null);
        withdraw.setBorderPainted(false);
        withdraw.setContentAreaFilled(false);
        withdraw.setDoubleBuffered(true);
        withdraw.setFocusPainted(false);
        withdraw.setFocusable(false);
        withdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        withdraw.setIconTextGap(0);
        withdraw.setPreferredSize(new java.awt.Dimension(128, 64));
        withdraw.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Withdraw/Selected.png"))); // NOI18N
        withdraw.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Withdraw/RollOver.gif"))); // NOI18N
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        add(withdraw);
        withdraw.setBounds(380, 390, 290, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.devInfoWin;
        this.app.switchFrames(this, nextFrame);
    }//GEN-LAST:event_devActionPerformed

    private void fastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastCashActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.fastCashWin;
        this.app.loginWin.setNextFrame(nextFrame);
        if (!this.app.isLoggedIn()) {
            this.app.switchFrames(this, this.app.loginWin);
        } else {
            // TODO new fastCash Frame
            this.app.switchFrames(this, nextFrame);
        }
    }//GEN-LAST:event_fastCashActionPerformed

    private void checkBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.checkBalWin;
        this.app.loginWin.setNextFrame(nextFrame);
        if (!this.app.isLoggedIn()) {
            this.app.switchFrames(this, this.app.loginWin);
        } else {
            // TODO new checkBal Frame
            this.app.switchFrames(this, nextFrame);
        }
    }//GEN-LAST:event_checkBalActionPerformed

    private void changePinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePinActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.changePinWin;
        this.app.loginWin.setNextFrame(nextFrame);
        if (!this.app.isLoggedIn()) {
            this.app.switchFrames(this, this.app.loginWin);
        } else {
            // TODO new changePin Frame
            this.app.switchFrames(this, nextFrame);
        }
    }//GEN-LAST:event_changePinActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.depositWin;
        this.app.loginWin.setNextFrame(nextFrame);
        if (!this.app.isLoggedIn()) {
            this.app.switchFrames(this, this.app.loginWin);
        } else {
            // TODO new deposit Frame
            this.app.switchFrames(this, nextFrame);
        }       
    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
        nextFrame = this.app.withdrawWin;
        this.app.loginWin.setNextFrame(nextFrame);
        if (!this.app.isLoggedIn()) {
            this.app.switchFrames(this, this.app.loginWin);
        } else {
            // TODO new withdraw Frame
            this.app.switchFrames(this, nextFrame);
        }
    }//GEN-LAST:event_withdrawActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePin;
    private javax.swing.JButton checkBal;
    private javax.swing.JButton deposit;
    private javax.swing.JButton dev;
    private javax.swing.JButton fastCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel nextFrame;
    MainApp app;
}