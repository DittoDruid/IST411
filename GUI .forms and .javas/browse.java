package libthing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class browse {
    private JPanel bigPanel;
    private JTextField browseSearchBox;
    private JButton searchButton;
    private JComboBox materialTypeBox;
    private JTabbedPane tabbedPane1;
    private JTable browseQueryResults;

    public browse() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String materialTypeStr = materialTypeBox.getSelectedItem().toString();
                System.out.println(materialTypeStr);
                String browseSearchTerm = browseSearchBox.getText();
                System.out.println(browseSearchTerm);

            }
        });
    }

    public void browse(){

        JFrame frame = new JFrame("browse");
        frame.setContentPane(new browse().bigPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
