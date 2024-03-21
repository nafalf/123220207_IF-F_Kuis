package kuis_123220207;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener{
    JLabel header = new JLabel("Selamat Datang");
    JLabel subheader = new JLabel("Silahkan login untuk melanjutkan");
    JLabel labelUsername = new JLabel("Username");
    JLabel labelPassword = new JLabel("Password");
    
    JTextField inputUsername = new JTextField();
    JTextField inputPassword = new JTextField();
    
    JButton tombolLogin = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(480,480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(subheader);
        add(labelUsername);
        add(labelPassword);
        add(tombolLogin);
        
//        header.setFont(header.getFont().deriveFont(20.Of));
        header.setBounds(190, 10, 440, 24);
        subheader.setBounds(20, 50, 440, 24);
        
        labelUsername.setBounds(20, 84, 440, 12);
        inputUsername.setBounds(20, 100, 440, 12);
        
        labelPassword.setBounds(20, 150, 440, 12);
        inputPassword.setBounds(18, 166, 440, 12);
        
        tombolLogin.setBounds(14,280, 440, 36);
        tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputUsername.getText();
            String password = inputPassword.getText();
            
            if(username.isEmpty() || password.isEmpty()){
                throw new Exception("Tidak Boleh Kosong");
            }
            
            new MainPage(username);
            
            this.dispose();
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
