/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatrice;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CalculatriceForm extends javax.swing.JFrame {

    /**
     * Creates new form CalculatriceForm
     */
    public CalculatriceForm() {
        initComponents();
    }
    boolean egalClik=false;
    boolean operator=false;
    CalculTools cal=new CalculTools();
    ArrayList operation= new ArrayList<String>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        supp = new javax.swing.JButton();
        ecran = new javax.swing.JTextField();
        mult = new javax.swing.JButton();
        add = new javax.swing.JButton();
        soust = new javax.swing.JButton();
        div = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        pourcent = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        egal = new javax.swing.JButton();
        virgule = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        signed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caculatrice");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        supp.setBackground(new java.awt.Color(204, 204, 204));
        supp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        supp.setText("->");
        supp.setBorder(null);
        supp.setBorderPainted(false);
        supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        ecran.setEditable(isDoubleBuffered());
        ecran.setBackground(new java.awt.Color(0, 0, 0));
        ecran.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ecran.setForeground(new java.awt.Color(255, 255, 255));
        ecran.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ecran.setText("0");
        ecran.setBorder(null);
        ecran.setDoubleBuffered(true);
        ecran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecranActionPerformed(evt);
            }
        });

        mult.setBackground(new java.awt.Color(204, 204, 204));
        mult.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mult.setText("x");
        mult.setBorder(null);
        mult.setBorderPainted(false);
        mult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("+");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        soust.setBackground(new java.awt.Color(204, 204, 204));
        soust.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        soust.setText("-");
        soust.setBorder(null);
        soust.setBorderPainted(false);
        soust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soustActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(204, 204, 204));
        div.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        div.setText("/");
        div.setBorder(null);
        div.setBorderPainted(false);
        div.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 102, 0));
        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 102, 0));
        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 102, 0));
        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 102, 0));
        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 102, 0));
        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 102, 0));
        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 102, 0));
        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        pourcent.setBackground(new java.awt.Color(204, 204, 204));
        pourcent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pourcent.setText("%");
        pourcent.setBorder(null);
        pourcent.setBorderPainted(false);
        pourcent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pourcent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourcentActionPerformed(evt);
            }
        });

        AC.setBackground(new java.awt.Color(204, 204, 204));
        AC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AC.setText("AC");
        AC.setBorder(null);
        AC.setBorderPainted(false);
        AC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 102, 0));
        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 102, 0));
        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        egal.setBackground(new java.awt.Color(204, 204, 204));
        egal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        egal.setText("=");
        egal.setBorder(null);
        egal.setBorderPainted(false);
        egal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        egal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egalActionPerformed(evt);
            }
        });

        virgule.setBackground(new java.awt.Color(255, 102, 0));
        virgule.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        virgule.setForeground(new java.awt.Color(255, 255, 255));
        virgule.setText(",");
        virgule.setBorder(null);
        virgule.setBorderPainted(false);
        virgule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        virgule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virguleActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 102, 0));
        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        signed.setBackground(new java.awt.Color(204, 204, 204));
        signed.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signed.setText("+/-");
        signed.setBorder(null);
        signed.setBorderPainted(false);
        signed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ecran)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(virgule, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mult, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(soust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(egal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pourcent, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signed, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ecran, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pourcent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(virgule, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(egal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ecranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecranActionPerformed

    private void virguleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virguleActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.ecran.getText()) && !this.ecran.getText().contains(".")){
            this.ecran.setText(this.ecran.getText() + '.');
            if(egalClik){
                egalClik=false;
            }
        }
    }//GEN-LAST:event_virguleActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText()) || operator){
            this.ecran.setText("7");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'7');
        }        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText())|| operator){
            this.ecran.setText("0");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'0');
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:        
        if(egalClik || "0".equals(this.ecran.getText())|| operator){
            this.ecran.setText("1");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'1');
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText())|| operator){
            this.ecran.setText("3");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'3');
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText())|| operator){
            this.ecran.setText("2");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'2');
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText()) || operator){
            this.ecran.setText("6");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'6');
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText())|| operator){
            this.ecran.setText("5");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'5');
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText()) || operator){
            this.ecran.setText("4");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'4');
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText()) || operator){
            this.ecran.setText("8");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'8');
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(egalClik || "0".equals(this.ecran.getText()) || operator){
            this.ecran.setText("9");
            egalClik=false;
            operator=false;
        }else{
            this.ecran.setText(this.ecran.getText()+'9');
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        // TODO add your handling code here:
       this.ecran.setText("");
       operation.clear();
    }//GEN-LAST:event_ACActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.ecran.getText())){
            StringBuilder calcul =new StringBuilder(this.ecran.getText());
            calcul.deleteCharAt(calcul.length()-1);
            this.ecran.setText(calcul.toString());
        }
    }//GEN-LAST:event_suppActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.ecran.getText())){
            operation.add(this.ecran.getText());
            operation.add("+");
            operator=true;
            /* this.ecran.setText("");*/
        }else{
            cal.changeOperator(operation,"+");
        }
    }//GEN-LAST:event_addActionPerformed

    private void pourcentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourcentActionPerformed
        // TODO add your handling code here:
            if(cal.isDouble(this.ecran.getText())){
                Double valeur=Double.parseDouble(this.ecran.getText())/100;
                this.ecran.setText(valeur.toString());
            }
        
    }//GEN-LAST:event_pourcentActionPerformed

    private void soustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soustActionPerformed
        // TODO add your handling code here:
         if(!"".equals(this.ecran.getText())){
            operation.add(this.ecran.getText());
            operation.add("-");
            operator=true;
            /*this.ecran.setText("");*/
        }else{
            cal.changeOperator(operation,"-");
        }
    }//GEN-LAST:event_soustActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.ecran.getText())){
            operation.add(this.ecran.getText());
            operation.add("*");
            operator=true;
            /*this.ecran.setText("");*/
        }else{
            cal.changeOperator(operation,"*");
        }
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.ecran.getText())){
           operation.add(this.ecran.getText());
           operation.add("/");
           operator=true;
           /*this.ecran.setText("");*/
        }else{
            cal.changeOperator(operation,"/");
        }
    }//GEN-LAST:event_divActionPerformed

    private void egalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egalActionPerformed
        // TODO add your handling code here:
        if(cal.isDouble(this.ecran.getText())){
            operation.add(this.ecran.getText());
            String resultat=cal.operation(operation).toString();           
            operation.clear();
            if(!"Infinity".equals(resultat)){
                 this.ecran.setText(cal.writeDoubleinInt(resultat));
            }else{
                this.ecran.setText("Ma error");
            }
        }else{
            this.ecran.setText("Ma error");
        }
        egalClik=true;
    }//GEN-LAST:event_egalActionPerformed

    private void signedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signedActionPerformed
        // TODO add your handling code here:
        if(cal.isDouble(this.ecran.getText()) && 0!=Double.parseDouble(this.ecran.getText())){
            Double valeur=Double.parseDouble(this.ecran.getText())*-1;
            this.ecran.setText(cal.writeDoubleinInt(valeur.toString()));            
        }
    }//GEN-LAST:event_signedActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatriceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatriceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatriceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatriceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatriceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton add;
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
    private javax.swing.JButton div;
    private javax.swing.JTextField ecran;
    private javax.swing.JButton egal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mult;
    private javax.swing.JButton pourcent;
    private javax.swing.JButton signed;
    private javax.swing.JButton soust;
    private javax.swing.JButton supp;
    private javax.swing.JButton virgule;
    // End of variables declaration//GEN-END:variables
}
