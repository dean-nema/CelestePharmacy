package com.mycompany.celestepharmacy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ssstepbro
 */
public class ControlPage extends javax.swing.JFrame {
    
    
      //variables
    private  String[] controlList =  ConH2.getCNames();
    private String[] empty = {""};
    private static ArrayList<Control> cData = new ArrayList<>();
    private Control obj = new Control();
    private String nAme ="";
    private int cost = 0;
    private boolean bool = false;
    private boolean bool1 = true;

    /**
     * Creates new form ControlPage
     */
    public ControlPage() {
      initComponents();
        amount.setText("1");
        if(controlList == null || ((controlList.length) == 0)){
         jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(empty));
        jComboBox1.setSelectedIndex(0);
        }else{
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(controlList));
        jComboBox1.setSelectedIndex(0);
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

        addCPopUp = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vCost = new javax.swing.JTextField();
        addNewViagra = new javax.swing.JButton();
        vAmount = new javax.swing.JTextField();
        vName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        sellBtn = new javax.swing.JButton();
        addQ = new javax.swing.JButton();
        subQ = new javax.swing.JButton();
        costLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        addCPopUp.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel5.setText("ADD CONTROL L");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel7.setText("AMOUNT");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel8.setText("TABLET COST");

        vCost.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        vCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vCostActionPerformed(evt);
            }
        });

        addNewViagra.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        addNewViagra.setText("ADD");
        addNewViagra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewViagraActionPerformed(evt);
            }
        });

        vAmount.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        vAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAmountActionPerformed(evt);
            }
        });

        vName.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        vName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vName, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(vCost, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addNewViagra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(vAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(addNewViagra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout addCPopUpLayout = new javax.swing.GroupLayout(addCPopUp.getContentPane());
        addCPopUp.getContentPane().setLayout(addCPopUpLayout);
        addCPopUpLayout.setHorizontalGroup(
            addCPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCPopUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addCPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addCPopUpLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        addCPopUpLayout.setVerticalGroup(
            addCPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCPopUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("CONTROL L");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setText("ITEM");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setText("AMOUNT");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setText("COST");

        returnBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        returnBtn.setText("RETURN");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        sellBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        sellBtn.setText("SELL");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });

        addQ.setText("Q+");
        addQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQActionPerformed(evt);
            }
        });

        subQ.setText("Q-");
        subQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subQActionPerformed(evt);
            }
        });

        costLabel.setBackground(new java.awt.Color(255, 255, 255));
        costLabel.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        costLabel.setForeground(new java.awt.Color(0, 153, 51));
        costLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        costLabel.setText("15");

        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(costLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 329, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addQ, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(subQ, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(450, 450, 450))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addQ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subQ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addCPopUp.setSize(840, 499);
        addCPopUp.setLocationRelativeTo(null);
        addCPopUp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        try {
            // add obj
            obj = ConH2.getCObj(nAme);
        } catch (SQLException ex) {
            Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Database error");
        }
      //get Amount Data
    String textFieldValue1 = amount.getText();
    int amnt = Integer.parseInt(textFieldValue1);
    if(nAme == ""){
        bool1 = false;
       JOptionPane.showMessageDialog(null, "NO SELECTED ITEMS");

    }
   
    // Check if the text field is not empty
    if (!textFieldValue1.isEmpty()) {
        // Now you can use the text as needed
    } else {
        // Handle the case where the text field is empty
       bool1 = false;
        JOptionPane.showMessageDialog(null, "INVALID AMOUNT");
    }    
     ///write to database
        try {
            if(bool1){
            ConH2.displayCData();
           cost = obj.calcCost(amnt);
            ConH2.insertReturns(nAme, amnt, cost, "Control L");
            ConH2.returnUpdateCTable(obj, amnt);
            ConH2.displayRData();
            ConH2.displayCData();
            amount.setText("1");
            JOptionPane.showMessageDialog(null, "Return Processed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR OCCURED");
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Get the selected item from the JComboBox

        Object selectedValue = jComboBox1.getSelectedItem();
        String name = (String)selectedValue;
        // Check if an item is selected
        if (selectedValue != null) {
            try {
                // Now you can use the selected item as needed
                obj = ConH2.getCObj(name);
                String textFieldValue1 = amount.getText();
                int amnt = Integer.parseInt(textFieldValue1);
                String newCost= String.valueOf(obj.calcCost(amnt));
                costLabel.setText(newCost);
            } catch (SQLException ex) {
                Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            nAme = name;
        } else {
            // Handle the case where no item is selected
            System.out.println("No item selected");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // Get the text from the JTextField
        String textFieldValue1 = amount.getText();
        int amnt = Integer.parseInt(textFieldValue1);
        // Check if the text field is not empty
        if (!textFieldValue1.isEmpty()) {
            // Now you can use the text as needed

            String newCost= String.valueOf(obj.calcCost(amnt));
            costLabel.setText(newCost);
        } else {
            // Handle the case where the text field is empty
            amount.setText("0");
        }

    }//GEN-LAST:event_amountActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        try {
            // add obj
            obj = ConH2.getCObj(nAme);
        } catch (SQLException ex) {
            Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Database error");
        }
        //get Amount Data
        String textFieldValue1 = amount.getText();
        int amnt = Integer.parseInt(textFieldValue1);
        if(nAme == ""){
            bool1 = false;
            JOptionPane.showMessageDialog(null, "NO SELECTED ITEMS");

        }
        if((obj.getAmount()<=0)){
            bool1 = false;
            JOptionPane.showMessageDialog(null, "OUT OF STOCK!!");
        }else if((obj.getAmount())< amnt){
            bool1 = false;
            JOptionPane.showMessageDialog(null, "NOT ENOUGH "+ nAme);

        }
        // Check if the text field is not empty
        if (!textFieldValue1.isEmpty()) {
            // Now you can use the text as needed
        } else {
            // Handle the case where the text field is empty
            bool1 = false;
            JOptionPane.showMessageDialog(null, "INVALID AMOUNT");
        }
        ///write to database
        try {
            if(bool1){
                ConH2.displayCData();
                cost = obj.calcCost(amnt);
                ConH2.insertCSales(nAme, amnt, cost);
                ConH2.sellUpdateCTable(obj, amnt);
                ConH2.displaySales();
                ConH2.displayCData();
                amount.setText("1");
                JOptionPane.showMessageDialog(null, "Purchase Processed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR OCCURED");
        }
        //test

    }//GEN-LAST:event_sellBtnActionPerformed

    private void addQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQActionPerformed
        // TODO add your handling code here:
        //get Amount Data
        String textFieldValue1 = amount.getText();
        int amnt = Integer.parseInt(textFieldValue1);
        // Check if the text field is not empty
        if (!textFieldValue1.isEmpty()) {
            // Now you can use the text as needed
            amnt++;
            String amnt2 = String.valueOf(amnt);
            amount.setText(amnt2);
            String newCost= String.valueOf(obj.calcCost(amnt));
            costLabel.setText(newCost);
        } else {
            // Handle the case where the text field is empty
            amount.setText("0");
        }
    }//GEN-LAST:event_addQActionPerformed

    private void subQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subQActionPerformed
        // TODO add your handling code here:

        String textFieldValue1 = amount.getText();
        int amnt = Integer.parseInt(textFieldValue1);
        // Check if the text field is not empty
        if (!textFieldValue1.isEmpty()) {
            // Now you can use the text as needed
            if(amnt!=0){
                amnt--;
            }
            String amnt2 = String.valueOf(amnt);
            amount.setText(amnt2);
            String newCost= String.valueOf(obj.calcCost(amnt));
            costLabel.setText(newCost);
        } else {
            // Handle the case where the text field is empty
            amount.setText("0");
        }
    }//GEN-LAST:event_subQActionPerformed

    private void vCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vCostActionPerformed

    private void addNewViagraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewViagraActionPerformed
        //variables
        String controlName = vName.getText().toUpperCase();
        int amount = Integer.parseInt(vAmount.getText());
        int cost  = Integer.parseInt(vCost.getText());
        for(String i : controlList ){
            if(controlName.equals(i)){
                bool = true;
            }
        }
        if(bool){
            try{
                obj = ConH2.getCObj(controlName);
                obj.addAmount(amount);
                obj.setCost(cost);
                ConH2.addUpdateCTable(obj);
                JOptionPane.showMessageDialog(null, "CONTROL L UPDATED!");
                ConH2.displayCData();
                vName.setText("");
                vAmount.setText("");
                vCost.setText("");
                controlList =  ConH2.getCNames();
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(controlList));
                jComboBox1.setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR OCCURED");
            }
        }else{
            try{
                ConH2.insertCData(controlName, amount, cost);
                ConH2.displayCData();
                JOptionPane.showMessageDialog(null, "CONTROL L UPDATED!");
                vName.setText("");
                vAmount.setText("");
                vCost.setText("");
                controlList =  ConH2.getCNames();
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(controlList));
                jComboBox1.setSelectedIndex(0);
            }catch (SQLException ex) {
                Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR OCCURED");
            }
        }

    }//GEN-LAST:event_addNewViagraActionPerformed

    private void vAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vAmountActionPerformed

    private void vNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        HomePage page = new HomePage();
         page.setLocationRelativeTo(null);
         page.setResizable(false);
        page.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    cData = ConH2.getCData();
                } catch (SQLException ex) {
                    Logger.getLogger(ControlPage.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("No data!!!");
                }
                 ControlPage frame = new ControlPage();
            // Set the location to the middle of the screen
             frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame addCPopUp;
    private javax.swing.JButton addNewViagra;
    private javax.swing.JButton addQ;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel costLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton sellBtn;
    private javax.swing.JButton subQ;
    private javax.swing.JTextField vAmount;
    private javax.swing.JTextField vCost;
    private javax.swing.JTextField vName;
    // End of variables declaration//GEN-END:variables
}