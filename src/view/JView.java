package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JView extends JFrame {

    //private String frameName = "JBlackJack";

    public JView () {
        //this.frameName = frameName;
        super("JBlackjack");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setBackground(Color.LIGHT_GRAY);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());
        HomeScreen homeScreen = new HomeScreen();
        add(homeScreen, BorderLayout.PAGE_END);
        setVisible(true);

    }

    public static void main(String[] args) {

        new JView();
        /*JFrame frame = new JFrame("Prova GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);

        // Defining the JPanle object to add later in frame object
        JPanel contentPane = new JPanel(new BorderLayout());
        //contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.LIGHT_GRAY);
        //contentPane.setPreferredSize(new Dimension(800, 600));
        //contentPane.setMaximumSize(new Dimension(800, 600));
        //contentPane.setMinimumSize(new Dimension(800, 600));


        frame.setContentPane(contentPane);
        frame.setVisible(true); //put at the end, first create than visible
        */
    }

}
