package flexbox;

/**
 * @author danni
 * @author tom_m
 */

public class FlexBoxUI extends javax.swing.JFrame {

    /**
     * Creates new form FlexBoxUI
     */
    
    public FlexBoxUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResultTextbox2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        FlexboxTitle = new javax.swing.JLabel();
        FlexboxComboBoxCardGrades = new javax.swing.JComboBox<>();
        Title2 = new javax.swing.JLabel();
        GradeOfCard = new javax.swing.JLabel();
        BoxSize = new javax.swing.JLabel();
        WidthTextbox = new javax.swing.JTextField();
        Width = new javax.swing.JLabel();
        Length = new javax.swing.JLabel();
        LengthTextbox = new javax.swing.JTextField();
        Height = new javax.swing.JLabel();
        HeightTextbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Result1 = new javax.swing.JLabel();

        ResultTextbox2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 185, 237));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        FlexboxTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FlexboxTitle.setText("Flexbox");

        FlexboxComboBoxCardGrades.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        FlexboxComboBoxCardGrades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        Title2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Title2.setText("Please specify the following details for your order:");

        GradeOfCard.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        GradeOfCard.setText("Grade of card:");

        BoxSize.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BoxSize.setText("Box Size:");
        BoxSize.setToolTipText("");

        WidthTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        WidthTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthTextboxActionPerformed(evt);
            }
        });

        Width.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Width.setText("Width:");

        Length.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Length.setText("Length:");

        LengthTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        Height.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Height.setText("Height:");

        HeightTextbox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jButton1.setText("Button 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Result1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FlexboxTitle)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Result1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Width)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WidthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Length)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LengthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Height)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeightTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxSize)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GradeOfCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FlexboxComboBoxCardGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Title2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(FlexboxTitle)
                .addGap(18, 18, 18)
                .addComponent(Title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FlexboxComboBoxCardGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GradeOfCard))
                .addGap(14, 14, 14)
                .addComponent(BoxSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Width)
                    .addComponent(WidthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Length)
                    .addComponent(LengthTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Height)
                    .addComponent(HeightTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Result1))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        Title2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WidthTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WidthTextboxActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try{
            float num1, num2, num3, result ;
            num1 = Float.parseFloat(HeightTextbox.getText());
            num2 = Float.parseFloat(LengthTextbox.getText());
            num3 = Float.parseFloat(WidthTextbox.getText());
            result = ((2*(num1*num2)) + (2*(num2*num3)) + (2*(num1*num3)));
            Result1.setText(String.valueOf(result));
        }catch(NumberFormatException e){
           Result1.setText(String.valueOf("Please insert only numbers"));
        }
        
         try{
            float num1,  result = 0;
            num1 = Float.parseFloat(Result1.getText());
            String num2 = (String)FlexboxComboBoxCardGrades.getSelectedItem();
            switch (num2){
                case "1":
                    result = (float) (num1 * 0.5);
                    break;
                case "2":
                    result = (float) (num1 * 0.6);
                    break;
                case "3":
                    result = (float) (num1 * 0.72);
                    break;
                case "4":
                    result = (float) (num1 * 0.9);
                    break;
                case "5":
                    result = (float) (num1 * 1.4);
                    break;
            }
            Result1.setText(String.valueOf(result));
        }catch(NumberFormatException e){
           Result1.setText(String.valueOf("Please insert only numbers"));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FlexBoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlexBoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlexBoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlexBoxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FlexBoxUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BoxSize;
    private javax.swing.JComboBox<String> FlexboxComboBoxCardGrades;
    private javax.swing.JLabel FlexboxTitle;
    private javax.swing.JLabel GradeOfCard;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField HeightTextbox;
    private javax.swing.JLabel Length;
    private javax.swing.JTextField LengthTextbox;
    private javax.swing.JLabel Result1;
    private javax.swing.JTextField ResultTextbox2;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField WidthTextbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
