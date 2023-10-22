/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package classes;

/**
 *
 * @author lucky13
 */
public class DeveloperFrame extends javax.swing.JPanel {

    /**
     * Creates new form DeveloperFrame
     */
    public DeveloperFrame(MainApp mn) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bck = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Developer/construction.png"))); // NOI18N
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        add(jLabel2);
        jLabel2.setBounds(120, 240, 470, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Developer/header.gif"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        add(jLabel1);
        jLabel1.setBounds(60, 10, 580, 96);

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Back/Default.png"))); // NOI18N
        bck.setBorderPainted(false);
        bck.setContentAreaFilled(false);
        bck.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bck.setIconTextGap(0);
        bck.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Back/Pressed.png"))); // NOI18N
        bck.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Back/RollOver.gif"))); // NOI18N
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });
        add(bck);
        bck.setBounds(10, 640, 150, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        // TODO add your handling code here:
        this.app.switchFrames(this, this.app.transacWin);
    }//GEN-LAST:event_bckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    MainApp app;
}
