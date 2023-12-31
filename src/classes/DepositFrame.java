/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package classes;

/**
 *
 * @author lucky13
 */
public class DepositFrame extends javax.swing.JPanel {

    /**
     * Creates new form DepositFrame
     */
    public DepositFrame(MainApp mn) {
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
        dailPad = new javax.swing.JPanel();
        btnExt = new javax.swing.JButton();
        btnEra = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        balanceTF = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(700, 700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Deposit/header.gif"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        add(jLabel1);
        jLabel1.setBounds(-130, 10, 750, 160);

        dailPad.setBackground(new java.awt.Color(255, 102, 102));
        dailPad.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 0, 0), null));
        dailPad.setPreferredSize(new java.awt.Dimension(360, 360));
        dailPad.setLayout(null);

        btnExt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/BtnBck.png"))); // NOI18N
        btnExt.setBorderPainted(false);
        btnExt.setContentAreaFilled(false);
        btnExt.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnExt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExt.setIconTextGap(0);
        btnExt.setName("6"); // NOI18N
        btnExt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/BtnBck.png"))); // NOI18N
        btnExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtActionPerformed(evt);
            }
        });
        dailPad.add(btnExt);
        btnExt.setBounds(270, 0, 90, 90);

        btnEra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/BtnEra.png"))); // NOI18N
        btnEra.setBorderPainted(false);
        btnEra.setContentAreaFilled(false);
        btnEra.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnEra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEra.setIconTextGap(0);
        btnEra.setName(""); // NOI18N
        btnEra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/BtnEra.png"))); // NOI18N
        btnEra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraActionPerformed(evt);
            }
        });
        dailPad.add(btnEra);
        btnEra.setBounds(270, 90, 90, 90);

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/BtnOk.png"))); // NOI18N
        btnOK.setBorderPainted(false);
        btnOK.setContentAreaFilled(false);
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnOK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOK.setIconTextGap(0);
        btnOK.setName("1"); // NOI18N
        btnOK.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/BtnOk.png"))); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        dailPad.add(btnOK);
        btnOK.setBounds(270, 180, 90, 180);

        btnDot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/BtnDot.png"))); // NOI18N
        btnDot.setBorderPainted(false);
        btnDot.setContentAreaFilled(false);
        btnDot.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnDot.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/BtnDot.png"))); // NOI18N
        btnDot.setFocusable(false);
        btnDot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDot.setIconTextGap(0);
        btnDot.setName("."); // NOI18N
        btnDot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/BtnDot.png"))); // NOI18N
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        dailPad.add(btnDot);
        btnDot.setBounds(180, 270, 90, 90);

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn0.png"))); // NOI18N
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setIconTextGap(0);
        btn0.setName("0"); // NOI18N
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn0.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        dailPad.add(btn0);
        btn0.setBounds(0, 270, 180, 90);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn1.png"))); // NOI18N
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setIconTextGap(0);
        btn1.setName("1"); // NOI18N
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn1.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        dailPad.add(btn1);
        btn1.setBounds(0, 180, 90, 90);

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn2.png"))); // NOI18N
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setIconTextGap(0);
        btn2.setName("2"); // NOI18N
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn2.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        dailPad.add(btn2);
        btn2.setBounds(90, 180, 90, 90);

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn3.png"))); // NOI18N
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setIconTextGap(0);
        btn3.setName("3"); // NOI18N
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn3.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        dailPad.add(btn3);
        btn3.setBounds(180, 180, 90, 90);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn4.png"))); // NOI18N
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setIconTextGap(0);
        btn4.setName("4"); // NOI18N
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn4.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        dailPad.add(btn4);
        btn4.setBounds(0, 90, 90, 90);

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn5.png"))); // NOI18N
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setIconTextGap(0);
        btn5.setName("5"); // NOI18N
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn5.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        dailPad.add(btn5);
        btn5.setBounds(90, 90, 90, 90);

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn6.png"))); // NOI18N
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setIconTextGap(0);
        btn6.setName("6"); // NOI18N
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn6.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        dailPad.add(btn6);
        btn6.setBounds(180, 90, 90, 90);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn7.png"))); // NOI18N
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setIconTextGap(0);
        btn7.setName("7"); // NOI18N
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn7.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        dailPad.add(btn7);
        btn7.setBounds(0, 0, 90, 90);

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn8.png"))); // NOI18N
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setIconTextGap(0);
        btn8.setName("8"); // NOI18N
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn8.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        dailPad.add(btn8);
        btn8.setBounds(90, 0, 90, 90);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/default/Btn9.png"))); // NOI18N
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setIconTextGap(0);
        btn9.setName("9"); // NOI18N
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buttons/clicked/Btn9.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        dailPad.add(btn9);
        btn9.setBounds(180, 0, 90, 90);

        add(dailPad);
        dailPad.setBounds(170, 310, 360, 360);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Check Bal/amnt.png"))); // NOI18N
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        add(jLabel2);
        jLabel2.setBounds(270, 200, 150, 40);

        balanceTF.setEditable(false);
        balanceTF.setBackground(new java.awt.Color(212, 118, 107));
        balanceTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(96, 28, 28), null));
        balanceTF.setForeground(new java.awt.Color(96, 28, 28));
        balanceTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        balanceTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        balanceTF.setFont(new java.awt.Font("JetBrainsMonoNL NF Medium", 1, 24)); // NOI18N
        balanceTF.setHighlighter(null);
        add(balanceTF);
        balanceTF.setBounds(210, 240, 280, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPress(javax.swing.JButton btn) {
        String text = balanceTF.getText();
        
        if (firstTime) {
            text = btn.getName();            
            firstTime = false;
            
        } else {
            if (btn.getName().equals("")) {
                text = text.length() != 0 ? text.substring(0, text.length() - 1) : text;
            } else {
                text = text + btn.getName();
            }
        }
        
        balanceTF.setText(text);
        btnDot.setEnabled(!balanceTF.getText().contains("."));
    }

    
    private void btnExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtActionPerformed
        // TODO add your handling code here:
        this.app.switchFrames(this,this.app.transacWin);
    }//GEN-LAST:event_btnExtActionPerformed

    private void btnEraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraActionPerformed
        // TODO add your handling code here:
        btnPress(btnEra);
    }//GEN-LAST:event_btnEraActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String amount = String.format("%.2f", Double.valueOf(balanceTF.getText()));
        this.app.addBalance(Double.parseDouble(amount));
        firstTime = true;
        balanceTF.setText(amount);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        // TODO add your handling code here:
        btnPress(btnDot);
    }//GEN-LAST:event_btnDotActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        btnPress(btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btnPress(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btnPress(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btnPress(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btnPress(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btnPress(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btnPress(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btnPress(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btnPress(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btnPress(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        balanceTF.setText("0.00");
        firstTime = true;
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField balanceTF;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEra;
    private javax.swing.JButton btnExt;
    private javax.swing.JButton btnOK;
    private javax.swing.JPanel dailPad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private boolean firstTime;
    MainApp app;
}
