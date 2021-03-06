package flexbox;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author 777900
 */
public class FlexBoxUI extends javax.swing.JFrame {
    double total = 0.0;
    double result = 0.0;
    
    /**
     * Creates new form FlexBoxUI
     */
    public FlexBoxUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        flexboxLabel = new javax.swing.JLabel();
        cardGradeComboBox = new javax.swing.JComboBox<>();
        orderDetailsLabel = new javax.swing.JLabel();
        cardGradeLabel = new javax.swing.JLabel();
        widthTextField = new javax.swing.JTextField();
        widthLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        lengthTextField = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        findCostButton = new javax.swing.JButton();
        colourLabel = new javax.swing.JLabel();
        colourComboBox = new javax.swing.JComboBox<>();
        reinforcedBottomLabel = new javax.swing.JLabel();
        reinforcedBottomComboBox = new javax.swing.JComboBox<>();
        reinforcedCornerLabel = new javax.swing.JLabel();
        reinforcedCornerComboBox = new javax.swing.JComboBox<>();
        sealableTopLabel = new javax.swing.JLabel();
        sealableTopsComboBox = new javax.swing.JComboBox<>();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        totalCostLabel = new javax.swing.JLabel();
        addAnotherOrderButton = new javax.swing.JButton();
        costOfOrderLabel = new javax.swing.JLabel();
        costOfOrderScrollPane = new javax.swing.JScrollPane();
        costOfOrderTextArea = new javax.swing.JTextArea();
        totalCostOfOrderScrollPane = new javax.swing.JScrollPane();
        totalCostOfOrderTextArea = new javax.swing.JTextArea();
        autoAddLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(51, 51, 255));
        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        flexboxLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        flexboxLabel.setForeground(new java.awt.Color(255, 255, 255));
        flexboxLabel.setText("Flexbox");

        cardGradeComboBox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        cardGradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        orderDetailsLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        orderDetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderDetailsLabel.setText("Please specify the following details for your order:");

        cardGradeLabel.setBackground(new java.awt.Color(255, 255, 255));
        cardGradeLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cardGradeLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardGradeLabel.setText("Grade of card:");

        widthTextField.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        widthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextFieldActionPerformed(evt);
            }
        });

        widthLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        widthLabel.setForeground(new java.awt.Color(255, 255, 255));
        widthLabel.setText("Width:");

        lengthLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthLabel.setText("Length:");

        lengthTextField.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        heightLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        heightLabel.setForeground(new java.awt.Color(255, 255, 255));
        heightLabel.setText("Height:");

        heightTextField.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        findCostButton.setText("Find Cost");
        findCostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCostButtonActionPerformed(evt);
            }
        });

        colourLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        colourLabel.setForeground(new java.awt.Color(255, 255, 255));
        colourLabel.setText("Colour Print:");

        colourComboBox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        colourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        colourComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colourComboBoxActionPerformed(evt);
            }
        });

        reinforcedBottomLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reinforcedBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        reinforcedBottomLabel.setText("Reinforced Bottoms:");

        reinforcedBottomComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reinforcedBottomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        reinforcedBottomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinforcedBottomComboBoxActionPerformed(evt);
            }
        });

        reinforcedCornerLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reinforcedCornerLabel.setForeground(new java.awt.Color(255, 255, 255));
        reinforcedCornerLabel.setText("Reinforced Corners:");

        reinforcedCornerComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reinforcedCornerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        reinforcedCornerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinforcedCornerComboBoxActionPerformed(evt);
            }
        });

        sealableTopLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sealableTopLabel.setForeground(new java.awt.Color(255, 255, 255));
        sealableTopLabel.setText("Sealable tops:");

        sealableTopsComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sealableTopsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        sealableTopsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sealableTopsComboBoxActionPerformed(evt);
            }
        });

        amountLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountLabel.setText("Amount of Boxes:");

        amountTextField.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        totalCostLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        totalCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalCostLabel.setText("Total Cost:");

        addAnotherOrderButton.setText("Add another order");
        addAnotherOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnotherOrderButtonActionPerformed(evt);
            }
        });

        costOfOrderLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        costOfOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        costOfOrderLabel.setText("Cost of order:");

        costOfOrderTextArea.setEditable(false);
        costOfOrderTextArea.setBackground(new java.awt.Color(170, 185, 237));
        costOfOrderTextArea.setColumns(20);
        costOfOrderTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        costOfOrderTextArea.setLineWrap(true);
        costOfOrderTextArea.setRows(5);
        costOfOrderScrollPane.setViewportView(costOfOrderTextArea);

        totalCostOfOrderTextArea.setEditable(false);
        totalCostOfOrderTextArea.setBackground(new java.awt.Color(170, 185, 237));
        totalCostOfOrderTextArea.setColumns(20);
        totalCostOfOrderTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        totalCostOfOrderTextArea.setLineWrap(true);
        totalCostOfOrderTextArea.setRows(5);
        totalCostOfOrderScrollPane.setViewportView(totalCostOfOrderTextArea);

        autoAddLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        autoAddLabel.setForeground(new java.awt.Color(255, 255, 255));
        autoAddLabel.setText("Automatically adds to \\/");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lengthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(widthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(heightLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sealableTopLabel)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(colourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(reinforcedBottomLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reinforcedBottomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sealableTopsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colourComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reinforcedCornerLabel)
                                            .addComponent(cardGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(reinforcedCornerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cardGradeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costOfOrderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCostOfOrderScrollPane)
                            .addComponent(costOfOrderScrollPane))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(findCostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAnotherOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(flexboxLabel))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(orderDetailsLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(autoAddLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(flexboxLabel)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderDetailsLabel)
                        .addGap(17, 17, 17)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthLabel)
                            .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colourLabel)
                            .addComponent(colourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardGradeLabel)
                            .addComponent(cardGradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthLabel)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinforcedBottomLabel)
                            .addComponent(reinforcedBottomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinforcedCornerLabel)
                            .addComponent(reinforcedCornerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sealableTopLabel)
                            .addComponent(sealableTopsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costOfOrderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(costOfOrderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findCostButton)
                        .addGap(41, 41, 41)))
                .addComponent(autoAddLabel)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCostOfOrderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(totalCostLabel)))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addAnotherOrderButton)
                        .addGap(38, 38, 38))))
        );

        orderDetailsLabel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAnotherOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnotherOrderButtonActionPerformed
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.00");

            result = parseDouble(costOfOrderTextArea.getText());

            totalCostOfOrderTextArea.setText(String.valueOf(decimalFormat.format(total)));

            costOfOrderTextArea.setText("");
            widthTextField.setText("");
            lengthTextField.setText("");
            heightTextField.setText("");
            amountTextField.setText("");
            cardGradeComboBox.setSelectedIndex(0);
            colourComboBox.setSelectedIndex(0);
            reinforcedBottomComboBox.setSelectedIndex(0);
            reinforcedCornerComboBox.setSelectedIndex(0);
            sealableTopsComboBox.setSelectedIndex(0);
        } catch (NumberFormatException e){
            costOfOrderTextArea.setText(String.valueOf("Please insert a number and don't keep the textbox empty."));
        }
    }//GEN-LAST:event_addAnotherOrderButtonActionPerformed

    private void sealableTopsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sealableTopsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sealableTopsComboBoxActionPerformed

    private void reinforcedCornerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforcedCornerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinforcedCornerComboBoxActionPerformed

    private void reinforcedBottomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforcedBottomComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinforcedBottomComboBoxActionPerformed

    private void colourComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colourComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colourComboBoxActionPerformed

    private void findCostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCostButtonActionPerformed
        String ComboBoxGrade = (String) cardGradeComboBox.getSelectedItem();
        String ColourPicker = (String) colourComboBox.getSelectedItem();
        String ReinforcedBoxBottom = (String) reinforcedBottomComboBox.getSelectedItem();
        String ReinforcedBoxCorner = (String) reinforcedCornerComboBox.getSelectedItem();
        String SealableBox = (String) sealableTopsComboBox.getSelectedItem();

        try {
            int amount = parseInt(amountTextField.getText());
            if(amount <= 0){
                amount = 1;
                amountTextField.setText(String.valueOf(amount));
                JOptionPane.showMessageDialog(null, "Invalid amount found, we have set it to 1 box");
            }

            float height, length, width, Area;
            height = Float.parseFloat(heightTextField.getText());
            length = Float.parseFloat(lengthTextField.getText());
            width = Float.parseFloat(widthTextField.getText());

            if(width != 0 && length != 0 && height != 0){
                if(width < 0){
                    absOnInput(widthTextField, width, "width");
                }

                if(length < 0){
                    absOnInput(lengthTextField, length, "length");
                }

                if(height < 0){
                    absOnInput(heightTextField, height, "height");
                }

                Area = ((2 * (height * length)) + (2 * (length * width)) + (2 * (height * width)));
                costOfOrderTextArea.setText(String.valueOf(Area));

                BoxType box = new BoxType(Area, ComboBoxGrade, ColourPicker, ReinforcedBoxBottom, ReinforcedBoxCorner, SealableBox);
                box.createBox();

                result = box.getCost();
                int boxType = box.getType();

                result = result * amount;

                if (boxType >= 1 && boxType <= 5) {
                    total = total + result;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");

                    costOfOrderTextArea.setText(String.valueOf(decimalFormat.format(result)));
                    totalCostOfOrderTextArea.setText(String.valueOf(decimalFormat.format(total)));
                } else {
                    costOfOrderTextArea.setText(String.valueOf("Invalid Box Type, Please change order"));
                }
            } else {
                costOfOrderTextArea.setText(String.valueOf("Invalid Input, Please enter the correct values [Height / Width / Lenght]"));
            }
        } catch (NumberFormatException e) {
            costOfOrderTextArea.setText(String.valueOf("Please insert a number and don't keep the textbox empty."));
        }
    }//GEN-LAST:event_findCostButtonActionPerformed

    private void widthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTextFieldActionPerformed

    private void absOnInput(javax.swing.JTextField textbox, float num, String niceName){
        num = Math.abs(num);
        textbox.setText(String.valueOf(num));
        JOptionPane.showMessageDialog(null, "Invalid "+ niceName +" found, we have set it to " + num);
    }
    
    /**
     * @param args 
     * Runs the program. Initialises the gui.
     */
    public static void main(String[] args) {
        FlexBoxUI gui = new FlexBoxUI();
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnotherOrderButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel autoAddLabel;
    private javax.swing.JComboBox<String> cardGradeComboBox;
    private javax.swing.JLabel cardGradeLabel;
    private javax.swing.JComboBox<String> colourComboBox;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JLabel costOfOrderLabel;
    private javax.swing.JScrollPane costOfOrderScrollPane;
    private javax.swing.JTextArea costOfOrderTextArea;
    private javax.swing.JButton findCostButton;
    private javax.swing.JLabel flexboxLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JLabel orderDetailsLabel;
    private javax.swing.JComboBox<String> reinforcedBottomComboBox;
    private javax.swing.JLabel reinforcedBottomLabel;
    private javax.swing.JComboBox<String> reinforcedCornerComboBox;
    private javax.swing.JLabel reinforcedCornerLabel;
    private javax.swing.JLabel sealableTopLabel;
    private javax.swing.JComboBox<String> sealableTopsComboBox;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JScrollPane totalCostOfOrderScrollPane;
    private javax.swing.JTextArea totalCostOfOrderTextArea;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}