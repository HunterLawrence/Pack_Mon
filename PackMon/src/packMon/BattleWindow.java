/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packMon;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        OutputPane = new javax.swing.JScrollPane();
        OutputTextArea = new javax.swing.JTextArea();
        ButtonPanel = new javax.swing.JPanel();
        AttackButton = new javax.swing.JButton();
        HealButton = new javax.swing.JButton();
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
        EnemyLabel = new javax.swing.JLabel();
        PlayerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(false);
        
        BackgroundPanel.setBackground(new java.awt.Color(0, 153, 0));

        OutputTextArea.setBackground(new java.awt.Color(102, 102, 0));
        OutputTextArea.setColumns(15);
        OutputTextArea.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        OutputTextArea.setForeground(new java.awt.Color(255, 255, 255));
        OutputTextArea.setRows(2);
        OutputTextArea.setLineWrap(true);
        OutputTextArea.setText("WELCOME TO PACKMON!");
        OutputTextArea.setEditable(false);
        OutputPane.setViewportView(OutputTextArea);

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setForeground(new java.awt.Color(255, 255, 255));

        AttackButton.setBackground(new java.awt.Color(204, 204, 204));
        AttackButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        AttackButton.setForeground(new java.awt.Color(0, 0, 0));
        AttackButton.setText("ATTACK");
        AttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackButtonActionPerformed(evt);
            }
        });

        HealButton.setBackground(new java.awt.Color(204, 204, 204));
        HealButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        HealButton.setForeground(new java.awt.Color(0, 0, 0));
        HealButton.setText("HEAL");
        HealButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		HealButtonActionPerformed(evt);
        	}
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(HealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        
                .addContainerGap())
        )));
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    )
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

        EnemyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PlayerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(OutputPane, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlayerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(EnemyMonsterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(EnemyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addGap(216, 216, 216)
                    .addComponent(PlayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(EnemyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EnemyMonsterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PlayerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OutputPane)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(PlayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
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
    }// </editor-fold>                        
   
    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {          
    	// The player's action
    	printMessage(control.playerAttack());
    	updateMonsterStats();
    	
    	// disable the buttons until either of the timers have run their course
    	HealButton.setEnabled(false);
    	AttackButton.setEnabled(false);
    	
    	// check if monster is defeated
    	if(control.monster.getHP() <= 0)
    	{
    		
    		// delay the new monster apearing to allow the user to read the new information
        	Timer timer = new Timer(2000, new ActionListener() {
        		public void actionPerformed(ActionEvent e)
        		{
        			// get a new monster
            		printMessage(control.newMonster());
            		updateMonsterStats();
            		updateImage(control.monster.getName());
            		
            		// re-enable the buttons
            		HealButton.setEnabled(true);
            		AttackButton.setEnabled(true);
        		}
        	});
        	timer.setRepeats(false);
        	timer.start();
    	}
    	else
    	{
    		// delay the monster attack to allow the player to read the attack message
        	Timer timer = new Timer(2000, new ActionListener() {
        		public void actionPerformed(ActionEvent e)
        		{
        			// The enemy's action
        	    	printMessage(control.monsterAttack());
        	        updatePlayerStats();
        	        
        	        // update player image if player is downed
        			if(control.player.getHP() == 0)
        			{
        				updatePlayerImage("PlayerDown");
        			}
        	        
        	        // re-enable the buttons
        	        HealButton.setEnabled(true);
        	        AttackButton.setEnabled(true);
        		}
        	});
        	timer.setRepeats(false);
        	timer.start();
    	}
    	
    	
    }
    
    private void HealButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
    	// The player's action
    	printMessage(control.playerHeal());
    	updatePlayerStats();
    	
    	// disable the buttons until after the timer has run its course
    	HealButton.setEnabled(false);
    	AttackButton.setEnabled(false);
    	// delay the monster attack to allow the player to read the heal message
    	Timer timer = new Timer(2000, new ActionListener() {
    		public void actionPerformed(ActionEvent e)
    		{
    			// The enemy's action
    	    	printMessage(control.monsterAttack());
    	        updatePlayerStats();
    	        
    	        // update player image if player is downed
    			if(control.player.getHP() == 0)
    			{
    				updatePlayerImage("PlayerDown");
    			}
    	        
    	        // re-enable the buttons
    	        HealButton.setEnabled(true);
    	        AttackButton.setEnabled(true);
    	        
    		}
    	});
    	timer.setRepeats(false);
    	timer.start();

    }
    
    
    private static final String MONSTER_IMAGE_FILE_LOCATION = "src\\MonsterImages\\";
    
    /***
     * updates the enemy monster on screen by searching for the file name that corresponds to the given monster name
     * @param monsterName
     */
    private void updateImage(String monsterName)
    {
    	String imageName = MONSTER_IMAGE_FILE_LOCATION + monsterName + ".png";
    	ImageIcon img = new ImageIcon(imageName);
        Image newImg = img.getImage();
        newImg = newImg.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newImg);
        EnemyLabel.setIcon(img);
    }
    
    private void updatePlayerImage(String updateImageName)
    {
    	String imageName = MONSTER_IMAGE_FILE_LOCATION + updateImageName + ".png";
    	ImageIcon img = new ImageIcon(imageName);
        Image newImg = img.getImage();
        newImg = newImg.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newImg);
        PlayerLabel.setIcon(img);
    }
    
    /***
     * Initializes a new monster
     * @param name The name of the monster
     * @param health The maximum health of the monster
     */
    private void updateMonsterStats()
    {
    	EnemyMonsterName.setText(control.monster.getName());
    	EnemyMonsterHealthDenominator.setText("" + control.monster.getMaxHealth());
    	EnemyMonsterHealthNumerator.setText("" + control.monster.getHP());
    	EnemyMonsterHealthBar.setMaximum(control.monster.getMaxHealth());
    	EnemyMonsterHealthBar.setMinimum(0);
    	EnemyMonsterHealthBar.setValue(control.monster.getHP());
    }
    
    /***
     * Initializes the player
     * @param name The player's name
     * @param health The player's maximum health
     */
    private void updatePlayerStats()
    {
    	PlayerName.setText(control.player.getName());
    	PlayerHealthDenominator.setText("" + control.player.getMaxHealth());
    	PlayerHealthNumerator.setText("" + control.player.getHP());
    	PlayerHealthBar.setMaximum(control.player.getMaxHealth());
    	PlayerHealthBar.setMinimum(0);
    	PlayerHealthBar.setValue(control.player.getHP());
    }
    
    
    /***
     * Prints a message to the player in the message space
     * @param message The message to display
     */
    private void printMessage(String message)
    {
    	OutputTextArea.setText(message);
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
                BattleWindow window = new BattleWindow();
                window.setVisible(true);
                
                
                // Start up functionality
                // create a new control object
                control = new GameControl();
                
                // Set player image
                window.updatePlayerImage("Player");
                window.updatePlayerStats();
                
                // Set monsterImage
                window.updateImage(control.monster.getName());
                window.updateMonsterStats();
            }
        });
    }

    // GameControl declaration
    private static GameControl control;
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel EnemyLabel;
    private javax.swing.JProgressBar EnemyMonsterHealthBar;
    private javax.swing.JLabel EnemyMonsterHealthDenominator;
    private javax.swing.JLabel EnemyMonsterHealthNumerator;
    private javax.swing.JLabel EnemyMonsterHealthSlash;
    private javax.swing.JPanel EnemyMonsterInfoPanel;
    private javax.swing.JLabel EnemyMonsterName;
    private javax.swing.JScrollPane OutputPane;
    private javax.swing.JTextArea OutputTextArea;
    private javax.swing.JProgressBar PlayerHealthBar;
    private javax.swing.JLabel PlayerHealthDenominator;
    private javax.swing.JLabel PlayerHealthNumerator;
    private javax.swing.JLabel PlayerHealthSlash;
    private javax.swing.JPanel PlayerInfoPanel;
    private javax.swing.JLabel PlayerLabel;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JButton AttackButton;
    private javax.swing.JButton HealButton;
    // End of variables declaration                   
}
