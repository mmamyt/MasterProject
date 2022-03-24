package partOne;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

    public class Checking5_abcde7 extends JFrame {
    public static JPanel panel;
    public static JLabel label1, label2, label3, label4;
    public static JTextField accNum, bal, name;
    public static JTextArea curAccs;
    public static int index = 0;

    Checking5_abcde7( String title ) {
    super( title );
    setSize( 600, 300 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    label1 = new JLabel("Enter Account Number:");
    label2 = new JLabel("Enter Balance:");
    label3 = new JLabel("Enter Name: ");
    label4 = new JLabel("Current Accounts: ");
    accNum = new JTextField(300);
    bal = new JTextField(300);
    name = new JTextField(300);
    Action action = new AbstractAction() //action for name textfield to detect enter
    {
        public void actionPerformed(ActionEvent e) {
            String stringAccNum = accNum.getText(); //get account number
            String stringBal = bal.getText(); //get balance input
            String stringName = name.getText(); //get name input
            curAccs.append("index " + index + ": AccNum " + stringAccNum + "; Balance " + Double.parseDouble(stringBal) + "; Name " + stringName + "\n"); //append the input to current
            index++; // increment index
            // clear text of textfield
            accNum.setText("");
            bal.setText("");
            name.setText("");
            accNum.requestFocus(); //set focus to account number
        }
    };
        name.addActionListener( action ); // set the action to name textfield
        curAccs =new JTextArea();
        curAccs.setBackground(Color.WHITE);
        curAccs.setEditable(false);
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx=100;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(label1, gbc);
        gbc.ipadx=250;
        gbc.ipady=20;
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(accNum, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx=100;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label2, gbc);
        gbc.ipadx=250;
        gbc.ipady=20;
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(bal, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx=100;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(label3, gbc);
        gbc.ipadx=250;
        gbc.ipady=20;
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(name, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx=100;
        gbc.ipady=40;
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(label4, gbc);
        gbc.ipadx=250;
        gbc.ipady=40;
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(curAccs, gbc);
    }
    public static void main(String[] args) {
            Checking5_abcde7 frame = new Checking5_abcde7("Checking5_abcde7");
            frame.setVisible( true );
    }
    }
