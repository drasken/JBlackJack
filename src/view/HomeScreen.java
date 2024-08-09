package view;

import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JPanel {

    private JPanel contentPane;
    private JButton continueButton;
    private JButton newPlayerButton;
    private JButton exitButton;
    private JPanel buttonsPanel;

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

}
