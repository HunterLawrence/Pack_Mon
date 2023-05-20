/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packMon;

/**
 *
 * @author Ruthl
 */
public class UserSelectionWindow extends javax.swing.JFrame {

    /**
     * Creates new form UserSelectionWindow
     */
    public UserSelectionWindow() {
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
        PackMonLogoImagePanel = new javax.swing.JPanel();
        PackMonTextLabel = new javax.swing.JLabel();
        GameSelectionPanel = new javax.swing.JPanel();
        NewGameButton1 = new javax.swing.JToggleButton();
        NewGameButton2 = new javax.swing.JToggleButton();
        NewGameButton3 = new javax.swing.JToggleButton();
        SelectGameText = new javax.swing.JLabel();
        LeaderboardButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(0, 153, 0));

        PackMonLogoImagePanel.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout PackMonLogoImagePanelLayout = new javax.swing.GroupLayout(PackMonLogoImagePanel);
        PackMonLogoImagePanel.setLayout(PackMonLogoImagePanelLayout);
        PackMonLogoImagePanelLayout.setHorizontalGroup(
            PackMonLogoImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        PackMonLogoImagePanelLayout.setVerticalGroup(
            PackMonLogoImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        PackMonTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        PackMonTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        PackMonTextLabel.setText("PACK-MON");

        GameSelectionPanel.setBackground(new java.awt.Color(0, 255, 0));
        GameSelectionPanel.setForeground(new java.awt.Color(255, 255, 255));

        NewGameButton1.setBackground(new java.awt.Color(255, 255, 255));
        NewGameButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewGameButton1.setForeground(new java.awt.Color(0, 0, 0));
        NewGameButton1.setText("NEW GAME");
        NewGameButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButton1ActionPerformed(evt);
            }
        });

        NewGameButton2.setBackground(new java.awt.Color(255, 255, 255));
        NewGameButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewGameButton2.setForeground(new java.awt.Color(0, 0, 0));
        NewGameButton2.setText("NEW GAME");
        NewGameButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButton2ActionPerformed(evt);
            }
        });
        
        NewGameButton3.setBackground(new java.awt.Color(255, 255, 255));
        NewGameButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewGameButton3.setForeground(new java.awt.Color(0, 0, 0));
        NewGameButton3.setText("NEW GAME");
        NewGameButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButton3ActionPerformed(evt);
            }
        });

        SelectGameText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SelectGameText.setForeground(new java.awt.Color(0, 0, 0));
        SelectGameText.setText("Please Select a Game or Make a New Game");

        javax.swing.GroupLayout GameSelectionPanelLayout = new javax.swing.GroupLayout(GameSelectionPanel);
        GameSelectionPanel.setLayout(GameSelectionPanelLayout);
        GameSelectionPanelLayout.setHorizontalGroup(
            GameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameSelectionPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(NewGameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(NewGameButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewGameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(GameSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectGameText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GameSelectionPanelLayout.setVerticalGroup(
            GameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectGameText)
                .addGap(84, 84, 84)
                .addGroup(GameSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewGameButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewGameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewGameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        LeaderboardButton.setBackground(new java.awt.Color(204, 204, 204));
        LeaderboardButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LeaderboardButton.setForeground(new java.awt.Color(0, 0, 0));
        LeaderboardButton.setText("LEADERBOARD");
        LeaderboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                                .addComponent(PackMonLogoImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PackMonTextLabel))
                            .addComponent(GameSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(LeaderboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PackMonTextLabel)
                    .addComponent(PackMonLogoImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GameSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeaderboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    // =================================== ACTION LISTENERS =============================================
    
    
    private void LeaderboardButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        System.out.println("LEADERBOARD BUTTON");
    }

    
    private void NewGameButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
    	System.out.println("NEW GAME BUTTON 1");
    }
    
    private void NewGameButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
    	System.out.println("NEW GAME BUTTON 2");
    }
    
    private void NewGameButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {
    	System.out.println("NEW GAME BUTTON 3");
    }
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(UserSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSelectionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel GameSelectionPanel;
    private javax.swing.JToggleButton LeaderboardButton;
    private javax.swing.JToggleButton NewGameButton1;
    private javax.swing.JToggleButton NewGameButton2;
    private javax.swing.JToggleButton NewGameButton3;
    private javax.swing.JPanel PackMonLogoImagePanel;
    private javax.swing.JLabel PackMonTextLabel;
    private javax.swing.JLabel SelectGameText;
    // End of variables declaration//GEN-END:variables
}