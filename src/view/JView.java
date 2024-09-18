package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JView extends JFrame {

    //private static final Object frameName = "JBlackJack";
    //private String frameName = "JBlackJack";
    private static JView instance;
    private HomeScreen homeScreen;


    private JView () {
        //this.frameName = frameName;
        super("JBlackJack");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        //setBackground(Color.RED);
        setLocationRelativeTo(null);
        //setLayout(new CardLayout());
        setLayout(new BorderLayout());
        homeScreen = new HomeScreen();
        add(homeScreen, BorderLayout.CENTER);
        pack();
        setVisible(true);

    }

    public static JView getInstance () {
        if (instance == null) {
            instance = new JView();
        }
        return instance;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater( () -> JView.getInstance());
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
