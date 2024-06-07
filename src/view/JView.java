package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JView {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Prova GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);

        // Defining the JPanle object to add later in frame object
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.GREEN);
        //contentPane.setPreferredSize(new Dimension(800, 600));
        //contentPane.setMaximumSize(new Dimension(800, 600));
        //contentPane.setMinimumSize(new Dimension(800, 600));


        frame.setContentPane(contentPane);
        frame.setVisible(true); //put at the end, first create than visible
    }

}
