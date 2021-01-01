package countingWords;

public class WordCount extends javax.swing.JFrame {

    public WordCount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordCountPanel = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        wordCountButton = new javax.swing.JButton();
        totalCountTextField = new javax.swing.JTextField();
        totalWordLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordCountPanel.setBackground(new java.awt.Color(204, 255, 255));

        wordLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        wordLabel.setText("Enter the Words");

        wordCountButton.setBackground(new java.awt.Color(102, 0, 102));
        wordCountButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        wordCountButton.setForeground(new java.awt.Color(255, 255, 255));
        wordCountButton.setText("Count Words");
        wordCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCountButtonActionPerformed(evt);
            }
        });

        totalWordLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        totalWordLabel.setText("   Total Words");

        clearButton.setBackground(new java.awt.Color(0, 0, 204));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        titleLabel.setText("    Word Count Tool");

        wordTextArea.setColumns(20);
        wordTextArea.setRows(5);
        jScrollPane1.setViewportView(wordTextArea);

        javax.swing.GroupLayout wordCountPanelLayout = new javax.swing.GroupLayout(wordCountPanel);
        wordCountPanel.setLayout(wordCountPanelLayout);
        wordCountPanelLayout.setHorizontalGroup(
            wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordCountPanelLayout.createSequentialGroup()
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(wordCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(wordCountPanelLayout.createSequentialGroup()
                                .addComponent(totalWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(wordCountPanelLayout.createSequentialGroup()
                                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        wordCountPanelLayout.setVerticalGroup(
            wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(wordCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordCountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        wordTextArea.setText("");
        totalCountTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void wordCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCountButtonActionPerformed
        String sentences = wordTextArea.getText();
        int i=0,words=1;
        
        for(i=0;i<sentences.length();i++){
            if(sentences.charAt(i)==' ')
                words++;
        }
         totalCountTextField.setText(" "+words);
    }//GEN-LAST:event_wordCountButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordCount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField totalCountTextField;
    private javax.swing.JLabel totalWordLabel;
    private javax.swing.JButton wordCountButton;
    private javax.swing.JPanel wordCountPanel;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JTextArea wordTextArea;
    // End of variables declaration//GEN-END:variables
}
