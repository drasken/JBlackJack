package view;

import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JPanel {

    private JFrame homeFrame;
    private JPanel contentPane;
    private JButton continueButton;
    private JButton newPlayerButton;
    private JButton exitButton;
    private JPanel buttonsPanel;
    private ImageIcon welcomeImage;
    private JLabel imageLabel;
    private int paddingBetweenButtons = 20;
    private Color bgcolor = new Color(0, 128, 0);

    public HomeScreen() {
        //try
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(bgcolor);


        welcomeImage = new ImageIcon("../asset/welcome.jpg");
        imageLabel = new JLabel(welcomeImage);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(imageLabel);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setBackground(bgcolor);
        contentPane.setAlignmentX(Component.CENTER_ALIGNMENT);
        continueButton = new HomeButton("Continue");
        contentPane.add(continueButton);
        contentPane.add(Box.createRigidArea(new Dimension(0, paddingBetweenButtons)));

        newPlayerButton = new HomeButton("New Player");
        contentPane.add(newPlayerButton);
        contentPane.add(Box.createRigidArea(new Dimension(0, paddingBetweenButtons)));

        exitButton = new HomeButton("Exit");
        contentPane.add(exitButton);
        contentPane.add(Box.createRigidArea(new Dimension(0, paddingBetweenButtons)));

        add(contentPane);
        add(Box.createVerticalGlue());
        //setLayout( new BorderLayout());
        //add(contentPane, BorderLayout.CENTER);
    }

    /*
    public HomeScreen() {
        setLayout(new BorderLayout());
        this.buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(0, 1, 5, 15));
        //buttonsPanel.setLayout(new BorderLayout());
        continueButton = new HomeButton("Continue");
        newPlayerButton = new HomeButton("New Player");
        exitButton = new HomeButton("Exit");
        //continueButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        //newPlayerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        //exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(continueButton);
        buttonsPanel.add(newPlayerButton);
        buttonsPanel.add(exitButton);
        //add(buttonsPanel, BorderLayout.CENTER);
        //contentPane.setLayout(new BoxLayout());
    }
    */

}
