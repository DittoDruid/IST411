package libthing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPanel panel1;
    private JLabel passwordLabel;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel usernameLabel;
    private JButton loginButton;
    private JButton cancelButton;



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
                browse browser = new browse();
                browser.browse();
                frame.dispose();
            }
        });
    }

}
