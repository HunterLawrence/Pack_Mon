/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packMon;

/**
 *
 * @author Ruthl
 */
public class BattleWindow extends javax.swing.JFrame {

    /**
     * Creates new form BattleWindow
     */
    public BattleWindow() {
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

        BackgroundPanel = new javax.swing.JPanel();
        OutputPane = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        ButtonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        EnemyMonsterInfoPanel = new javax.swing.JPanel();
        EnemyMonsterHealthBar = new javax.swing.JProgressBar();
        EnemyMonsterName = new javax.swing.JLabel();
        EnemyMonsterHealthNumerator = new javax.swing.JLabel();
        EnemyMonsterHealthSlash = new javax.swing.JLabel();
        EnemyMonsterHealthDenominator = new javax.swing.JLabel();
        PlayerInfoPanel = new javax.swing.JPanel();
        PlayerHealthBar = new javax.swing.JProgressBar();
        PlayerName = new javax.swing.JLabel();
        PlayerHealthNumerator = new javax.swing.JLabel();
        PlayerHealthSlash = new javax.swing.JLabel();
        PlayerHealthDenominator = new javax.swing.JLabel();
        PlayerImage = new javax.swing.JPanel();
        EnemyMonsterImage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(0, 153, 0));

        OutputTextArea.setBackground(new java.awt.Color(102, 102, 0));
        OutputTextArea.setColumns(15);
        OutputTextArea.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        OutputTextArea.setForeground(new java.awt.Color(255, 255, 255));
        OutputTextArea.setRows(2);
        OutputTextArea.setText("OUTPUT_TEXT");
        OutputPane.setViewportView(OutputTextArea);

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("USER_OPTION_1");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("USER_OPTION_2");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("USER_OPTION_3");

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("USER_OPTION_4");

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EnemyMonsterInfoPanel.setBackground(new java.awt.Color(204, 255, 153));
        EnemyMonsterInfoPanel.setForeground(new java.awt.Color(204, 255, 153));

        EnemyMonsterName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        EnemyMonsterName.setForeground(new java.awt.Color(0, 0, 0));
        EnemyMonsterName.setText("MONSTER_NAME");

        EnemyMonsterHealthNumerator.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        EnemyMonsterHealthNumerator.setForeground(new java.awt.Color(0, 0, 0));
        EnemyMonsterHealthNumerator.setText("MHNumer");

        EnemyMonsterHealthSlash.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        EnemyMonsterHealthSlash.setForeground(new java.awt.Color(0, 0, 0));
        EnemyMonsterHealthSlash.setText("/");

        EnemyMonsterHealthDenominator.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        EnemyMonsterHealthDenominator.setForeground(new java.awt.Color(0, 0, 0));
        EnemyMonsterHealthDenominator.setText("MHDnom");

        javax.swing.GroupLayout EnemyMonsterInfoPanelLayout = new javax.swing.GroupLayout(EnemyMonsterInfoPanel);
        EnemyMonsterInfoPanel.setLayout(EnemyMonsterInfoPanelLayout);
        EnemyMonsterInfoPanelLayout.setHorizontalGroup(
            EnemyMonsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnemyMonsterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnemyMonsterName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnemyMonsterInfoPanelLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(EnemyMonsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnemyMonsterInfoPanelLayout.createSequentialGroup()
                        .addComponent(EnemyMonsterHealthNumerator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnemyMonsterHealthSlash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnemyMonsterHealthDenominator))
                    .addComponent(EnemyMonsterHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        EnemyMonsterInfoPanelLayout.setVerticalGroup(
            EnemyMonsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnemyMonsterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnemyMonsterName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EnemyMonsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnemyMonsterHealthNumerator)
                    .addComponent(EnemyMonsterHealthSlash)
                    .addComponent(EnemyMonsterHealthDenominator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnemyMonsterHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PlayerInfoPanel.setBackground(new java.awt.Color(204, 255, 153));
        PlayerInfoPanel.setForeground(new java.awt.Color(204, 255, 153));

        PlayerName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        PlayerName.setForeground(new java.awt.Color(0, 0, 0));
        PlayerName.setText("MONSTER_NAME");

        PlayerHealthNumerator.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        PlayerHealthNumerator.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHealthNumerator.setText("MHNumer");

        PlayerHealthSlash.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        PlayerHealthSlash.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHealthSlash.setText("/");

        PlayerHealthDenominator.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        PlayerHealthDenominator.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHealthDenominator.setText("MHDnom");

        javax.swing.GroupLayout PlayerInfoPanelLayout = new javax.swing.GroupLayout(PlayerInfoPanel);
        PlayerInfoPanel.setLayout(PlayerInfoPanelLayout);
        PlayerInfoPanelLayout.setHorizontalGroup(
            PlayerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayerInfoPanelLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(PlayerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayerInfoPanelLayout.createSequentialGroup()
                        .addComponent(PlayerHealthNumerator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayerHealthSlash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayerHealthDenominator))
                    .addComponent(PlayerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PlayerInfoPanelLayout.setVerticalGroup(
            PlayerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PlayerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerHealthNumerator)
                    .addComponent(PlayerHealthSlash)
                    .addComponent(PlayerHealthDenominator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PlayerImageLayout = new javax.swing.GroupLayout(PlayerImage);
        PlayerImage.setLayout(PlayerImageLayout);
        PlayerImageLayout.setHorizontalGroup(
            PlayerImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        PlayerImageLayout.setVerticalGroup(
            PlayerImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EnemyMonsterImageLayout = new javax.swing.GroupLayout(EnemyMonsterImage);
        EnemyMonsterImage.setLayout(EnemyMonsterImageLayout);
        EnemyMonsterImageLayout.setHorizontalGroup(
            EnemyMonsterImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        EnemyMonsterImageLayout.setVerticalGroup(
            EnemyMonsterImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(OutputPane, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(EnemyMonsterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(PlayerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(EnemyMonsterImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EnemyMonsterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(PlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(EnemyMonsterImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlayerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OutputPane)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BattleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JProgressBar EnemyMonsterHealthBar;
    private javax.swing.JLabel EnemyMonsterHealthDenominator;
    private javax.swing.JLabel EnemyMonsterHealthNumerator;
    private javax.swing.JLabel EnemyMonsterHealthSlash;
    private javax.swing.JPanel EnemyMonsterImage;
    private javax.swing.JPanel EnemyMonsterInfoPanel;
    private javax.swing.JLabel EnemyMonsterName;
    private javax.swing.JScrollPane OutputPane;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JProgressBar PlayerHealthBar;
    private javax.swing.JLabel PlayerHealthDenominator;
    private javax.swing.JLabel PlayerHealthNumerator;
    private javax.swing.JLabel PlayerHealthSlash;
    private javax.swing.JPanel PlayerImage;
    private javax.swing.JPanel PlayerInfoPanel;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}