package libthing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPanel panel1;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JLabel usernameLabel;
    private JButton loginButton;
    private JButton cancelButton;
    private JPanel errorMsg;


    public static void main(String args[]){

        JFrame frame = new JFrame("Welcome");
        frame.setContentPane(new login(frame).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public login(JFrame frame) {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((usernameField.getText()).equals("") || (passwordField.getText()).equals("") ){
                    errorMsg.setVisible(true);
                }
                else {
                    String username = usernameField.getText();
                    String password = passwordField.getText();
                    System.out.println(username + password);
                    browse browser = new browse();
                    browser.browse();
                    frame.dispose();
                }

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });



    }
}
