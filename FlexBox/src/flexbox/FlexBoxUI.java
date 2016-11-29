package flexbox;

/**
 * @author danni
 * @author tom_m
 */
public class FlexBoxUI extends javax.swing.JFrame {

    float total;

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

        jPanel1 = new javax.swing.JPanel();
        FlexboxTitle = new javax.swing.JLabel();
        FlexboxComboBoxCardGrades = new javax.swing.JComboBox<>();
        Title2 = new javax.swing.JLabel();
        GradeOfCard = new javax.swing.JLabel();
        WidthTextbox = new javax.swing.JTextField();
        Width = new javax.swing.JLabel();
        Length = new javax.swing.JLabel();
        LengthTextbox = new javax.swing.JTextField();
        Height = new javax.swing.JLabel();
        HeightTextbox = new javax.swing.JTextField();
        FindCost = new javax.swing.JButton();
        ColourPrint = new javax.swing.JLabel();
        ColourBox = new javax.swing.JComboBox<>();
        ReinforcedBottom = new javax.swing.JLabel();
        ReinforcedB = new javax.swing.JComboBox<>();
        ReinforcedCorner = new javax.swing.JLabel();
        ReinforcedC = new javax.swing.JComboBox<>();
        SealableTops = new javax.swing.JLabel();
        SealableTopsBox = new javax.swing.JComboBox<>();
        Amount = new javax.swing.JLabel();
        AmountTextbox = new javax.swing.JTextField();
        TotalCost = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Result1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Result2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 185, 237));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        FlexboxTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FlexboxTitle.setText("Flexbox");

        FlexboxComboBoxCardGrades.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        FlexboxComboBoxCardGrades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        Title2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Title2.setText("Please specify the following details for your order:");

        GradeOfCard.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        GradeOfCard.setText("Grade of card:");

        WidthTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        WidthTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthTextboxActionPerformed(evt);
            }
        });

        Width.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Width.setText("Width:");

        Length.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Length.setText("Length:");

        LengthTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        Height.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Height.setText("Height:");

        HeightTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        FindCost.setText("Find Cost");
        FindCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindCostActionPerformed(evt);
            }
        });

        ColourPrint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ColourPrint.setText("Colour Print:");

        ColourBox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        ColourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        ColourBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourBoxActionPerformed(evt);
            }
        });

        ReinforcedBottom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ReinforcedBottom.setText("Reinforced Bottom");

        ReinforcedB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ReinforcedB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        ReinforcedB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinforcedBActionPerformed(evt);
            }
        });

        ReinforcedCorner.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ReinforcedCorner.setText("Reinforced Corner");

        ReinforcedC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ReinforcedC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        ReinforcedC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinforcedCActionPerformed(evt);
            }
        });

        SealableTops.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SealableTops.setText("Sealable tops");

        SealableTopsBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SealableTopsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        SealableTopsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SealableTopsBoxActionPerformed(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Amount.setText("Amount ");

        AmountTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        TotalCost.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TotalCost.setText("Total Cost:");

        jButton1.setText("Add another order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cost of order:");

        Result1.setBackground(new java.awt.Color(170, 185, 237));
        Result1.setColumns(20);
        Result1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Result1.setLineWrap(true);
        Result1.setRows(5);
        jScrollPane2.setViewportView(Result1);

        Result2.setBackground(new java.awt.Color(170, 185, 237));
        Result2.setColumns(20);
        Result2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Result2.setLineWrap(true);
        Result2.setRows(5);
        jScrollPane3.setViewportView(Result2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Width)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WidthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Length)
                                .addGap(18, 18, 18)
                                .addComponent(LengthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Height)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HeightTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Title2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(SealableTops)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SealableTopsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ReinforcedBottom)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ReinforcedB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ReinforcedCorner)
                                            .addComponent(Amount))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ReinforcedC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AmountTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(FlexboxTitle))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(GradeOfCard)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FlexboxComboBoxCardGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(ColourPrint)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ColourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FindCost)
                                .addGap(238, 238, 238)
                                .addComponent(TotalCost)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1)))
                        .addContainerGap(162, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FlexboxTitle)
                .addGap(21, 21, 21)
                .addComponent(Title2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColourBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GradeOfCard)
                        .addComponent(ColourPrint)
                        .addComponent(FlexboxComboBoxCardGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReinforcedBottom)
                    .addComponent(ReinforcedB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReinforcedCorner)
                    .addComponent(ReinforcedC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SealableTops)
                    .addComponent(SealableTopsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount)
                    .addComponent(AmountTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Width)
                    .addComponent(WidthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Length)
                    .addComponent(LengthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Height)
                    .addComponent(HeightTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindCost)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TotalCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Title2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WidthTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WidthTextboxActionPerformed

    private void FindCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindCostActionPerformed
        String ComboBoxGrade = (String) FlexboxComboBoxCardGrades.getSelectedItem();
        String ColourPicker = (String) ColourBox.getSelectedItem();
        String ReinforcedBoxBottom = (String) ReinforcedB.getSelectedItem();
        String ReinforcedBoxCorner = (String) ReinforcedC.getSelectedItem();
        String SealableBox = (String) SealableTopsBox.getSelectedItem();

        try {
            float height, length, width, Area;
            height = Float.parseFloat(HeightTextbox.getText());
            length = Float.parseFloat(LengthTextbox.getText());
            width = Float.parseFloat(WidthTextbox.getText());
            Area = ((2 * (height * length)) + (2 * (length * width)) + (2 * (height * width)));
            Result1.setText(String.valueOf(Area));

            BoxType box = new BoxType(Area, ComboBoxGrade, ColourPicker, ReinforcedBoxBottom, ReinforcedBoxCorner, SealableBox);
            box.createBox();
            double result = box.getCost();
            int boxType = box.getType();

            float amount;
            amount = Float.parseFloat(AmountTextbox.getText());
            result = result * amount;

            if (boxType == 1 || boxType == 2 || boxType == 3 || boxType == 4 || boxType == 5) {
                Result1.setText(String.valueOf((result)));
            } else {
                Result1.setText(String.valueOf("Invalid Box Type, Please change order"));
            }
        } catch (NumberFormatException e) {
            Result1.setText(String.valueOf("Please insert a number and don't keep the textbox empty."));
        }
    }//GEN-LAST:event_FindCostActionPerformed

    private void ReinforcedBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinforcedBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinforcedBActionPerformed

    private void ReinforcedCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinforcedCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinforcedCActionPerformed

    private void SealableTopsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SealableTopsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SealableTopsBoxActionPerformed

    private void ColourBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColourBoxActionPerformed

    /**
     * @param args Runs the program. Initialises the gui.
     */
    public static void main(String[] args) {
        FlexBoxUI gui = new FlexBoxUI();
        new FlexBoxUI().setVisible(true);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float result;
        try {
            result = Float.parseFloat(Result1.getText());
            total = result + total;
            Result2.setText(String.valueOf((total)));

            WidthTextbox.setText("");
            LengthTextbox.setText("");
            HeightTextbox.setText("");
            AmountTextbox.setText("");
            FlexboxComboBoxCardGrades.setSelectedIndex(0);
            ColourBox.setSelectedIndex(0);
            ReinforcedB.setSelectedIndex(0);
            ReinforcedC.setSelectedIndex(0);
            SealableTopsBox.setSelectedIndex(0);
            Result1.setText("");
        } catch (NumberFormatException e) {
            Result2.setText(String.valueOf(("Please insert a number and don't keep the textbox empty.")));
        }


    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmountTextbox;
    private javax.swing.JComboBox<String> ColourBox;
    private javax.swing.JLabel ColourPrint;
    private javax.swing.JButton FindCost;
    private javax.swing.JComboBox<String> FlexboxComboBoxCardGrades;
    private javax.swing.JLabel FlexboxTitle;
    private javax.swing.JLabel GradeOfCard;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField HeightTextbox;
    private javax.swing.JLabel Length;
    private javax.swing.JTextField LengthTextbox;
    private javax.swing.JComboBox<String> ReinforcedB;
    private javax.swing.JLabel ReinforcedBottom;
    private javax.swing.JComboBox<String> ReinforcedC;
    private javax.swing.JLabel ReinforcedCorner;
    private javax.swing.JTextArea Result1;
    private javax.swing.JTextArea Result2;
    private javax.swing.JLabel SealableTops;
    private javax.swing.JComboBox<String> SealableTopsBox;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel TotalCost;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField WidthTextbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}