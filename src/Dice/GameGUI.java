package Dice;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        GameGUI
 * File         GameGUI.java
 * Description  A class representing the GUI used in a rolling dice simulation.
 * Project      Craps Simulation
 * Environment  PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
 * Date         11/21/2020
 * @author      <i>FALLDIUSA ESTAVAN</i>
 * @version: 	%1% %2%
 * @see:     	javax.swing
 * @see:     	java.text.DecimalFormat;
  </pre>
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class GameGUI extends javax.swing.JFrame {

        int total = 0;
        int[] freq = new int[6];
        double[] percent =new double[6];
        Die die1 = new Die(Die.roll());
        Die die2 = new Die(Die.roll());
        int sumD =0, point=0;
        final int WON=0, LOST=1,CONTINUE=2;
        boolean firstRoll = true;
        int Game = CONTINUE, gamesWin = 0, gamesLost =0, gamesPlayed =0;
        String FName = "src/Craps_Game/GameRecord.txt";
        String PointValue = "";
        
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  GameGUI()
     * Description  Default constructor. Builds the GUI, creates instance of 
     *              the class, sets the rollJButton as the default button
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * @see         java.awt.Toolkit
     * Date         11/23/2020
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public GameGUI() {
        initComponents();  
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/die2.png"));       
        //center the form at start
        setLocationRelativeTo(null);        
        //set rollButton as default
        this.getRootPane().setDefaultButton(rollJButton);        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlJPanel = new javax.swing.JPanel();
        rollJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        statisticsJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsJTextArea = new javax.swing.JTextArea();
        resultJPanel = new javax.swing.JPanel();
        sumJLabel = new javax.swing.JLabel();
        StatusJLabel = new javax.swing.JLabel();
        scoreJLabel = new javax.swing.JLabel();
        poiJLabel = new javax.swing.JLabel();
        pointJLabel = new javax.swing.JLabel();
        resJLabel = new javax.swing.JLabel();
        gStatusJTextField = new javax.swing.JTextField();
        die1JLabel = new javax.swing.JLabel();
        die2JLabel = new javax.swing.JLabel();
        menuJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        actionJMenu = new javax.swing.JMenu();
        statisticsJMenuItem = new javax.swing.JMenuItem();
        rollJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Craps Simulation Game");
        setResizable(false);

        controlJPanel.setLayout(new java.awt.GridLayout(1, 0));

        rollJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rollJButton.setText("Roll");
        rollJButton.setToolTipText("roll the dice");
        rollJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(rollJButton);

        printJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printJButton.setText("Print");
        printJButton.setEnabled(false);
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(printJButton);

        statisticsJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statisticsJButton.setText("Statistics");
        statisticsJButton.setToolTipText("statistic ");
        statisticsJButton.setEnabled(false);
        statisticsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(statisticsJButton);

        clearJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearJButton.setText("Clear");
        clearJButton.setToolTipText("Clear the number");
        clearJButton.setEnabled(false);
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(clearJButton);

        quitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quitJButton.setText("Quit");
        quitJButton.setToolTipText("Quit the program");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(quitJButton);

        titleJLabel.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(204, 0, 51));
        titleJLabel.setText("Welcome to Craps GameSimulation");

        resultsJTextArea.setEditable(false);
        resultsJTextArea.setColumns(20);
        resultsJTextArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        resultsJTextArea.setRows(5);
        jScrollPane1.setViewportView(resultsJTextArea);

        sumJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sumJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sumJLabel.setText("Sum:");

        StatusJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StatusJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StatusJLabel.setText("Status:");

        scoreJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scoreJLabel.setText("0");

        poiJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        poiJLabel.setText("0");

        pointJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pointJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pointJLabel.setText("Point:");

        resJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        gStatusJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gStatusJTextField.setEnabled(false);
        gStatusJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gStatusJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultJPanelLayout = new javax.swing.GroupLayout(resultJPanel);
        resultJPanel.setLayout(resultJPanelLayout);
        resultJPanelLayout.setHorizontalGroup(
            resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultJPanelLayout.createSequentialGroup()
                        .addGroup(resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultJPanelLayout.createSequentialGroup()
                                .addComponent(sumJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(scoreJLabel))
                            .addGroup(resultJPanelLayout.createSequentialGroup()
                                .addComponent(pointJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(poiJLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resJLabel))
                    .addGroup(resultJPanelLayout.createSequentialGroup()
                        .addComponent(StatusJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gStatusJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        resultJPanelLayout.setVerticalGroup(
            resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resJLabel)
                .addGap(61, 61, 61))
            .addGroup(resultJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumJLabel)
                    .addComponent(scoreJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusJLabel)
                    .addComponent(gStatusJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(resultJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointJLabel)
                    .addComponent(poiJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        die1JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        die1JLabel.setText("Die 1");

        die2JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        die2JLabel.setText("Die 2");

        fileJMenu.setText("File");

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clear all");
        clearJMenuItem.setEnabled(false);
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setEnabled(false);
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("Save statistic as separate file");
        saveJMenuItem.setEnabled(false);
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);
        fileJMenu.add(jSeparator2);

        exitJMenuItem.setMnemonic('E');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Exit the program");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        menuJMenuBar.add(fileJMenu);

        actionJMenu.setMnemonic('c');
        actionJMenu.setText("Action");

        statisticsJMenuItem.setMnemonic('t');
        statisticsJMenuItem.setText("Statistics");
        statisticsJMenuItem.setToolTipText("Display statistic");
        statisticsJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsJMenuItemActionPerformed(evt);
            }
        });
        actionJMenu.add(statisticsJMenuItem);

        rollJMenuItem.setMnemonic('r');
        rollJMenuItem.setText("Roll");
        rollJMenuItem.setToolTipText("Play the Game");
        rollJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollJMenuItemActionPerformed(evt);
            }
        });
        actionJMenu.add(rollJMenuItem);

        menuJMenuBar.add(actionJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");

        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        menuJMenuBar.add(helpJMenu);

        setJMenuBar(menuJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(die1JLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(resultJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(die2JLabel))
                    .addComponent(titleJLabel))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titleJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(die2JLabel)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(die1JLabel)
                                .addGap(28, 28, 28)))))
                .addComponent(controlJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       clearJMenuItemActionPerformed()
     * Description  Event handler reset form to its original state and to reset 
     *              all class instance variables using clearJButton
     * @param       evt java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020   
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        printJButton.setEnabled(false);
        printJMenuItem.setEnabled(false);
        statisticsJButton.setEnabled(false);
        saveJMenuItem.setEnabled(false);
        clearJButton.setEnabled(false);
        clearJMenuItem.setEnabled(false);
        poiJLabel.setText("0");
        scoreJLabel.setText("0");
        resultsJTextArea.setText("");
        setLabel(die1JLabel, "src/Images/", 1);
        setLabel(die2JLabel, "src/Images/", 1);
        gamesWin = 0; 
        gamesLost =0;
        gamesPlayed =0;
        for(int i =0; i < freq.length;i++)
           {
               percent[i]= 0;
               freq[i]=0;
           }
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       printJMenuItemActionPerformed()
     * Description  Print the GUI form
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       exitJMenuItemActionPerformed()
     * Description  Event handler to end the application
     * @param       evt java.awt.event.ActionEvent
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        quitJButton.doClick();
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       statisticsJMenuItemActionPerformed()
     * Description  To show the player result if they won or lost.
     * @param       evt java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020   
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void statisticsJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJMenuItemActionPerformed
        statisticsJButton.doClick();
    }//GEN-LAST:event_statisticsJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       aboutJMenuItemActionPerformed()
     * Description  Show the About form.
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        About myAbout = new About(this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       rollJButtonActionPerformed()
     * Description  To play the game
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void rollJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollJMenuItemActionPerformed
        rollJButton.doClick();
    }//GEN-LAST:event_rollJMenuItemActionPerformed
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       enableJButton()
     * Description  To enable the button.
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void enableJButton()
    {
        printJButton.setEnabled(true);
        printJMenuItem.setEnabled(true);
        statisticsJButton.setEnabled(true);
        saveJMenuItem.setEnabled(true);
        clearJButton.setEnabled(true);
        clearJMenuItem.setEnabled(true);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       rollJButtonActionPerformed()
     * Description  To play the game
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void rollJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollJButtonActionPerformed
       gamesPlayed++;
       total +=2;
       
       sumD = rollDice();
        int face1= die1.getSide();
        int face2= die2.getSide();
        enableJButton();
        try{
            setLabel(die1JLabel, "src/Images/", die1.getSide());
            setLabel(die2JLabel, "src/Images/", die2.getSide());
            
            if(firstRoll)
            {
                switch(sumD)
                {
                    case 7: case 11:
                        Game = WON;
                        PointValue = "";
                        firstRoll = true;
                        gamesWin++;
                        break;
                     case 2: case 3: case12:
                        Game = LOST;
                        PointValue ="";
                        firstRoll = true;
                        gamesLost++;
                        break;
                      default:
                          Game = CONTINUE;
                        point = sumD;
                        PointValue = String.valueOf(point);
                        firstRoll = false;
                        gamesLost++;  
                }
            }
            else
            {
                firstRoll = false;
                if(sumD == point)
                {
                    Game = WON;
                    firstRoll = true;
                    gamesWin++;
                }
                else
                    if(sumD ==7)
                    {
                        Game = LOST;
                        firstRoll =true;
                        gamesLost++;
                    }
            }
        freq[face1 -1]++;
        freq[face2 -1]++;
         Percent();
        displayResults();
                
    }
catch(java.lang.NumberFormatException e)
{
    JOptionPane.showMessageDialog(null, "Enter a positive integer!","Input Error!", JOptionPane.ERROR_MESSAGE);
}
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       setLabel()
     * Description  Method to set the correct image on the given labels.
     * @param       label Jlabel
     * @param       folder String
     * @param       num int
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

       public void setLabel(JLabel label, String folder, int num)
       {
        String image = folder + "die" + num + ".png";
        label.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_rollJButtonActionPerformed

     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       displayResults()
     * Description  set the array percent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
       private void Percent()
       {
           for(int i =0; i < freq.length;i++)
           {
               percent[i]= (double)freq[i]/total;
           }
       }
       
       /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       rollDice()
     * Description  To roll the dice
     * @param       int
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/29/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
       public int rollDice()
       {
           die1.setSide(Die.roll());
           die2.setSide(Die.roll());
           return (die1.getSide() + die2.getSide());
       }
       
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       displayResults()
     * Description  Method to display results
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

       private void displayResults()
       {
           DecimalFormat perc = new DecimalFormat("#,##0.00%");
           StringBuffer output = new StringBuffer("Face    " + "Frequency     " + "Percents\n");
           
           for(int i =0; i<freq.length ;i++)
           {
               output.append("" +(i + 1)+ "\t     " +freq[i] + "\t       "+
                       perc.format(percent[i]) + "\n");
           }
           resultsJTextArea.setText(output.toString());
           scoreJLabel.setText(Integer.toString((int) sumD));
           poiJLabel.setText(Integer.toString((int) point));
           if (Game == gamesWin)
               gStatusJTextField.setText("WON");
           else if (Game == gamesLost)
                gStatusJTextField.setText("LOST");
           else
               gStatusJTextField.setText("CONTINUE");
       }
       
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       printJButtonActionPerformed()
     * Description  Print the JTextArea
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
            try
            {
 
                resultsJTextArea.print();
            }
            catch(PrinterException ex)
            {
                JOptionPane.showMessageDialog(null,"Not Printed", "Print Error",
                    JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_printJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       statisticsJButtonActionPerformed()
     * Description  To show the player result if they won or lost.
     * @param       evt java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020   
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void statisticsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsJButtonActionPerformed
        StringBuffer display = new StringBuffer();
        DecimalFormat perc = new DecimalFormat("#,##0.00%");
        display.delete(0, display.length()); //clear
        double per=  ( (double) gamesWin/ (double) gamesPlayed)/100;
        display.append("Number of games played ="  + gamesPlayed +"\n");
        display.append("Number of games won = " + gamesWin +"\n");
        display.append("Number of games lost = " + gamesLost +"\n");
        display.append("Percentage games won = " + perc.format(per)+ "\n");
        display.append('\n');
        
        resultsJTextArea.setText(display.toString());
    }//GEN-LAST:event_statisticsJButtonActionPerformed
     
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       quitJButtonActionPerformed()
     * Description  Event handler to end the application
     * @param       evt java.awt.event.ActionEvent
     * @see         java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020  
     *</pre>
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       clearJButtonActionPerformed()
     * Description  Event handler reset form to its original state and to reset 
     *              all class instance variables.
     * @param       evt java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020   
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        clearJMenuItem.doClick();
    }//GEN-LAST:event_clearJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       saveJMenuItemActionPerformed()
     * Description  To save the player's result of the game
     * @param       evt java.awt.event.ActionEvent
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * Date         11/23/2020   
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        try
        {
            FileWriter filePointer = new FileWriter(FName);
            PrintWriter output = new PrintWriter(filePointer, true);
            output.write(resultsJTextArea.getText());
            output.close();
        }
        catch(IOException exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_saveJMenuItemActionPerformed

    private void gStatusJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gStatusJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gStatusJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Splash mySplash = new Splash(2700);
             mySplash.showSplash();
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StatusJLabel;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenu actionJMenu;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JLabel die1JLabel;
    private javax.swing.JLabel die2JLabel;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JTextField gStatusJTextField;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menuJMenuBar;
    private javax.swing.JLabel poiJLabel;
    private javax.swing.JLabel pointJLabel;
    private javax.swing.JButton printJButton;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton quitJButton;
    private javax.swing.JLabel resJLabel;
    private javax.swing.JPanel resultJPanel;
    private javax.swing.JTextArea resultsJTextArea;
    public javax.swing.JButton rollJButton;
    private javax.swing.JMenuItem rollJMenuItem;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JLabel scoreJLabel;
    private javax.swing.JButton statisticsJButton;
    private javax.swing.JMenuItem statisticsJMenuItem;
    private javax.swing.JLabel sumJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
