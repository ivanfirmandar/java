package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends Component implements ActionListener {

    private JTextField usernameTA,passwordTA;
    private JButton submitButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        Login login = new Login();
        login.showFrame(frame);

    }
    public void showFrame(JFrame frame){
        usernameTA = new JTextField("Username");
        passwordTA = new JTextField("Password");
        submitButton = new JButton("Submit");
        usernameTA.setColumns(10);
        passwordTA.setColumns(10);
        frame.add(usernameTA);
        frame.add(passwordTA);
        frame.add(submitButton);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(500,500);
        frame.setVisible(true);
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (usernameTA.getText().equals("user")){
            if (passwordTA.getText().equals("user")){
                JOptionPane.showMessageDialog(this,"Berhasil Masuk");
            }else{
                JOptionPane.showMessageDialog(this,"Password Salah");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Username Salah");
        }
    }
}
