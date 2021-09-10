/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancalculator;

//package loanassistant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.border.Border;


public class LoanAssistant extends JFrame 
{
    //Controls

JFrame jframe = new JFrame();   

    
JLabel balanceLabel = new JLabel();
JTextField balanceTextField = new JTextField();
JLabel interestLabel = new JLabel();
JTextField interestTextField = new JTextField();
JLabel monthsLabel = new JLabel();
JTextField monthsTextField = new JTextField();
JLabel paymentLabel = new JLabel();
JTextField paymentTextField = new JTextField();



JButton computeButton = new JButton();
JButton newLoanButton = new JButton();

JButton monthsButton = new JButton();
JButton paymentButton = new JButton();

JLabel analysisLabel = new JLabel();
JTextArea analysisTextArea = new JTextArea();
JButton exitButton = new JButton();

Color lightYellow = new Color(240,230,140);
boolean computePayment;



Font myFont = new Font("Arial",Font.PLAIN,16);
    public static void main(String[] args) 
    {
        
        new LoanAssistant().show();
                
    }
    
    
    
    public LoanAssistant()
    {
       // setTitle("Loan Assistant");
        setResizable(false);
        this.setLocationRelativeTo(null);
        
    
   
       
        addWindowListener(new WindowAdapter()
        {
            
            public void windowClosing(WindowEvent evt)
            {
                exitForm(evt);
            }
        });
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;
        
       
        
        balanceLabel.setText("Loan Balance");
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10,10,0,0);
        getContentPane().add(balanceLabel, gridConstraints);
        balanceTextField.setPreferredSize(new Dimension(100,25));
        balanceTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        balanceTextField.setFont(myFont); 
        balanceTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=0;
        gridConstraints.insets = new Insets(10,10,0,10);
        getContentPane().add(balanceTextField, gridConstraints);
        
        
        interestLabel.setText("Intterest Rate");
        interestLabel.setForeground(Color.BLACK);
        interestLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10,10,0,0);
        getContentPane().add(interestLabel, gridConstraints);
        interestTextField.setPreferredSize(new Dimension(100,25));
        interestTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        interestTextField.setFont(myFont);
        interestTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=1;
        gridConstraints.insets = new Insets(10,10,0,10);
        getContentPane().add(interestTextField, gridConstraints);
        
        
        monthsLabel.setText("Number of Payments");
        monthsLabel.setForeground(Color.BLACK);
        monthsLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10,10,0,0);
        getContentPane().add(monthsLabel, gridConstraints);
        monthsTextField.setPreferredSize(new Dimension(100,25));
        monthsTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        monthsTextField.setFont(myFont); 
        monthsTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=2;
        gridConstraints.insets = new Insets(10,10,0,10);
        getContentPane().add(monthsTextField, gridConstraints);
        
        
        paymentLabel.setText("Monthly Payment");
        paymentLabel.setForeground(Color.BLACK);
        paymentLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10,10,0,0);
        getContentPane().add(paymentLabel, gridConstraints);
        paymentTextField.setPreferredSize(new Dimension(100,25));
        paymentTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        paymentTextField.setFont(myFont); 
        paymentTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=3;
        gridConstraints.insets = new Insets(10,10,0,10);
        getContentPane().add(paymentTextField, gridConstraints);
        
        
        
        balanceTextField.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                balanceTextFieldActionPerformed(e);
            }
        
         });
        
        balanceTextField.addKeyListener(new KeyAdapter() 
         {
             
         public void keyPressed(KeyEvent e) 
            {
             balanceTextFieldKeyPressed(e);
            }
         });
        
        
        interestTextField.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                interestTextFieldActionPerformed(e);
            }
        
         });
        
        interestTextField.addKeyListener(new KeyAdapter() 
         {
         public void keyPressed(KeyEvent e) 
            {
             interestTextFieldKeyPressed(e);
            }
         });
         
        monthsTextField.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                monthsTextFieldActionPerformed(e);
            }
        
        });
        
        monthsTextField.addKeyListener(new KeyAdapter() 
         {
         public void keyPressed(KeyEvent e) 
            {
             monthsTextFieldKeyPressed(e);
            }
         });
          
        paymentTextField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                paymentTextFieldActionPerformed(e);
            }
        
        });
        
        paymentTextField.addKeyListener(new KeyAdapter() 
         {
         public void keyPressed(KeyEvent e) 
            {
             paymentTextFieldKeyPressed(e);
            }
         });
        
        computeButton.setText("Compute Monthly Payment");
        computeButton.setBackground(Color.WHITE);
        computeButton.setForeground(Color.BLACK);
        computeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //computeButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10,0,0,0);
        getContentPane().add(computeButton, gridConstraints);
        computeButton.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               computeButtonActionPerformed(e);
           }
        });
        
        
        newLoanButton.setText("New Loan Analysis");
        newLoanButton.setBackground(Color.WHITE);
        newLoanButton.setForeground(Color.BLACK);
        newLoanButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
  
       // newLoanButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        newLoanButton.setEnabled(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        gridConstraints.gridwidth = 2;
        gridConstraints.insets = new Insets(10,0,10,0);
        getContentPane().add(newLoanButton, gridConstraints);
        newLoanButton.addActionListener(new ActionListener()
        {
            
           public void actionPerformed(ActionEvent e)
           {
               newLoanButtonActionPerformed(e);
           }
        });
        
        
        monthsButton.setText("OR");
        monthsButton.setBackground(Color.WHITE);
        monthsButton.setForeground(Color.BLACK);
        monthsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
       // monthsButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        monthsButton.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.insets = new Insets(10,0,0,0);
        getContentPane().add(monthsButton, gridConstraints);
        monthsButton.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               monthsButtonActionPerformed(e);
           }
        });
        
        
        paymentButton.setText("OR");
        paymentButton.setFocusable(false);
        paymentButton.setBackground(Color.WHITE);
        paymentButton.setForeground(Color.BLACK);
        paymentButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //paymentButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.insets = new Insets(10,0,0,0);
        getContentPane().add(paymentButton, gridConstraints);
        paymentButton.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               paymentButtonActionPerformed(e);
           }
        });
        
        
        analysisLabel.setText("Loan Analysis");
        analysisLabel.setForeground(Color.BLACK);
        analysisLabel.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx=3;
        gridConstraints.gridy=0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(0,10,0,0);
        getContentPane().add(analysisLabel, gridConstraints);
        analysisTextArea.setPreferredSize(new Dimension(250,150));
        analysisTextArea.setFocusable(false);
        analysisTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        analysisTextArea.setFont(new Font("Courier New",Font.PLAIN,14));
        analysisTextArea.setEditable(false);
        analysisTextArea.setBackground(lightYellow);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight=4;
        gridConstraints.insets = new Insets(0,10,0,10);
        getContentPane().add(analysisTextArea, gridConstraints);
        
        
        exitButton.setText("Exit");
        exitButton.setBackground(Color.WHITE);
        exitButton.setForeground(Color.BLACK);
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
       // exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        exitButton.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 5;
        getContentPane().add(exitButton, gridConstraints);
        exitButton.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               exitButtonActionPerformed(e);
           }
        });
        
        pack();
        
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
       double height = screenSize.getHeight();
       double width= screenSize.getWidth();
       paymentButton.doClick();
    }
    
    private void exitForm(WindowEvent evt)
    {
        System.exit(0);
    }
    
     
     private void computeButtonActionPerformed(ActionEvent e)
    {
        double balance,interest,payment;
        int months;
        double monthlyInterest, multiplier;
        double loanBalance,finalPayment;
        
        
        
        if(validateDecimalNumber(balanceTextField))
        {
            balance = Double.valueOf(balanceTextField.getText()).doubleValue();
        }
        else
        {
            JOptionPane.showConfirmDialog(null,"Invalid Input or empty entry of Loan"
                    + "Balance.\nPlease correct it shoud be a Number Only.","Balance Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(validateDecimalNumber(interestTextField))
        {
            interest = Double.valueOf(interestTextField.getText())
                    .doubleValue();
        }
        else
         {
             JOptionPane.showConfirmDialog(null,"Invalid Input or empty entry of Interest"
                     + " Rate.\nPlease correct it shoud be a Number Only.","Interest Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
             return;
         }
        monthlyInterest= interest/1200;
        
        
                   
                    if(computePayment)
                    {
                         if(validateDecimalNumber(monthsTextField))
                        {
                            months = Integer.valueOf(monthsTextField.getText())
                                    .intValue();
                        }
                         else
                         {
                            JOptionPane.showConfirmDialog(null,"Invalid Input or empty"
                                    + " entry of Number of Payments.\nPlease correct it shoud be a Number Only."
                                    + "","Numbers of Payments Input Error",
                                    JOptionPane.DEFAULT_OPTION,JOptionPane
                                            .INFORMATION_MESSAGE);
                             return;
                         }
                        if(interest == 0)
                                {
                                    payment = balance/months;
                                }
                        else
                                {
                                    multiplier = Math.pow(1+monthlyInterest,months);
                                    payment = balance*monthlyInterest*multiplier / 
                                            (multiplier-1);
                                }
                        paymentTextField.setText(new DecimalFormat("0.00")
                                .format(payment));
                    }
                    else
                    {
                         if(validateDecimalNumber(paymentTextField))
                            {
                                payment = Double.valueOf(paymentTextField.getText())
                                        .doubleValue();
                                if(payment <= (balance*monthlyInterest+1.0))
                                {
                                    if(JOptionPane.showConfirmDialog(null,"Minimum"
                                            + " payment must be $"+ new DecimalFormat
                                            ("0.00").format((int)(balance*monthlyInterest 
                                            + 1.0))+"\n"+"Do you want to use mininum payment?",
                                       "Input Error",JOptionPane.YES_NO_OPTION,JOptionPane
                                             .QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
                                            {
                                                paymentTextField.setText(new DecimalFormat("0.00")
                                                        .format((int)(balance*monthlyInterest+1.0)));
                                                payment = Double.valueOf(paymentTextField.getText())
                                                        .doubleValue();
                                            }
                                    else
                                    {
                                        paymentTextField.requestFocus();
                                        return;
                                    }
                                }
                            }
                         else
                         {
                             JOptionPane.showConfirmDialog(null,"Invalid Input or empty "
                                     + "entry of Monthly Payment.\nPlease correct it shoud be a Number Only.",
                                     "Payment Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                             return;
                         }
                        if(interest == 0)
                        {
                            months=(int)(balance / payment);
                        }
                        else
                        {
                            months = (int)((Math.log(payment)-Math.log(payment
                                    -balance*monthlyInterest))/Math.log(1+monthlyInterest));
                        }
                        monthsTextField.setText(String.valueOf(months));
                    }
                       payment= Double.valueOf(paymentTextField.getText()).doubleValue();
                    analysisTextArea.setText("Loan Balance: $ " + new DecimalFormat("0.00")
                            .format(balance));
                    analysisTextArea.append("\n" + "Interest Rate: "+ new DecimalFormat("0.00")
                            .format(interest)+"%");
                    loanBalance = balance;
                    for (int paymentNumber = 1; paymentNumber <= months-1; paymentNumber++)
                    {
                        loanBalance += loanBalance*monthlyInterest-payment;
                    }
                    finalPayment = loanBalance;
                    
                    if(finalPayment > payment)
                    {
                        loanBalance += loanBalance * monthlyInterest -payment;
                        finalPayment = loanBalance; 
                        months++;
                        monthsTextField.setText(String.valueOf(months));
                    }
                    
                    analysisTextArea.append("\n\n" + String.valueOf(months - 1) + 
                            " Payments of $" + new DecimalFormat("0.00")
                                    .format(payment));
                    analysisTextArea.append("\n" +  
                            "Final Payment of $" + new DecimalFormat("0.00")
                                    .format(finalPayment));
                    analysisTextArea.append("\n" +  
                            "Total Payment of $" + new DecimalFormat("0.00")
                                    .format((months -1)*payment+finalPayment));
                    analysisTextArea.append("\n" +  
                            "Interest Paid $" + new DecimalFormat("0.00")
                                    .format((months -1)*payment+ finalPayment-balance));
                    computeButton.setEnabled(false);
                    
                    
                    newLoanButton.setEnabled(true);
                    monthsButton.setEnabled(false);
                    paymentButton.setEnabled(false);
                    monthsButton.setBackground(Color.WHITE);
                    monthsButton.setForeground(Color.BLACK);
                    paymentButton.setForeground(Color.BLACK);
                    paymentButton.setBackground(Color.WHITE);
                   //newLoanButton.requestFocus(false); 
                    }
    
      private void newLoanButtonActionPerformed(ActionEvent e)
    {
        if(computePayment)
        {
           paymentTextField.setText("");
           monthsTextField.setText("");
        }
         else
        {
            paymentTextField.setText("");
            monthsTextField.setText("");
        }
        analysisTextArea.setText("");
        computeButton.setEnabled(true);
        newLoanButton.setEnabled(false);
        monthsButton.setEnabled(true);
        paymentButton.setEnabled(true);
        
        balanceTextField.requestFocus();
    }

      private void monthsButtonActionPerformed(ActionEvent e)
    {
        computePayment = false;
        paymentButton.setVisible(true);
        monthsButton.setVisible(false);
        monthsTextField.setText("");
        monthsTextField.setEditable(false);
        monthsTextField.setBackground(lightYellow);
        monthsTextField.setFocusable(false);
        paymentTextField.setEditable(true);
        paymentTextField.setBackground(Color.WHITE);
        paymentTextField.setFocusable(true);
        computeButton.setText("Compute Number of Payments");
        balanceTextField.requestFocus();
    } 
      
     private void paymentButtonActionPerformed(ActionEvent e)
    {
        computePayment = true;
        paymentButton.setVisible(false);
        monthsButton.setVisible(true);
        monthsTextField.setEditable(true);
        monthsTextField.setBackground(Color.WHITE);
        monthsTextField.setFocusable(true);
        paymentTextField.setText("");
        paymentTextField.setEditable(false);
        paymentTextField.setBackground(lightYellow);
        paymentTextField.setFocusable(false);
        computeButton.setText("Compute Monthly Payment");
        balanceTextField.requestFocus();
    }
    
    private void exitButtonActionPerformed(ActionEvent e)
    {
        System.exit(0);
    }   
    
    private void balanceTextFieldActionPerformed(ActionEvent e)
    { 
        
        balanceTextField.transferFocus();
    }
    
    
    
    private void balanceTextFieldKeyPressed(KeyEvent e) {
           char c = e.getKeyChar();
                     
           if(Character.isLetter(c)){
               
                balanceTextField.setEditable (false);
                JOptionPane.showConfirmDialog(null,"Input Should be a Number only. "
                    + "\nPlease correct.","Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else{
               balanceTextField.setEditable (true); 
            } 
        }
    
    private void interestTextFieldActionPerformed(ActionEvent e)
    {
        interestTextField.transferFocus();
    }
    
    private void interestTextFieldKeyPressed(KeyEvent e) {
           char c = e.getKeyChar();
            if(Character.isLetter(c)){
                interestTextField.setEditable (false);
                JOptionPane.showConfirmDialog(null,"Input Should be a Number only. "
                    + "\nPlease correct.","Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else{
               interestTextField.setEditable (true); 
            } 
        }
     
    private void monthsTextFieldActionPerformed(ActionEvent e)
    {
        monthsTextField.transferFocus();
    }
    
    private void monthsTextFieldKeyPressed(KeyEvent e) {
           char c = e.getKeyChar();
            if(Character.isLetter(c)){
                monthsTextField.setEditable (false);
                JOptionPane.showConfirmDialog(null,"Input Should be a Number only. "
                    + "\nPlease correct.","Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else{
               monthsTextField.setEditable (true); 
            } 
        }
      
    private void paymentTextFieldActionPerformed(ActionEvent e)
    {
        paymentTextField.transferFocus();
    }
    
    private void paymentTextFieldKeyPressed(KeyEvent e) {
           char c = e.getKeyChar();
            if(Character.isLetter(c)){
                paymentTextField.setEditable (false);
                JOptionPane.showConfirmDialog(null,"Input Should be a Number only. "
                    + "\nPlease correct.","Input Error",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else{
               paymentTextField.setEditable (true); 
            } 
        }
    
       
    public boolean validateDecimalNumber(JTextField tf)
     {
         String s = tf.getText().trim();
         boolean hasDecimal = false;
         boolean valid = true;
         
         
         if(s.length() == 0)
         {
             valid = false;
         }
         else
         {
             for(int i = 0;i<s.length();i++)
             {
                 char c = s.charAt(i);
                    if(c>='0'&& c<='9')
                    {
                        continue;
                    }
                    else if (c =='.'&& !hasDecimal)
                    {
                        hasDecimal = true;
                    }
                    else
                    {
                        valid = false;
                    }
             }
         }
         
         tf.setText(s);
         if(!valid)
         {
             tf.requestFocus();
         }
         return(valid);
     }    
}



