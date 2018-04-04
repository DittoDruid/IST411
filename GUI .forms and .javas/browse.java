package libthing;

import javax.swing.*;

public class browse {
    private JPanel bigPanel;
    private JTextField textField1;
    private JButton searchButton;
    private JComboBox comboBox1;
    private JTabbedPane tabbedPane1;

    public void browse(){

        JFrame frame = new JFrame("browse");
        frame.setContentPane(new browse().bigPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
